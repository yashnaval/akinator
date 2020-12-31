package hey.myexample.akinator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class eleventh extends AppCompatActivity {

    TextView textView,textView1;
    static String Vero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);
        textView = (TextView)findViewById(R.id.textView);
        textView1 = (TextView)findViewById(R.id.textView1);

        Intent intent =getIntent();
        Vero=intent.getStringExtra("Vero");


        SQLiteDatabase Heros = this.openOrCreateDatabase("akinator",MODE_PRIVATE,null);
        Cursor AKI = Heros.rawQuery("SELECT * FROM hcharacter WHERE gender=? AND universe=? AND color=? AND human=? AND superpowers=? AND weapons=? AND lifestatus=? AND fly=? AND cape=? AND vero=?", new String[]{second.gen,third.universe,fourth.colour,fifth.Human,sixth.Super,seventh.Weapon,eight.LifeStatus,ninth.Fly,tenth.Cape,eleventh.Vero},null);
        int namei = AKI.getColumnIndex("name");
        /*int genderi = AKI.getColumnIndex("gender");
        int universei = AKI.getColumnIndex("universe");
        int colori = AKI.getColumnIndex("color");
        int humani = AKI.getColumnIndex("human");
        int superpowersi = AKI.getColumnIndex("superpowers");
        int weaponsi = AKI.getColumnIndex("weapons");
        int lifestatusi = AKI.getColumnIndex("lifestatus");
        int flyi = AKI.getColumnIndex("fly");
        int capei = AKI.getColumnIndex("cape");
        int veroi = AKI.getColumnIndex("vero");*/
        AKI.moveToFirst();
            textView1.setText(AKI.getString(namei));
        }
    }
