package br.ifsc.edu.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText editTextinicial, editTextfinal; // esta aqui em cima para que possa ser usado pelo codigo todo
    TextView textViewResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextinicial = findViewById(R.id.editTextinicial); // R = contem todos os id's que tem dentro do codigo
        editTextfinal = findViewById(R.id.editTextfinal);
        textViewResultado = findViewById(R.id.textViewResultado);
    }

    public void sorteia(View view) { // isso aqui é o botão (View view)
        Button but = (Button) view;
        but.setText("Sorteado");

        int inicial = Integer.parseInt(editTextinicial.getText().toString());
        int fim = Integer.parseInt(editTextfinal.getText().toString());

        Random rand = new Random();
        int numsorteado = rand.nextInt((fim - inicial) + 1) + inicial;

        textViewResultado.setText(Integer.toString((numsorteado)));


        }
    }
