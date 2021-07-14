package com.example.shopping_listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class itemsactivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.shopping_listapp.EXTRA.REPLY";
    TextView AppleTextView;
    TextView RiceTextView;
    TextView CheeseTextView;
    TextView PotatoTextView;
    TextView BananaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);
        AppleTextView=findViewById(R.id.AppleText);
        RiceTextView=findViewById(R.id.RiceText);
        CheeseTextView=findViewById(R.id.CheeseText);
        PotatoTextView=findViewById(R.id.PotatoText);
        BananaTextView=findViewById(R.id.BananaText);
    }

    public void AddApples(View view) {
        String item=AppleTextView.getText().toString();
        Intent intent= new Intent();
        intent.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void AddRices(View view) {
        String item=RiceTextView.getText().toString();
        Intent intent= new Intent();
        intent.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void AddCheese(View view) {
        String item=CheeseTextView.getText().toString();
        Intent intent= new Intent();
        intent.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void AddPotato(View view) {
        String item=PotatoTextView.getText().toString();
        Intent intent= new Intent();
        intent.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, intent);
        finish();
    }

    public void AddBanana(View view) {
        String item=BananaTextView.getText().toString();
        Intent intent= new Intent();
        intent.putExtra(EXTRA_REPLY, item);
        setResult(RESULT_OK, intent);
        finish();
    }
}