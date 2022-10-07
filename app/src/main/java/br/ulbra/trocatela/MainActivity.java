package br.ulbra.trocatela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btTelaP, btTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarregarTelaPrincipal();
    }

    public void CarregarTelaPrincipal() {
        setContentView(R.layout.activity_main);
        btTela2 = (Button) findViewById(R.id.btTela2);

        btTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarTela2();
            }
        });
    }

    public void CarregarTela2() {
        setContentView(R.layout.activity_tela2);
        btTelaP = (Button) findViewById(R.id.btTelaP);

        btTelaP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarTelaPrincipal();
            }
        });
    }

}