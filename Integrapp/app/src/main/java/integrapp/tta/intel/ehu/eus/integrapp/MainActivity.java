package integrapp.tta.intel.ehu.eus.integrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.castellano).setOnClickListener(this);
        findViewById(R.id.ingles).setOnClickListener(this);

    }
    public void menu(View v){
        Intent intent = new Intent(this, AukerakActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, AukerakActivity.class);

        switch (v.getId()) {
            case R.id.castellano:
                intent.putExtra("idioma","c");
                startActivity(intent);
                break;
            case R.id.ingles:
                intent.putExtra("idioma","e");
                startActivity(intent);
                break;
        }
    }
}
