package cl.isisur.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button boton;
    EditText nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombre);
        boton = findViewById(R.id.BTAceptar);

        boton.setOnClickListener(new View.OnClickListener (){
            @Override
            public void onClick(View view){
                Intent intent =new Intent(getApplicationContext(), MainActivity2.class);
                String nombreImagen = nombre.getText().toString();

                intent.putExtra("nombre", nombreImagen);
                startActivity(intent);
            }

        });
    }
}