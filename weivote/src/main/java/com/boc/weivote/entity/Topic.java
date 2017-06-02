package com.boc.weivote.entity;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Topic implements Serializable {
	
    private Integer id;
    
    private String topic;
    @JsonIgnore
    private Byte status;

    private Byte requeired;

    private Byte maxChecks;
    @JsonIgnore
    private Date createTime;
    @JsonIgnore
    private Date updateTime;
    @JsonIgnore
    private String createBy;

    private static final long serialVersionUID = 1L;

    public Topic(Integer id, String topic, Byte status, Byte requeired, Byte maxChecks, Date createTime, Date updateTime, String createBy) {
        this.id = id;
        this.topic = topic;
        this.status = status;
        this.requeired = requeired;
        this.maxChecks = maxChecks;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.createBy = createBy;
    }

    public Topic() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic == null ? null : topic.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getRequeired() {
        return requeired;
    }

    public void setRequeired(Byte requeired) {
        this.requeired = requeired;
    }

    public Byte getMaxChecks() {
        return maxChecks;
    }

    public void setMaxChecks(Byte maxChecks) {
        this.maxChecks = maxChecks;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Topic other = (Topic) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTopic() == null ? other.getTopic() == null : this.getTopic().equals(other.getTopic()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRequeired() == null ? other.getRequeired() == null : this.getRequeired().equals(other.getRequeired()))
            && (this.getMaxChecks() == null ? other.getMaxChecks() == null : this.getMaxChecks().equals(other.getMaxChecks()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTopic() == null) ? 0 : getTopic().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRequeired() == null) ? 0 : getRequeired().hashCode());
        result = prime * result + ((getMaxChecks() == null) ? 0 : getMaxChecks().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        return result;
    }
}