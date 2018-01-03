package com.xuzp.ksql;

import java.util.List;

public class DBTable {

    /** 表名 */
    private String tableName;

    /** 表注释 */
    private String remark;

    /** 表所属数据库名 */
    private String tableCat;

    /** 表模式 */
    private String tableScheme;

    /** 表类型，可选值：TABLE */
    private String tableType;

    private String tableTypeName;

    private String tableTypeCat;

    private String tableTypeScheme;

    private String refGeneration;

    private String selfReferencingColName;

    private List<DBColumn> columns;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getTableCat() {
        return tableCat;
    }

    public void setTableCat(String tableCat) {
        this.tableCat = tableCat;
    }

    public String getTableScheme() {
        return tableScheme;
    }

    public void setTableScheme(String tableScheme) {
        this.tableScheme = tableScheme;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public String getTableTypeName() {
        return tableTypeName;
    }

    public void setTableTypeName(String tableTypeName) {
        this.tableTypeName = tableTypeName;
    }

    public String getTableTypeCat() {
        return tableTypeCat;
    }

    public void setTableTypeCat(String tableTypeCat) {
        this.tableTypeCat = tableTypeCat;
    }

    public String getTableTypeScheme() {
        return tableTypeScheme;
    }

    public void setTableTypeScheme(String tableTypeScheme) {
        this.tableTypeScheme = tableTypeScheme;
    }

    public String getRefGeneration() {
        return refGeneration;
    }

    public void setRefGeneration(String refGeneration) {
        this.refGeneration = refGeneration;
    }

    public String getSelfReferencingColName() {
        return selfReferencingColName;
    }

    public void setSelfReferencingColName(String selfReferencingColName) {
        this.selfReferencingColName = selfReferencingColName;
    }

    public List<DBColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<DBColumn> columns) {
        this.columns = columns;
    }
}
