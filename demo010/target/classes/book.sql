CREATE DATABASE springbootdata;
USE springbootdata;
CREATE TABLE book (
    id int(0) NOT NULL AUTO_INCREMENT,
    name varchar(32),
    author varchar(32),
    press varchar(32),
    status varchar(1),
    PRIMARY KEY (id) USING BTREE
);
INSERT INTO book VALUES (1,'楚辞','屈原','中国文联出版社','0');
INSERT INTO book VALUES (2,'史记','司马迁','中国文联出版社','1');
INSERT INTO book VALUES (3,'西游记','吴承恩','中国文联出版社','2');
