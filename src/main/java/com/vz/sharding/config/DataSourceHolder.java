package com.vz.sharding.config;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.datasource.lookup.DataSourceLookupFailureException;

/**
 * @author victorzhang0929@hotmail.com
 * @since 2019-09-17 19:22
 */
@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DataSourceHolder {

    private static final ThreadLocal<String> HOLDER = new ThreadLocal<>();

    public static void setDataSource(String dataSourceName) {
        if (StringUtils.isBlank(dataSourceName)) {
            throw new DataSourceLookupFailureException("Set datSourceMode failed, dataSourceName can not be blank");
        }
        HOLDER.set(dataSourceName);
    }

    public static void release() {
        HOLDER.remove();
    }

    public static String getDataSource() {
        return HOLDER.get();
    }
}
