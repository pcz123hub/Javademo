package com.example.demo008.controller;

import java.util.ArrayList;
import com.example.demo008.entity.Data;
import com.example.demo008.entity.User;
import com.example.demo008.entity.Book;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("book")
public class BookController {
    // 获取所有图书信息
    ArrayList<Book> books = Data.getData();

    // 查询所有图书(分页)
    @RequestMapping("list")
    public String findBook(@RequestParam(defaultValue = "0") int page, Model model, HttpSession session) {
        session.setAttribute("user", new User("zhangsan", "ADMIN"));
        int pageSize = 5;
        int totalItems = books.size();
        int totalPages = (int) Math.ceil((double) totalItems / pageSize);
        
        // 验证页码参数
        if (page < 0) {
            page = 0;
        }
        
List<Book> pageBooks = books.stream()
            .skip(page * pageSize)
            .limit(pageSize)
            .collect(Collectors.toList());
            
        model.addAttribute("books", pageBooks);
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", totalPages);
        return "books";
    }

    // 显示新增图书页面
@RequestMapping(value = "add", method = RequestMethod.GET)
    public String showAddForm(Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null || !user.getRole().equals("ADMIN")) {
            return "redirect:/book/list";
        }
model.addAttribute("book", new Book(0, "defaultName", "", "", "0"));
        return "book-add";
    }

    // 处理新增图书提交
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String addBook(@ModelAttribute Book book, HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        if (user == null || !user.getRole().equals("ADMIN")) {
            return "redirect:/book/list";
        }
        book.setId(books.size() + 1); // 设置图书ID
        book.setStatus("0"); // 默认状态为可借阅
        books.add(book);
        model.addAttribute("books", books);
        return "redirect:/book/list";
    }

    // 按条件查询图书(分页)
    @RequestMapping(value = "search", produces = "application/json")
// 为解决 'ResponseBody cannot be resolved to a type' 问题，需要导入 ResponseBody 类
@ResponseBody
    public Map<String, Object> searchBook(@RequestParam(defaultValue = "0") int page, 
                                        @RequestParam(required = false) String name,
                                        @RequestParam(required = false) String author,
                                        HttpSession session) {
        ArrayList<Book> bs = new ArrayList<>();
        
        if ((name == null || name.isEmpty()) && (author == null || author.isEmpty())) {
            bs = books;
        } else {
            for (Book b : books) {
                if ((name != null && !name.isEmpty() && b.getName() != null && b.getName().contains(name)) || 
                    (author != null && !author.isEmpty() && b.getAuthor() != null && b.getAuthor().contains(author))) {
                    bs.add(b);
                }
            }
        }
        
        int pageSize = 5;
        int totalItems = bs.size();
        int totalPages = (int) Math.ceil((double) totalItems / pageSize);
        
        List<Book> pageBooks = bs.stream()
            .skip(page * pageSize)
            .limit(pageSize)
            .collect(Collectors.toList());
            
// 为解决HashMap无法解析的问题，需要导入java.util.HashMap和java.util.Map
Map<String, Object> result = new HashMap<>();
        result.put("books", pageBooks);
        result.put("currentPage", page);
        result.put("totalPages", totalPages);
        
        return result;
    }

    // 获取借阅图书编号
    @RequestMapping("find/{id}")
    public String findBook(@PathVariable("id") Integer id, HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        if (user == null || !user.getRole().equals("ADMIN")) {
            return "redirect:/book/list";
        }
        
        for (Book book : books) {
            if (book.getId().equals(id)) {
                if (book.getStatus().equals("0")) {
                    book.setStatus("1");
                    System.out.println("用户" + user.getName() + "借阅了图书:" + book.getName());
                    model.addAttribute("message", "借阅成功：" + book.getName());
                    model.addAttribute("alert", "借阅成功！请及时归还。");
                    break;
                }
            }
        }
        
        return "redirect:/book/list";
    }
}