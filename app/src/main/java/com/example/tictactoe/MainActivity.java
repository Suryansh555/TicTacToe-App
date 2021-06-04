package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final Context context = this;
    String Player1 ;
    String Player2 ;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9 ;
    TextView Output ;
    int ActivePlayer = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                LayoutInflater li = LayoutInflater.from(context);
                View promptsView = li.inflate(R.layout.prompts, null);

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        context);

                // set prompts.xml to alertdialog builder
                alertDialogBuilder.setView(promptsView);

                final EditText userInput = (EditText) promptsView
                        .findViewById(R.id.editTextDialogUserInput);
                final EditText userInput2 = (EditText) promptsView
                .findViewById(R.id.editTextDialogUserInput1);

                // set dialog message
                alertDialogBuilder
                        .setCancelable(false)
                        .setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        Player1 = userInput.getText().toString();
                                        Player2 = userInput2.getText().toString();
                                            if(Player1.equals("")){
                                                Player1 = "Player1";
                                            }
                                            if(Player2.equals("")){
                                                Player2 = "Player2";
                                            }
                                            Output.setText(Player1 + " Plays");


                                    }
                                });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();


        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        Output = findViewById(R.id.Output);


        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);

        // Output.setText(Player1 + " Plays");



    }
    public String check(){
        if(ActivePlayer == 9){
            return "  ";
        }
        if((btn1.getText().equals(btn2.getText())) && (btn1.getText().equals(btn3.getText()))){
            if(btn1.getText() == "X")
                Toast.makeText(this,Player1 + " " + "Wins",Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this,Player2 + " " + "Wins",Toast.LENGTH_LONG).show();
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn1.setBackgroundColor(getResources().getColor(R.color.black));
            btn2.setBackgroundColor(getResources().getColor(R.color.black));
            btn3.setBackgroundColor(getResources().getColor(R.color.black));
            return btn1.getText().toString() ;
        }
        if((btn4.getText().equals(btn5.getText())) && (btn4.getText().equals(btn6.getText()))){
            if(btn4.getText() == "X")
                Toast.makeText(this,Player1 + " " + "Wins",Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this,Player2 + " " + "Wins",Toast.LENGTH_LONG).show();
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn4.setBackgroundColor(getResources().getColor(R.color.black));
            btn5.setBackgroundColor(getResources().getColor(R.color.black));
            btn6.setBackgroundColor(getResources().getColor(R.color.black));


            return btn4.getText().toString() ;
        }
        if((btn7.getText().equals(btn8.getText())) && (btn7.getText().equals(btn9.getText()))){
            if(btn7.getText() == "X")
                Toast.makeText(this,Player1 + " " + "Wins",Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this,Player2 + " " + "Wins",Toast.LENGTH_LONG).show();
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            btn7.setBackgroundColor(getResources().getColor(R.color.black));
            btn8.setBackgroundColor(getResources().getColor(R.color.black));
            btn9.setBackgroundColor(getResources().getColor(R.color.black));


            return btn7.getText().toString() ;
        }
        if((btn1.getText().equals(btn4.getText())) && (btn1.getText().equals(btn7.getText()))){
            if(btn1.getText() == "X")
                Toast.makeText(this,Player1 + " " + "Wins",Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this,Player2 + " " + "Wins",Toast.LENGTH_LONG).show();
            btn1.setEnabled(true);
            btn4.setEnabled(true);
            btn7.setEnabled(true);
            btn1.setBackgroundColor(getResources().getColor(R.color.black));
            btn4.setBackgroundColor(getResources().getColor(R.color.black));
            btn7.setBackgroundColor(getResources().getColor(R.color.black));


            return btn1.getText().toString()  ;
        }
        if((btn2.getText().equals(btn5.getText())) && (btn2.getText().equals(btn8.getText()))){
            if(btn2.getText() == "X")
                Toast.makeText(this,Player1 + " " + "Wins",Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this,Player2 + " " + "Wins",Toast.LENGTH_LONG).show();
            btn2.setEnabled(true);
            btn5.setEnabled(true);
            btn8.setEnabled(true);
            btn2.setBackgroundColor(getResources().getColor(R.color.black));
            btn5.setBackgroundColor(getResources().getColor(R.color.black));
            btn8.setBackgroundColor(getResources().getColor(R.color.black));


            return btn2.getText().toString() ;
        }
        if((btn3.getText().equals(btn6.getText())) && (btn3.getText().equals(btn9.getText()))){
            if(btn3.getText() == "X")
                Toast.makeText(this,Player1 + " " + "Wins",Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this,Player2 + " " + "Wins",Toast.LENGTH_LONG).show();
            btn3.setEnabled(true);
            btn6.setEnabled(true);
            btn9.setEnabled(true);
            btn3.setBackgroundColor(getResources().getColor(R.color.black));
            btn6.setBackgroundColor(getResources().getColor(R.color.black));
            btn9.setBackgroundColor(getResources().getColor(R.color.black));


            return btn3.getText().toString() ;
        }
        if((btn1.getText().equals(btn5.getText())) && (btn1.getText().equals(btn9.getText()))){
            if(btn1.getText() == "X")
                Toast.makeText(this,Player1 + " " + "Wins",Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this,Player2 + " " + "Wins",Toast.LENGTH_LONG).show();
            btn1.setEnabled(true);
            btn5.setEnabled(true);
            btn9.setEnabled(true);
            btn1.setBackgroundColor(getResources().getColor(R.color.black));
            btn5.setBackgroundColor(getResources().getColor(R.color.black));
            btn9.setBackgroundColor(getResources().getColor(R.color.black));

            return btn1.getText().toString() ;
        }
        if((btn3.getText().equals(btn5.getText())) && (btn3.getText().equals(btn7.getText()))){
            if(btn3.getText() == "X")
                Toast.makeText(this,Player1 + " " + "Wins",Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this,Player2 + " " + "Wins",Toast.LENGTH_LONG).show();
            btn3.setEnabled(true);
            btn5.setEnabled(true);
            btn7.setEnabled(true);
            btn3.setBackgroundColor(getResources().getColor(R.color.black));
            btn5.setBackgroundColor(getResources().getColor(R.color.black));
            btn7.setBackgroundColor(getResources().getColor(R.color.black));


            return btn3.getText().toString() ;
        }
        Toast.makeText(this, "Reason can not be blank", Toast.LENGTH_SHORT).show();
        return "";
    }


    @Override
    public void onClick(View v) {
        ActivePlayer++;
        String A ;
        if(ActivePlayer % 2 == 0){
            Output.setText(Player1 + " " + "Plays");
            A = "O";
        }
        else{
            Output.setText(Player2 + " " + "Plays");
            A = "X";
        }

        if(v.getId() == R.id.btn1){
            btn1.setText(A);
            btn1.setEnabled(false);
        }
        else if(v.getId() == R.id.btn2){
            btn2.setText(A);
            btn2.setEnabled(false);
        }
        else if(v.getId() == R.id.btn3){
            btn3.setText(A);
            btn3.setEnabled(false);
        }
        else if(v.getId() == R.id.btn4){
            btn4.setText(A);
            btn4.setEnabled(false);
        }
        else if(v.getId() == R.id.btn5){
            btn5.setText(A);
            btn5.setEnabled(false);
        }
        else if(v.getId() == R.id.btn6){
            btn6.setText(A);
            btn6.setEnabled(false);
        }
        else if(v.getId() == R.id.btn7){
            btn7.setText(A);
            btn7.setEnabled(false);
        }
        else if(v.getId() == R.id.btn8){
            btn8.setText(A);
            btn8.setEnabled(false);
        }
        else if(v.getId() == R.id.btn9){
            btn9.setText(A);
            btn9.setEnabled(false);
        }

        String result = check();
        if(!result.isEmpty()){
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
            alertDialogBuilder.setTitle("Game Over");
            if(result == "X"){
                alertDialogBuilder.setMessage(Player1 + " " + "wins" );
                Output.setText(Player1 + " " + "wins");
            }
            else if(result == "O"){
                alertDialogBuilder.setMessage(Player2 + " " + "wins" );
                Output.setText(Player2 + " " + "wins");
            }
            else{
                alertDialogBuilder.setMessage("No One Wins");
                Output.setText("No One Wins");
            }
            alertDialogBuilder
                    .setCancelable(false)
                    .setPositiveButton("OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog,int id) {

                                }
                            })
            .setNegativeButton("NewGame",new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog,int id){
                    PackageManager packageManager = context.getPackageManager();
                    Intent intent = packageManager.getLaunchIntentForPackage(context.getPackageName());
                    ComponentName componentName = intent.getComponent();
                    Intent mainIntent = Intent.makeRestartActivityTask(componentName);
                    context.startActivity(mainIntent);
                    Runtime.getRuntime().exit(0);
                }

            });

            AlertDialog alertDialog = alertDialogBuilder.create();

            // show it
            alertDialog.show();

        }
    }
}