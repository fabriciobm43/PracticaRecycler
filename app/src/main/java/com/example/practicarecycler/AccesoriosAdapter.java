package com.example.practicarecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class AccesoriosAdapter extends RecyclerView.Adapter<AccesoriosViewHolder> {

    ArrayList<Accesorios>  accesorios;

    public AccesoriosAdapter(){
        accesorios=new ArrayList<>();
    }

    public void setData(ArrayList<Accesorios> accesorios){
        this.accesorios=accesorios;
    }

    @NonNull
    @Override
    public AccesoriosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context= parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View accesoriosView= layoutInflater.inflate(R.layout.listaaccesorios,parent,false);

        return new AccesoriosViewHolder(accesoriosView);
    }

    @Override
    public void onBindViewHolder(@NonNull AccesoriosViewHolder holder, int position) {
        Accesorios accesorio= accesorios.get(position);
        Picasso.get().load(accesorio.imagenurl).into(holder.imagen);
        holder.nombre.setText(accesorio.nombre);
        holder.descripcion.setText(accesorio.descripcion);
        holder.precio.setText(accesorio.precio.toString());
    }

    @Override
    public int getItemCount() {
        return accesorios.size();
    }
}
