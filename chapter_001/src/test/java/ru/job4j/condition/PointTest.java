package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int inX1 = 4;
        int inY1 = 1;
        int inX2 = 7;
        int inY2 = 3;
        double expected = 3.6;
        double out = Point.distance(inX1,inY1,inX2,inY2);
        Assert.assertEquals(expected,out,0.01);
    }

    @Test
    public void distance2() {
        int inX1 = 12;
        int inY1 = 15;
        int inX2 = 15;
        int inY2 = 18;
        double expected = 4.24;
        double out = Point.distance(inX1,inY1,inX2,inY2);
        Assert.assertEquals(expected,out,0.01);
    }

}
