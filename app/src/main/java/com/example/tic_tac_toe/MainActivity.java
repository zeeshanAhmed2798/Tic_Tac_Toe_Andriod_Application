package com.example.tic_tac_toe;



import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,restart;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flag=0;
    int count =0;
    int chechk=0;
    Button turn;
    TextView result;


    private void highlightWinningCombination(int [] winningCombination) {
        for (int i = 0; i < 3; i++) {
            Button button = findViewById(winningCombination[i]);
            button.setBackgroundResource(R.drawable.win);
        }
    }
    private void unhighlightWinningCombination(int[] UnwinningCombination) {
        for (int i = 0; i < 9; i++) {
            Button button = findViewById(UnwinningCombination[i]);
            button.setBackgroundResource(R.drawable.button_background);
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initial();

        turn.setText("now 'X' turn ");
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newGame();
            }
        });
    }

    private void initial() {
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        turn=findViewById(R.id.turn);
        result=findViewById(R.id.result);
        restart=findViewById(R.id.restart);


    }




    public void chechk(View view){

     Button currentBtn=(Button) view;
     if(currentBtn.getText().toString().equals("") && chechk==0)
     {

     count++;
     if(flag==0)
     {
         currentBtn.setText("X");
         flag=1;

     }else {
         currentBtn.setText("O");
         flag=0;
     }
         if(currentBtn.getText().toString().equals("X"))
         {
             turn.setText("now 'O' turn ");
         }
         else if(currentBtn.getText().toString().equals("O"))
         {
             turn.setText("now 'X' turn");
         }
     if(count>4)
     {
         b1=btn1.getText().toString();
         b2=btn2.getText().toString();
         b3=btn3.getText().toString();
         b4=btn4.getText().toString();
         b5=btn5.getText().toString();
         b6=btn6.getText().toString();
         b7=btn7.getText().toString();
         b8=btn8.getText().toString();
         b9=btn9.getText().toString();
         if(b1.equals(b2) && b2.equals(b3) && !b1.equals(""))
         {
             Toast.makeText(this, "Winner is : "+b1, Toast.LENGTH_SHORT).show();
             result.setText("Winner is "+b1);
             result.setVisibility(view.VISIBLE);
             chechk=1;
             Animation move= AnimationUtils.loadAnimation(MainActivity.this,R.anim.tick_line);
             result.startAnimation(move);
             int[] winningCombination = {R.id.btn1, R.id.btn2, R.id.btn3};
             highlightWinningCombination( winningCombination);


         } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals(""))
         {
             Toast.makeText(this, "Winner is : "+b4, Toast.LENGTH_SHORT).show();
             result.setText("Winner is "+b4);
             result.setVisibility(view.VISIBLE);
             chechk=1;
             Animation move= AnimationUtils.loadAnimation(MainActivity.this,R.anim.tick_line);
             result.startAnimation(move);
             int[] winningCombination = {R.id.btn4, R.id.btn5, R.id.btn6};
             highlightWinningCombination( winningCombination);

         }else if (b7.equals(b8) && b8.equals(b9) && !b7.equals(""))
         {
             Toast.makeText(this, "Winner is : "+b7, Toast.LENGTH_SHORT).show();
             result.setText("Winner is "+b7);
             result.setVisibility(view.VISIBLE);
             chechk=1;
             Animation move= AnimationUtils.loadAnimation(MainActivity.this,R.anim.tick_line);
             result.startAnimation(move);
             int[] winningCombination = {R.id.btn7, R.id.btn8, R.id.btn9};
             highlightWinningCombination( winningCombination);

         }else if (b1.equals(b4) && b4.equals(b7) && !b1.equals(""))
         {
             Toast.makeText(this, "Winner is : "+b1, Toast.LENGTH_SHORT).show();
             result.setText("Winner is "+b1);
             result.setVisibility(view.VISIBLE);
             chechk=1;
             Animation move= AnimationUtils.loadAnimation(MainActivity.this,R.anim.tick_line);
             result.startAnimation(move);
             int[] winningCombination = {R.id.btn1, R.id.btn4, R.id.btn7};
             highlightWinningCombination( winningCombination);
         }
         else if (b2.equals(b5) && b5.equals(b8) && !b2.equals(""))
         {
             Toast.makeText(this, "Winner is : "+b2, Toast.LENGTH_SHORT).show();
             result.setText("Winner is "+b2);
             result.setVisibility(view.VISIBLE);
             chechk=1;
             Animation move= AnimationUtils.loadAnimation(MainActivity.this,R.anim.tick_line);
             result.startAnimation(move);
             int[] winningCombination = {R.id.btn2, R.id.btn5, R.id.btn8};
             highlightWinningCombination( winningCombination);

         }else if (b3.equals(b6) && b6.equals(b9) && !b3.equals(""))
         {
             Toast.makeText(this, "Winner is : "+b3, Toast.LENGTH_SHORT).show();
             result.setText("Winner is "+b3);
             result.setVisibility(view.VISIBLE);
             chechk=1;
             Animation move= AnimationUtils.loadAnimation(MainActivity.this,R.anim.tick_line);
             result.startAnimation(move);
             int[] winningCombination = {R.id.btn3, R.id.btn6, R.id.btn9};
             highlightWinningCombination( winningCombination);
         }else if (b1.equals(b5) && b5.equals(b9) && !b1.equals(""))
         {
             Toast.makeText(this, "Winner is : "+b1, Toast.LENGTH_SHORT).show();
             result.setText("Winner is "+b1);
             result.setVisibility(view.VISIBLE);
             Animation move= AnimationUtils.loadAnimation(MainActivity.this,R.anim.tick_line);
             result.startAnimation(move);
             chechk=1;
             int[] winningCombination = {R.id.btn1, R.id.btn5, R.id.btn9};
             highlightWinningCombination( winningCombination);

         }else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
             Toast.makeText(this, "Winner is : "+b3, Toast.LENGTH_SHORT).show();
             result.setText("Winner is "+b3);
             result.setVisibility(view.VISIBLE);
             chechk=1;
             Animation move= AnimationUtils.loadAnimation(MainActivity.this,R.anim.tick_line);
             result.startAnimation(move);
             int[] winningCombination = {R.id.btn3, R.id.btn5, R.id.btn7};
             highlightWinningCombination( winningCombination);
         } else if (!b1.equals("") && !b2.equals("")&& !b3.equals("")&& !b4.equals("")
                 && !b5.equals("")&& !b6.equals("")&& !b7.equals("")&& !b8.equals("")
                 && !b9.equals("")) {
             Toast.makeText(this, "Game is Draw", Toast.LENGTH_SHORT).show();
             result.setVisibility(view.VISIBLE);
             result.setText("Game is Draw");
             Animation move= AnimationUtils.loadAnimation(MainActivity.this,R.anim.tick_line);
             result.startAnimation(move);
             chechk=1;
         }


     }
    }

}
public  void newGame()
{
    btn1.setText("");
    btn2.setText("");
    btn3.setText("");
    btn4.setText("");
    btn5.setText("");
    btn6.setText("");
    btn7.setText("");
    btn8.setText("");
    btn9.setText("");
    result.setText("");
    turn.setText("now 'O' turn ");
    flag=1;
    chechk=0;
    count=0;
    result.setVisibility(View.INVISIBLE);
    result.setVisibility(View.GONE);
   int[] UnwinningCombination={R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9};
    unhighlightWinningCombination(UnwinningCombination);
}

}
