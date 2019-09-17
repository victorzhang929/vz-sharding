package com.vz.sharding.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 路由数据源
 * @author victorzhang0929@hotmail.com
 * @since 2019-09-17 19:21
 */
public final class RoutingDataSource  extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.getDataSource();
    }
}
