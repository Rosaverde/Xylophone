package com.gtr.xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    SoundPool mSoundpool;

    final int NR_OF_MAX_STREAMS = 7;

    int mCSoundID;
    int mDSoundID;
    int mESoundID;
    int mFSoundID;
    int mGSoundID;
    int mASoundID;
    int mBSoundID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundpool = new SoundPool(NR_OF_MAX_STREAMS, AudioManager.STREAM_MUSIC,0);

        mCSoundID = mSoundpool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundID = mSoundpool.load(getApplicationContext(),R.raw.note2_d,1);
        mESoundID = mSoundpool.load(getApplicationContext(),R.raw.note3_e,1);
        mFSoundID = mSoundpool.load(getApplicationContext(),R.raw.note4_f,1);
        mGSoundID = mSoundpool.load(getApplicationContext(),R.raw.note5_g,1);
        mASoundID = mSoundpool.load(getApplicationContext(),R.raw.note6_a,1);
        mBSoundID = mSoundpool.load(getApplicationContext(),R.raw.note7_b,1);
    }

    public void playC(View v)
    {
        mSoundpool.play(mCSoundID,1,1,0,0,0);
    }
    public void playD(View v)
    {
        mSoundpool.play(mDSoundID,1,1,0,0,0);
    }
    public void playE(View v)
    {
        mSoundpool.play(mESoundID,1,1,0,0,0);
    }
    public void playF(View v)
    {
        mSoundpool.play(mFSoundID,1,1,0,0,0);
    }
    public void playG(View v)
    {
        mSoundpool.play(mGSoundID,1,1,0,0,0);
    }
    public void playA(View v)
    {
        mSoundpool.play(mASoundID,1,1,0,0,0);
    }
    public void playB(View v)
    {
        mSoundpool.play(mBSoundID,1,1,0,0,0);
    }
}
