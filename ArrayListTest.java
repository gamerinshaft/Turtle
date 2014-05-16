import java.util.*;
import java.awt.*;
import java.applet.Applet;


public class ArrayListTest extends Applet {
  ArrayList<String> strings = new ArrayList<String>();

  public void init() {
    strings.add("item1");
    strings.add("item2");
    strings.add("item3");
  }

  public void paint(Graphics g){
    for (int i = 0; i < strings.size(); i++) {
      g.drawString(strings.get(i), 10, (i+1)*20);
    }
  }
}