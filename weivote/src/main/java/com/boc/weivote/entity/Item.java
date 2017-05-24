package com.boc.weivote.entity;

import java.io.Serializable;

public class Item implements Serializable {
    private Integer id;

    private Integer topicId;

    private String itemContent;

    private String voteUserIds;

    private static final long serialVersionUID = 1L;

    public Item(Integer id, Integer topicId, String itemContent, String voteUserIds) {
        this.id = id;
        this.topicId = topicId;
        this.itemContent = itemContent;
        this.voteUserIds = voteUserIds;
    }

    public Item() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTopicId() {
        return topicId;
    }

    public void setTopicId(Integer topicId) {
        this.topicId = topicId;
    }

    public String getItemContent() {
        return itemContent;
    }

    public void setItemContent(String itemContent) {
        this.itemContent = itemContent == null ? null : itemContent.trim();
    }

    public String getVoteUserIds() {
        return voteUserIds;
    }

    public void setVoteUserIds(String voteUserIds) {
        this.voteUserIds = voteUserIds == null ? null : voteUserIds.trim();
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
        Item other = (Item) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTopicId() == null ? other.getTopicId() == null : this.getTopicId().equals(other.getTopicId()))
            && (this.getItemContent() == null ? other.getItemContent() == null : this.getItemContent().equals(other.getItemContent()))
            && (this.getVoteUserIds() == null ? other.getVoteUserIds() == null : this.getVoteUserIds().equals(other.getVoteUserIds()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTopicId() == null) ? 0 : getTopicId().hashCode());
        result = prime * result + ((getItemContent() == null) ? 0 : getItemContent().hashCode());
        result = prime * result + ((getVoteUserIds() == null) ? 0 : getVoteUserIds().hashCode());
        return result;
    }
}