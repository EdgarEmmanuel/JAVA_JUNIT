package com.example.test_java_fx.domain;

import java.util.Objects;

public class Entity {
    public long id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return id == entity.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public long getId() {
        return id;
    }

    protected void setId(long id) {
        this.id = id;
    }

    public static Boolean operatorEquals(Entity a, Entity b){
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        return a.equals(b);
    }

    public static Boolean operatorInequal(Entity a, Entity b){
        return !(a==b);
    }
}
