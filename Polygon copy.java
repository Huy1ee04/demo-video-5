package Bai6_3;

import java.util.List;
import java.awt.*;



public class Polygon {
    private List<Point> points;
    private GraphicsBundle bundle;

    public Polygon(List<Point> points, GraphicsBundle bundle) {
        if (points.size() < 3) {
            throw new IllegalArgumentException("A polygon must have at least 3 points.");
        }
        this.points = points;
        this.bundle = bundle;
    }

    public List<Point> getPoints() {
        return points;
    }

    public GraphicsBundle getBundle() {
        return bundle;
    }

}
