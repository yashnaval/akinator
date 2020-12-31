package hey.myexample.akinator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class fourth extends AppCompatActivity {

    Button button1,button2;
    Animation scaleUp,scaleDown;
    TextView textView;
    static String colour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        button1 = (Button)findViewById(R.id.Button1);
        button2 = (Button)findViewById(R.id.Button2);
        textView = (TextView)findViewById(R.id.textView);
        Intent intent =getIntent();
        colour=intent.getStringExtra("Colour");

        scaleUp = AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this,R.anim.scale_down);
        button1.setOnTouchListener(new View.OnTouchListener() {
            String hmn="Y";
            @Override
            public boolean onTouch(View v, MotionEvent event) {


                if (event.getAction()==MotionEvent.ACTION_UP)
                {
                    button1.startAnimation(scaleDown);
                    //Log.i("called","here");
                }
                else if (event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    button1.startAnimation(scaleUp);
                    //Log.i("called","there");
                }
                Intent intent2 =new Intent(getApplicationContext(),fifth.class);
                intent2.putExtra("Human",hmn);
                startActivity(intent2);
                finish();
                return true;

            }
        });
        button2.setOnTouchListener(new View.OnTouchListener() {
            String hmn = "N";
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_UP)
                {
                    button2.startAnimation(scaleDown);
                    //Log.i("called","here");
                }
                else if (event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    button2.startAnimation(scaleUp);
                    //Log.i("called","there");
                }
                Intent intent2 = new Intent(getApplicationContext(),fifth.class);
                intent2.putExtra("Human",hmn);
                startActivity(intent2);
                finish();
                return true;
            }
        });
    }
}