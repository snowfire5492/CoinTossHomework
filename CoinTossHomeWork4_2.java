package cointosshomework4_2;

/* 
 * Chapter No. 4    Excercise No. 2
 * File Name: CoinTossHomeWork4_2.java
 * @author: Eric Schenck
 * Date: September 21, 2012
 * 
 * 
 * Problem Statement: Write a program that will print out statistics 
 * for eight coin tosses. The user will input either an “h” for heads or 
 * a “t” for tails for the eight tosses. The program will then print out 
 * the total number and percentages of heads and tails. Use the increment 
 * operator to increment the number of tosses as each toss is input.
 * 
 * 
 *
 * Overall plan:
 * 1.) ask the user to input the results of eight coin tosses 
 * 2.) 
 * 3.) perform three seperate equations to figure out the amount of 
 * calories burned per minute for each activity.
 * 4.) Perform three seperate equations to multiply the amount of calories
 * burned per minute per activity by the amount of time stated in the problem
 * for each individual activity
 * 5.) add the three calorie amounts to calculate the total amount of 
 * calories burned.
 * 6.) print out a statement with the amount of calories burned.
 *
 * 
 */

import javax.swing.JOptionPane;

public class CoinTossHomeWork4_2 {
    
    
    
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Hello there!\nIf you will id"
            + " like you to flip a coin\nfor me a total of eight times.\n"
            + "Enter either 'h' for heads or 't' for tails.");
        
        String userInput1 = 
                JOptionPane.showInputDialog(null, "What is the result"
                + " of your first toss?\n\nPlease enter h or t:");
        String userInput2 =
                JOptionPane.showInputDialog(null, "What is the result "
                + "of your second toss?\n\nRemember to enter h or t:");
        String userInput3 =
                JOptionPane.showInputDialog(null, "Now enter the result"
                + " of your third toss:");
        String userInput4 =
                JOptionPane.showInputDialog(null, "Now enter the result of"
                + " of your fourth toss:");
        String userInput5 =
                JOptionPane.showInputDialog(null, "Keep it up your doing"
                + " a great job!\n\nNow enter the result of "
                + "your fifth toss:");
        String userInput6 =
                JOptionPane.showInputDialog(null, "Now enter the result of "
                + "your sixth toss:");
        String userInput7 =
                JOptionPane.showInputDialog(null, "Keep going your almost "
                + "finished!\n\nEnter the result of your seventh toss:");
        String userInput8 =
                JOptionPane.showInputDialog(null, "And finally,\nEnter "
                + "the result of your eighth toss:");
        
        
        int numberOfHeads = 0;
        
        int numberOfTails = 0;
        
        
        
        JOptionPane.showMessageDialog(null, "number of heads is "
                + numberOfHeads + "\n\nNumber of tails is "
                + numberOfTails);
                

    
    }
}
