package com.example.jorgeurrea.tarea4;

import android.content.Intent;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jorgeurrea.tarea4.Beans.ItemProduct;

import java.util.ArrayList;
import java.util.Iterator;



public class FragmentTechnology extends android.support.v4.app.Fragment {
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<ItemProduct> productstech;

    public FragmentTechnology() {}

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_technology, container, false);
        RecyclerView recyclerView = (RecyclerView)
                view.findViewById(R.id.fragment_technology_recycler_view);

        recyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);


        productstech= new ArrayList<ItemProduct>();
        productstech.add(new ItemProduct(getString(R.string.title_item1),
                getString(R.string.store_item1), getString(R.string.location_item1),
                getString(R.string.phone_item1),getString(R.string.description_item1),
                0, 0 ,0));

        productstech.add(new ItemProduct(getString(R.string.title_item2),
                getString(R.string.store_item2), getString(R.string.location_item2),
                getString(R.string.phone_item2),getString(R.string.description_item2),
                1, 1,1 ));

        productstech.add(new ItemProduct(getString(R.string.title_item3),
                getString(R.string.store_item3), getString(R.string.location_item3),
                getString(R.string.phone_item3),getString(R.string.description_item3),
                2, 2,2 ));

        mAdapter = new AdapterProduct(getActivity(), productstech);
        recyclerView.setAdapter(mAdapter);
        return view;
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        ItemProduct itemProduct = data.getParcelableExtra("ITEM");
        Iterator<ItemProduct> iterator = productstech.iterator();
        int position = 0;
        while(iterator.hasNext()){
            ItemProduct item = iterator.next();
            if(item.getCode() == itemProduct.getCode()){
                productstech.set(position, itemProduct);
                break;
            }
            position++;
        }
        mAdapter.notifyDataSetChanged();
    }


}