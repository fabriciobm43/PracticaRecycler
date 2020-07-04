package com.example.practicarecycler;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AccesoriosViewHolder extends RecyclerView.ViewHolder {
    ImageView imagen;
    TextView nombre;
    TextView descripcion;
    TextView precio;
    public AccesoriosViewHolder(@NonNull View itemView) {
        super(itemView);
        imagen= itemView.findViewById(R.id.img_Acces);
        nombre=itemView.findViewById(R.id.txt_Nombre);
        descripcion=itemView.findViewById(R.id.txt_Descripcion);
        precio= itemView.findViewById(R.id.txt_Precio);

    }
}
