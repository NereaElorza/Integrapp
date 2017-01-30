package integrapp.tta.intel.ehu.eus.integrapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Locale;

public class MapaActivity extends AppCompatActivity {

    String idioma ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);

        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        if (extras != null) {//ver si contiene datos
            idioma = (String) extras.get("idioma");//Obtengo el nombre de la pantalla
        }

        TextView p = (TextView) findViewById(R.id.id1);
        TextView b = (TextView) findViewById(R.id.id2);
        TextView c = (TextView) findViewById(R.id.id3);
        TextView g = (TextView) findViewById(R.id.id5);
        TextView a = (TextView) findViewById(R.id.id4);

        if(idioma.matches("c")){
            p.setText(R.string.patioc);
            b.setText(R.string.baño1c);
            c.setText(R.string.comedorc);
            a.setText(R.string.aulac);
            g.setText(R.string.gimnasioc);
        }else{
            p.setText(R.string.patioe);
            b.setText(R.string.baño1e);
            c.setText(R.string.comedore);
            a.setText(R.string.aulae);
            g.setText(R.string.gimnasioe);
        }


    }
    public void mapa(View v){

        Intent explicit_intent = new Intent(this,Mapa2Activity.class);
        explicit_intent.putExtra("idioma",idioma);

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
