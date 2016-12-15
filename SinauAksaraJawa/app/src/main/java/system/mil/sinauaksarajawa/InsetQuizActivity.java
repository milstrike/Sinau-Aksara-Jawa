package system.mil.sinauaksarajawa;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


public class InsetQuizActivity extends AppCompatActivity{

    //instansiasi object view
    public ImageView gambarSoal;
    public TextView soal, jawabanA, jawabanB, jawabanC, jawabanyangbenar, bijitotal;
    public LinearLayout jawabanbener, jawabansalah, lembarsoal, kuiserampung;

    //inisialisasi variabel
    public String jawabanbenar = "";
    public String pilihanjawaban = "";
    public int nilai = 0;
    public int soalTampil = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Montserrat-Regular.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );

        setContentView(R.layout.activity_inset_quiz);

        //link object ke layout view
        gambarSoal = (ImageView) findViewById(R.id.gambar_soal);
        soal = (TextView) findViewById(R.id.teks_soal);
        jawabanA = (TextView) findViewById(R.id.jawaban_a);
        jawabanB = (TextView) findViewById(R.id.jawaban_b);
        jawabanC = (TextView) findViewById(R.id.jawaban_c);
        jawabanyangbenar = (TextView) findViewById(R.id.jawabansingbener);
        bijitotal = (TextView) findViewById(R.id.totalbiji);

        jawabanbener = (LinearLayout) findViewById(R.id.jawabanbenar);
        jawabansalah = (LinearLayout) findViewById(R.id.jawabansalah);
        lembarsoal = (LinearLayout) findViewById(R.id.paparescaradas);
        kuiserampung = (LinearLayout) findViewById(R.id.kuisentek);

        //memanggil method buat soal
        getSoal(soalTampil);

    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }



    //DATA SOAL
    public void soal1(){
        gambarSoal.setImageResource(R.drawable.gambarsoal1);
        soal.setText("Kewan ing dhuwur arane...");
        jawabanA.setText("A. Biawak");
        jawabanB.setText("B. Boyo");
        jawabanC.setText("C. Kadal");
        jawabanbenar = "B. Boyo";
    }

    public void soal2(){
        gambarSoal.setImageResource(R.drawable.gambarsoal2);
        soal.setText("Manuk ing dhuwur arane...");
        jawabanA.setText("A. Dara");
        jawabanB.setText("B. Emprit");
        jawabanC.setText("C. Gagak");
        jawabanbenar = "A. Dara";
    }

    public void soal3(){
        gambarSoal.setImageResource(R.drawable.gambarsoal3);
        soal.setText("Alat ing dhuwur arane...");
        jawabanA.setText("A. Kacamata");
        jawabanB.setText("B. Lensa");
        jawabanC.setText("C. Alis");
        jawabanbenar = "A. Kacamata";
    }

    public void soal4(){
        gambarSoal.setImageResource(R.drawable.gambarsoal4);
        soal.setText("Kewan sing mabure wengi kaya ing dhuwur iku arane...");
        jawabanA.setText("A. Manuk");
        jawabanB.setText("B. Lawa");
        jawabanC.setText("C. Coro");
        jawabanbenar = "B. Lawa";
    }

    public void soal5(){
        gambarSoal.setImageResource(R.drawable.gambarsoal5);
        soal.setText("Material bangunan ing dhuwur arane...");
        jawabanA.setText("A. Gendeng");
        jawabanB.setText("B. Bata");
        jawabanC.setText("C. Gabus");
        jawabanbenar = "B. Bata";
    }

    public void soal6(){
        gambarSoal.setImageResource(R.drawable.gambarsoal6);
        soal.setText("Tulisan jawa ing dhuwur wacane...");
        jawabanA.setText("A. rawa");
        jawabanB.setText("B. dawa");
        jawabanC.setText("C. bala");
        jawabanbenar = "A. rawa";
    }

    public void soal7(){
        gambarSoal.setImageResource(R.drawable.gambarsoal7);
        soal.setText("Tulisan jawa ing dhuwur wacane...");
        jawabanA.setText("A. bata tata");
        jawabanB.setText("B. bata nata");
        jawabanC.setText("C. nata bata");
        jawabanbenar = "C. nata bata";
    }

    public void soal8(){
        gambarSoal.setImageResource(R.drawable.gambarsoal8);
        soal.setText("Tulisan jawa ing dhuwur wacane...");
        jawabanA.setText("A. maca");
        jawabanB.setText("B. mata");
        jawabanC.setText("C. mara");
        jawabanbenar = "B. mata";
    }

    public void soal9(){
        gambarSoal.setImageResource(R.drawable.gambarsoal9);
        soal.setText("Tulisan jawa ing dhuwur wacane...");
        jawabanA.setText("A. dana");
        jawabanB.setText("B. dawa");
        jawabanC.setText("C. mawa");
        jawabanbenar = "C. mawa";
    }

    public void soal10(){
        gambarSoal.setImageResource(R.drawable.gambarsoal10);
        soal.setText("Tulisan jawa ing dhuwur wacane...");
        jawabanA.setText("A. ana dara sanga");
        jawabanB.setText("B. ana lawa sanga");
        jawabanC.setText("C. ana bata sanga");
        jawabanbenar = "A. ana dara sanga";
    }
    //DATA SOAL




    //handle soal selanjutnya
    public void nextSoal(View v){

        jawabanbener.setVisibility(View.GONE);
        jawabansalah.setVisibility(View.GONE);
        kuiserampung.setVisibility(View.GONE);
        lembarsoal.setEnabled(true);

        soalTampil++;
        if(soalTampil < 11){
            getSoal(soalTampil);
        }
        else{
            tampilBiji();
        }



    }

    //handle menampilkan nilai
    public void tampilBiji(){
        //lembarsoal.setEnabled(false);
        kuiserampung.setVisibility(View.VISIBLE);
        bijitotal.setText(String.valueOf(nilai));
    }

    //Fungsi membuat soal
    public void getSoal(int a){
        switch (a){
            case 1:
                soal1();
                break;

            case 2:
                soal2();
                break;

            case 3:
                soal3();
                break;

            case 4:
                soal4();
                break;

            case 5:
                soal5();
                break;

            case 6:
                soal6();
                break;

            case 7:
                soal7();
                break;

            case 8:
                soal8();
                break;

            case 9:
                soal9();
                break;

            case 10:
                soal10();
                break;
        }
    }

    //handle jawaban A
    public void takeJawabanA(View v){
        pilihanjawaban = jawabanA.getText().toString();
        pembandingJawaban();
    }

    //handle jawaban b
    public void takeJawabanB(View v){
        pilihanjawaban = jawabanB.getText().toString();
        pembandingJawaban();
    }


    //handle jawaban c
    public void takeJawabanC(View v){
        pilihanjawaban = jawabanC.getText().toString();
        pembandingJawaban();
    }

    //pemeriksa kebenaran jawaban
    public void pembandingJawaban(){
        if(jawabanbenar.equalsIgnoreCase(pilihanjawaban)){
            lembarsoal.setEnabled(false);
            jawabanbener.setVisibility(View.VISIBLE);
            jawabansalah.setVisibility(View.GONE);
            kuiserampung.setVisibility(View.GONE);
            nilai = nilai + 10;
        }
        else{
            lembarsoal.setEnabled(false);
            jawabanbener.setVisibility(View.GONE);
            jawabansalah.setVisibility(View.VISIBLE);
            kuiserampung.setVisibility(View.GONE);
            jawabanyangbenar.setText(jawabanbenar);
            nilai = nilai - 10;
        }
    }

    //handle kuis selesai
    public void kuisrampung(View v){
        finish();
    }
}
