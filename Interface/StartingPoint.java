import javax.swing.*;
import java.awt.*;
public class StageOne extends JFrame
{
 private JLabel jLNumber;
 private JLabel jLSumToNumber;
 private JTextField jTFNumber;
 private JTextField jTFSumToNumber;
 private JButton jBCompute;
 private JButton jBExit;
 private static final int WIDTH = 300;
 private static final int HEIGHT = 120;
 /**
 Constructor with no arguments
 */
 public StageOne()
 {
 //Invoke JFrame constructor and set the size
 super("Simple Arithmetic Progression");
 super.setSize(WIDTH,HEIGHT);
 // Create two labels
 jLNumber = new JLabel("Enter an integer (N) : ",
 SwingConstants.RIGHT);
 jLSumToNumber = new JLabel("Sum of first N integers : ",
 SwingConstants.RIGHT);
 //Create two JTextfields
 jTFNumber = new JTextField(10);
 jTFSumToNumber = new JTextField(10);
 jTFSumToNumber.setEditable(false);
 //Create compute JButton
 jBCompute = new JButton("Calculate");
 //Create Exit JButton
 jBExit = new JButton("Exit");
CRC_C6547_CH008.indd 449 10/16/2008 5:02:39 PM
Apago PDF Enhancer
450 ¦ Java Programming Fundamentals
 Container conInterior = super.getContentPane();
 //Set the layout
 conInterior.setLayout(new GridLayout(3,2));
 //Place components in the container
 //left to right; top to bottom order
 conInterior.add(jLNumber);
 conInterior.add(jTFNumber);
 conInterior.add(jLSumToNumber);
 conInterior.add(jTFSumToNumber);
 conInterior.add(jBCompute);
 conInterior.add(jBExit);
 //Make the frame visible and allow graceful exit
 super.setVisible(true);
 super.setDefaultCloseOperation(EXIT_ON_CLOSE);
 }
 public static void main( String args[] )
 {
 StageOne stageOne = new StageOne();
 }
}