package com.example.demo007.controller;

import com.example.demo007.entity.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

@RestController
public class FileController{
    @RequestMapping("/fileUpload")
    public Result fileUpload(MultipartFile[] files , HttpServletRequest request){
        for (MultipartFile file : files){
            String fileName = file.getOriginalFilename();
            String subfix = fileName.substring(fileName.lastIndexOf("."));
            if (!".jpg".equalsIgnoreCase(subfix)){
                return new Result(false,"上传失败，只能上传jpg格式的图片！");
            }
            //重新生成文件名（根据具体情况生成对应文件名）
            fileName = UUID.randomUUID() + subfix;
            //设置上传文件所存放的路径
            String dirPath="src/main/resources/backend/upload";
            File filePath = new File(dirPath);
            if (!filePath.exists()){  
                filePath.mkdirs();
            }
            try{
                file.transferTo(new File(filePath.getCanonicalFile() + "/" + fileName));
                return new Result(true,"/backend/upload/"+fileName);
            }catch (Exception e){
                e.printStackTrace();
                //上传失败，返回错误信息
                return new Result(false,"上传失败！原因：" + e.getMessage());
            }
        }
        return new Result(false,"上传失败！");
    }
}