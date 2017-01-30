package integrapp.tta.intel.ehu.eus.integrapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MailakActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mailak);

        findViewById(R.id.nivel1).setOnClickListener(this);
        findViewById(R.id.nivel2).setOnClickListener(this);
        findViewById(R.id.nivel3).setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, AukerakActivity.class);

        switch (v.getId()) {
            case R.id.nivel1:
                intent.putExtra("nivel","1");
                startActivity(intent);
                break;
            case R.id.nivel2:
                intent.putExtra("nivel","2");
                startActivity(intent);
                break;
            case R.id.nivel3:
                intent.putExtra("nivel","3");
                startActivity(intent);
                break;
        }

    }
}
