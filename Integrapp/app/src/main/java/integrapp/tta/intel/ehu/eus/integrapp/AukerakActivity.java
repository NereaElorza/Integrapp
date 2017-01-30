package integrapp.tta.intel.ehu.eus.integrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AukerakActivity extends AppCompatActivity {

    String nivel = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aukerak);

        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        if (extras != null) {//ver si contiene datos
            nivel = (String) extras.get("nivel");//Obtengo el nombre de la pantalla
        }
    }

    public void jolasak(View v){
        Intent intent = new Intent(this, JolasakActivity.class);
        startActivity(intent);
    }
    public void autoebaluazioa (View v){
        Intent intent = new Intent(this, AutoebaluazioaActivity.class);
        startActivity(intent);
    }

    public void mapa (View view){
        Intent intent = new Intent(this, MapaActivity.class);
        intent.putExtra("nivel",nivel);
        startActivity(intent);
    }
}
