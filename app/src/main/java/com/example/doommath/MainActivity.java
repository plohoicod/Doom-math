package com.example.doommath;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button quitBtn, playBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton(){
        quitBtn =(Button)findViewById(R.id.quit);
        playBtn = (Button)findViewById(R.id.play);

        playBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(
                           MainActivity.this, "Game", Toast.LENGTH_LONG
                        ).show();
                    }
                }
        );

        quitBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        AlertDialog.Builder quit_alert = new AlertDialog.Builder(MainActivity.this);
                        quit_alert.setMessage("I WOULDN'T LEAVE IT IF I WERE YOU.\n(PRESS Y TO QUIT)")
                                .setCancelable(false)
                                .setPositiveButton("Y", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogQuit, int i) {
                                        finish();
                                    }
                                })
                                .setNegativeButton("N", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogQuit, int i) {
                                        dialogQuit.cancel();
                                    }
                                });
                        AlertDialog alertQuit = quit_alert.create();
                        //alertQuit.setTitle("?");
                        alertQuit.show();
                    }
                }
        );

    }
}
