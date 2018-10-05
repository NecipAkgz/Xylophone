package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(7, AudioManager.STREAM_MUSIC, 0);

        // TODO: Load and get the IDs to identify the sounds
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        mDSoundId = mSoundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        mESoundId = mSoundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        mFSoundId = mSoundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        mGSoundId = mSoundPool.load(getApplicationContext(), R.raw.note5_g, 1);
        mASoundId = mSoundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        mBSoundId = mSoundPool.load(getApplicationContext(), R.raw.note7_b, 1);

    }

    public void playC(View view) {
        mSoundPool.play(mCSoundId, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playD(View view) {
        mSoundPool.play(mDSoundId, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playE(View view) {
        mSoundPool.play(mESoundId, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playF(View view) {
        mSoundPool.play(mFSoundId, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playG(View view) {
        mSoundPool.play(mGSoundId, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playA(View view) {
        mSoundPool.play(mBSoundId, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void playB(View view) {
        mSoundPool.play(mASoundId, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    // TODO: Add the play methods triggered by the buttons


}
