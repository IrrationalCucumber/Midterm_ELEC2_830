package com.example.bahaynikuya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    //redirect to CALCULATOR
    Button button = (Button)findViewById(R.id.button3);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Menu.this, MainActivity.class);
            startActivity(intent);
        }
    });
    //redirect to TODOLIST
    Button button1 = (Button) findViewById(R.id.button4);

    button1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(Menu.this, ToDoList.class);
            startActivity(intent);
        }
    });
    }
}