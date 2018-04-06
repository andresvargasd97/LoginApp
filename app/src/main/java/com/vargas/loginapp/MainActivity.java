package com.vargas.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText Username;
    private EditText Password;
    private Button LogIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.UsernameInput);
        Password = findViewById(R.id.PasswordInput);
        LogIn = findViewById(R.id.login_button);

        LogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validar(Username.getText().toString(), Password.getText().toString());
            }
        });

    }
    private void validar(String Username, String Password){
        if((Username.equals("Pixies") ) && (Password.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, Logged_In.class);
            startActivity(intent);
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Datos Invalidos", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        }
    }


}
