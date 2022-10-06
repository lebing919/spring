package com.hbwl.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * @ClassName: MybatisConfig
 * @Author: le
 * @Date: 2022/10/6 14:19
 **/
@Component
public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean =new SqlSessionFactoryBean();
//        设置数据库传入的对象类型所在的包，例如：人物对象Account在domain包下
        sqlSessionFactoryBean.setTypeAliasesPackage("com.hbwl.domain");
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer msc =new MapperScannerConfigurer();
        msc.setBasePackage("com.hbwl.dao");
        return msc;
    }


}
