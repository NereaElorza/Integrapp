package integrapp.tta.intel.ehu.eus.integrapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Locale;

public class MapaActivity extends AppCompatActivity {

    String nivel ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        if (extras != null) {//ver si contiene datos
            nivel = (String) extras.get("nivel");//Obtengo el nombre de la pantalla
        }


    }
    public void mapa(View v){

        Intent explicit_intent = new Intent(this,Mapa2Activity.class);
        explicit_intent.putExtra("nivel",nivel);

        switch (v.getId()) {
            case R.id.patio:

                explicit_intent.putExtra("p","patio");
                startActivity(explicit_intent);
                break;
            case R.id.baño:

                explicit_intent.putExtra("b","baño");
                startActivity(explicit_intent);

                break;
            case R.id.comedor:

                explicit_intent.putExtra("c","comedor");
                startActivity(explicit_intent);

                break;
            case R.id.aula:

                explicit_intent.putExtra("a","aula");
                startActivity(explicit_intent);

                break;
            case R.id.gimnasio:

                explicit_intent.putExtra("g","gimnasio");
                startActivity(explicit_intent);

                break;

            default:
        }

    }

}
