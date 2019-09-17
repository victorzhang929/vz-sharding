package com.vz.sharding.config.aop;

import com.vz.sharding.config.DataSourceHolder;
import com.vz.sharding.config.annotation.TargetDataSource;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 数据源切面
 * 动态数据源切换，资源释放
 * @author victorzhang0929@hotmail.com
 * @since 2019-09-17 19:29
 */
@Slf4j
@Aspect
@Component
public class DataSourceAspect {

    @Before("@annotation(targetDataSource)")
    public void switchDataSource(TargetDataSource targetDataSource) {
        log.info("DataSourceAspect switchDataSource is {}", targetDataSource.value());
        DataSourceHolder.setDataSource(targetDataSource.value());
    }

    @After("@annotation(targetDataSource)")
    public void restoreDataSource(TargetDataSource targetDataSource) {
        log.info("DataSourceAspect restoreDataSource is {}", targetDataSource.value());
        DataSourceHolder.release();
    }
}


