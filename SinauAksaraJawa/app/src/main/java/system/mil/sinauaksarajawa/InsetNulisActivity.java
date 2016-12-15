package system.mil.sinauaksarajawa;

import android.content.Context;
import android.content.Intent;
import android.gesture.Gesture;
import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import android.gesture.Prediction;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.gesture.GestureOverlayView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class InsetNulisActivity extends AppCompatActivity implements GestureOverlayView.OnGesturePerformedListener{

    GestureLibrary mLibrary;

    private int urutan = 1;
    private String aksara_rekan = "";
    private ImageView card_inset_nulis;
    private LinearLayout areanulis, benernulis, salahnulis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Montserrat-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        setContentView(R.layout.activity_inset_nulis);
        urutan = extras.getInt("aksara");

        card_inset_nulis = (ImageView) findViewById(R.id.card_inset_nulis);

        areanulis = (LinearLayout) findViewById(R.id.areanulisaksara);
        benernulis = (LinearLayout) findViewById(R.id.pesenbener);
        salahnulis = (LinearLayout) findViewById(R.id.pesensalah);

        aksaraSelector(urutan);

        mLibrary = GestureLibraries.fromRawResource(this, R.raw.gestures);
        if (!mLibrary.load()) {
            finish();
        }

        GestureOverlayView gestures = (GestureOverlayView) findViewById(R.id.gestures);
        gestures.addOnGesturePerformedListener(this);

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

        public void maju(View V){
            urutan++;
            if(urutan == 20 || urutan > 20){
                urutan = 20;
        }
        aksaraSelector(urutan);
    }

    public void mundur(View V){
        urutan--;
        if(urutan == 1 || urutan < 1){
            urutan = 1;
        }
        aksaraSelector(urutan);
    }

    private void aksaraSelector(int selector){
        switch(selector){
            case 1:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ha_huruf.png").into(card_inset_nulis);
                aksara_rekan = "ha";
                break;

            case 2:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/na_huruf.png").into(card_inset_nulis);
                aksara_rekan = "na";
                break;

            case 3:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ca_huruf.png").into(card_inset_nulis);
                aksara_rekan = "ca";
                break;

            case 4:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ra_huruf.png").into(card_inset_nulis);
                aksara_rekan = "ra";
                break;

            case 5:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ka_huruf.png").into(card_inset_nulis);
                aksara_rekan = "ka";
                break;

            case 6:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/da_huruf.png").into(card_inset_nulis);
                aksara_rekan = "da";
                break;

            case 7:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ta_huruf.png").into(card_inset_nulis);
                aksara_rekan = "ta";
                break;

            case 8:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/sa_huruf.png").into(card_inset_nulis);
                aksara_rekan = "sa";
                break;

            case 9:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/wa_huruf.png").into(card_inset_nulis);
                aksara_rekan = "wa";
                break;

            case 10:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/la_huruf.png").into(card_inset_nulis);
                aksara_rekan = "la";
                break;

            case 11:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/pa_huruf.png").into(card_inset_nulis);
                aksara_rekan = "pa";
                break;

            case 12:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/dha_huruf.png").into(card_inset_nulis);
                aksara_rekan = "dha";
                break;

            case 13:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ja_huruf.png").into(card_inset_nulis);
                aksara_rekan = "ja";
                break;

            case 14:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ya_huruf.png").into(card_inset_nulis);
                aksara_rekan = "ya";
                break;

            case 15:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/nya_huruf.png").into(card_inset_nulis);
                aksara_rekan = "nya";
                break;

            case 16:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ma_huruf.png").into(card_inset_nulis);
                aksara_rekan = "ma";
                break;

            case 17:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ga_huruf.png").into(card_inset_nulis);
                aksara_rekan = "ga";
                break;

            case 18:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ba_huruf.png").into(card_inset_nulis);
                aksara_rekan = "ba";
                break;

            case 19:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/tha_huruf.png").into(card_inset_nulis);
                aksara_rekan = "tha";
                break;

            case 20:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/nga_huruf.png").into(card_inset_nulis);
                aksara_rekan = "nga";
                break;
        }
    }

    public void setKotakbener(){
        areanulis.setEnabled(false);
        benernulis.setVisibility(View.VISIBLE);
        salahnulis.setVisibility(View.GONE);
    }

    public void setKotakSalah(){
        areanulis.setEnabled(false);
        benernulis.setVisibility(View.GONE);
        salahnulis.setVisibility(View.VISIBLE);
    }

    public void lanjutSinau(View V){
        urutan = urutan + 1;
        if(urutan<21){
            Intent i = new Intent(InsetNulisActivity.this, InsetNulisActivity.class);
            i.putExtra("aksara", urutan);
            startActivity(i);
            finish();
        }else{
            finish();
        }

    }

    public void baleniSinau(View V){
        Intent i = new Intent(InsetNulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", urutan);
        startActivity(i);
        finish();
    }

    @Override
    public void onGesturePerformed(GestureOverlayView overlay, Gesture gesture) {
        ArrayList<Prediction> predictions = mLibrary.recognize(gesture);

        if (predictions.size() > 0 && predictions.get(0).score > 1.0) {
            String result = predictions.get(0).name;

            if (aksara_rekan.equalsIgnoreCase(result)) {
                setKotakbener();
            } else{
                setKotakSalah();
            }
        }
    }
}
