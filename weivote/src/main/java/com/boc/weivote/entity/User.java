package com.boc.weivote.entity;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;

    private String userName;

    private String weixinKeys;

    private Byte userRight;

    private static final long serialVersionUID = 1L;

    public User(Integer id, String userName, String weixinKeys, Byte userRight) {
        this.id = id;
        this.userName = userName;
        this.weixinKeys = weixinKeys;
        this.userRight = userRight;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getWeixinKeys() {
        return weixinKeys;
    }

    public void setWeixinKeys(String weixinKeys) {
        this.weixinKeys = weixinKeys == null ? null : weixinKeys.trim();
    }

    public Byte getUserRight() {
        return userRight;
    }

    public void setUserRight(Byte userRight) {
        this.userRight = userRight;
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getWeixinKeys() == null ? other.getWeixinKeys() == null : this.getWeixinKeys().equals(other.getWeixinKeys()))
            && (this.getUserRight() == null ? other.getUserRight() == null : this.getUserRight().equals(other.getUserRight()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getWeixinKeys() == null) ? 0 : getWeixinKeys().hashCode());
        result = prime * result + ((getUserRight() == null) ? 0 : getUserRight().hashCode());
        return result;
    }
}