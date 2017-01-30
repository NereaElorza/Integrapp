package integrapp.tta.intel.ehu.eus.integrapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.IOException;

public class Mapa2Activity extends AppCompatActivity implements View.OnClickListener {

    String habitacion = "";
    String nivel = "";
    String ad = "";
    String a [] = {"https://dl.dropboxusercontent.com/s/aaawpex2ly3xkh2/agenda.mp3?dl=0","https://dl.dropboxusercontent.com/s/dg6cp4ez4o9ztmb/arbela.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/ja3tfmh5z1yc1zd/aulkia.mp3?dl=0","https://dl.dropboxusercontent.com/s/cbnwjlog6mybzea/estutzea.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/smwtol6fuuc40ix/ikaslea.mp3?dl=0","https://dl.dropboxusercontent.com/s/wsdkkny20a9dxlu/irakaslea.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/oi2odea48tx4ply/karpeta.mp3?dl=0","https://dl.dropboxusercontent.com/s/p1dvdmfxlwrlbef/koadernoa.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/jlnzz9nbdpejnr7/mahaia.mp3?dl=0"};
    String p [] = {"https://dl.dropboxusercontent.com/s/r2xout4m0vpn6yq/futbol.mp3?dl=0","https://dl.dropboxusercontent.com/s/ov3xj44n53gjjvo/izkutaketa.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/eyoh8lr0x4on730/kanikak.mp3?dl=0","https://dl.dropboxusercontent.com/s/5vussjn11inelyb/pilota.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/nu2uefaszbuft9f/porteria.mp3?dl=0","https://dl.dropboxusercontent.com/s/cluc7f19vjsl83d/saskia.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/vyfqr1aukxr2ndk/soka.mp3?dl=0","https://dl.dropboxusercontent.com/s/w31gzd3mwoappk8/zabua.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/o17983w702u43tk/zelaia.mp3?dl=0"};
    String g[] = {"https://dl.dropboxusercontent.com/s/tsysmlewjqzvhpk/eraiki.mp3?dl=0","https://dl.dropboxusercontent.com/s/nkuqofxhxvsdi3t/koltxoneta.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/n2arodwaajiv4l0/korrika.mp3?dl=0","https://dl.dropboxusercontent.com/s/0wmeetxelrarkka/salto.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/gwm0d18ohj6tro5/tranpolin.mp3?dl=0","https://dl.dropboxusercontent.com/s/69yo96csac3y2yp/txirrista.mp3?dl=0"};
    String b[] = {"https://dl.dropboxusercontent.com/s/xtref48nv9asrck/ispilua.mp3?dl=0","https://dl.dropboxusercontent.com/s/g5uan0fdyjj00m5/katetik%20tiratu.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/engb9ymoqlh67zt/komun%20ontzia.mp3?dl=0","https://dl.dropboxusercontent.com/s/tq79tt5amssnj9z/konketa.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/04087lr9504nb52/papera.mp3?dl=0","https://dl.dropboxusercontent.com/s/rloc14at1aqz8cg/txisa.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/nbhnilkyc0fn8lj/txorrota.mp3?dl=0","https://dl.dropboxusercontent.com/s/iycaonbfaqrenpk/ura.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/qcvlllsvk58z6p8/xaboia.mp3?dl=0"};
    String c[] = {"https://dl.dropboxusercontent.com/s/wd4p5turcptr2b1/edalontzia.mp3?dl=0","https://dl.dropboxusercontent.com/gosaria.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/pdtzrgw6724xoco/hamaiketakoa.mp3?dl=0","https://dl.dropboxusercontent.com/s/vehqgdrb9zvi1s4/janaria.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/9zo3w23c05fmkps/koilara.mp3?dl=0","https://dl.dropboxusercontent.com/s/lzj77lvurvjn7o0/labana.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/n50znps7xhiepo2/pitxarra.mp3?dl=0","https://dl.dropboxusercontent.com/s/u8vjsbq7voyjuen/platerra.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/b8kf2qjqakt6ns6/sardexka.mp3?dl=0"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa2);

        findViewById(R.id.b11).setOnClickListener(this);
        findViewById(R.id.b12).setOnClickListener(this);
        findViewById(R.id.b13).setOnClickListener(this);
        findViewById(R.id.b21).setOnClickListener(this);
        findViewById(R.id.b22).setOnClickListener(this);
        findViewById(R.id.b23).setOnClickListener(this);
        findViewById(R.id.b31).setOnClickListener(this);
        findViewById(R.id.b32).setOnClickListener(this);
        findViewById(R.id.b33).setOnClickListener(this);


        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        if (extras != null) {//ver si contiene datos
            nivel = (String) extras.get("nivel");
            habitacion = (String) extras.get("p");//Obtengo el nombre de la pantalla
            if(habitacion==null){
                habitacion = (String) extras.get("b");
                if(habitacion==null) {
                    habitacion = (String) extras.get("c");
                    if(habitacion==null){
                        habitacion = (String) extras.get("a");
                        if(habitacion==null){
                            habitacion = (String) extras.get("g");
                        }
                    }

                }
            }
        }

        ImageButton b11 = (ImageButton) findViewById(R.id.b11);
        TextView t11e = (TextView) findViewById(R.id.t11e);
        TextView t11 = (TextView) findViewById(R.id.t11);

        ImageButton b12 = (ImageButton) findViewById(R.id.b12);
        TextView t12e = (TextView) findViewById(R.id.t12e);
        TextView t12 = (TextView) findViewById(R.id.t12);

        ImageButton b13 = (ImageButton) findViewById(R.id.b13);
        TextView t13e = (TextView) findViewById(R.id.t13e);
        TextView t13 = (TextView) findViewById(R.id.t13);

        ImageButton b21 = (ImageButton) findViewById(R.id.b21);
        TextView t21e = (TextView) findViewById(R.id.t21e);
        TextView t21 = (TextView) findViewById(R.id.t21);

        ImageButton b22 = (ImageButton) findViewById(R.id.b22);
        TextView t22e = (TextView) findViewById(R.id.t22e);
        TextView t22 = (TextView) findViewById(R.id.t22);

        ImageButton b23 = (ImageButton) findViewById(R.id.b23);
        TextView t23e = (TextView) findViewById(R.id.t23e);
        TextView t23 = (TextView) findViewById(R.id.t23);

        ImageButton b31 = (ImageButton) findViewById(R.id.b31);
        TextView t31e = (TextView) findViewById(R.id.t31e);
        TextView t31 = (TextView) findViewById(R.id.t31);

        ImageButton b32 = (ImageButton) findViewById(R.id.b32);
        TextView t32e = (TextView) findViewById(R.id.t32e);
        TextView t32 = (TextView) findViewById(R.id.t32);

        ImageButton b33 = (ImageButton) findViewById(R.id.b33);
        TextView t33e = (TextView) findViewById(R.id.t33e);
        TextView t33 = (TextView) findViewById(R.id.t33);



        if(habitacion.matches("patio")){

            t11e.setText(R.string.patio1);
            t12e.setText(R.string.patio2);
            t13e.setText(R.string.patio3);
            t21e.setText(R.string.patio4);
            t22e.setText(R.string.patio5);
            t23e.setText(R.string.patio6);
            t31e.setText(R.string.patio7);
            t32e.setText(R.string.patio8);
            t33e.setText(R.string.patio9);

            t11.setText(R.string.patio1);
            t12.setText(R.string.patio2);
            t13.setText(R.string.patio3);
            t21.setText(R.string.patio4);
            t22.setText(R.string.patio5);
            t23.setText(R.string.patio6);
            t31.setText(R.string.patio7);
            t32.setText(R.string.patio8);
            t33.setText(R.string.patio9);
        }
        if(habitacion.matches("aula")){
            t11e.setText(R.string.aula1);
            t12e.setText(R.string.aula2);
            t13e.setText(R.string.aula3);
            t21e.setText(R.string.aula4);
            t22e.setText(R.string.aula5);
            t23e.setText(R.string.aula6);
            t31e.setText(R.string.aula7);
            t32e.setText(R.string.aula8);
            t33e.setText(R.string.aula9);

            t11.setText(R.string.aula1);
            t12.setText(R.string.aula2);
            t13.setText(R.string.aula3);
            t21.setText(R.string.aula4);
            t22.setText(R.string.aula5);
            t23.setText(R.string.aula6);
            t31.setText(R.string.aula7);
            t32.setText(R.string.aula8);
            t33.setText(R.string.aula9);

        }
        if(habitacion.matches("gimnasio")){
            t11e.setText(R.string.gimnasio1);
            t12e.setText(R.string.gimnasio2);
            t13e.setText(R.string.gimnasio3);
            t21e.setText(R.string.gimnasio4);
            t22e.setText(R.string.gimnasio5);
            t23e.setText(R.string.gimnasio6);

            t11.setText(R.string.gimnasio1);
            t12.setText(R.string.gimnasio2);
            t13.setText(R.string.gimnasio3);
            t21.setText(R.string.gimnasio4);
            t22.setText(R.string.gimnasio5);
            t23.setText(R.string.gimnasio6);


            t31e.setVisibility(View.GONE);
            t32e.setVisibility(View.GONE);
            t33e.setVisibility(View.GONE);
            t31.setVisibility(View.GONE);
            t32.setVisibility(View.GONE);
            t33.setVisibility(View.GONE);
            b31.setVisibility(View.GONE);
            b32.setVisibility(View.GONE);
            b33.setVisibility(View.GONE);
        }
        if(habitacion.matches("comedor")){
            t11e.setText(R.string.comedor1);
            t12e.setText(R.string.comedor2);
            t13e.setText(R.string.comedor3);
            t21e.setText(R.string.comedor4);
            t22e.setText(R.string.comedor5);
            t23e.setText(R.string.comedor6);
            t31e.setText(R.string.comedor7);
            t32e.setText(R.string.comedor8);
            t33e.setText(R.string.comedor9);

            t11.setText(R.string.comedor1);
            t12.setText(R.string.comedor2);
            t13.setText(R.string.comedor3);
            t21.setText(R.string.comedor4);
            t22.setText(R.string.comedor5);
            t23.setText(R.string.comedor6);
            t31.setText(R.string.comedor7);
            t32.setText(R.string.comedor8);
            t33.setText(R.string.comedor9);
        }
        if(habitacion.matches("baño")){
            t11e.setText(R.string.baño1);
            t12e.setText(R.string.baño2);
            t13e.setText(R.string.baño3);
            t21e.setText(R.string.baño4);
            t22e.setText(R.string.baño5);
            t23e.setText(R.string.baño6);
            t31e.setText(R.string.baño7);
            t32e.setText(R.string.baño8);
            t33e.setText(R.string.baño9);

            t11.setText(R.string.baño1);
            t12.setText(R.string.baño2);
            t13.setText(R.string.baño3);
            t21.setText(R.string.baño4);
            t22.setText(R.string.baño5);
            t23.setText(R.string.baño6);
            t31.setText(R.string.baño7);
            t32.setText(R.string.baño8);
            t33.setText(R.string.baño9);
        }

    }



    public void reproducirAudio (View v){
        LinearLayout layout = (LinearLayout)findViewById(R.id.test_layout);

        AudioPlayer audio = new AudioPlayer(v);

        try {
            audio.setAudioUri(Uri.parse(ad));
        } catch (IOException e) {
            e.printStackTrace();
        }
        audio.start();

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.b11:
                if(habitacion.matches("patio"))
                    ad=p[0];
                if(habitacion.matches("baño"))
                    ad=b[0];
                if(habitacion.matches("comedor"))
                    ad=c[0];
                if(habitacion.matches("aula"))
                    ad=a[0];
                if(habitacion.matches("gimnasio"))
                    ad=g[0];
                reproducirAudio(v);
                break;
            case R.id.b12:
                if(habitacion.matches("patio"))
                    ad=p[1];
                if(habitacion.matches("baño"))
                    ad=b[1];
                if(habitacion.matches("comedor"))
                    ad=c[1];
                if(habitacion.matches("aula"))
                    ad=a[1];
                if(habitacion.matches("gimnasio"))
                    ad=g[1];
                reproducirAudio(v);
                break;
            case R.id.b13:
                if(habitacion.matches("patio"))
                    ad=p[2];
                if(habitacion.matches("baño"))
                    ad=b[2];
                if(habitacion.matches("comedor"))
                    ad=c[2];
                if(habitacion.matches("aula"))
                    ad=a[2];
                if(habitacion.matches("gimnasio"))
                    ad=g[2];
                reproducirAudio(v);
                break;
            case R.id.b21:
                if(habitacion.matches("patio"))
                    ad=p[3];
                if(habitacion.matches("baño"))
                    ad=b[3];
                if(habitacion.matches("comedor"))
                    ad=c[3];
                if(habitacion.matches("aula"))
                    ad=a[3];
                if(habitacion.matches("gimnasio"))
                    ad=g[3];
                reproducirAudio(v);
                break;
            case R.id.b22:
                if(habitacion.matches("patio"))
                    ad=p[4];
                if(habitacion.matches("baño"))
                    ad=b[4];
                if(habitacion.matches("comedor"))
                    ad=c[4];
                if(habitacion.matches("aula"))
                    ad=a[4];
                if(habitacion.matches("gimnasio"))
                    ad=g[4];
                reproducirAudio(v);
                break;
            case R.id.b23:
                if(habitacion.matches("patio"))
                    ad=p[5];
                if(habitacion.matches("baño"))
                    ad=b[5];
                if(habitacion.matches("comedor"))
                    ad=c[5];
                if(habitacion.matches("aula"))
                    ad=a[5];
                if(habitacion.matches("gimnasio"))
                    ad=g[5];
                reproducirAudio(v);
                break;
            case R.id.b31:
                if(habitacion.matches("patio"))
                    ad=p[6];
                if(habitacion.matches("baño"))
                    ad=b[6];
                if(habitacion.matches("comedor"))
                    ad=c[6];
                if(habitacion.matches("aula"))
                    ad=a[6];
                if(habitacion.matches("gimnasio"))
                    ad=g[6];
                reproducirAudio(v);
                break;
            case R.id.b32:
                if(habitacion.matches("patio"))
                    ad=p[7];
                if(habitacion.matches("baño"))
                    ad=b[7];
                if(habitacion.matches("comedor"))
                    ad=c[7];
                if(habitacion.matches("aula"))
                    ad=a[7];
                reproducirAudio(v);
                break;
            case R.id.b33:
                if(habitacion.matches("patio"))
                    ad=p[8];
                if(habitacion.matches("baño"))
                    ad=b[8];
                if(habitacion.matches("comedor"))
                    ad=c[8];
                if(habitacion.matches("aula"))
                    ad=a[8];
                reproducirAudio(v);
                break;
        }
    }
}
