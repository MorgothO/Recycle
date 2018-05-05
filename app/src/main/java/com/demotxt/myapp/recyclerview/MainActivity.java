package com.demotxt.myapp.recyclerview;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {
   // private BottomSheetBehavior mBottomSheetBehavior1;
    Button mButton1;
    List<Book> lstBook;
    List<Book> item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





item = new ArrayList<>();
        item.add(new Book("T", "Categorie Shoe", "Description Shoe", R.drawable.one,400));
        item.add(new Book("t", "Categorie Shoe", "Description Shoe", R.drawable.two,250));
        item.add(new Book("e", "Categorie Shoe", "Description Shoe", R.drawable.three,300));
        item.add(new Book("a", "Categorie Shoe", "Description Shoe", R.drawable.four,100));

    /*    item.add(new Book("T", "Categorie Shoe", "Description Shoe", R.drawable.one,40));
        item.add(new Book("t", "Categorie Shoe", "Description Shoe", R.drawable.two,20));
        item.add(new Book("e", "Categorie Shoe", "Description Shoe", R.drawable.three,30));
        item.add(new Book("a", "Categorie Shoe", "Description Shoe", R.drawable.four,10));
*/

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, item);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));

        myrv.setAdapter(myAdapter);


    }

    public void sendMessage(View view) {
        Book b = new Book();
        ListIterator itit = item.listIterator();
        b=(Book)itit.next();
        System.out.println(b.price);
        Log.d("MyApp", String.valueOf(b.price));
        Collections.sort(item);


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, item);
        myrv.setLayoutManager(new GridLayoutManager(this, 2));

        myrv.setAdapter(myAdapter);


















    }
}