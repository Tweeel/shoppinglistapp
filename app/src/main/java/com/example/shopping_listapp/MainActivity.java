package com.example.shopping_listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "com.example.shopping_listapp.EXTRA.REPLY";
    public static final int TEXT_REQUEST=1;
    TextView item1;
    TextView item2;
    TextView item3;
    TextView item4;
    TextView item5;
    TextView item6;
    TextView item7;
    TextView item8;
    TextView item9;
    TextView item10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        item1=findViewById(R.id.ItemChoosen1);
        item2=findViewById(R.id.ItemChoosen2);
        item3=findViewById(R.id.ItemChoosen3);
        item4=findViewById(R.id.ItemChoosen4);
        item5=findViewById(R.id.ItemChoosen5);
        item6=findViewById(R.id.ItemChoosen6);
        item7=findViewById(R.id.ItemChoosen7);
        item8=findViewById(R.id.ItemChoosen8);
        item9=findViewById(R.id.ItemChoosen9);
        item10=findViewById(R.id.ItemChoosen10);


    }

    public void Add_Items(View view) {
        Intent intent = new Intent(this,itemsactivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(itemsactivity.EXTRA_REPLY);
                if(item1!=null) {
                    item1.setText(reply);
                    item1.setVisibility(View.VISIBLE);
                }
                else{
                    item2.setText(reply);
                    item2.setVisibility(View.VISIBLE);
                }
            }
        }
    }
    
}