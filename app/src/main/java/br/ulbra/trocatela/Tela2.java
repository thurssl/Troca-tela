package br.ulbra.trocatela;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

    }

    public class MainActivity extends AppCompatActivity {
        Button btTelaP;


        public void CarregarTela2() {
            setContentView(R.layout.activity_tela2);
            btTelaP = (Button) findViewById(R.id.btTelaP);

            btTelaP.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    CarregarTela2();
                }
            });
        }
    }
}
