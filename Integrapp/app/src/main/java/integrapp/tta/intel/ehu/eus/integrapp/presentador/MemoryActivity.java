package integrapp.tta.intel.ehu.eus.integrapp.presentador;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import integrapp.tta.intel.ehu.eus.integrapp.R;

public class MemoryActivity extends AppCompatActivity implements View.OnClickListener {

    int pareja1 = 0;
    int pareja2 = 0;
    int pareja3 = 0;
    int parejas = 0;
    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);

        findViewById(R.id.pareja1).setOnClickListener(this);
        findViewById(R.id.pareja2).setOnClickListener(this);
        findViewById(R.id.pareja3).setOnClickListener(this);
        findViewById(R.id.pareja1a).setOnClickListener(this);
        findViewById(R.id.pareja2a).setOnClickListener(this);
        findViewById(R.id.pareja3a).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.pareja1:
                pareja1++;
                parejas++;

                final ImageButton boton1 = (ImageButton) findViewById(R.id.pareja1);
                boton1.setImageResource(R.drawable.pelota);

                break;
            case R.id.pareja2:
                pareja2++;
                parejas++;

                ImageButton boton2 = (ImageButton) findViewById(R.id.pareja2);
                boton2.setImageResource(R.drawable.rotuladores);  //seleccionar el boton

                break;
            case R.id.pareja3:
                pareja3++;
                parejas++;

                ImageButton boton3 = (ImageButton) findViewById(R.id.pareja3);
                boton3.setImageResource(R.drawable.estuche); //seleccionar el boton

                break;
            case R.id.pareja1a:
                pareja1++;
                parejas++;

                ImageButton boton1a = (ImageButton) findViewById(R.id.pareja1a);
                boton1a.setImageResource(R.drawable.pelota);  //seleccionar el boton


                break;
            case R.id.pareja2a:
                pareja2++;
                parejas++;

                ImageButton boton2a = (ImageButton) findViewById(R.id.pareja2a);
                boton2a.setImageResource(R.drawable.rotuladores);  //seleccionar el boton

                break;
            case R.id.pareja3a:
                pareja3++;
                parejas++;

                ImageButton boton3a = (ImageButton) findViewById(R.id.pareja3a);
                boton3a.setImageResource(R.drawable.estuche);;  //seleccionar el boton

                break;
            default:
        }
    }
    public void enviar(View view){
        if(parejas==2){
            if(pareja1==2 || pareja2==2 ||pareja3==2){

                if(pareja1==2){
                    ImageButton boton1 = (ImageButton) findViewById(R.id.pareja1);
                    boton1.setImageDrawable(null);
                    boton1.setBackgroundColor(Color.GREEN);
                    boton1.setEnabled(false);

                    ImageButton boton1a = (ImageButton) findViewById(R.id.pareja1a);
                    boton1a.setImageDrawable(null);
                    boton1a.setBackgroundColor(Color.GREEN);
                    boton1a.setEnabled(false);
                }
                if(pareja2==2){
                    ImageButton boton2 = (ImageButton) findViewById(R.id.pareja2);
                    boton2.setImageDrawable(null);
                    boton2.setBackgroundColor(Color.GREEN);
                    boton2.setEnabled(false);

                    ImageButton boton2a = (ImageButton) findViewById(R.id.pareja2a);
                    boton2a.setImageDrawable(null);
                    boton2a.setBackgroundColor(Color.GREEN);
                    boton2a.setEnabled(false);
                }
                if(pareja3==2){
                    ImageButton boton3 = (ImageButton) findViewById(R.id.pareja3);
                    boton3.setImageDrawable(null);
                    boton3.setBackgroundColor(Color.GREEN);
                    boton3.setEnabled(false);

                    ImageButton boton3a = (ImageButton) findViewById(R.id.pareja3a);
                    boton3a.setImageDrawable(null);
                    boton3a.setBackgroundColor(Color.GREEN);
                    boton3a.setEnabled(false);
                }

                Toast.makeText(this,"Acertaste",Toast.LENGTH_SHORT).show();
                cont++;
                reiniciar();

            }else{

                if(pareja1!=0){
                    ImageButton boton1 = (ImageButton) findViewById(R.id.pareja1);
                    boton1.setImageDrawable(null);
                    boton1.setBackgroundColor(Color.LTGRAY);

                    ImageButton boton1a = (ImageButton) findViewById(R.id.pareja1a);
                    boton1a.setImageDrawable(null);
                    boton1a.setBackgroundColor(Color.LTGRAY);
                }
                if(pareja2!=0){
                    ImageButton boton2 = (ImageButton) findViewById(R.id.pareja2);
                    boton2.setImageDrawable(null);
                    boton2.setBackgroundColor(Color.LTGRAY);

                    ImageButton boton2a = (ImageButton) findViewById(R.id.pareja2a);
                    boton2a.setImageDrawable(null);
                    boton2a.setBackgroundColor(Color.LTGRAY);
                }
                if(pareja3!=0){
                    ImageButton boton3 = (ImageButton) findViewById(R.id.pareja3);
                    boton3.setImageDrawable(null);
                    boton3.setBackgroundColor(Color.LTGRAY);

                    ImageButton boton3a = (ImageButton) findViewById(R.id.pareja3a);
                    boton3a.setImageDrawable(null);
                    boton3a.setBackgroundColor(Color.LTGRAY);
                }
                Toast.makeText(this,"Fallaste",Toast.LENGTH_SHORT).show();
                reiniciar();
            }
            if(cont==3){
                AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
                dialogo1.setTitle("ZORIONAK, JOKUA AMAITU DUZU!!");
                dialogo1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {
                        cancelar();
                    }
                });
                dialogo1.show();
            }
        }
    }

    public void reiniciar(){
        pareja1=0;
        pareja2=0;
        pareja3=0;
        parejas=0;
    }

    public void cancelar(){
        Intent intent = new Intent(this, JolasakActivity.class);
        startActivity(intent);
    }

}
