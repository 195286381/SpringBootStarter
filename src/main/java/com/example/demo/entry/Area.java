package com.example.demo.entry;

import java.util.Date;

/**
 * @author zhuzhiwei
 * @since 2018/7/26
 */
public class Area {
    // 主键
    private Integer AreaId;
    // 区域名
    private String AreaName;
    // 优先区域
    private Integer priority;
    // 创建时间
    private Date createTime;
    // 最后修改时间
    private Date lastEditTime;

    public Integer getAreaId() {
        return AreaId;
    }

    public void setAreaId(Integer areaId) {
        AreaId = areaId;
    }

    public String getAreaName() {
        return AreaName;
    }

    public void setAreaName(String areaName) {
        AreaName = areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
