package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClicked(View view) {
        // Get view handle using the view id
        EditText Num1 = findViewById(R.id.Num1);

       // Get the view’s text
        String Num1Text = Num1.getText().toString();

        // Cast the String into Integer
        int num1Text = 0;
        Integer num1 = Integer.valueOf(Num1Text);

        EditText Num2 = findViewById(R.id.Num2);
        String Num2Text = Num2.getText().toString();
        int num2Text = 0;
        Integer num2 = Integer.valueOf(Num1Text);

        Integer result = null;
        if (view.getId() == R.id.btnPlus)
            result = num1 + num2;
        if (view.getId() == R.id.btnMinus)
            result = num1 - num2;
        if (view.getId() == R.id.btnMult)
            result = num1 * num2;
        if (view.getId() == R.id.btnDiv)
            result = num1 / num2;

        if (result != null) {
            TextView tvRes = findViewById(R.id.tvResult);
            tvRes.setText(result.toString());
        }



    }

}