package org.oop;

import static java.lang.Math.atan2;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private final double xPosition;
    private final double yPosition;


    public Point(double x, double y) {
        this.xPosition = x;
        this.yPosition = y;
    }

    public double distance(Point point) {
        if (this == point)
            return 0.0;

        Point differenceVector = getDifferenceVector(this , point);

        return sqrt(square(differenceVector.xPosition) + square(differenceVector.yPosition));
    }

    public double direction(Point point) {
        Point differenceVector = getDifferenceVector(this , point);

        return atan2(differenceVector.yPosition, differenceVector.xPosition);
    }

    private Point getDifferenceVector(Point from , Point to) {
        double xDistance = to.xPosition - from.xPosition;
        double yDistance = to.yPosition - from.yPosition;

        return new Point(xDistance, yDistance);
    }

    private double square(double value) {
        return pow(value, 2);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        return this.xPosition == ((Point) obj).xPosition && this.yPosition == ((Point) obj).yPosition;

    }
}
