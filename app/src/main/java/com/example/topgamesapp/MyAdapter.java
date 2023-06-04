package com.example.topgamesapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    // Step 1
    private Context context;
    private ArrayList<GameModel> gamesList;


    // Step 2 constructor
    public MyAdapter(Context context, ArrayList<GameModel> gamesList) {
        this.context = context;
        this.gamesList = gamesList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_custom_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GameModel model = gamesList.get(position);
        holder.gameTitle.setText((model.getTitle()));
        holder.gameImage.setImageResource(model.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "You choose: " + model.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return gamesList.size();
    }


    // Step 3 View Holder
    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView gameImage;
        private TextView gameTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.gameImage = itemView.findViewById(R.id.cardViewImg);
            this.gameTitle = itemView.findViewById(R.id.cardText);
        }
    }


}
