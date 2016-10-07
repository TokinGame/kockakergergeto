package hu.tokingame;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by M on 10/7/2016.
 */

public class Assets {

    public static AssetManager mgr;

    public static void prepare() {
        mgr = new AssetManager();
        Texture.setAssetManager(mgr);
    }

    public static void load(){

    }

    public static void afterLoaded(){

    }

    public static void unload(){
        mgr.dispose();
    }

}
