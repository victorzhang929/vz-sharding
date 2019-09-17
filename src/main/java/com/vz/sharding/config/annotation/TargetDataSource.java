package com.vz.sharding.config.annotation;

import java.lang.annotation.*;

/**
 * 动态数据源注解，目标数据源
 * @author victorzhang0929@hotmail.com
 * @since 2019-09-17 19:30
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TargetDataSource {

    /**
     * 数据源名称
     * @return 具体目标数据源名称
     */
    String value();
}
