package org.bukkit.craftbukkit.entity;

import net.minecraft.entity.passive.TurtleEntity;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Turtle;

public class CraftTurtle extends CraftAnimals implements Turtle {

    public CraftTurtle(CraftServer server, TurtleEntity entity) {
        super(server, entity);
    }

    @Override
    public TurtleEntity getHandle() {
        return (TurtleEntity) super.getHandle();
    }

    @Override
    public String toString() {
        return "CraftTurtle";
    }

    @Override
    public EntityType getType() {
        return EntityType.TURTLE;
    }
}
