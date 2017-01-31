package integrapp.tta.intel.ehu.eus.integrapp.vista;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.net.rtp.AudioGroup;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

import integrapp.tta.intel.ehu.eus.integrapp.AudioPlayer;
import integrapp.tta.intel.ehu.eus.integrapp.R;

public class AudioActivity extends AppCompatActivity implements View.OnClickListener {

    final int AUDIO_REQUEST_CODE=3;
    String grabado="";
    String a ="https://dl.dropboxusercontent.com/s/m2al1lviy7l4j1i/afaria.mp3?dl=0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);

        findViewById(R.id.button_reproducir).setOnClickListener(this);
        findViewById(R.id.button_reproducirgrabado).setOnClickListener(this);
    }

    public void grabarAudio (View v){
        if(!getPackageManager().hasSystemFeature(PackageManager.FEATURE_MICROPHONE))
            Toast.makeText(this,R.string.no_micro, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MediaStore.Audio.Media.RECORD_SOUND_ACTION);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, AUDIO_REQUEST_CODE);
        } else
            Toast.makeText(this, R.string.no_app, Toast.LENGTH_SHORT).show();
    }

    public void reproducirAudio (View v,String aud){
        LinearLayout layout = (LinearLayout)findViewById(R.id.test_layout);

        AudioPlayer audio = new AudioPlayer(v);

        try {
            audio.setAudioUri(Uri.parse(aud));
        } catch (IOException e) {
            e.printStackTrace();
        }

        audio.start();



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(resultCode != Activity.RESULT_OK)
            return;
        switch (requestCode){
            case AUDIO_REQUEST_CODE:
                Uri grabacion=data.getData();
                grabado=grabacion.toString();
                break;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_reproducir:

                reproducirAudio(v,a);
                break;
            case R.id.button_reproducirgrabado:
                reproducirAudio(v,grabado);
                break;
        }
    }
}
