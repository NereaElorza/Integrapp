package integrapp.tta.intel.ehu.eus.integrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Aukerak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aukerak);
    }

    public void jolasak(View v){
        Intent intent = new Intent(this, Jolasak.class);
        startActivity(intent);
    }
    public void autoebaluazioa (View v){
        Intent intent = new Intent(this, Autoebaluazioa.class);
        startActivity(intent);
    }
}
