import java.util.*;
import java.awt.*;
import java.applet.Applet;

public class TurtleApplet extends Applet {
  Turtle kamekichi; // 「亀吉」用インスタンス変数の宣言
  public void init() {
    setBackground(Color.white); // アプレットの背景色を白に設定
    kamekichi = new Turtle(200,100);  // 「亀吉」の生成
    // triangles(kamekichi, 40, 2, 10); // 三角形（その１）
    triangles(kamekichi, 40, 2, 20);  //三角形（その2）

    //square(kamekichi);	// 「亀吉」を正方形に動かす

  }

  void square(Turtle t) {
    for (int i = 0; i < 4; i++) {
      t.move(50);
      t.turn(90);
    }
  }
  // 三角形の回転を行うメソッド
  // triangles(kamekichi, 40, 2, 10); 三角形（その１）
  // triangles(kamekichi, 40, 2, 20); 三角形（その２）

  void triangles(Turtle t, int n, int c, int d) {
    for (int i = 0; i++ < n; ) {
      triangle(t, i * c);
      t.turn(d);
    }
  }

  void triangle(Turtle t, int size) {
    t.penColor(Color.RED);
    t.move(size);
    t.turn(120);
    t.penColor(Color.BLUE);
    t.move(size);
    t.turn(120);
    t.move(size);
    t.turn(120);
  }

  public void paint(Graphics g) {
    kamekichi.paint(g); // 「亀吉」に足跡を描かせる
  }

}

