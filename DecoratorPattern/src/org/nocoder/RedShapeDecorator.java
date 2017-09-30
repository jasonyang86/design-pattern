package org.nocoder;

/**
 * Created by YANGJINLONG on 2017-9-29.
 */
public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
    }

    private void setRedBorder(Shape decoraedShape){
        System.out.println("Border color：red");
    }
}
