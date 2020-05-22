package com.example.trainingdesign.Models;

public class CategoryModel {
    private String categoryName;
    private int categoryimage;

    public CategoryModel() {
    }

    public CategoryModel(String categoryName, int categoryimage) {
        this.categoryName = categoryName;
        this.categoryimage = categoryimage;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryimage() {
        return categoryimage;
    }

    public void setCategoryimage(int categoryimage) {
        this.categoryimage = categoryimage;
    }


}
