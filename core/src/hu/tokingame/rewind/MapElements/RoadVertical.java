package hu.tokingame.rewind.MapElements;

import com.badlogic.gdx.physics.box2d.World;

import hu.tokingame.rewind.MyBaseClasses.OneSpriteStaticActor;
import hu.tokingame.rewind.MyBaseClasses.WorldBodyEditorLoader;

/**
 * Created by tuskeb on 2016. 11. 18..
 */

public class RoadVertical extends Road {
    public RoadVertical(World world, WorldBodyEditorLoader loader, float X, float Y) {
        super(world, loader, "vr.png", new OneSpriteStaticActor("Map/vr.png"), X, Y);
    }
}
