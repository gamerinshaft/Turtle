import java.util.*;
import java.awt.*;
import java.applet.Applet;


public class PointTest extends Applet {
  ArrayList<Point> points = new ArrayList<Point>();

  public void init() {
    points.add(new Point(50,50));
    points.add(new Point(100,100));
  }

  public void paint(Graphics g){
    Point pt1, pt2;
    pt1 = points.get(0);
    pt2 = points.get(1);
    g.drawLine(pt1.x, pt1.y, pt2.x, pt2.y);
  }
}