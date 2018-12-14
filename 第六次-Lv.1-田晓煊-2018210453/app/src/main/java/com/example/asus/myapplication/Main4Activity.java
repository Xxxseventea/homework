package com.example.asus.myapplication;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {
    private List<Steam> steamList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        initGames();
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        MyAdapter adapter = new MyAdapter(steamList);
        recyclerView.setAdapter(adapter);
        }
        private void initGames(){
        for (int i = 0;i<2;i++){
            Steam game1 = new Steam(R.mipmap.steam1);
            steamList.add(game1);
            Steam game2 = new Steam(R.mipmap.steam2);
            steamList.add(game2);
            Steam game3 = new Steam(R.mipmap.steam3);
            steamList.add(game3);
            Steam game4 = new Steam(R.mipmap.steam4);
            steamList.add(game4);
            Steam game5 = new Steam(R.mipmap.steam5);
            steamList.add(game5);
            Steam game6 = new Steam(R.mipmap.steam6);
            steamList.add(game6);
            Steam game7 = new Steam(R.mipmap.steam7);
            steamList.add(game7);
        }
        }
    }
