package com.example.doommath;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Dialog MyDialog;
    TextView yes;
    TextView no;
    private Button quitBtn, playBtn, levelsBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton(){
        quitBtn =(Button)findViewById(R.id.quit);
        playBtn = (Button)findViewById(R.id.play);
        levelsBtn = (Button)findViewById(R.id.levels);

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

        levelsBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        try {
                            Intent intent = new Intent(MainActivity.this, GameLevels.class);
                            startActivity(intent);
                            finish();
                        } catch (Exception e){

                        }
                    }
                }
        );

        quitBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        MyCustomAlertDialog();
                    }
                }
        );

    }


    public void MyCustomAlertDialog(){
        MyDialog = new Dialog(MainActivity.this);
        MyDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        MyDialog.setContentView(R.layout.customexitdialog);
        MyDialog.setTitle("My Custom Dialog");
        TextView message = MyDialog.findViewById(R.id.text1);
        message.setText("I WOULDN'T LEAVE IT IF I WERE YOU.\n(PRESS Y TO QUIT)");
        yes = (TextView)MyDialog.findViewById(R.id.yes);
        no = (TextView)MyDialog.findViewById(R.id.no);

        yes.setEnabled(true);
        no.setEnabled(true);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialog.cancel();
            }
        });

        MyDialog.show();
    }

    @Override
    public void onBackPressed(){
        MyCustomAlertDialog();
    }
}
