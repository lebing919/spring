package com.hbwl.dao;

import com.hbwl.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

public interface TestDao {
    @Insert("insert into emp(name,age,dep_id)values (#{name},#{age},#{dep_id})")
    void insert(Account account);

    void le();

    @Select("select * from emp where id = #{id}")
    Account select(Integer id);
}
