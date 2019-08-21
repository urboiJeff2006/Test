package com.example.hangman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    boolean xcv = false;
    int guessed = 0;
    String[] words = new String []{"bro","minecraft","sticks","dank","goated","cracked","chinese","bodying","lit","nasty"};
    char[] playerGuess = new char[30];
    char[] GuessedWords = new char [10];
    int GuessedWordsIndex = 0;
    Random rand = new Random();
    boolean guessedWord = true;
    int RandomNumber = rand.nextInt(9);
    String randomWord = words[RandomNumber];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView =  (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.button);
        ImageView Imageface = (ImageView) findViewById(R.id.face);
        ImageView Imageeye = (ImageView) findViewById(R.id.eye);
        ImageView Imageeye1 = (ImageView) findViewById(R.id.eye1);
        ImageView Imagearm = (ImageView) findViewById(R.id.arm);
        ImageView Imagearm1 = (ImageView) findViewById(R.id.arm1);
        ImageView Imageneck = (ImageView) findViewById(R.id.neck);
        ImageView spine = (ImageView) findViewById(R.id.spine);
        ImageView leg = (ImageView) findViewById(R.id.leg);
        ImageView leg1 = (ImageView) findViewById(R.id.leg1);


            for(int i = 0; i < 30;i++){
                playerGuess[i] = '_';
            }

            while (guessed< 10 ){

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        EditText editText = (EditText) findViewById(R.id.textInput2);

                        xcv = false;
                        textView.setText(" pick a letter ");
                        char inserted = editText.getText().charAt(0);

                        for(int i = 0;i < randomWord.length();i++){
                            if (inserted==randomWord.charAt(i)){
                                xcv = true;
                                playerGuess[i] = inserted;
                            }

                        }


                         guessedWord = true;
                        //boolean endThing = false;
                        for(int i = 0; i< randomWord.length();i++){
                            if(playerGuess[i] ==('_')){
                                guessedWord = false;
                                break;
                            }

                        }

                        boolean zzz = false;
                        for(int i = 0; i < 10;i++){
                            if(GuessedWords[i] == inserted){
                                zzz = true;
                            }
                        }


                        if(zzz){
                            textView.setText("you already guessed that word, bruh");
                        }else{

                            GuessedWords[GuessedWordsIndex] = inserted;
                            GuessedWordsIndex++;
                            guessed++;
                        }


                        if(xcv ){
                            textView.setText(" the letter you guessed is correct ");
                        }if(!xcv){
                            textView.setText(" the letter you guessed is a faliure, like you ");


                        }
                        for(int i = 0; i < randomWord.length(); i++){
                          //  System.out.print(playerGuess[i]);
                        }
                    }
                });

                if(guessedWord){
                    break;
                }

            }

            textView.setText(" Time to guess");
            String yee = words[RandomNumber];
            if(yee.equals(randomWord)){
                textView.setText(" you won ");
            }else{
                textView.setText("you lost, you will get instant death by broomstick, the correct answer is " + randomWord);
            }




    }
}
