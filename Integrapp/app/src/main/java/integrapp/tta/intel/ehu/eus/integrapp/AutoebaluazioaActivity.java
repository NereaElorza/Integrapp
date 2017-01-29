package integrapp.tta.intel.ehu.eus.integrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AutoebaluazioaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autoebaluazioa);
    }
    public void test(View v){
        Intent intent = new Intent(this, TestActivity.class);
        startActivity(intent);
    }
    public void ahotsa(View v){
        Intent intent = new Intent(this, AudioActivity.class);
        startActivity(intent);
    }

    public void dibpal(View v){
        Intent intent = new Intent(this, UnirActivity.class);
        startActivity(intent);
    }
}
