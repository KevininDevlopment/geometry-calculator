
/**
 * A Java program to caluclate area.
 *
 * @author Kevin Amaya
 * @version (04/10/2018
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Color;


public class CalculateTheArea extends JFrame  
{
    
    
    // Labels
    JLabel details = new JLabel("Please enter the base and height of the triangle," +" " + 
    "then press the"+ " " + "Triangle Area" + " " + "button", JLabel.CENTER);
    JLabel sqrdetails = new JLabel("Please enter the length and width of the square or rectangle, then press the" + " " +
    "Square / Rectangle Area button", JLabel.CENTER);
    JLabel cirdetails = new JLabel("Please enther the radius of the circle," + " "
    + " " + "then press the Circle Circumference button", JLabel.CENTER);
    JLabel addDetails = new JLabel("Please enter the two numbers you would like to add" + " " +
     " together", JLabel.CENTER);
   
    // Buttons
    JButton Button1 = new JButton ("Triangle Area");
    JButton Button2 = new JButton("Square / Rectangle Area");
    JButton Button3 = new JButton("Circle Circumference");
    JButton Button4 = new JButton("Do Another Calculation");
    
    
    // Panels
    private JPanel panel1 = new JPanel();
    private JPanel panel2 = new JPanel();
    private JPanel panel3 = new JPanel();
    private JPanel panel4 = new JPanel();
    
    
    // JTextField components
    private JTextField trianglebase;
    private JTextField triangleheight;
    private JTextField trianglearea;
    private JTextField squareLen;
    private JTextField squareWid;
    private JTextField squareAr;
    private JTextField circleRadius;
    private JTextField circleCircumference;
    private JTextField number1;
    private JTextField number2;
    private JTextField sum;
    
    // Triangle
    String triangleBaseText;
    double triangBase;
    String triangleHeightText;
    double triangHeight;
    double triangArea;
    
    // Square / Rectangle
    String sqaureLengthText;
    double squareLength;
    String squareWidthText;
    double squareWidth;
    double squareArea; 
    
    // Circle
    String circleRadiusText;
    int radius;
    String circleAreaText;
    double circumference;
    
    // Addittion
    String number1Text;
    double num1;
    String number2Text;
    double num2;
    double numSum;
      

public CalculateTheArea(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    createMenu();
    
    // Panel componenets
    panel1.setBackground(Color.BLUE);
    panel2.setBackground(Color.RED);
    panel3.setBackground(Color.GREEN);
    panel4.setBackground(Color.YELLOW);
    setLayout(new BorderLayout());
    
    // Triangle components
    add(panel1, BorderLayout.CENTER);
    trianglebase = new JTextField(5);
    triangleheight = new JTextField(5);
    trianglearea = new JTextField(5);
    panel1.add(details, JLabel.CENTER);
    details.setForeground(Color.white);
    panel1.add(trianglebase);
    panel1.add(triangleheight);
    panel1.add(trianglearea);
    panel1.add(Button1);
    
    
    
    // Square componenets
    add(panel2, BorderLayout.CENTER);
    squareLen = new JTextField(5);
    squareWid = new JTextField(5);
    squareAr = new JTextField(5);
    panel2.add(sqrdetails);
    sqrdetails.setForeground(Color.white);
    panel2.add(squareLen);
    panel2.add(squareWid);
    panel2.add(squareAr);
    panel2.add(Button2);
    
    
    // Circle componenets
    add(panel3, BorderLayout.CENTER);
    circleRadius = new JTextField(5);
    circleCircumference = new JTextField(5);
    panel3.add(cirdetails);
    cirdetails.setForeground(Color.white);
    panel3.add(circleRadius);
    panel3.add(circleCircumference);
    panel3.add(Button3);
    
    // Do another calculation
    add(panel4, BorderLayout.CENTER);
    number1 = new JTextField(5);
    number2 = new JTextField(5);
    sum = new JTextField(5);
    panel4.add(addDetails);
    addDetails.setForeground(Color.black);
    panel4.add(number1);
    panel4.add(number2);
    panel4.add(sum);
    panel4.add(Button4);
    
    
    Button1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
   {
       String triangleBaseText = trianglebase.getText();
       double triangBase = Double.parseDouble(triangleBaseText);
       String triangleHeightText = triangleheight.getText();
       double triangHeight = Double.parseDouble(triangleHeightText);
       double triangArea = (triangBase * triangHeight)/2;
       trianglearea.setText(String.valueOf(triangArea));
   }
 }); 

     Button2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
   {
       String squareLengthText = squareLen.getText();
       double squareLen = Double.parseDouble(squareLengthText);
       String squareWidthText = squareWid.getText();
       double squareWidth = Double.parseDouble(squareWidthText);
       double squareArea = squareLen * squareWidth;
       squareAr.setText(String.valueOf(squareArea));
   }

}); 

    Button3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
   {
       String circleRadiusText = circleRadius.getText();
       int radius = Integer.parseInt(circleRadiusText);
       double circumference = radius * Math.PI * 2;
       circleCircumference.setText(String.valueOf(circumference));
   }
 }); 
 
     Button4.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e)
   {
       String number1Text = number1.getText();
       double num1 = Double.parseDouble(number1Text);
       String number2Text = number2.getText();
       double num2 = Double.parseDouble(number2Text);
       double numSum = num1 + num2;
       sum.setText(String.valueOf(numSum));
   }

});   

}

private class MyMenu implements ActionListener {

    private JPanel panel;
    private MyMenu(JPanel panel2) {
        this.panel = panel2;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switchPanel(panel);

    }

}

private void createMenu() {
    JMenuBar menubar = new JMenuBar();
    JMenu menu = new JMenu("Geometry Calculator");
    JMenuItem triangleMenu = new JMenuItem("Triangle");
    JMenuItem squareMenu = new JMenuItem("Square / Rectangle");
    JMenuItem circleMenu = new JMenuItem("Circle");
    JMenuItem doMenu = new JMenuItem("Do Another Calculation");
    JMenuItem exitMenu = new JMenuItem("Exit Application");
    
    // Menu configuration
    menubar.add(menu);
    menu.add(triangleMenu);
    menu.add(squareMenu);
    menu.add(circleMenu);
    menu.add(doMenu);
    menu.add(exitMenu);
    setJMenuBar(menubar);
    triangleMenu.addActionListener(new MyMenu(panel1));
    squareMenu.addActionListener(new MyMenu(panel2));
    circleMenu.addActionListener(new MyMenu(panel3));
    doMenu.addActionListener(new MyMenu(panel4));
    exitMenu.addActionListener((ActionEvent event) -> {
    System.exit(0);
 });
    

}

private void switchPanel(JPanel panel) {
    getContentPane().removeAll();
    getContentPane().add(panel, BorderLayout.CENTER);
    getContentPane().doLayout();
    update(getGraphics());
}


public static void main(String[] args) {
    CalculateTheArea frame = new CalculateTheArea();
    frame.setBounds(500, 400, 500, 400);
    frame.setVisible(true);
         
   }
}
