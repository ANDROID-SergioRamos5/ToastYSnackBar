package com.example.toastsnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast);

        Button button = (Button) findViewById(R.id.botonToast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = new Toast(getApplicationContext());

                LayoutInflater inflater = getLayoutInflater();
                //Ponemos el layout y el id de donde esta definido el toast.
                View layout = inflater.inflate(R.layout.toast2, (ViewGroup)findViewById(R.id.toast));

                TextView txtMensaje = (TextView)layout.findViewById(R.id.txtMensaje);
                txtMensaje.setText("Has pulsado el boton");

                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
            }
        });
    }
}
