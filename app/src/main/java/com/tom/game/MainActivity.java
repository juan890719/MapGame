package com.tom.game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.arrow_up).setOnClickListener(this);
        findViewById(R.id.arrow_down).setOnClickListener(this);
        findViewById(R.id.arrow_left).setOnClickListener(this);
        findViewById(R.id.arrow_right).setOnClickListener(this);
        gameView = findViewById(R.id.game);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.arrow_up:
                Log.d("MainActivity","onClick_UP");
                //gameView.setPosY(gameView.getPosY() - 50);
                gameView.moveUp();
                //gameView.invalidate();
                break;
            case R.id.arrow_down:
                Log.d("MainActivity","onClick_DOWN");
               // gameView.setPosY(gameView.getPosY() + 50);
                gameView.moveDown();
                //gameView.invalidate();
                break;
            case R.id.arrow_left:
                Log.d("MainActivity","onClick_LEFT");
               // gameView.setPosX(gameView.getPosX() - 50);
                gameView.moveLeft();
                //gameView.invalidate();
                break;
            case R.id.arrow_right:
                Log.d("MainActivity","onClick_RIGHT");
               // gameView.setPosX(gameView.getPosX() + 50);
                gameView.moveRight();
                //gameView.invalidate();
                break;
        }

    }
}
