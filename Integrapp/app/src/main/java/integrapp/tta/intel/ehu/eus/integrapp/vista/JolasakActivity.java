package integrapp.tta.intel.ehu.eus.integrapp.vista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import integrapp.tta.intel.ehu.eus.integrapp.R;

public class JolasakActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jolasak);
    }

    public void ahorcado(View v){
        Intent intent = new Intent(this, AhorcadoActivity.class);
        startActivity(intent);
    }
    public void memory(View v){
        Intent intent = new Intent(this, MemoryActivity.class);
        startActivity(intent);
    }
}
