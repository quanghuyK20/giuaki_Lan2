package com.exemple.registerlogin;

import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Success extends AppCompatActivity {

    private EditText etEmail, etName;
    private String email, name;
    private String URL = "http://192.168.43.122/login/login.php";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success);
    }

}
