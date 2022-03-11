package com.example.test_java_fx.domain;

import java.util.Objects;

public abstract class ValueObject {
    @Override
    public boolean equals(Object o) {
        ValueObject valueObject = (ValueObject) o;
        if (this == o) return true;
        if (o == null || getClass() != valueObject.getClass()) return false;
        //Entity entity = (Entity) o;
        return this.equalsCore(valueObject);
    }

    public abstract boolean equalsCore(ValueObject o);

    @Override
    public int hashCode() {
        return this.hashCodeCore();
    }

    public abstract int hashCodeCore();

    public static Boolean operatorEquals(ValueObject a, ValueObject b){
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        return a.equals(b);
    }

    public static Boolean operatorInequal(ValueObject a, ValueObject b){
        return !(a==b);
    }
}
