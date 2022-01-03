package com.emoran.practicarv;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MiAdaptador extends RecyclerView.Adapter<MiAdaptador.ViewHolder>
{
    private List<String> mData;
    private LayoutInflater mInflater;
    //Constructor le pasamos datos

    MiAdaptador(Context context, List<String> data){
        this.mInflater=LayoutInflater.from(context);
        this.mData=data;

    }


    @Override
    //construye (infla) cada fila con lo que hemos creado en el xml row.
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
       View view = mInflater.inflate(R.layout.row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
            String animal = mData.get(position);
            holder.myTextView.setText(animal);
        }


    //Recupera la posicion del elemento que clickeamos
    //asigna al textview el nombre del animal;


    @Override
    // cuenta los elementos para saber cuando llegar al final en este caso le pasamos el tamaño de nuesto arraylist
    public int getItemCount() {
        return  mData.size();
    }

    // construimos(inflamos) la vista para cada fila que previamente creamos en row.


    public class  ViewHolder extends  RecyclerView.ViewHolder{
        TextView myTextView;
        ViewHolder(View itemView){
            super(itemView);
            myTextView = itemView.findViewById(R.id.tvAnimalNombre);
        }
    }



}
