package com.example.arthur.teste_touch;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnTouchListener {

    TextView touchTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        touchTextView = (TextView)findViewById(R.id.touchTextView);
        touchTextView.setOnTouchListener(this);
    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()){

            case MotionEvent.ACTION_DOWN:{
                touchTextView.setText("toque comum");
                break;
            }
            case MotionEvent.ACTION_MOVE:{
                touchTextView.setText("Deslizando na tela");
                break;
            }
        }
        return true;
    }
}
