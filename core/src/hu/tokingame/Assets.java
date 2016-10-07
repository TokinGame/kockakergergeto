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

    public static AssetManager manager;
    public static final AssetDescriptor<Texture> TOKIN_TEXTURE =new AssetDescriptor<Texture>("tokin.png", Texture.class);



    public static void prepare() {
        manager = new AssetManager();
        Texture.setAssetManager(manager);
    }

    public static void load(){
        manager.load(TOKIN_TEXTURE);
    }

    public static void afterLoaded(){

    }

    public static void unload(){
        manager.dispose();
    }

}
