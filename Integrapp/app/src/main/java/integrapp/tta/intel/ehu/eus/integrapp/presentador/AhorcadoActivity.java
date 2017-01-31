package integrapp.tta.intel.ehu.eus.integrapp.presentador;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import integrapp.tta.intel.ehu.eus.integrapp.R;


public class AhorcadoActivity extends AppCompatActivity {

    final String arrayPalabras[]={"A G E N D A","B O R R A G O M A","I K A S L E A","K A R P E T A","K L A S E A","M A P A","A M A N T A L A",
            "O R D E N A G A I L U A","A U L K I A",
            "P A P E R O N T Z I A","A R T A Z I A K","L E I H O A"};

    String[]palabra;
    String cadena = "" ;
    int num;
    int numero;
    String arrayfinal[];
    int contbien=0;
    int contmal=0;
    String falladas = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahorcado);

        obtenerPalabra();
    }

    public void obtenerPalabra(){
        String dibujo[]=null;
        numero = (int) Math.round(Math.random() * 11);
        String pal = arrayPalabras[numero];
        palabra= pal.split(" ");
        arrayfinal=pal.split(" ");
        num=palabra.length;

        for (int i=0; i<num; i++){
            arrayfinal[i]="_ ";
            cadena+=arrayfinal[i];
        }

        TextView txt = (TextView)findViewById(R.id.palabra_ahorcado);
        txt.setText(cadena);

    }

    public void comprobarLetra(View view){
        boolean acierto=false;
        cadena="";
        final String letra = ((EditText)findViewById(R.id.letra)).getText().toString();


        for (int x = 0; x < num; x++) {
            if (palabra[x].matches(letra)) {
                arrayfinal[x]=letra;
                acierto=true;
                contbien++;
            }
        }
        if(acierto==false){
            falladas+=letra+"  ";
            TextView text = (TextView)findViewById(R.id.sobra);
            text.setText(falladas);
            contmal++;
            ImageView logo= (ImageView)findViewById(R.id.imageAhorcado);
            logo.setImageResource(R.drawable.ahorcado+(contmal+1));
        }
        for (int i=0; i<num; i++){
            cadena += arrayfinal[i]+ " ";
        }

        if(contbien==num) {
            String titulo = "ZORIONAK!! JOKUA IRABAZI DUZU";
            dialogo(titulo);
        }
        if(contmal==9){
            String titulo = "OHH, EZ DUZU HITZA ASMATU";
            ImageView logo = (ImageView) findViewById(R.id.imageAhorcado);
            logo.setImageResource(R.drawable.ahorcado);
            dialogo(titulo);
        }

        TextView text = (TextView)findViewById(R.id.palabra_ahorcado);
        text.setText("");
        text.setText(cadena);
        EditText t = (EditText)findViewById(R.id.letra);
        t.setText("");

    }
    public void dialogo(String titulo){
        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(this);
        dialogo1.setTitle(titulo);
        dialogo1.setMessage("Hitza "+arrayPalabras[numero]+" zen");
        dialogo1.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                cancelar();
            }
        });
        dialogo1.show();
    }
    public void cancelar(){
        Intent intent = new Intent(this, JolasakActivity.class);
        startActivity(intent);
    }
}
