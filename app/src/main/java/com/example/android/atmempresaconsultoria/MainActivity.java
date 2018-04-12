package com.example.android.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity implements View.OnClickListener{

    private ImageView botaoEmpresa;
    private ImageView botaoServico;
    private ImageView botaoCliente;
    private ImageView botaoContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoEmpresa = (ImageView) findViewById(R.id.empresaId);
        botaoServico = (ImageView) findViewById(R.id.servicoId);
        botaoCliente = (ImageView) findViewById(R.id.clienteId);
        botaoContato = (ImageView) findViewById(R.id.contatoId);

        botaoEmpresa.setOnClickListener(this);
        botaoServico.setOnClickListener(this);
        botaoCliente.setOnClickListener(this);
        botaoContato.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        if(id == R.id.empresaId){
            Intent intent = new Intent(MainActivity.this, EmpresaActivity.class);
            startActivity(intent);
        }

        else if(id == R.id.servicoId){
            Intent intent = new Intent(MainActivity.this, ServicoActivity.class);
            startActivity(intent);
        }

        else if(id == R.id.clienteId){
            Intent intent = new Intent(MainActivity.this, ClienteActivity.class);
            startActivity(intent);
        }

        else if(id == R.id.contatoId){
            Intent intent = new Intent(MainActivity.this, ContatoActivity.class);
            startActivity(intent);
        }

    }
}
