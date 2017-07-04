package com.example.guillermo1.encontrapet.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.guillermo1.encontrapet.R;

public class Cadastro extends AppCompatActivity {

    private EditText nome;
    private EditText senha;
    private EditText cep;
    private EditText telefone;
    private EditText celular;
    private Button cadastrar;
    private Button voltar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome =(EditText) findViewById(R.id.nome_usuario);
        senha =(EditText) findViewById(R.id.senha);
        cep =(EditText) findViewById(R.id.cep);
        telefone =(EditText) findViewById(R.id.telefone);
        celular =(EditText) findViewById(R.id.celular);
        cadastrar =(Button) findViewById(R.id.cadastrar);
        voltar =(Button) findViewById(R.id.voltar);
        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cadastro.this, Pet.class);
                Bundle b = new Bundle();
                b.putString("nome", nome.getText().toString());
                b.putString("senha", senha.getText().toString());
                b.putInt("cep", Integer.parseInt(cep.getText().toString()));
                b.putInt("telefone", Integer.parseInt(telefone.getText().toString()));
                b.putInt("celular", Integer.parseInt(celular.getText().toString()));
                intent.putExtras(b);
                startActivity(intent);
                finish();
            }
        });
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cadastro.this, Login.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
