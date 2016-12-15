package system.mil.sinauaksarajawa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class NulisActivity extends AppCompatActivity {

    ImageView ha, na, ca, ra, ka, da, ta, sa, wa, la, pa, dha, ja, ya, nya, ma, ga, ba, tha, nga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Montserrat-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        setContentView(R.layout.activity_nulis);

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

        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ha_huruf.png").into(ha);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/na_huruf.png").into(na);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ca_huruf.png").into(ca);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ra_huruf.png").into(ra);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ka_huruf.png").into(ka);

        Picasso.with(getApplicationContext()).load("file:///android_asset/img/da_huruf.png").into(da);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ta_huruf.png").into(ta);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/sa_huruf.png").into(sa);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/wa_huruf.png").into(wa);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/la_huruf.png").into(la);

        Picasso.with(getApplicationContext()).load("file:///android_asset/img/pa_huruf.png").into(pa);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/dha_huruf.png").into(dha);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ja_huruf.png").into(ja);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ya_huruf.png").into(ya);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/nya_huruf.png").into(nya);

        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ma_huruf.png").into(ma);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ga_huruf.png").into(ga);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/ba_huruf.png").into(ba);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/tha_huruf.png").into(tha);
        Picasso.with(getApplicationContext()).load("file:///android_asset/img/nga_huruf.png").into(nga);

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    public void goToNulisAksara(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        startActivity(i);
    }

    public void nulisHa(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 1);
        startActivity(i);
    }

    public void nulisNa(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 2);
        startActivity(i);
    }

    public void nulisCa(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 3);
        startActivity(i);
    }

    public void nulisRa(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 4);
        startActivity(i);
    }

    public void nulisKa(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 5);
        startActivity(i);
    }

    public void nulisDa(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 6);
        startActivity(i);
    }

    public void nulisTa(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 7);
        startActivity(i);
    }

    public void nulisSa(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 8);
        startActivity(i);
    }

    public void nulisWa(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 9);
        startActivity(i);
    }

    public void nulisLa(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 10);
        startActivity(i);
    }

    public void nulisPa(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 11);
        startActivity(i);
    }

    public void nulisDha(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 12);
        startActivity(i);
    }

    public void nulisJa(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 13);
        startActivity(i);
    }

    public void nulisYa(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 14);
        startActivity(i);
    }

    public void nulisNya(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 15);
        startActivity(i);
    }

    public void nulisMa(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 16);
        startActivity(i);
    }

    public void nulisGa(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 17);
        startActivity(i);
    }

    public void nulisBa(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 18);
        startActivity(i);
    }

    public void nulisTha(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 19);
        startActivity(i);
    }

    public void nulisNga(View V){
        Intent i = new Intent(NulisActivity.this, InsetNulisActivity.class);
        i.putExtra("aksara", 20);
        startActivity(i);
    }

}
