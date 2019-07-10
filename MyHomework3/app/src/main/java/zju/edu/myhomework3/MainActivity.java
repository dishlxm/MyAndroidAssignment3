package zju.edu.myhomework3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button a_button;
    Button l_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a_button = (Button) findViewById(R.id.animation_button);
        l_button = (Button) findViewById(R.id.lottie_button);
        a_button.setOnClickListener(this);
        l_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Intent intent1 = new Intent(MainActivity.this, AnimationActivity.class);
        Intent intent2 = new Intent(MainActivity.this, LottieActivity.class);
        switch (v.getId()){
            case R.id.animation_button:
                startActivity(intent1);
                break;
            case R.id.lottie_button:
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
