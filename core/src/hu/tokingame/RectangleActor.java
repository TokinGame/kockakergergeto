package hu.tokingame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import static hu.tokingame.Assets.TOKIN_TEXTURE;

public class RectangleActor extends MyActor {
    Sprite tokin = new Sprite (Assets.manager.get(TOKIN_TEXTURE));

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        tokin.draw(batch);
    }
}
