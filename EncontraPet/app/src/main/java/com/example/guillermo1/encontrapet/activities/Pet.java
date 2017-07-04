package com.example.guillermo1.encontrapet.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.guillermo1.encontrapet.R;
import com.example.guillermo1.encontrapet.classes.Usuario;
import com.example.guillermo1.encontrapet.classes.classPet;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.Random;

public class Pet extends AppCompatActivity {
    private EditText nome;
    private EditText raca;
    private Button cadastrar;
    private Button voltar;
    private Button add;
    private FirebaseDatabase database;
    private DatabaseReference ref;
    private Random rnd;
    private int randomLat,randomLng;
    private ArrayList<classPet> pets;
    private TableLayout tabela;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet);
        nome = (EditText) findViewById(R.id.nome);
        raca = (EditText) findViewById(R.id.raca);
        cadastrar = (Button) findViewById(R.id.cadastrar);
        voltar = (Button) findViewById(R.id.voltar);
        add = (Button) findViewById(R.id.add);
        database = FirebaseDatabase.getInstance();
        ref = database.getReference("Usuario");
        rnd = new Random();
        pets = new ArrayList<>();
        randomLat = rnd.nextInt((90 - -90) + 1) + -90;
        randomLng = rnd.nextInt((180 - -180) + 1) + -180;

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = getIntent().getExtras();
                ref.setValue(new Usuario(b.getString("nome"),b.getString("senha"),b.getInt("cep"),b.getInt("telefone"),b.getInt("celular"),randomLat,randomLng,pets));

            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pet.this,Cadastro.class));
                finish();
            }
        });
    }
}
