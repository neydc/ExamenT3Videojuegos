package com.eduardo.collantes.clases.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.eduardo.collantes.clases.MainActivity;
import com.eduardo.collantes.clases.R;

import java.util.List;


import com.squareup.picasso.*;


public class MyStringAdapter extends RecyclerView.Adapter<MyStringAdapter.MyStringViewHolder> {

    private List<String> mData;
    private List<MainActivity.Anime> mAnime;
    private MainActivity mainActivity;


    public MyStringAdapter(/*List<String> data,*/ List<MainActivity.Anime> anime, MainActivity mainActivity){
        //mData = data;
        this.mAnime = anime;
        this.mainActivity=mainActivity;

    }


    @NonNull
    @Override
    public MyStringViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_string,parent,false);



        return new MyStringViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyStringViewHolder holder, int position) {
    TextView tvNombre =holder.mView.findViewById(R.id.tvNombre);
    TextView tvInicial =holder.mView.findViewById(R.id.tvInicial);
        TextView tvDesc =holder.mView.findViewById(R.id.descripcion);
    ImageView ivAvatar =holder.mView.findViewById(R.id.ivAvatar);
    String text = "";
        MainActivity.Anime anime = mAnime.get(position);
        tvNombre.setText(anime.nombre);
        tvDesc.setText(anime.descripcion);
       // tvInicial.setText(anime.nombre.substring(0,1));
        Picasso.with(mainActivity.getApplicationContext()).load( mAnime.get(position).imagen).resize(120, 60).into(ivAvatar);

    }

    @Override
    public int getItemCount() {
        //return mData.size();
        return mAnime.size();
    }

    public class MyStringViewHolder extends RecyclerView.ViewHolder{

        private View mView;
        public MyStringViewHolder(@NonNull View itemView){
            super(itemView);
            mView=itemView;
        }
    }
}
