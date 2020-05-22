package com.example.trainingdesign.Models;

public class CardModel {
    private String cardName;
    private int cardThumbnail;
    private int cardBackGround;
    private String cardQuantity;
    private double cardPrice;
    private int storeThumb;

    public CardModel(String cardName, int cardThumbnail, int cardBackGround, String cardQuantity, double cardPrice, int storeThumb) {
        this.cardName = cardName;
        this.cardThumbnail = cardThumbnail;
        this.cardBackGround = cardBackGround;
        this.cardQuantity = cardQuantity;
        this.cardPrice = cardPrice;
        this.storeThumb = storeThumb;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCardThumbnail() {
        return cardThumbnail;
    }

    public void setCardThumbnail(int cardThumbnail) {
        this.cardThumbnail = cardThumbnail;
    }

    public int getCardBackGround() {
        return cardBackGround;
    }

    public void setCardBackGround(int cardBackGround) {
        this.cardBackGround = cardBackGround;
    }

    public String getCardQuantity() {
        return cardQuantity;
    }

    public void setCardQuantity(String cardQuantity) {
        this.cardQuantity = cardQuantity;
    }

    public double getCardPrice() {
        return cardPrice;
    }

    public void setCardPrice(double cardPrice) {
        this.cardPrice = cardPrice;
    }

    public int getStoreThumb() {
        return storeThumb;
    }

    public void setStoreThumb(int storeThumb) {
        this.storeThumb = storeThumb;
    }

}
