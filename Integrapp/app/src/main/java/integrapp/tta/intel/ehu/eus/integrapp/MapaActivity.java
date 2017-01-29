package integrapp.tta.intel.ehu.eus.integrapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Locale;

public class MapaActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
    }
    @Override
    public void onClick(View v) {

        Intent explicit_intent = new Intent(this,Mapa2Activity.class);

        switch (v.getId()) {
            case R.id.patio:

                explicit_intent.putExtra("patio","paio");
                break;
            case R.id.baño:

                explicit_intent.putExtra("baño","baño");

                break;
            case R.id.comedor:

                explicit_intent.putExtra("comedor","comedor");

                break;
            case R.id.aula:

                explicit_intent.putExtra("aula","aula");

                break;
            case R.id.gimnasio:

                explicit_intent.putExtra("gimnasio","gimnasio");

                break;

            default:
        }
        startActivity(explicit_intent);
    }

}
