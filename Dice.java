import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
public class Dice extends JPanel implements MouseListener{
  Random r = new Random();
  private JFrame myFrame;
  ArrayList<Face> diceList = new ArrayList<Face>();
//  ArrayList<Face> diceToRoll = new ArrayList<Face>();
//  ArrayList<Face> diceToKeep = new ArrayList<Face>();
// rather than seperate lists make "keep" a property of a Face
  Scanner in = new Scanner(System.in);
  
  public Dice(){
    int index = 0;
    myFrame = new JFrame("Dice");
    myFrame.add(this);
    myFrame.setVisible(true);
    myFrame.setSize(650,300);
    //creates list of faces
    while(index<5){
      diceList.add(new Face());
      index++;
    }  
  }
//list of each side from 1-6
  public ArrayList<Face> getFaces(){
    return diceList;
  }
//rolls between 1/6 for all dice that are not kept
  public void roll(){
    for(Face f: diceList){
      if(!f.keep)f.switchSide(r.nextInt(5) + 1);
    }
  }
//graphics stuff
  public void paintComponent(Graphics g) {
   // System.out.println(diceList.size());
    int ofset = 0;
    for(Face f: diceList){
      f.update(g, ofset);
      ofset += 130;
    }
  }

  //we should write notes for what our stuff does because we arent in same class, also maybe say what we havent done or stuff the other class' ppl(s) could do for the period.
   // public int askForNum(){
   //      //asks player for an integer and returns that integer.
   //      System.out.print("Enter an integer between 1 and 5:  ");
   //      int ans = in.nextInt(); 
   //      return ans;
   //  }
  
  // public int play(){
            // int a = in.nextInt(); 
            // int b = in.nextInt(); 
            // int c = in.nextInt();
            // int d = in.nextInt(); 
            // int e = in.nextInt(); 
    // roll(diceToRoll);
    // for(int index = 0; index<3;index++;){
    //   for(int i = 0; i <5; i++){
    //     System.out.print("Enter a dice you want to keep 0 and 4:  ");
    //     diceToKeep.add(a);
    //     diceToRoll.remove(askForNum);
    //   }
    //   roll(diceToRoll);
    // }
    // System.out.print("Its Yhahtzee! youve got 3 rolls, lets use em!");
    // System.out.print("Roll(3)");
//write code for first roll
    
    // System.out.print("Nice Keeps! you have 2 rolls left");
    // System.out.print("Roll(2)");
//write code for second roll
    
    // System.out.print("Nice Keeps! You have 1 roll left");
    // System.out.print("Roll(1)");
//write code for third roll
    // System.out.print("No Dice?");
  // }


    public void mouseDragged (MouseEvent event) {
    }
    public void mouseReleased (MouseEvent event) {
    }
    
    public void mousePressed (MouseEvent event) {
    }
    
    public void mouseEntered (MouseEvent event) {
    }
    
    public void mouseExited (MouseEvent event) {
    }

    public void mouseClicked (MouseEvent event) {
    }
}


//differernt skeletons for each roll
//Yahtzee
 // if (diceToKeep.get(0).equals(diceToKeep.get(1) && diceToKeep.get(0).equals(diceToKeep.get(2 && diceToKeep.get(0).equals(diceToKeep.get(3 && diceToKeep.get(0).equals(diceToKeep.get(4) && diceToKeep.get(0).equals(diceToKeep.get(5)){
// System.out.print("Yhatzee!");
  //Score += Score+50;
//diceToKeep.get(0)

//Full Streak
//for(diceList: Dice){
//if (Dice.contains(1) && Dice.contains(2) && Dice.contains(3) && Dice.contains(4) && Dice.contains(5) && Dice.contains(6)){
//Score += Score+40;
//}
//}


//Small Streak
//for(diceList: Dice){
//if (Dice.contains(1) && Dice.contains(2) && Dice.contains(3) && Dice.contains(4) && Dice.contains(5)){
//Score += Score+30;
//}
//}

//Chance
//  int sum = 0;
//        for (int i = 0; i < 5; i++)
//            sum += diceList.get(i);
// d1n=0;d2n=0;d3n=0;d4n=0;d5n=0;d6n=0;
//y=0;
//while(y<6){
// if(diceToKeep.get(y)=6){
// d6n++;
// y++;
//if(diceToKeep.get(y)=1){
// d1n++;
// y++;
// }
//if(diceToKeep.get(y)=2){
// d2n++;
// y++;
// }
//if(diceToKeep.get(y)=3){
// d3n++;
// y++;
// }
//if(diceToKeep.get(y)=4){
// d4n++;
// y++;
// }
//if(diceToKeep.get(y)=5){
// d5n++;
// y++;
// }}}
//if(d1n>=3 || d2n>=3 || d3n>=3 || d4n>=3 || d5n>=3 || d6n>=3)
//Score += Score+sum;
//}