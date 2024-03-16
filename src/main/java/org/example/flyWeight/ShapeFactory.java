package org.example.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private Map<ShapeType, Shape> map;

    public ShapeFactory() {
        map = new HashMap<>();
    }

    public Shape getShape(ShapeType shapeType) {
        if (!map.containsKey(shapeType)) {
            map.put(shapeType, new ConcreteShape(shapeType));
        }
        return map.get(shapeType);
    }
}
