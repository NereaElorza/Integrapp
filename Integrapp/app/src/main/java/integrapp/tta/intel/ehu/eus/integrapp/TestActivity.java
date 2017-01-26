package integrapp.tta.intel.ehu.eus.integrapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    private String cadena1[] = {"SUKALDEA", "KONKETA", "PAPERA"};
    private String cadena2[] = {"TXIRRISTA", "SASKIA", "ZALDIA"};
    private String cadena3[] = {"KOMUNA", "IKASGELA", "JANTOKIA"};
    private int contador = 0;
    private int correct = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        contador=1;
        crearRadio();

    }

    public void enviar(View v) {
        LinearLayout layout = (LinearLayout) findViewById(R.id.test_choices);


        RadioGroup group = (RadioGroup) findViewById(R.id.test_choices);
        int choice = group.getChildCount();
        for (int i = 0; i < choice; i++) {
            group.getChildAt(i).setEnabled(false);      //deshabilitar todos los botones
        }
        findViewById(R.id.button_send_test).setVisibility(View.GONE);

        int idboton= group.getCheckedRadioButtonId();
        View vista=findViewById(idboton);
        int selected=group.indexOfChild(vista);

        group.getChildAt(correct).setBackgroundColor(Color.GREEN);

        if (selected != correct) {
            group.getChildAt(selected).setBackgroundColor(Color.RED);
            Toast.makeText(getApplicationContext(), "Has fallado!", Toast.LENGTH_SHORT).show();


        } else {
            Toast.makeText(getApplicationContext(), "Correcto!", Toast.LENGTH_SHORT).show();
        }

        findViewById(R.id.button_next).setVisibility(View.VISIBLE);
    }

    public void crearRadio(){
        ImageView logo= (ImageView)findViewById(R.id.imagenLogo);
        String cadena[];
        if (contador == 1) {
            cadena = cadena1;
            logo.setImageResource(R.drawable.lavabo);
        } else{
            if (contador == 2) {
                cadena = cadena2;
                logo.setImageResource(R.drawable.potro);
                correct=2;
            }else{
                cadena = cadena3;
                logo.setImageResource(R.drawable.comedor);
                correct=2;
            }
        }

        RadioGroup group = (RadioGroup) findViewById(R.id.test_choices);
        for (int i = 0; i < 3; i++) {
            RadioButton radio = new RadioButton(this);
            radio.setText(cadena[i]);
            group.addView(radio);
        }
        findViewById(R.id.button_send_test).setVisibility(View.VISIBLE);
    }

    public void modifPant(View v) {
        LinearLayout layout = (LinearLayout) findViewById(R.id.test_choices);
        findViewById(R.id.button_next).setVisibility(View.INVISIBLE);
        layout.removeAllViews();
        contador++;
        if(contador>3){
            Intent intent = new Intent(this, AutoebaluazioaActivity.class);
            startActivity(intent);
        }
        crearRadio();;

    }
}

