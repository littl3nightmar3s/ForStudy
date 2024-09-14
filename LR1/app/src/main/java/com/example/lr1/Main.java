package com.example.lr1;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends Activity
        implements View.OnClickListener{
    @Override
    protected void onCreate (Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);
        setContentView(R.layout.main_act);

        Button button=(Button) findViewById(R.id.btn1);
        Button button2=(Button) findViewById(R.id.btn2);
        Button button3=(Button) findViewById(R.id.btn3);
        Button button4=(Button) findViewById(R.id.btn4);

        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }
    @Override
    public void onClick (View view) {
        Button b =(Button)view;
        b.setText(R.string.afterClick);
    }
}

