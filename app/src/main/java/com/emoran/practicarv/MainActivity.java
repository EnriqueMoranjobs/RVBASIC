package com.emoran.practicarv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String>animalNames = new ArrayList<>();
        animalNames.add("CABALLO");
        animalNames.add("PERRO");
        animalNames.add("CERDO");
        animalNames.add("GATO");
        animalNames.add("LEON");
        animalNames.add("TIGRE");
        animalNames.add("RINOCERONTE");
        animalNames.add("AGUILA");

        RecyclerView recyclerView = findViewById(R.id.rvAnimales);
        LinearLayoutManager mlayout = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mlayout);
        MiAdaptador adapter = new MiAdaptador(this, animalNames);
        recyclerView.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
              mlayout.getOrientation()  );
        recyclerView.addItemDecoration(dividerItemDecoration);
    }
}