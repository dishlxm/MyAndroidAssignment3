package zju.edu.myhomework3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonAlpha;
    Button buttonScale;
    Button buttonSet;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        buttonAlpha = (Button) findViewById(R.id.button_alpha);
        buttonScale = (Button) findViewById(R.id.button_scale);
        buttonSet = (Button) findViewById(R.id.button_set);
        imageView = (ImageView) findViewById(R.id.pic);
        buttonAlpha.setOnClickListener(this);
        buttonScale.setOnClickListener(this);
        buttonSet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Animation loadAnimation;
        AnimationSet animationSet = new AnimationSet(true);
        switch (v.getId()){
            case R.id.button_alpha:
                loadAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha);
                imageView.startAnimation(loadAnimation);
                break;
            case R.id.button_scale:
                loadAnimation = AnimationUtils.loadAnimation(this, R.anim.scale);
                imageView.startAnimation(loadAnimation);
                break;
            case R.id.button_set:
                animationSet = (AnimationSet) AnimationUtils.loadAnimation(this, R.anim.set);
                imageView.startAnimation(animationSet);
                break;
            default:
                break;
        }
    }
}
