package com.uucoding.gof23.structural.composite;

import java.util.ArrayList;

/**
 * 测试
 *
 * @author : uu
 * @version : v1.0
 * @Date 2021/1/30  15:07
 */
public class Client {

    public static void main(String[] args) {
        Category level11 = new Category("图书", 1);

        level11.setSubCategoryList(new ArrayList<Category>(){{
            add(new Category("科幻类", 2));
            add(new Category("武侠类", 2));
            add(new Category("计算机类", 2));
        }});

        Category level12 = new Category("电子产品", 1);

        level12.setSubCategoryList(new ArrayList<Category>(){{
            add(new Category("手机", 2));
            add(new Category("电脑", 2));
            add(new Category("U盘", 2));
        }});

        Category level = new Category("商城分类", 0);
        level.setSubCategoryList(new ArrayList<Category>(){{
            add(level11);
            add(level12);
        }});
        printTree(level, level.getLevel());
    }

    private static void printTree(Category category, Integer level) {
        for (int i = 0; i < level; i++) {
            System.out.print("\t");
        }
        if (!level.equals(0)) {
            System.out.print("|-");
        }
        System.out.println(category.getName());
        if (category.getSubCategoryList() == null) {
            return;
        }
        for (Category tempCategory : category.getSubCategoryList()) {
            printTree(tempCategory, tempCategory.getLevel());
        }
    }
}
