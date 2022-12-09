import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;

public class Face extends JPanel implements MouseListener{
  String base = System.getProperty("user.dir") + "/faces/Alea_";
  int side = -1;
  boolean keep = false;
  
private Image constructImage(String fileName) {
  //get image
  File imageFile = new File(fileName);
  return new ImageIcon(imageFile.toString()).getImage();
}
  public void switchSide(int num) {
      side = num;
  }

  public void update(Graphics g, int x) {
    //System.out.println(base + side);
      g.drawImage(constructImage(base + side + ".png"), x, 0, 112, 112, null);
  }
  // flips keep
  public void switchKeep(){
    keep = !keep;
  }
  // sets keep to input
  public void switchKeep(boolean in){
    keep = in;
  }

  public int getSide(){
    return side;
  }


    public void mouseDragged (MouseEvent event) {
    }
    public void mouseReleased (MouseEvent event) {
    }
    public void mousePressed (MouseEvent event) {
      this.switchKeep();
    }
    public void mouseEntered (MouseEvent event) {
    }
    public void mouseExited (MouseEvent event) {
    }
    public void mouseClicked (MouseEvent event) {
    }
}
  

