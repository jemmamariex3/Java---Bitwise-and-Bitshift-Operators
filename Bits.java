/*
Jemma Tiongson
Section #16031
App: Bits
Purpose: Demonstrate ability to apply bitwize operations and check answers using JOptionPane
 */

import javax.swing.JOptionPane;
class Bits{
   public static void main (String [] args){
      // Bitwise and Bitshift Operators
      
      /*
      The & Operator (Bitwise AND) - perform AND opp by multiplying two bits to each other
      
        00101000 (40)
      & 00110010 (50)
       _________
       00100000 (32)
       */
      int andOne = 40;
      int andTwo = 50;
      int resultAnd = andOne & andTwo;
      JOptionPane.showMessageDialog(null, "40 & 50 = " + resultAnd);

      /*
      The | Operator (Bitwise OR) - each position is 0 if BOTH bits are 0. Otherwise the position is 1
      
        01011110 (90)
      | 01000110 (70)
       _________
       01011110 (94)
       */
      int orOne = 90;
      int orTwo = 70;
      int resultOr = orOne | orTwo;
      JOptionPane.showMessageDialog(null, "90 | 70 = " + resultOr);
      
      /*
      The ^ Operator (Bitwise XOR - Exclusive OR) - position is 0 if BOTH bits are 0. position is 1 if one of the bits are 0 or 1.
      
        00011001 (25)
      ^ 00011110 (30)
        ________
        00000111 (7)
       */
      int xorOne = 25;
      int xorTwo = 30;
      int resultXor = xorOne ^ xorTwo;
      JOptionPane.showMessageDialog(null, "25 | 30 = " + resultXor);
      
      /*
      The ~ Operator (Bitwise Compliment Operator) - aka 2's compliment: 1 turns into 0 and 0 turns into 1.
      
      ~ 00101000
        result = 11010111 (-40)
       */
      int compOne = 40;
      int resultComp = ~ compOne;
      JOptionPane.showMessageDialog(null, "~ 40 = " + resultComp);
      
      /*
      The << Operator (Left Shift) - shift patterns to the left/ like multiplying by 2^n
      010 (2) << 1
      result: 100 (4)
       */
      int leftOne = 2;
      int resultLeft = 2 << 1;
      JOptionPane.showMessageDialog(null, "2 << 1 = " + resultLeft);
      
      /*
      The >> Operator (Right Shift) - shifts pattern to the right
      00010100 (20) >> 3
      result: 00000010 (2)
       */
      int rightOne = 20;
      int resultRight = 20 >> 3;
      JOptionPane.showMessageDialog(null, "20 >> 3 = " + resultRight);
      
      /*
      The >>> Operator (Zero Fill Right) - shifts bits to the right removing bits of on the right side and adding 0s on the left.
      
       01001011 (70) >>> 3
       result = 00001000 (8)
       */
      int zeroOne = 70;
      int resultZero = 70 >>> 3;
      JOptionPane.showMessageDialog(null, "70 >>> 3 = " + resultZero);
   }
}