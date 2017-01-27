package com.example.rai.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit =(EditText)findViewById(R.id.edit);
        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = edit.getText().toString();
                showCustomToast(text);
            }
        });
    }

    public void showCustomToast(String msg)
    {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast,null);
        TextView text = (TextView)layout.findViewById(R.id.text);
        text.setText(msg);
        Toast custom = new Toast(this);
        custom.setGravity(Gravity.CENTER_HORIZONTAL,0,500);
        custom.setView(layout);
        custom.show();
    }

}
