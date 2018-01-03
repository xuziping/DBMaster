package com.xuzp.ksql;

import java.util.List;

/**
 * @author za-xuzhiping
 * @Date 2017/11/27
 * @Time 17:42
 */
public class DBInfo {

    /** 数据库产品名称 */
    private String databaseProductName;

    /** 数据库产品版本号 */
    private String databaseProductVersion;

    /** 数据库用作类别和表名之间的分隔符 */
    private String catalogSeparator;

    /** 驱动版本 */
    private String driverVersion;

    /** 可用的数据库名称列表 */
    private List<String> catalogs;

    public String getDatabaseProductName() {
        return databaseProductName;
    }

    public void setDatabaseProductName(String databaseProductName) {
        this.databaseProductName = databaseProductName;
    }

    public String getDatabaseProductVersion() {
        return databaseProductVersion;
    }

    public void setDatabaseProductVersion(String databaseProductVersion) {
        this.databaseProductVersion = databaseProductVersion;
    }

    public String getCatalogSeparator() {
        return catalogSeparator;
    }

    public void setCatalogSeparator(String catalogSeparator) {
        this.catalogSeparator = catalogSeparator;
    }

    public String getDriverVersion() {
        return driverVersion;
    }

    public void setDriverVersion(String driverVersion) {
        this.driverVersion = driverVersion;
    }

    public List<String> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<String> catalogs) {
        this.catalogs = catalogs;
    }
}
