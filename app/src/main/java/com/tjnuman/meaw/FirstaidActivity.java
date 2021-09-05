package com.tjnuman.meaw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FirstaidActivity extends AppCompatActivity {
    private RecyclerView tasksRecyclerView;
    private RecyclerAdapter tasksAdapter;
    private EditText searchbar;
    String [] titlearray,descriptionarray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstaid);
        searchbar = findViewById(R.id.searchbar);
        tasksRecyclerView = findViewById(R.id.itemsrecycler);

        titlearray = getResources().getStringArray(R.array.titlearray);
        descriptionarray = getResources().getStringArray(R.array.detailarray);
        tasksAdapter = new RecyclerAdapter(this,titlearray,descriptionarray);
        tasksRecyclerView.setAdapter(tasksAdapter);
        tasksRecyclerView.setLayoutManager(new LinearLayoutManager(this));






//        searchbar.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                filter(s.toString());
//            }
//        });



    }


//    private void filter(String text) {
//
//        ArrayList<FirstAidModel> filteredList = new ArrayList<>();
//        for(titlearray item : titlearra)
//        {
//            if(item.getTitle().toLowerCase().contains(text.toLowerCase())){
//                filteredList.add(item);
//            }
//        }
//        tasksAdapter.filterList(filteredList);
//    }
}