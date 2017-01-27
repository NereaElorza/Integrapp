package integrapp.tta.intel.ehu.eus.integrapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.StringTokenizer;


public class AhorcadoActivity extends AppCompatActivity {

    final String cadena[]={"A G E N D A","B O R R A G O M A","I K A S L E A","K A R P E T A","K L A S E A","M A P A","A M A N T A L A",
            "O R D E N A G A I L U A","A U L K I A",
            "P A P E R O N T Z I A","A R T A Z I A K","L E I H O A"};

    String[]palabra = null;
    int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahorcado);

        obtenerPalabra();
    }

    public void obtenerPalabra(){
        String dibujo[]=null;
        int numero = (int) Math.round(Math.random() * 11);
        String pal = cadena[numero];
        palabra= pal.split(" ");
        num=palabra.length;
        setContentView(R.layout.activity_ahorcado);
        TextView text = (TextView)findViewById(R.id.pal);
        text.setText(pal);



    }

    public void comprobarLetra(View view){
        setContentView(R.layout.activity_ahorcado);
        TextView text = (TextView)findViewById(R.id.palabra_ahorcado);
        String letra= String.valueOf(text.getText());

        text.setText(letra);


        String cadena = "" ;
        for (int x = 0; x < num; x++) {
            if (palabra[x].matches(letra)) {
                cadena += letra + " ";
            }else{
                cadena+="_ ";
            }
        }
        text.setText(cadena);
    }
}
