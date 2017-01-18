package integrapp.tta.intel.ehu.eus.integrapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

public class AudioActivity extends AppCompatActivity {

    final int AUDIO_REQUEST_CODE=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
    }
    //PENSAR COMO PASAR LA URL

    public void grabarAudio (View v){
        if(!getPackageManager().hasSystemFeature(PackageManager.FEATURE_MICROPHONE))
            Toast.makeText(this,R.string.no_micro, Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MediaStore.Audio.Media.RECORD_SOUND_ACTION);
        if (intent.resolveActivity(getPackageManager()) != null) {
            /*File dir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC);
            try{
                File file = File.createTempFile("audio",".mp4",dir);
                //poner nombre al fichero de audio
            } catch (IOException e) {
                e.printStackTrace();
            }*/
            startActivityForResult(intent, AUDIO_REQUEST_CODE);
        } else
            Toast.makeText(this, R.string.no_app, Toast.LENGTH_SHORT).show();
    }

    public void reproducirAudio (View v){
        LinearLayout layout = (LinearLayout)findViewById(R.id.test_layout);

        String advise = "http://u017633.ehu.eus:28080/static/ServidorTta/AndroidManifest.mp4";
        AudioPlayer audio = new AudioPlayer(v);
        MediaPlayer mp = new MediaPlayer();
        //mp.setOnPreparedListener(audio);
        try {
            audio.setAudioUri(Uri.parse(advise));
        } catch (IOException e) {
            e.printStackTrace();
        }
        audio.onPrepared(mp);
        audio.start();

    }
}
