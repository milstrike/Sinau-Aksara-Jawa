package system.mil.sinauaksarajawa;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.gesture.Gesture;
import android.gesture.GestureLibraries;
import android.gesture.GestureLibrary;
import android.gesture.Prediction;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.gesture.GestureOverlayView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class InsetSinauActivity extends AppCompatActivity implements GestureOverlayView.OnGesturePerformedListener {

    GestureLibrary mLibrary;

    //inisialisasi urutan aksara
    private int urutan = 1;

    private String aksara_rekan = "";

    //instansiasi objek view
    private ImageView card_inset_sinau, card_inset_sinau_suara, aksaraguidance;
    private LinearLayout areanulis, benernulis, salahnnulis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle extras = getIntent().getExtras();

        setContentView(R.layout.activity_inset_sinau);

        //memanggil urutan aksara
        urutan = extras.getInt("aksara");

        //Linkage object ke view layout
        card_inset_sinau = (ImageView) findViewById(R.id.card_inset_sinau);
        card_inset_sinau_suara = (ImageView) findViewById(R.id.card_inset_sinau_suara);
        aksaraguidance = (ImageView) findViewById(R.id.guidance);

        areanulis = (LinearLayout) findViewById(R.id.sinau_nulis);
        benernulis = (LinearLayout) findViewById(R.id.bener_nulis);
        salahnnulis = (LinearLayout) findViewById(R.id.salah_nulis);

        //memanggil fungsi load aksara
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

    //Aksara Loader dengan parameter urutan
    private void aksaraSelector(int selector){
        switch(selector){
            case 1:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ha.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ha_guidance.png").into(aksaraguidance);
                aksara_rekan = "ha";
                break;

            case 2:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/na.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/na_guidance.png").into(aksaraguidance);
                aksara_rekan = "na";
                break;

            case 3:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ca.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ca_guidance.png").into(aksaraguidance);
                aksara_rekan = "ca";
                break;

            case 4:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ra.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ra_guidance.png").into(aksaraguidance);
                aksara_rekan = "ra";
                break;

            case 5:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ka.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ka_guidance.png").into(aksaraguidance);
                aksara_rekan = "ka";
                break;

            case 6:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/da.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/da_guidance.png").into(aksaraguidance);
                aksara_rekan = "da";
                break;

            case 7:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ta.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ta_guidance.png").into(aksaraguidance);
                aksara_rekan = "ta";
                break;

            case 8:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/sa.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/sa_guidance.png").into(aksaraguidance);
                aksara_rekan = "sa";
                break;

            case 9:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/wa.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/wa_guidance.png").into(aksaraguidance);
                aksara_rekan = "wa";
                break;

            case 10:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/la.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/la_guidance.png").into(aksaraguidance);
                aksara_rekan = "la";
                break;

            case 11:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/pa.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/pa_guidance.png").into(aksaraguidance);
                aksara_rekan = "pa";
                break;

            case 12:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/dha.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/dha_guidance.png").into(aksaraguidance);
                aksara_rekan = "dha";
                break;

            case 13:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ja.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ja_guidance.png").into(aksaraguidance);
                aksara_rekan = "ja";
                break;

            case 14:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ya.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ya_guidance.png").into(aksaraguidance);
                aksara_rekan = "ya";
                break;

            case 15:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/nya.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/nya_guidance.png").into(aksaraguidance);
                aksara_rekan = "nya";
                break;

            case 16:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ma.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ma_guidance.png").into(aksaraguidance);
                aksara_rekan = "ma";
                break;

            case 17:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ga.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ga_guidance.png").into(aksaraguidance);
                aksara_rekan = "ga";
                break;

            case 18:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ba.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/ba_guidance.png").into(aksaraguidance);
                aksara_rekan = "ba";
                break;

            case 19:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/tha.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/tha_guidance.png").into(aksaraguidance);
                aksara_rekan = "tha";
                break;

            case 20:
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/nga.png").into(card_inset_sinau);
                Picasso.with(getApplicationContext()).load("file:///android_asset/img/nga_guidance.png").into(aksaraguidance);
                aksara_rekan = "nga";
                break;
        }
    }

    //handle button play sound
    public void playSound(View V){
        card_inset_sinau_suara.setImageDrawable(getResources().getDrawable(R.drawable.suara_main));
        card_inset_sinau_suara.setEnabled(false);
        Play(String.valueOf(urutan));
    }


    //handle play sound
    public void Play(String fileName)
    {
        AssetFileDescriptor descriptor = null;
        try {
            descriptor = getApplicationContext().getAssets().openFd("snd/" + fileName + ".wav");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long start = descriptor.getStartOffset();
        long end = descriptor.getLength();
        MediaPlayer mediaPlayer=new MediaPlayer();
        try {
            mediaPlayer.setDataSource(descriptor.getFileDescriptor(), start, end);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                card_inset_sinau_suara.setImageDrawable(getResources().getDrawable(R.drawable.suara));
                card_inset_sinau_suara.setEnabled(true);
            }
        });
        mediaPlayer.start();

    }

    //handle kebenaran
    public void setKotakbener(){
        areanulis.setEnabled(false);
        benernulis.setVisibility(View.VISIBLE);
        salahnnulis.setVisibility(View.GONE);
    }

    public void setKotakSalah(){
        areanulis.setEnabled(false);
        benernulis.setVisibility(View.GONE);
        salahnnulis.setVisibility(View.VISIBLE);
    }


    //handle lanjut karakter
    public void lanjutSinau(View V){
        urutan = urutan + 1;
        if(urutan<21){
            Intent i = new Intent(InsetSinauActivity.this, InsetSinauActivity.class);
            i.putExtra("aksara", urutan);
            startActivity(i);
            finish();
        }
        else{
            finish();
        }

    }

    //handle lanjut karakter
    public void baleniSinau(View V){
        Intent i = new Intent(InsetSinauActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", urutan);
        startActivity(i);
        finish();
    }

    //handling gesture
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
