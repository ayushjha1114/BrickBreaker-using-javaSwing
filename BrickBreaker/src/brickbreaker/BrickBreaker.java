
package brickbreaker;

import javax.swing.JFrame;

/**
 *
 * @author Ayush jha
 */
public class BrickBreaker {

    
    public static void main(String[] args) {
       JFrame obj = new JFrame();
       Gameplay gamePlay= new Gameplay();
       obj.setBounds(10, 10, 700, 600);
       obj.setTitle("BrickBreaker");
       obj.setResizable(false);
       obj.setVisible(true);
       obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       obj.add(gamePlay);
    }
    
}
