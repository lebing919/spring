package com.hbwl.server;

import com.hbwl.bookdao.BookDaoimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookServer")
public class BookServer implements BookService {
    @Autowired
    private BookDaoimpl bookDao;
    public void save() {
        System.out.println("BookServer success!");
        bookDao.save();
        System.out.println(bookDao);
    }
    public void setBookDao(BookDaoimpl bookDao) {
        this.bookDao = bookDao;
    }
}
