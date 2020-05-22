package com.example.trainingdesign.Models;


public class StoreModel {
    private String storeName;
    private int storeThumbnail;

    public StoreModel(String storeName, int storeThumbnail) {
        this.storeName = storeName;
        this.storeThumbnail = storeThumbnail;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public int getStoreThumbnail() {
        return storeThumbnail;
    }

    public void setStoreThumbnail(int storeThumbnail) {
        this.storeThumbnail = storeThumbnail;
    }
}
