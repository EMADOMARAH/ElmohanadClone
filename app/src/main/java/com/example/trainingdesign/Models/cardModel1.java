package com.example.trainingdesign.Models;

import android.view.View;
import android.widget.TextView;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class cardModel1
{


    String textfield;
    String image;

    public cardModel1(String textfield, String image) {
        this.textfield = textfield;
        this.image = image;
    }



    public String getTextfield() {
        return textfield;
    }

    public void setTextfield(String textfield) {
        this.textfield = textfield;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

