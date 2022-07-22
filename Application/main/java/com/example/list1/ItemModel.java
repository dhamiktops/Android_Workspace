package com.example.list1;

public class ItemModel
{

    int image;
    String text;
    String txt2;
    String txt3;

    ItemModel( int image, String text,String txt2,String txt3)
    {
        this.image=image;
        this.text=text;
        this.txt2=txt2;
        this.txt3=txt3;

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }

    public String getTxt3() {
        return txt3;
    }

    public void setTxt3(String txt3) {
        this.txt3 = txt3;
    }
}
