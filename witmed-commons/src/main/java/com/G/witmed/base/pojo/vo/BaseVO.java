package com.G.witmed.base.pojo.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>基础信息功能 - 基础视图信息</b>
 * <p>
 *     基础视图信息设置了如下属性：
 *     1、status：系统状态
 *     2、createdBy：创建人
 *     3、createdTime：创建时间
 *     4、modifiedBy：修改人
 *     5、modifiedTime：修改时间
 *     本项目所有功能视图信息都必须继承于本基础视图信息
 * </p>
 */
public class BaseVO implements Serializable {
    private static final long serialVersionUID = 5811194868718091569L;
    private String status;
    private String createdBy;
    private Date createdTime;
    private String modifiedBy;
    private Date modifiedTime;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
}
