package com.knowledge.jni.designpattern.bridgepattern;

/**
 * Created by universe on 2017/6/6.
 */

public class CircleDraw extends Shape {

    public int x;
    public int y;

    public CircleDraw(DrawApi drawApi,int x,int y) {
        super(drawApi);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawApi.draw(x,y);
    }

    public static void test(){
        CircleDraw draw = new CircleDraw(new GreenDraw(),1,2);
        draw.draw();
        CircleDraw drawTwo = new CircleDraw(new RedDraw(),1,2);
        drawTwo.draw();
    }
}
