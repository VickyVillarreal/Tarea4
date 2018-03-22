package com.iteso.sesion13_scrollabletab;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.iteso.sesion13_scrollabletab.Beans.Category;
import com.iteso.sesion13_scrollabletab.Beans.Store;
import com.iteso.sesion13_scrollabletab.Beans.itemProduct;
import com.iteso.sesion13_scrollabletab.database.CategoryControl;
import com.iteso.sesion13_scrollabletab.database.DataBaseHandler;
import com.iteso.sesion13_scrollabletab.database.ItemProductControl;
import com.iteso.sesion13_scrollabletab.database.StroreControl;

import java.util.ArrayList;

public class ActivityProduct extends AppCompatActivity {
  /*  protected Spinner stores;
    protected Spinner categories;
    protected Spinner images;
    protected EditText id;
    protected EditText title;
    protected EditText description;
    protected ArrayAdapter<Store> storesAdapter;
    protected ArrayAdapter<Category> categoriesAdapter;
    protected ArrayAdapter<String> imagesAdapter;
    protected DataBaseHandler dh; //DataBase Instance
    protected Store storeSelected; //Store selected in spinner
    protected Category categorySelected; //Category selected in spinner
    protected int imageSelected; //Image selected in spinner
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        storeSelected = null;
        categorySelected = null;
        imageSelected = -1;
//DataBase Objects
        dh = DataBaseHandler.getInstance(this);
        StroreControl storeControl = new StroreControl();
        CategoryControl categoryControl = new CategoryControl();
//Fill info from Database
        ArrayList<Store> storesList = storeControl.getStores( dh);
        ArrayList<Category> categoriesList = categoryControl.getCategories(dh);
//Create Adapter to show into Spinner, ListView or GridLayout
        storesAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, storesList);
        stores.setAdapter(storesAdapter);
        categoriesAdapter =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categoriesList);
        categories.setAdapter(categoriesAdapter);
        ArrayList<String> myimages = new ArrayList<>();
        myimages.add("Mac"); myimages.add("Alienware");
        imagesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myimages);
        images.setAdapter(imagesAdapter);
        stores.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                storeSelected = storesAdapter.getItem(position);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });
        images.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imageSelected = position;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        public void setCategorySelected(int categoryId){
            for (int position = 0; position < categoriesAdapter.getCount(); position++)
            {
                if(categoryId == ((Category) categoriesAdapter.getItem(position)).getIdCategory())
                {
                    categories.setSelection(position);
                    return;
                }
            }
        }
    public void setStoreSelected(int storeId){
        for (int position = 0; position < storesAdapter.getCount(); position++)
        {
            if(((Store)storesAdapter.getItem(position)).getId() == storeId)
            {
                stores.setSelection(position);
                return;
            }
        }
    }
    public void setImageSelected(int imageId){
        images.setSelection(imageId);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_product_search:
                int idProduct = 0;
                try {
                    idProduct = Integer.parseInt(id.getText().toString().trim());
                }catch(NumberFormatException e){ return; }
                ItemProductControl itemProductControl = new ItemProductControl();
                itemProduct itemProduct = itemProductControl.getProductById(idProduct, dh);
                if(itemProduct != null) {
                    title.setText(itemProduct.getTitle());
                    description.setText(itemProduct.getDescription());
                    if(itemProduct.getCategory() != null) {
                        setCategorySelected(itemProduct.getCategory().getIdCategory());}
                    if(itemProduct.getStore()!= null) {
                        setStoreSelected(itemProduct.getStore().getId());}
                    setImageSelected(itemProduct.getImage());
                }
                break;
        }
    }*/

}
