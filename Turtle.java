import java.awt.*;
import java.util.*;
public class Turtle {
  //　インスタンス変数の宣言
  double x, y;
  double angle;
  Color color = Color.BLACK;
  ArrayList<Point> points = new ArrayList<Point>();
  ArrayList<Color> colors = new ArrayList<Color>();
  //この他にも必要な変数を宣言する。ArrayList用の変数など
  Turtle(int i, int j) {
    x = i; y = j; angle =0;
    points.add(new Point(i,j));
  }

  //各種メソッドの定義
  public void move(double length) {
    double length_x = Math.cos(angle*Math.PI/180)*length;
    double length_y = Math.sin(angle*Math.PI/180)*length;
    x = x + length_x;
    y = y - length_y;
    points.add(new Point( (int)Math.round(x),(int)Math.round(y)));
    colors.add(color);
  }

  public void turn(double deg) {
    angle = angle + deg;
    //向きを変える処理
  }
  public void penSize(int size){
  }
  public void penColor(Color c){
    color = c;
  }

  public void paint(Graphics g) {
    int i;
    Point pt1,pt2;
    Color draw_color;
    for(i=0;i<points.size()-1;i++){
      pt1 = points.get(i);
      pt2 = points.get(i+1);
      draw_color = colors.get(i);

      g.setColor(draw_color);

      g.drawLine(pt1.x, pt1.y, pt2.x, pt2.y);
    }
  }
}