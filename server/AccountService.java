package com.hbwl.server;

import com.hbwl.dao.TestDao;
import com.hbwl.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: AccountService
 * @Author: le
 * @Date: 2022/10/6 14:52
 **/
@Service("accountService")
public class AccountService {
    @Autowired
    private TestDao testdao;

    public void le(){
        System.out.println("niuniu");
    }
    public Account select(Integer id){
        return testdao.select(id);
    }
    public void insert(Account account){
        testdao.insert(account);
    }
}
