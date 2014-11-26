package de.storch.fluchomat;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.widget.GridView;

public class FluchomatActivity extends Activity {
	
	private SoundManager mSoundManager;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        mSoundManager = new SoundManager();
        mSoundManager.initSounds(getBaseContext());
        mSoundManager.addSound(1, R.raw.scheisse);
        mSoundManager.addSound(2, R.raw.scheisse_hier_mit_der_scheisse_hier);
        mSoundManager.addSound(3, R.raw.ja_ich_werd_noch_mal_bloede);
        mSoundManager.addSound(4, R.raw.ich_seh_aber_nuescht);
        mSoundManager.addSound(5, R.raw.wie_gehtn_das);
        mSoundManager.addSound(6, R.raw.das_man_ma_was_sieht);
        mSoundManager.addSound(7, R.raw.wo_ist_hier_vorne_und_hinten);
        mSoundManager.addSound(8, R.raw.zweihundert_puls_hab_ich_bald);
        mSoundManager.addSound(9, R.raw.ich_schmeiss_die_scheisse_aus_dem_fenster_raus);
        mSoundManager.addSound(10, R.raw.en_schwarzen_bildschirm_hab_ich);
        mSoundManager.addSound(11, R.raw.ich_hau_ihn_weg);
        mSoundManager.addSound(12, R.raw.hier_steht_on_off_soll_ich_da_druff_druecken);
        mSoundManager.addSound(13, R.raw.ohhhh);
        mSoundManager.addSound(14, R.raw.gibts_doch_gar_net);
        mSoundManager.addSound(15, R.raw.jetzt_geht_er);
        mSoundManager.addSound(16, R.raw.ich_hab_hier_aufn_knopf_gedrueckt_und_er_geht);
        
		setVolumeControlStream(AudioManager.STREAM_MUSIC);
    }
    
    public void playSound(int soundId) {
    	mSoundManager.playSound(soundId);
    }
    
}