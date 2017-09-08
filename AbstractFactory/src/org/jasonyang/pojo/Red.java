package org.jasonyang.pojo;

import org.jasonyang.pojo.Color;

/**
 * Created by jason on 17/9/8.
 */
public class Red implements Color {
    @Override
    public void fill(){
        System.out.println("这是红色的填充方法");
    }
}
