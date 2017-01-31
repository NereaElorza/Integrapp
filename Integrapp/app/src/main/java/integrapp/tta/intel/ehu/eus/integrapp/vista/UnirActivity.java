package integrapp.tta.intel.ehu.eus.integrapp.vista;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import integrapp.tta.intel.ehu.eus.integrapp.R;

public class UnirActivity extends AppCompatActivity implements View.OnClickListener{

    int pareja1 = 0;
    int pareja2 = 0;
    int pareja3 = 0;
    int parejas = 0;
    int cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unir);

        findViewById(R.id.im1).setOnClickListener(this);
        findViewById(R.id.tx1).setOnClickListener(this);
        findViewById(R.id.im2).setOnClickListener(this);
        findViewById(R.id.tx2).setOnClickListener(this);
        findViewById(R.id.im3).setOnClickListener(this);
        findViewById(R.id.tx3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        ImageButton boton1 = (ImageButton) findViewById(R.id.im1);
        Button boton1a = (Button) findViewById(R.id.tx1);
        ImageButton boton2 = (ImageButton) findViewById(R.id.im2);
        Button boton2a = (Button) findViewById(R.id.tx2);
        ImageButton boton3 = (ImageButton) findViewById(R.id.im3);
        Button boton3a = (Button) findViewById(R.id.tx3);

        switch (v.getId()) {
            case R.id.im1:
                pareja1++;
                parejas++;

                Toast.makeText(this,"Irudia klikatuta",Toast.LENGTH_SHORT).show();

                break;
            case R.id.im2:
                pareja2++;
                parejas++;

                Toast.makeText(this,"Irudia klikatuta",Toast.LENGTH_SHORT).show();

                break;
            case R.id.im3:
                pareja3++;
                parejas++;

                Toast.makeText(this,"Irudia klikatuta",Toast.LENGTH_SHORT).show();

                break;
            case R.id.tx1:
                pareja1++;
                parejas++;

                boton1a.setBackgroundColor(Color.CYAN);

                break;
            case R.id.tx2:
                pareja2++;
                parejas++;

                boton2a.setBackgroundColor(Color.CYAN);
                break;
            case R.id.tx3:
                pareja3++;
                parejas++;

                boton3a.setBackgroundColor(Color.CYAN);
                break;
            default:
        }
    }

    public void enviar(View view){
        if(parejas==2){
            ImageButton boton1 = (ImageButton) findViewById(R.id.im1);
            Button boton1a = (Button) findViewById(R.id.tx1);
            ImageButton boton2 = (ImageButton) findViewById(R.id.im2);
            Button boton2a = (Button) findViewById(R.id.tx2);
            ImageButton boton3 = (ImageButton) findViewById(R.id.im3);
            Button boton3a = (Button) findViewById(R.id.tx3);

            if(pareja1==2 || pareja2==2 ||pareja3==2){

                if(pareja1==2){

                    boton1.setVisibility(View.INVISIBLE);

                    boton1a.setVisibility(View.INVISIBLE);
                }
                if(pareja2==2){
                    boton2.setVisibility(View.INVISIBLE);

                    boton2a.setVisibility(View.INVISIBLE);
                }
                if(pareja3==2){
                    boton3.setVisibility(View.INVISIBLE);

                    boton3a.setVisibility(View.INVISIBLE);
                }

                Toast.makeText(this,"Acertaste",Toast.LENGTH_SHORT).show();
                cont++;
                reiniciar();

            }else{

                if(pareja1!=0){

                    boton1a.setBackgroundColor(Color.LTGRAY);
                }
                if(pareja2!=0){
                    boton2a.setBackgroundColor(Color.LTGRAY);
                }
                if(pareja3!=0){
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
        Intent intent = new Intent(this, AutoebaluazioaActivity.class);
        startActivity(intent);
    }
}