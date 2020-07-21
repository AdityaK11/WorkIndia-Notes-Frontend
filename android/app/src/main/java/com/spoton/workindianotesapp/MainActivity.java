package com.spoton.workindianotesapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        RecyclerView rv = findViewById(R.id.rv_notes);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewDialog dialog = new ViewDialog();
                dialog.showDialog(MainActivity.this);
            }
        });

        rv.setLayoutManager(new LinearLayoutManager(this));
        NotesAdapter adapter = new NotesAdapter();
        rv.setAdapter(adapter);
    }
}