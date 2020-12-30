package Simulation;

import Engine.items.Entity;
import Engine.graphics.GraphicsComponent;
import Engine.physics.PhysicsComponent;
import com.jme3.math.Vector3f;
import com.jme3.scene.Spatial;

class Wall implements Entity {
    Vector3f pos;
    GraphicsComponent gfx;
    PhysicsComponent phyc;

    public Wall(Vector3f pos) {
        this.pos = pos;
        phyc.move(pos);
    }
    
    public void update() {
        // no operations
    }

    public Spatial getSpatial() {
        return gfx.getSpatial();
    }

    public Identificator getIdentificator() {
        return Identificator.WALL;
    }
    
    // lol i dunno what to put here
    public void collision(Entity e, float distance) {
        switch (e.getIdentificator()) {
        case PERSON: break;
        case WALL: break;
        case UNKNOWN: break;
        default: break;
        }
    }
}