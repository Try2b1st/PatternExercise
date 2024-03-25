package org.example.visitor;

public interface Visitor {
    void visited(Circle circle);

    void visited(Rectangle rectangle);
}
