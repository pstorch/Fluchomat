package de.storch.fluchomat;

import android.app.Activity;
import android.media.AudioManager;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class FluchomatActivity extends Activity {
	
	private SoundManager soundManager;
    private List<Sound> sounds = new ArrayList<Sound>();
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ListAdapter(this));

        sounds.add(new Sound(R.raw.scheisse, "Scheiße"));
        sounds.add(new Sound(R.raw.scheisse_hier_mit_der_scheisse_hier, "Scheiße mit der Scheiße"));
        sounds.add(new Sound(R.raw.ja_ich_werd_noch_mal_bloede, "Werd noch mal blöde"));
        sounds.add(new Sound(R.raw.ich_seh_aber_nuescht, "Ich seh aber nüscht"));
        sounds.add(new Sound(R.raw.wie_gehtn_das, "Wie geht'n das?"));
        sounds.add(new Sound(R.raw.das_man_ma_was_sieht, "Daß ma mal was sieht"));
        sounds.add(new Sound(R.raw.wo_ist_hier_vorne_und_hinten, "Vorne und Hinten"));
        sounds.add(new Sound(R.raw.zweihundert_puls_hab_ich_bald, "200 Puls"));
        sounds.add(new Sound(R.raw.ich_schmeiss_die_scheisse_aus_dem_fenster_raus, "Aus dem Fenster raus"));
        sounds.add(new Sound(R.raw.en_schwarzen_bildschirm_hab_ich, "Schwarzen Bildschirm"));
        sounds.add(new Sound(R.raw.ich_hau_ihn_weg, "Hau ihn weg"));
        sounds.add(new Sound(R.raw.hier_steht_on_off_soll_ich_da_druff_druecken, "On, Off"));
        sounds.add(new Sound(R.raw.ohhhh, "Ohhh"));
        sounds.add(new Sound(R.raw.gibts_doch_gar_net, "Gibts doch gar net"));
        sounds.add(new Sound(R.raw.jetzt_geht_er, "Jetzt geht er"));
        sounds.add(new Sound(R.raw.ich_hab_hier_aufn_knopf_gedrueckt_und_er_geht, "Knopf gedrückt"));

        soundManager = new SoundManager();
        soundManager.initSounds(getBaseContext());
        for (Sound sound : sounds) {
            soundManager.addSound(sounds.indexOf(sound), sound.getId());
        }

		setVolumeControlStream(AudioManager.STREAM_MUSIC);
    }
    
    public void playSound(int id) {
    	soundManager.playSound(id);
    }

    public String getSoundText(int soundId) {
        return sounds.get(soundId).getText();
    }
    
}