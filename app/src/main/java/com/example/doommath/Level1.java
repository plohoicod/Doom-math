package com.example.doommath;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Level1 extends AppCompatActivity {

    Dialog MyDialog;
    TextView yes;
    TextView no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);


        TextView textView1 = (TextView)findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    TextView ans = (TextView)findViewById(R.id.answer);
                    String get = ans.getText().toString();
                    if(get.length() == 6 && !get.equals("Answer")) {
                        ans.setText(get);
                        return;
                    }
                    if(get.equals("Answer"))
                        get = "1";
                    else
                        get = get + "1";
                    ans.setText(get);
                } catch (Exception e){

                }
            }
        });


        TextView textView2 = (TextView)findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    TextView ans = (TextView)findViewById(R.id.answer);
                    String get = ans.getText().toString();
                    if(get.length() == 6 && !get.equals("Answer")) {
                        ans.setText(get);
                        return;
                    }
                    if(get.equals("Answer"))
                        get = "2";
                    else
                        get = get + "2";
                    ans.setText(get);
                } catch (Exception e){

                }
            }
        });


        TextView textView3 = (TextView)findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    TextView ans = (TextView)findViewById(R.id.answer);
                    String get = ans.getText().toString();
                    if(get.length() == 6 && !get.equals("Answer")) {
                        ans.setText(get);
                        return;
                    }
                    if(get.equals("Answer"))
                        get = "3";
                    else
                        get = get + "3";
                    ans.setText(get);
                } catch (Exception e){

                }
            }
        });


        TextView textView4 = (TextView)findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    TextView ans = (TextView)findViewById(R.id.answer);
                    String get = ans.getText().toString();
                    if(get.length() == 6 && !get.equals("Answer")) {
                        ans.setText(get);
                        return;
                    }
                    if(get.equals("Answer"))
                        get = "4";
                    else
                        get = get + "4";
                    ans.setText(get);
                } catch (Exception e){

                }
            }
        });


        TextView textView5 = (TextView)findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    TextView ans = (TextView)findViewById(R.id.answer);
                    String get = ans.getText().toString();
                    if(get.length() == 6 && !get.equals("Answer")) {
                        ans.setText(get);
                        return;
                    }
                    if(get.equals("Answer"))
                        get = "5";
                    else
                        get = get + "5";
                    ans.setText(get);
                } catch (Exception e){

                }
            }
        });


        TextView textView6 = (TextView)findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    TextView ans = (TextView)findViewById(R.id.answer);
                    String get = ans.getText().toString();
                    if(get.length() == 6 && !get.equals("Answer")) {
                        ans.setText(get);
                        return;
                    }
                    if(get.equals("Answer"))
                        get = "6";
                    else
                        get = get + "6";
                    ans.setText(get);
                } catch (Exception e){

                }
            }
        });


        TextView textView7 = (TextView)findViewById(R.id.textView7);
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    TextView ans = (TextView)findViewById(R.id.answer);
                    String get = ans.getText().toString();
                    if(get.length() == 6 && !get.equals("Answer")) {
                        ans.setText(get);
                        return;
                    }
                    if(get.equals("Answer"))
                        get = "7";
                    else
                        get = get + "7";
                    ans.setText(get);
                } catch (Exception e){

                }
            }
        });


        TextView textView8 = (TextView)findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    TextView ans = (TextView)findViewById(R.id.answer);
                    String get = ans.getText().toString();
                    if(get.length() == 6 && !get.equals("Answer")) {
                        ans.setText(get);
                        return;
                    }
                    if(get.equals("Answer"))
                        get = "8";
                    else
                        get = get + "8";
                    ans.setText(get);
                } catch (Exception e){

                }
            }
        });


        TextView textView9 = (TextView)findViewById(R.id.textView9);
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    TextView ans = (TextView)findViewById(R.id.answer);
                    String get = ans.getText().toString();
                    if(get.length() == 6 && !get.equals("Answer")) {
                        ans.setText(get);
                        return;
                    }
                    if(get.equals("Answer"))
                        get = "9";
                    else
                        get = get + "9";
                    ans.setText(get);
                } catch (Exception e){

                }
            }
        });

        TextView textView0 = (TextView)findViewById(R.id.textView0);
        textView0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    TextView ans = (TextView)findViewById(R.id.answer);
                    String get = ans.getText().toString();
                    if(get.length() == 6 && !get.equals("Answer")) {
                        ans.setText(get);
                        return;
                    }
                    if(get.equals("Answer"))
                        get = "0";
                    else
                        get = get + "0";
                    ans.setText(get);
                } catch (Exception e){

                }
            }
        });


        TextView textViewdel = (TextView)findViewById(R.id.textViewdel);
        textViewdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    TextView ans = (TextView)findViewById(R.id.answer);
                    String get = ans.getText().toString();
                    ans.setText("Answer");
                } catch (Exception e){

                }
            }
        });

        TextView textViewIdea = (TextView)findViewById(R.id.textViewidea);
        textViewIdea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    MyCustomAlertDialog();
                } catch (Exception e){

                }
            }
        });

        Button buttonBack = (Button) findViewById(R.id.button_back2);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Level1.this, GameLevels.class);
                    startActivity(intent);
                    finish();
                } catch (Exception e){

                }
            }
        });



    }


    public void MyCustomAlertDialog(){
        MyDialog = new Dialog(Level1.this);
        MyDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        MyDialog.setContentView(R.layout.customdialog);
        MyDialog.setTitle("My Custom Dialog");

        yes = (TextView)MyDialog.findViewById(R.id.yes);
        no = (TextView)MyDialog.findViewById(R.id.no);

        yes.setEnabled(true);
        no.setEnabled(true);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello, I'm Custom Alert Dialog", Toast.LENGTH_LONG).show();
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
        try {
            Intent intent = new Intent(Level1.this, GameLevels.class);
            startActivity(intent);
            finish();
        } catch (Exception e){

        }
    }
}
