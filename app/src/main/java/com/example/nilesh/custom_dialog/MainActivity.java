package com.example.nilesh.custom_dialog;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=(Button)findViewById(R.id.button);
        final TextView textView=(TextView)findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog= new Dialog(MainActivity.this);
                dialog.setTitle("Login Dialog");
                dialog.setContentView(R.layout.custom);
                dialog.show();


                final EditText editText=(EditText)dialog.findViewById(R.id.editText);
                Button submit=(Button)dialog.findViewById(R.id.submit);
                Button cancel=(Button)dialog.findViewById(R.id.cancel);

                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String text=editText.getText().toString();
                        textView.setText(text);
                        Toast.makeText(getApplicationContext(),"Name displayed",Toast.LENGTH_SHORT).show();
                        dialog.dismiss();
                    }
                });

                cancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getApplicationContext(),"Work Cancelled ",Toast.LENGTH_SHORT);
                        dialog.cancel();
                    }
                });
            }
        });
    }
}
