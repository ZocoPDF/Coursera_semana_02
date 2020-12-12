package com.zoco.coursera_semana_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_2 extends AppCompatActivity {

    TextView tvNombre, tvFechaNacimiento, tvTelefono, tvEmail, tvDescripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        tvNombre = (TextView) findViewById(R.id.nombrecampo);
        tvFechaNacimiento = (TextView) findViewById(R.id.fechanacimientocampo);
        tvTelefono = (TextView) findViewById(R.id.telefonocampo);
        tvEmail = (TextView) findViewById(R.id.emailcampo);
        tvDescripcion = (TextView) findViewById(R.id.descripcioncampo);

        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("Nombre");
        String fechaNacimiento = parametros.getString("FechaNacimiento");
        String telefono = parametros.getString("Telefono");
        String email = parametros.getString("Email");
        String descripcion = parametros.getString("Descripcion");

        tvNombre.setText(nombre);
        tvFechaNacimiento.setText(fechaNacimiento);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);
        Toast.makeText(this, telefono, Toast.LENGTH_SHORT).show();

    }
}