package com.example.trainingdesign.Models;

import android.os.Parcel;
import android.os.Parcelable;

public class CollectionModel implements Parcelable {
    private String collectionName;
    private int collectionThumbnail;

    public CollectionModel(String collectionName, int collectionThumbnail) {
        this.collectionName = collectionName;
        this.collectionThumbnail = collectionThumbnail;
    }

    private CollectionModel(Parcel in) {
        collectionName = in.readString();
        collectionThumbnail = in.readInt();
    }

    public static final Creator<CollectionModel> CREATOR = new Creator<CollectionModel>() {
        @Override
        public CollectionModel createFromParcel(Parcel in) {
            return new CollectionModel(in);
        }

        @Override
        public CollectionModel[] newArray(int size) {
            return new CollectionModel[size];
        }
    };

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public int getCollectionThumbnail() {
        return collectionThumbnail;
    }

    public void setCollectionThumbnail(int collectionThumbnail) {
        this.collectionThumbnail = collectionThumbnail;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(collectionName);
        dest.writeInt(collectionThumbnail);
    }
}
