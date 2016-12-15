package system.mil.sinauaksarajawa;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    //Instansiasi object ImageView
    ImageView ha, na, ca, ra, ka, da, ta, sa, wa, la, pa, dha, ja, ya, nya, ma, ga, ba, tha, nga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Inisialisasi font aplikasi
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Montserrat-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        setContentView(R.layout.activity_main);

        //Linkage object dengan view layout
        ha = (ImageView) findViewById(R.id.ha);
        na = (ImageView) findViewById(R.id.na);
        ca = (ImageView) findViewById(R.id.ca);
        ra = (ImageView) findViewById(R.id.ra);
        ka = (ImageView) findViewById(R.id.ka);
        da = (ImageView) findViewById(R.id.da);
        ta = (ImageView) findViewById(R.id.ta);
        sa = (ImageView) findViewById(R.id.sa);
        wa = (ImageView) findViewById(R.id.wa);
        la = (ImageView) findViewById(R.id.la);
        pa = (ImageView) findViewById(R.id.pa);
        dha = (ImageView) findViewById(R.id.dha);
        ja = (ImageView) findViewById(R.id.ja);
        ya = (ImageView) findViewById(R.id.ya);
        nya = (ImageView) findViewById(R.id.nya);
        ma = (ImageView) findViewById(R.id.ma);
        ga = (ImageView) findViewById(R.id.ga);
        ba = (ImageView) findViewById(R.id.ba);
        tha = (ImageView) findViewById(R.id.tha);
        nga = (ImageView) findViewById(R.id.nga);

        //Load gambar ke layout menggunakan library picasso
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ha.png").into(ha);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/na.png").into(na);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ca.png").into(ca);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ra.png").into(ra);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ka.png").into(ka);

        Picasso.with(getApplicationContext()).load("file:///android_asset/img/da.png").into(da);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ta.png").into(ta);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/sa.png").into(sa);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/wa.png").into(wa);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/la.png").into(la);

        Picasso.with(getApplicationContext()).load("file:///android_asset/img/pa.png").into(pa);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/dha.png").into(dha);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ja.png").into(ja);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ya.png").into(ya);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/nya.png").into(nya);

        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ma.png").into(ma);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ga.png").into(ga);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ba.png").into(ba);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/tha.png").into(tha);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/nga.png").into(nga);

    }

    //Implementasi font aplikasi
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


    //Handle Inset Sinau --> per aksara
    public void sinauHa(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 1);
        startActivity(i);
    }

    public void sinauNa(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 2);
        startActivity(i);
    }

    public void sinauCa(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 3);
        startActivity(i);
    }

    public void sinauRa(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 4);
        startActivity(i);
    }

    public void sinauKa(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 5);
        startActivity(i);
    }

    public void sinauDa(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 6);
        startActivity(i);
    }

    public void sinauTa(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 7);
        startActivity(i);
    }

    public void sinauSa(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 8);
        startActivity(i);
    }

    public void sinauWa(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 9);
        startActivity(i);
    }

    public void sinauLa(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 10);
        startActivity(i);
    }

    public void sinauPa(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 11);
        startActivity(i);
    }

    public void sinauDha(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 12);
        startActivity(i);
    }

    public void sinauJa(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 13);
        startActivity(i);
    }

    public void sinauYa(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 14);
        startActivity(i);
    }

    public void sinauNya(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 15);
        startActivity(i);
    }

    public void sinauMa(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 16);
        startActivity(i);
    }

    public void sinauGa(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 17);
        startActivity(i);
    }

    public void sinauBa(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 18);
        startActivity(i);
    }

    public void sinauTha(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 19);
        startActivity(i);
    }

    public void sinauNga(View V){
        Intent i = new Intent(MainActivity.this, InsetSinauActivity.class);
        i.putExtra("aksara", 20);
        startActivity(i);
    }
    //Handle Inset Sinau --> per aksara
}