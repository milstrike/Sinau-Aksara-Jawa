package system.mil.sinauaksarajawa;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Inisialisasi library font aplikasi
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Montserrat-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );


        setContentView(R.layout.activity_menu);

    }

    //Implementasi library font aplikasi
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    //Memanggil activity Sinau
    public void goToMainActivity(View V){
        Intent i = new Intent(MenuActivity.this, MainActivity.class);
        startActivity(i);
    }

    //Memanggil activity Nulis
    public void goToNulisActivity(View V){
        Intent i = new Intent(MenuActivity.this, NulisActivity.class);
        startActivity(i);
    }

    //Memanggil activity Kuis
    public void goToQuizActivity(View V){
        Intent i = new Intent(MenuActivity.this, QuizActivity.class);
        startActivity(i);
    }

    //Memanggil activity Tentang
    public void goToTentangActivity(View V){
        Intent i = new Intent(MenuActivity.this, TentangActivity.class);
        startActivity(i);
    }

    //Memanggil konfirmasi keluar
    @Override
    public void onBackPressed(){
        new AlertDialog.Builder(this)
                .setMessage("Arep metu saka aplikasi iki?")
                .setPositiveButton("Iya", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(1);
                    }
                })
                .setNegativeButton("Ora", null)
                .show();
    }

}
