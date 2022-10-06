package com.hbwl.bookdao;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("bookDao")
public class BookDaoimpl implements BookDao {

    public void save() {
        System.out.println("niuniu");
    }
}
