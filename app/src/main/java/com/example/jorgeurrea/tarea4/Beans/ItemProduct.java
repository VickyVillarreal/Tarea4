package com.example.jorgeurrea.tarea4.Beans;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.ParseException;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jorgeurrea.tarea4.ActivityMain;
import com.example.jorgeurrea.tarea4.AdapterProduct;
import com.example.jorgeurrea.tarea4.R;

import org.w3c.dom.Text;


public class ItemProduct implements Parcelable{
    private String title, store, location, phone, description;
    private int image;
    private int thumbnail;
    private int code;

    public ItemProduct (Parcel in){
        image = in.readInt();
        title= in.readString();
        store = in.readString();
        location = in.readString();
        phone = in.readString();
        description = in.readString();
        code = in.readInt();

    }

    public itemProduct(){
        image = 0;
        title = "";
        store = "";
        location = "";
        phone = "";
        description = "";

    }

    public itemProduct(String title, String store, String location, String phone, String description, int image, int thumbnail, int code) {
        this.title = title;
        this.store = store;
        this.image = image;
        this.thumbnail = thumbnail;
        this.location = location;
        this.phone = phone;
        this.description = description;
        this.code = code;
    }

    public static final Creator<ItemProduct> CREATOR = new Creator<ItemProduct>() {
        @Override
        public ItemProduct createFromParcel(Parcel in) {
            return new ItemProduct(in);
        }

        @Override
        public ItemProduct[] newArray(int size) {
            return new ItemProduct[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int i) {
        dest.writeInt(image);
        dest.writeString(title);
        dest.writeString(store);
        dest.writeString(location);
        dest.writeString(phone);
        dest.writeString(description);
        dest.writeInt(code);
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "itemProduct{" +
                "product='" + title + '\'' +
                ", store='" + store + '\'' +
                ", location='" + location + '\'' +
                ", phone='" + phone + '\'' +
                ", description= '"+ description + '\'' +
                ", code= '" + code + '\'' +
                '}';
    }



}