package com.rins.wishMarking.model;

import java.time.LocalDateTime;

enum Category {
    CLOTH,
    ACC,
    SHOES
     }

public class Marking {
    private int markNo;
    private String markUrl;
    private Category category;
    private String subCategory;
    private String optionalCategory;
    private String title;
    private String description;
    private int priority;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Member member;

    public int getMarkNo() {
        return markNo;
    }

    public void setMarkNo(int markNo) {
        this.markNo = markNo;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getMarkUrl() {
        return markUrl;
    }

    public void setMarkUrl(String markUrl) {
        this.markUrl = markUrl;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getOptionalCategory() {
        return optionalCategory;
    }

    public void setOptionalCategory(String optionalCategory) {
        this.optionalCategory = optionalCategory;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Marking(String markUrl, Category category, String subCategory, String optionalCategory, String title, String description, int priority, LocalDateTime createdAt, LocalDateTime updatedAt, Member member, int markNo) {
        this.markUrl = markUrl;
        this.category = category;
        this.subCategory = subCategory;
        this.optionalCategory = optionalCategory;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.member = member;
        this.markNo = markNo;
    }

    @Override
    public String toString() {
        return "Marking{" +
                "markUrl='" + markUrl + '\'' +
                ", Category='" + category + '\'' +
                ", subCategory='" + subCategory + '\'' +
                ", optionalCategory='" + optionalCategory + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
