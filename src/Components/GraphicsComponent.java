package Components;

import Simulation.Entity;
import com.jme3.math.Vector3f;
import com.jme3.scene.Spatial;
import com.jme3.scene.Geometry;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.shape.Box;
import com.jme3.material.Material;
import com.jme3.renderer.queue.RenderQueue.ShadowMode;

import Environment.Graphics;
import Environment.Locator;

public class GraphicsComponent {
    private Entity entity;
    protected Spatial sp;
    private Material mat;
    private ColorRGBA color = ColorRGBA.Green;
    private Graphics graphics;

    public GraphicsComponent(final Graphics graphics, final Entity entity) {
        this.graphics = graphics;
        this.entity = entity;
        
        Spatial cube = new Geometry("PersonCube", new Box(40, 40, 40));
        mat = graphics.createShadedMaterial(ColorRGBA.Red, ColorRGBA.Blue);
        
        cube.setMaterial(mat);
        cube.scale(0.03f);
        cube.setShadowMode(ShadowMode.CastAndReceive);
        
        this.sp = cube;
        this.show();

        //sp.setUserData("entity", entity);
    }

    public void moveTo(final Vector3f pos) {
        sp.setLocalTranslation(pos);
    }

    public void rotate(final float x, final float y, final float z) {
        sp.rotate(x, y, z);
    }

    public void scale(final float x, final float y, final float z) {
        sp.scale(x, y, z);
    }

    public void show() {
        graphics.addToScene(sp);
    }

    public void hide() {
        graphics.removeFromScene(sp);
    }

    public void changeColor(final ColorRGBA color) {
        graphics.changeMaterialColor(sp, color);
    }

    public Spatial getSpatial() {
        return sp;
    }

}