package com.example.jymapplication.storage;

import com.example.jymapplication.model.Entity;
import com.example.jymapplication.model.Trainee;
import com.example.jymapplication.model.Trainer;
import com.example.jymapplication.model.Training;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component

public class Storage {


    private final Map<String, Entity> data = new HashMap<>();


    public void addEntity(Entity entity) {

        if (entity instanceof Trainer) {
            ((Trainer) entity).setNamespace("trainer:" + entity.getNamespace());

        }
        if (entity instanceof Trainee) {
            ((Trainee) entity).setNamespace("trainee:" + entity.getNamespace());
        }
        if (entity instanceof Training) {
            ((Training) entity).setNamespace("training:" + entity.getNamespace());
        }
        data.put(entity.getNamespace(), entity);

    }

    public void removeEntity(String entityId) {
        data.remove(entityId);
    }

    public Map<String, Entity> getData() {
        return data;
    }

    public void updateEntity(Entity entity) {
        data.remove(entity.getNamespace());
        data.put(entity.getNamespace(), entity);
    }

    public Entity getEntity(int id) {
        return data.get(String.valueOf(id));
    }


}
