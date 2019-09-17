package com.vz.sharding;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 分库分表启动类
 * @author victorzhang0929@hotmail.com
 * @since ${YEAR}-${MONTH}-${DAY} ${HOUR}:${MINUTE}
 */
@Slf4j
@SpringBootApplication
public class ShardingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingApplication.class, args);
        log.info("分库分表服务启动[成功]");
    }
}
