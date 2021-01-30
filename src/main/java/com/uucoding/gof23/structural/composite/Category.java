package com.uucoding.gof23.structural.composite;

import java.util.List;

/**
 * 分类
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/30  15:05
 */
public class Category {

    /**
     * 名称
     */
    private String name;

    /**
     * 级别
     */
    private Integer level;

    /**
     * 子分类
     */
    private List<Category> subCategoryList;

    public Category(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    public List<Category> getSubCategoryList() {
        return subCategoryList;
    }

    public void setSubCategoryList(List<Category> subCategoryList) {
        this.subCategoryList = subCategoryList;
    }
}
