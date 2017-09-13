package com.example.chun.synth;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button aButton, aSharpButton, bButton, cButton, cSharpButton, dButton, dSharpButton, eButton, fButton, fSharpButton, gButton, gSharpButton;
    private Button ahButton, ahSharpButton, bhButton, chButton, chSharpButton, dhButton, dhSharpButton, ehButton, fhButton, fhSharpButton, ghButton, ghSharpButton;
    private Button scaleButton;
    private MediaPlayer aNote, aSharpNote, bNote, cNote, cSharpNote, dNote, dSharpNote, eNote, fNote, fSharpNote, gNote, gSharpNote;
    private MediaPlayer ahNote, ahSharpNote, bhNote, chNote, chSharpNote, dhNote, dhSharpNote, ehNote, fhNote, fhSharpNote, ghNote, ghSharpNote;
    private MediaPlayer[] scale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();
        setListeners();
        createMediaPlayers();
        generateSongs();
    }
//a comment
    private void generateSongs() {
        scale = new MediaPlayer[]{eNote, fSharpNote, gNote, ahNote, bhNote, chSharpNote, dhNote, ehNote};
    }


    private void delayPlaying(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void createMediaPlayers() {
        aNote = MediaPlayer.create(this, R.raw.scalea);
        aSharpNote = MediaPlayer.create(this, R.raw.scalebb);
        bNote = MediaPlayer.create(this, R.raw.scaleb);
        cNote = MediaPlayer.create(this, R.raw.scalec);
        cSharpNote = MediaPlayer.create(this, R.raw.scalecs);
        dNote = MediaPlayer.create(this, R.raw.scaled);
        dSharpNote = MediaPlayer.create(this, R.raw.scaleds);
        eNote = MediaPlayer.create(this, R.raw.scalee);
        fNote = MediaPlayer.create(this, R.raw.scalef);
        fSharpNote = MediaPlayer.create(this, R.raw.scalefs);
        gNote = MediaPlayer.create(this, R.raw.scaleg);
        gSharpNote = MediaPlayer.create(this, R.raw.scalegs);
        ahNote = MediaPlayer.create(this, R.raw.scalehigha);
        ahSharpNote = MediaPlayer.create(this, R.raw.scalehighbb);
        bhNote = MediaPlayer.create(this, R.raw.scalehighb);
        chNote = MediaPlayer.create(this, R.raw.scalehighc);
        chSharpNote = MediaPlayer.create(this, R.raw.scalehighcs);
        dhNote = MediaPlayer.create(this, R.raw.scalehighd);
        dhSharpNote = MediaPlayer.create(this, R.raw.scalehighds);
        ehNote = MediaPlayer.create(this, R.raw.scalehighe);
        fhNote = MediaPlayer.create(this, R.raw.scalehighf);
        fhSharpNote = MediaPlayer.create(this, R.raw.scalehighfs);
        ghNote = MediaPlayer.create(this, R.raw.scalehighg);
        ghSharpNote = MediaPlayer.create(this, R.raw.scalehighgs);
    }

    private void setListeners() {
        aButton.setOnClickListener(this);
        aSharpButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        cSharpButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dSharpButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fSharpButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gSharpButton.setOnClickListener(this);
        ahButton.setOnClickListener(this);
        ahSharpButton.setOnClickListener(this);
        bhButton.setOnClickListener(this);
        chButton.setOnClickListener(this);
        chSharpButton.setOnClickListener(this);
        dhButton.setOnClickListener(this);
        dhSharpButton.setOnClickListener(this);
        ehButton.setOnClickListener(this);
        fhButton.setOnClickListener(this);
        fhSharpButton.setOnClickListener(this);
        ghButton.setOnClickListener(this);
        ghSharpButton.setOnClickListener(this);
        scaleButton.setOnClickListener(this);
    }

    private void wireWidgets() {
        aButton = (Button) findViewById(R.id.button_a);
        aSharpButton = (Button) findViewById(R.id.button_a_sharp);
        bButton = (Button) findViewById(R.id.button_b);
        cButton = (Button) findViewById(R.id.button_c);
        cSharpButton = (Button) findViewById(R.id.button_c_sharp);
        dButton = (Button) findViewById(R.id.button_d);
        dSharpButton = (Button) findViewById(R.id.button_d_sharp);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fSharpButton = (Button) findViewById(R.id.button_f_sharp);
        gButton = (Button) findViewById(R.id.button_g);
        gSharpButton = (Button) findViewById(R.id.button_g_sharp);
        ahButton = (Button) findViewById(R.id.button_ah);
        ahSharpButton = (Button) findViewById(R.id.button_ah_sharp);
        bhButton = (Button) findViewById(R.id.button_bh);
        chButton = (Button) findViewById(R.id.button_ch);
        chSharpButton = (Button) findViewById(R.id.button_ch_sharp);
        dhButton = (Button) findViewById(R.id.button_dh);
        dhSharpButton = (Button) findViewById(R.id.button_dh_sharp);
        ehButton = (Button) findViewById(R.id.button_eh);
        fhButton = (Button) findViewById(R.id.button_fh);
        fhSharpButton = (Button) findViewById(R.id.button_fh_sharp);
        ghButton = (Button) findViewById(R.id.button_gh);
        ghSharpButton = (Button) findViewById(R.id.button_gh_sharp);
        scaleButton = (Button) findViewById(R.id.button_scale);
    }

    @Override
    public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button_a:
                    aNote.seekTo(0);
                    aNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_a_sharp:
                    aSharpNote.seekTo(0);
                    aSharpNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_b:
                    bNote.seekTo(0);
                    bNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_c:
                    cNote.seekTo(0);
                    cNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_c_sharp:
                    cSharpNote.seekTo(0);
                    cSharpNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_d:
                    dNote.seekTo(0);
                    dNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_d_sharp:
                    dSharpNote.seekTo(0);
                    dSharpNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_e:
                    eNote.seekTo(0);
                    eNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_f:
                    fNote.seekTo(0);
                    fNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_f_sharp:
                    fSharpNote.seekTo(0);
                    fSharpNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_g:
                    gNote.seekTo(0);
                    gNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_g_sharp:
                    gSharpNote.seekTo(0);
                    gSharpNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_ah:
                    ahNote.seekTo(0);
                    ahNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_ah_sharp:
                    ahSharpNote.seekTo(0);
                    ahSharpNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_bh:
                    bhNote.seekTo(0);
                    bhNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_ch:
                    chNote.seekTo(0);
                    chNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_ch_sharp:
                    chSharpNote.seekTo(0);
                    chSharpNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_dh:
                    dhNote.seekTo(0);
                    dhNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_dh_sharp:
                    dhSharpNote.seekTo(0);
                    dhSharpNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_eh:
                    ehNote.seekTo(0);
                    ehNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_fh:
                    fhNote.seekTo(0);
                    fhNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_fh_sharp:
                    fhSharpNote.seekTo(0);
                    fhSharpNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_gh:
                    ghNote.seekTo(0);
                    ghNote.start();
                    delayPlaying(500);
                    break;
                case R.id.button_gh_sharp:
                    ghSharpNote.seekTo(0);
                    ghSharpNote.start();
                    delayPlaying(500);
                    break;
                default:
//
            }

            switch (view.getId()) {
                case R.id.button_scale:
                    for (MediaPlayer note : scale) {
                        note.seekTo(0);
                        note.start();
                        delayPlaying(500);
                    }
                    break;
                default:
            }
        }
    }


