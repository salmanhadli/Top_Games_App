package com.example.topgamesapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<GameModel> gamesList = new ArrayList<GameModel>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        gamesList.add(new GameModel("Horizon Chase", R.drawable.card1));
        gamesList.add(new GameModel("PUBG", R.drawable.card2));
        gamesList.add(new GameModel("Head Ball 2", R.drawable.card3));
        gamesList.add(new GameModel("Hooked on You", R.drawable.card4));
        gamesList.add(new GameModel("FIFA 2022", R.drawable.card5));
        gamesList.add(new GameModel("Fortnite", R.drawable.card6));

        MyAdapter adapter = new MyAdapter(this, gamesList);

        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}