package integrapp.tta.intel.ehu.eus.integrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Mapa2Activity extends AppCompatActivity {

    String habitacion = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa2);

        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        if (extras != null) {//ver si contiene datos
            habitacion = (String) extras.get("nombre");//Obtengo el nombre de la pantalla
        }

        ImageButton boton1 = (ImageButton) findViewById(R.id.im1);
        TextView boton1a = (Button) findViewById(R.id.tx1);
       // TextView boton1a = (Button) findViewById(R.id.tx1);
        ImageButton boton2 = (ImageButton) findViewById(R.id.im2);
        Button boton2a = (Button) findViewById(R.id.tx2);
        ImageButton boton3 = (ImageButton) findViewById(R.id.im3);
        Button boton3a = (Button) findViewById(R.id.tx3);




        if(habitacion=="patio"){

        }
        if(habitacion=="aula"){

        }
        if(habitacion=="gimnasio"){

        }
        if(habitacion=="comedor"){

        }
        if(habitacion=="baño"){

        }

    }
}
