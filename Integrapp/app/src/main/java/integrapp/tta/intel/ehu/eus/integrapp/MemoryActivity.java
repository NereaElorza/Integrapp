package integrapp.tta.intel.ehu.eus.integrapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MemoryActivity extends AppCompatActivity {

   int parejaId1=0;
   int parejaId2=0;
   int parejas = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memory);
    }

    public void parejas(View view){
        boolean igualdad;

        //pareja1
        Button p1 = (Button) findViewById(R.id.pareja1);
        p1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(parejas<1){
                    parejaId1=1;
                    parejas++;
                }else{
                    parejaId2=1;
                    parejas++;
                }
            }
        });
        //pareja2
        Button p2 = (Button) findViewById(R.id.pareja2);
        p2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(parejas<1){
                    parejaId1=2;
                    parejas++;
                }else{
                    parejaId2=2;
                    parejas++;
                }
            }
        });
        //pareja3
        Button p3 = (Button) findViewById(R.id.pareja3);
        p3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(parejas<1){
                    parejaId1=3;
                    parejas++;
                }else{
                    parejaId2=3;
                    parejas++;
                }
            }
        });
        //pareja1a
        Button p1a = (Button) findViewById(R.id.pareja1a);
        p1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(parejas<1){
                    parejaId1=1;
                    parejas++;
                }else{
                    parejaId2=1;
                    parejas++;
                }
            }
        });
        //pareja2a
        Button p2a = (Button) findViewById(R.id.pareja2a);
        p2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(parejas<1){
                    parejaId1=2;
                    parejas++;
                }else{
                    parejaId2=2;
                    parejas++;
                }
            }
        });
        //pareja3a
        Button p3a = (Button) findViewById(R.id.pareja3a);
        p3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(parejas<1){
                    parejaId1=3;
                    parejas++;
                }else{
                    parejaId2=3;
                    parejas++;
                }
            }
        });

        if(parejas==2){
            if(parejaId1==parejaId2){
                igualdad=true;
                Toast.makeText(this, "Acertaste", Toast.LENGTH_LONG).show();
            }else{
                igualdad=false;
                Toast.makeText(this, "Fallaste", Toast.LENGTH_LONG).show();
            }
            parejas = 0;
            parejaId1=0;
            parejaId2=0;
        }else{
            Toast.makeText(this, "Te falta una pareja", Toast.LENGTH_LONG).show();
        }


    }

}
