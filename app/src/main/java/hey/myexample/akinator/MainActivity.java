package hey.myexample.akinator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button button;
    Animation scaleUp,scaleDown;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.Button);
        scaleUp = AnimationUtils.loadAnimation(this,R.anim.scale_up);
        scaleDown = AnimationUtils.loadAnimation(this,R.anim.scale_down);
        imageView = (ImageView)findViewById(R.id.imageView);

        SQLiteDatabase Heros = this.openOrCreateDatabase("akinator",MODE_PRIVATE,null);
        Heros.execSQL("CREATE TABLE IF NOT EXISTS hcharacter(name VARCHAR(20),gender CHAR,universe VARCHAR(10),color VARCHAR(10),human CHAR,superpowers CHAR,weapons CHAR,lifestatus VARCHAR(10),fly CHAR,cape CHAR,vero CHAR)");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('spiderman','M','MARVEL','red','Y','Y','N','alive','Y','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('ironman','M','MARVEL','red','Y','N','Y','dead','Y','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('batman','M','DC','black','Y','N','N','alive','N','Y','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('captain-america','M','MARVEL','blue','Y','Y','Y','dead','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('black-widow','F','MARVEL','black','Y','N','N','dead','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('superman','M','DC','blue','N','Y','N','alive','Y','Y','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('flash','M','DC','red','Y','Y','N','alive','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('aquaman','M','DC','blue','Y','Y','N','alive','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('hulk','M','MARVEL','green','Y','Y','N','alive','Y','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('thor','M','MARVEL','silver','N','Y','Y','alive','Y','Y','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('wonder-woman','F','MARVEL','red','Y','Y','Y','alive','N','Y','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('antman','M','MARVEL','red','Y','N','Y','alive','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('starlord','M','MARVEL','red','N','Y','N','alive','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('doctor-strange','M','MARVEL','red','Y','Y','N','alive','Y','Y','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('deadpool','M','MARVEL','red','Y','Y','Y','alive','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('black-panther','M','MARVEL','black','Y','Y','Y','alive','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('scarlet-witch','F','MARVEL','red','Y','Y','N','alive','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('hawk-eye','M','MARVEL','black','Y','N','Y','alive','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('wolverine','M','MARVEL','yellow','Y','Y','Y','dead','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('vision','M','MARVEL','red','N','Y','N','dead','Y','Y','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('groot','M','MARVEL','brown','N','Y','N','dead','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('gamora','F','MARVEL','green','N','N','N','dead','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('rocket','M','MARVEL','brown','N','N','N','alive','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('captain-marvel','F','MARVEL','red','N','Y','N','alive','N','Y','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('nick-fury','M','MARVEL','black','Y','N','N','alive','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('falcon','M','MARVEL','red','Y','N','Y','alive','Y','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('rohdie','M','MARVEL','black','Y','N','Y','alive','Y','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('winter-soldier','M','MARVEL','black','Y','N','Y','alive','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('shazam','M','DC','red','Y','Y','N','alive','N','Y','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('cyborg','M','DC','silver','N','Y','N','alive','N','N','H')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('thanos','M','MARVEL','purple','N','Y','N','dead','N','N','V')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('ultron','M','MARVEL','silver','N','N','Y','dead','Y','N','V')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('hella','F','MARVEL','green','N','Y','N','dead','N','Y','V')");
        Heros.execSQL("INSERT INTO hcharacter(name,gender,universe,color,human,superpowers,weapons,lifestatus,fly,cape,vero) VALUES('jocker','M','DC','red','Y','N','N','alive','N','N','V')");


        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction()==MotionEvent.ACTION_UP)
                {
                    button.startAnimation(scaleDown);
                    //Log.i("called","here");
                }
                else if (event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    button.startAnimation(scaleUp);
                    //Log.i("called","there");
                }
                imageView.animate().scaleXBy(100).scaleYBy(100).alpha(0).setDuration(1000).start();
                Intent intent = new Intent(getApplicationContext(),start.class);
                startActivity(intent);
                finish();
                return true;
            }
        });
    }
}