package hu.tokingame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.viewport.Viewport;

/**
 * Created by davim on 2016. 10. 07..
 */

public class MenuStage extends MyStage {
    private RectangleActor fupa;

    public MenuStage(Viewport viewport, Game game, RectangleActor fupa) {
        super(viewport, game);
        this.fupa = fupa;
    }

    public MenuStage(Viewport viewport, Batch batch, Game game, RectangleActor fupa) {

        super(viewport, batch, game);
        this.fupa = fupa;
    }

    public MenuStage(Game game, RectangleActor fupa) {

        super(game);
        this.fupa = fupa;
    }

    public void init(){
        fupa = new RectangleActor();
        addActor(fupa);
    }
}
