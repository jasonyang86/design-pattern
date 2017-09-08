package org.jasonyang.pojo;

import org.jasonyang.pojo.Shape;

/**
 * 正方形
 * Created by jason on 17/9/8.
 */
public class Square implements Shape {
    @Override
    public void draw(){
        System.out.println("假装这是正方形");
    }
}
