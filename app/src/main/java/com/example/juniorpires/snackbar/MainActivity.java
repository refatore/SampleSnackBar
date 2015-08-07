package com.example.juniorpires.snackbar;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {


    CoordinatorLayout snackBarPositionLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        snackBarPositionLayout = (CoordinatorLayout) findViewById(R.id.snackbarPosition);

        Snackbar.make(snackBarPositionLayout,"Mensagem apagada",Snackbar.LENGTH_LONG).setAction(
                "Desfazer", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                    }
                }
        ).show();
    }


}
