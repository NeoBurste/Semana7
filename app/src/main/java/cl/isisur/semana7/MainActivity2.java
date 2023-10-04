package cl.isisur.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        datos = findViewById(R.id.datos);

        Intent intent =getIntent();

        String nombre = intent.getExtras().getString("nombre");
        datos.setText(nombre);
    }
}