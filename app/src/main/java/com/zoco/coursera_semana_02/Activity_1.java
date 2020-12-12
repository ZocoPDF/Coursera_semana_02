package com.zoco.coursera_semana_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Date;

public class Activity_1 extends AppCompatActivity {

    Button boton;
    EditText eTextNombre, eTextTelefono, eTextEmail, eTextDescripcion;
    DatePicker dpFechaNacimiento;
    int[] fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        eTextNombre = (EditText) findViewById(R.id.etnombre);
        dpFechaNacimiento = (DatePicker) findViewById(R.id.dpfechanacimiento);
        eTextTelefono = (EditText) findViewById(R.id.ettelefono);
        eTextEmail = (EditText) findViewById(R.id.etemail);
        eTextDescripcion = (EditText) findViewById(R.id.etdescripcion);
        boton = (Button) findViewById(R.id.bsiguiente);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_1.this, Activity_2.class );
                intent.putExtra("Nombre", eTextNombre.getText().toString());
                intent.putExtra("FechaNacimiento", dpFechaNacimiento.getDayOfMonth()+"/"+(dpFechaNacimiento.getMonth()+1)+"/"+dpFechaNacimiento.getYear());
                intent.putExtra("Telefono", eTextTelefono.getText().toString());
                intent.putExtra("Email", eTextEmail.getText().toString());
                intent.putExtra("Descripcion", eTextDescripcion.getText().toString());
                startActivity(intent);
            }
        });


    }
}