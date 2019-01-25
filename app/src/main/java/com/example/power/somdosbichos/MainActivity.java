package com.example.power.somdosbichos;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageView cachorro;
    private ImageView gato;
    private ImageView leao;
    private ImageView macaco;
    private ImageView ovelha;
    private ImageView vaca;
    private MediaPlayer mediaPlayer;
    private Toast toast;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.cachorro=findViewById(R.id.imageCachorro);
        this.gato=findViewById(R.id.imageGato);
        this.leao=findViewById(R.id.ImageLeao);
        this.macaco=findViewById(R.id.imageMacaco);
        this.ovelha=findViewById(R.id.ImageOvelha);
        this.vaca=findViewById(R.id.imageVaca);

        cachorro.setOnClickListener(this);
        gato.setOnClickListener(this);
        leao.setOnClickListener(this);
        macaco.setOnClickListener(this);
        ovelha.setOnClickListener(this);
        vaca.setOnClickListener(this);





    }


        @Override
        public void onClick(View view) {

            switch(view.getId()){
                case  R.id.imageCachorro:

                    mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.cao);
                    tocarSom();


                    break;

                case R.id.imageGato:
                    mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.gato);
                    tocarSom();



                    break;

                case R.id.ImageLeao:
                    mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.leao);
                    tocarSom();

                    break;
                case R.id.imageMacaco:

                    mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.macaco);
                    tocarSom();

                    break;

                case R.id.imageVaca:
                    mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.vaca);
                    tocarSom();

                    break;

                case R.id.ImageOvelha:
                    mediaPlayer=MediaPlayer.create(getApplicationContext(),R.raw.ovelha);
                    tocarSom();

                    break;





        }


    }

    private void tocarSom() {
        if(mediaPlayer!=null){

            mediaPlayer.start();



        }


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayer!=null){
            mediaPlayer.release();
            mediaPlayer=null;


        }
    }
}
