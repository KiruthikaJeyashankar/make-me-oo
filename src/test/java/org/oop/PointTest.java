package org.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);

        assertEquals(0, origin.distance(origin));
        assertEquals(0 , origin.distance(new Point(0 , 0)));
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);

        assertEquals(1, origin.distance(point1));
        assertEquals(1, origin.distance(point2));
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        assertEquals(2, point1.distance(point2));
    }


    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {

        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        assertEquals(0, origin.direction(point1));
        assertEquals(0, origin.direction(point2));
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {

        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        assertEquals(Math.PI, origin.direction(point1));
        assertEquals(Math.PI, origin.direction(point2));

    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {

        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        assertEquals(Math.PI / 2, origin.direction(point1));
        assertEquals(Math.PI / 2, origin.direction(point2));
    }
}