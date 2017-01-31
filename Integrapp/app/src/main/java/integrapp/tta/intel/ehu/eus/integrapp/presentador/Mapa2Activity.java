package integrapp.tta.intel.ehu.eus.integrapp.presentador;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.IOException;

import integrapp.tta.intel.ehu.eus.integrapp.vista.AudioPlayer;
import integrapp.tta.intel.ehu.eus.integrapp.R;

public class Mapa2Activity extends AppCompatActivity implements View.OnClickListener {

    String habitacion = "";
    String idioma = "";
    String ad = "";
    String a [] = { "https://dl.dropboxusercontent.com/s/wsdkkny20a9dxlu/irakaslea.mp3?dl=0","https://dl.dropboxusercontent.com/s/smwtol6fuuc40ix/ikaslea.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/dg6cp4ez4o9ztmb/arbela.mp3?dl=0","https://dl.dropboxusercontent.com/s/aaawpex2ly3xkh2/agenda.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/jlnzz9nbdpejnr7/mahaia.mp3?dl=0","https://dl.dropboxusercontent.com/s/ja3tfmh5z1yc1zd/aulkia.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/cbnwjlog6mybzea/estutzea.mp3?dl=0","https://dl.dropboxusercontent.com/s/p1dvdmfxlwrlbef/koadernoa.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/oi2odea48tx4ply/karpeta.mp3?dl=0"};

    String p [] = {"https://dl.dropboxusercontent.com/s/5vussjn11inelyb/pilota.mp3?dl=0","https://dl.dropboxusercontent.com/s/w31gzd3mwoappk8/zabua.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/vyfqr1aukxr2ndk/soka.mp3?dl=0","https://dl.dropboxusercontent.com/s/o17983w702u43tk/zelaia.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/nu2uefaszbuft9f/porteria.mp3?dl=0","https://dl.dropboxusercontent.com/s/cluc7f19vjsl83d/saskia.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/eyoh8lr0x4on730/kanikak.mp3?dl=0","https://dl.dropboxusercontent.com/s/ov3xj44n53gjjvo/izkutaketa.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/r2xout4m0vpn6yq/futbol.mp3?dl=0"};

    String g[] = {
            "https://dl.dropboxusercontent.com/s/n2arodwaajiv4l0/korrika.mp3?dl=0","https://dl.dropboxusercontent.com/s/0wmeetxelrarkka/salto.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/tsysmlewjqzvhpk/eraiki.mp3?dl=0","https://dl.dropboxusercontent.com/s/69yo96csac3y2yp/txirrista.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/nkuqofxhxvsdi3t/koltxoneta.mp3?dl=0", "https://dl.dropboxusercontent.com/s/gwm0d18ohj6tro5/tranpolin.mp3?dl=0"};

    String b[] = {"https://dl.dropboxusercontent.com/s/04087lr9504nb52/papera.mp3?dl=0", "https://dl.dropboxusercontent.com/s/iycaonbfaqrenpk/ura.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/rloc14at1aqz8cg/txisa.mp3?dl=0","https://dl.dropboxusercontent.com/s/qcvlllsvk58z6p8/xaboia.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/nbhnilkyc0fn8lj/txorrota.mp3?dl=0", "https://dl.dropboxusercontent.com/s/tq79tt5amssnj9z/konketa.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/g5uan0fdyjj00m5/katetik%20tiratu.mp3?dl=0", "https://dl.dropboxusercontent.com/s/engb9ymoqlh67zt/komun%20ontzia.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/xtref48nv9asrck/ispilua.mp3?dl=0"};

    String c[] = {"https://dl.dropboxusercontent.com/s/wd4p5turcptr2b1/edalontzia.mp3?dl=0","https://dl.dropboxusercontent.com/s/u8vjsbq7voyjuen/platerra.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/b8kf2qjqakt6ns6/sardexka.mp3?dl=0","https://dl.dropboxusercontent.com/s/9zo3w23c05fmkps/koilara.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/lzj77lvurvjn7o0/labana.mp3?dl=0","https://dl.dropboxusercontent.com/s/n50znps7xhiepo2/pitxarra.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/vehqgdrb9zvi1s4/janaria.mp3?dl=0","https://dl.dropboxusercontent.com/gosaria.mp3?dl=0",
            "https://dl.dropboxusercontent.com/s/pdtzrgw6724xoco/hamaiketakoa.mp3?dl=0",};


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
            idioma = (String) extras.get("idioma");
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

        Button b11 = (Button) findViewById(R.id.b11);
        TextView t11 = (TextView) findViewById(R.id.t11);

        Button b12 = (Button) findViewById(R.id.b12);
        TextView t12 = (TextView) findViewById(R.id.t12);

        Button b13 = (Button) findViewById(R.id.b13);
        TextView t13 = (TextView) findViewById(R.id.t13);

        Button b21 = (Button) findViewById(R.id.b21);
        TextView t21 = (TextView) findViewById(R.id.t21);

        Button b22 = (Button) findViewById(R.id.b22);
        TextView t22 = (TextView) findViewById(R.id.t22);

        Button b23 = (Button) findViewById(R.id.b23);
        TextView t23 = (TextView) findViewById(R.id.t23);

        Button b31 = (Button) findViewById(R.id.b31);
        TextView t31 = (TextView) findViewById(R.id.t31);

        Button b32 = (Button) findViewById(R.id.b32);
        TextView t32 = (TextView) findViewById(R.id.t32);

        Button b33 = (Button) findViewById(R.id.b33);
        TextView t33 = (TextView) findViewById(R.id.t33);


        if(habitacion.matches("patio")){

            if(idioma.matches("c")){
                t11.setText(R.string.patio1c);
                t12.setText(R.string.patio2c);
                t13.setText(R.string.patio3c);
                t21.setText(R.string.patio4c);
                t22.setText(R.string.patio5c);
                t23.setText(R.string.patio6c);
                t31.setText(R.string.patio7c);
                t32.setText(R.string.patio8c);
                t33.setText(R.string.patio9c);
            }else{
                t11.setText(R.string.patio1e);
                t12.setText(R.string.patio2e);
                t13.setText(R.string.patio3e);
                t21.setText(R.string.patio4e);
                t22.setText(R.string.patio5e);
                t23.setText(R.string.patio6e);
                t31.setText(R.string.patio7e);
                t32.setText(R.string.patio8e);
                t33.setText(R.string.patio9e);
            }
            b11.setText(R.string.patio1);
            b12.setText(R.string.patio2);
            b13.setText(R.string.patio3);
            b21.setText(R.string.patio4);
            b22.setText(R.string.patio5);
            b23.setText(R.string.patio6);
            b31.setText(R.string.patio7);
            b32.setText(R.string.patio8);
            b33.setText(R.string.patio9);

        }
        if(habitacion.matches("aula")){
            if(idioma.matches("c")){
                t11.setText(R.string.aula1c);
                t12.setText(R.string.aula2c);
                t13.setText(R.string.aula3c);
                t21.setText(R.string.aula4c);
                t22.setText(R.string.aula5c);
                t23.setText(R.string.aula6c);
                t31.setText(R.string.aula7c);
                t32.setText(R.string.aula8c);
                t33.setText(R.string.aula9c);

            }else {
                t11.setText(R.string.aula1e);
                t12.setText(R.string.aula2e);
                t13.setText(R.string.aula3e);
                t21.setText(R.string.aula4e);
                t22.setText(R.string.aula5e);
                t23.setText(R.string.aula6e);
                t31.setText(R.string.aula7e);
                t32.setText(R.string.aula8e);
                t33.setText(R.string.aula9e);

            }
            b11.setText(R.string.aula1);
            b12.setText(R.string.aula2);
            b13.setText(R.string.aula3);
            b21.setText(R.string.aula4);
            b22.setText(R.string.aula5);
            b23.setText(R.string.aula6);
            b31.setText(R.string.aula7);
            b32.setText(R.string.aula8);
            b33.setText(R.string.aula9);

        }
        if(habitacion.matches("gimnasio")){
            if(idioma.matches("c")){
                t11.setText(R.string.gimnasio1c);
                t12.setText(R.string.gimnasio2c);
                t13.setText(R.string.gimnasio3c);
                t21.setText(R.string.gimnasio4c);
                t22.setText(R.string.gimnasio5c);
                t23.setText(R.string.gimnasio6c);
            }else{
                t11.setText(R.string.gimnasio1e);
                t12.setText(R.string.gimnasio2e);
                t13.setText(R.string.gimnasio3e);
                t21.setText(R.string.gimnasio4e);
                t22.setText(R.string.gimnasio5e);
                t23.setText(R.string.gimnasio6e);
            }
            b11.setText(R.string.gimnasio1);
            b12.setText(R.string.gimnasio2);
            b13.setText(R.string.gimnasio3);
            b21.setText(R.string.gimnasio4);
            b22.setText(R.string.gimnasio5);
            b23.setText(R.string.gimnasio6);


            b31.setVisibility(View.GONE);
            b32.setVisibility(View.GONE);
            b33.setVisibility(View.GONE);
            t31.setVisibility(View.GONE);
            t32.setVisibility(View.GONE);
            t33.setVisibility(View.GONE);
            b31.setVisibility(View.GONE);
            b32.setVisibility(View.GONE);
            b33.setVisibility(View.GONE);
        }
        if(habitacion.matches("comedor")){
            if(idioma.matches("c")){
                t11.setText(R.string.comedor1c);
                t12.setText(R.string.comedor2c);
                t13.setText(R.string.comedor3c);
                t21.setText(R.string.comedor4c);
                t22.setText(R.string.comedor5c);
                t23.setText(R.string.comedor6c);
                t31.setText(R.string.comedor7c);
                t32.setText(R.string.comedor8c);
                t33.setText(R.string.comedor9c);
            }else{
                t11.setText(R.string.comedor1e);
                t12.setText(R.string.comedor2e);
                t13.setText(R.string.comedor3e);
                t21.setText(R.string.comedor4e);
                t22.setText(R.string.comedor5e);
                t23.setText(R.string.comedor6e);
                t31.setText(R.string.comedor7e);
                t32.setText(R.string.comedor8e);
                t33.setText(R.string.comedor9e);
            }
            b11.setText(R.string.comedor1);
            b12.setText(R.string.comedor2);
            b13.setText(R.string.comedor3);
            b21.setText(R.string.comedor4);
            b22.setText(R.string.comedor5);
            b23.setText(R.string.comedor6);
            b31.setText(R.string.comedor7);
            b32.setText(R.string.comedor8);
            b33.setText(R.string.comedor9);

        }
        if(habitacion.matches("baño")){
            if(idioma.matches("c")){
                t11.setText(R.string.baño1c);
                t12.setText(R.string.baño2c);
                t13.setText(R.string.baño3c);
                t21.setText(R.string.baño4c);
                t22.setText(R.string.baño5c);
                t23.setText(R.string.baño6c);
                t31.setText(R.string.baño7c);
                t32.setText(R.string.baño8c);
                t33.setText(R.string.baño9c);
            }else{
                t11.setText(R.string.baño1e);
                t12.setText(R.string.baño2e);
                t13.setText(R.string.baño3e);
                t21.setText(R.string.baño4e);
                t22.setText(R.string.baño5e);
                t23.setText(R.string.baño6e);
                t31.setText(R.string.baño7e);
                t32.setText(R.string.baño8e);
                t33.setText(R.string.baño9e);
            }
            b11.setText(R.string.baño1);
            b12.setText(R.string.baño2);
            b13.setText(R.string.baño3);
            b21.setText(R.string.baño4);
            b22.setText(R.string.baño5);
            b23.setText(R.string.baño6);
            b31.setText(R.string.baño7);
            b32.setText(R.string.baño8);
            b33.setText(R.string.baño9);

        }

    }



    public void reproducirAudio (View v){
        LinearLayout layout = (LinearLayout)findViewById(R.id.mapa2);

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
