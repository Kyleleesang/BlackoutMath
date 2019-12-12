/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackoutMath;

import java.lang.String;
import java.io.*;
import java.util.*;

/**
 *
 * @author kleesans
 */
public class BlackoutMath {
    




  public static void test(String equation) {
    System.out.println(equation);
  }
  
  public static Optional<Integer> compute(String expression) {
      String numbuilder = "";
      String Operators = "+-/*";
      Stack<String> OperatorStack = new Stack<String>();
      Stack<Integer> NumberStack = null;
       String[] strArray = new String[]{"+","/","-","*"};
      for (int i = 0; i < expression.length(); i++) {
          if (!Operators.contains(expression.contains(i))) {
              numbuilder += i;
          } else {
              int num = Integer.parseInt(numbuilder);
              NumberStack.add(num);
              numbuilder = "";
              OperatorStack.add(i);
          }
      }
      return null;
        
      
  }
  
  public static boolean evaluate(String equation) {
      for (int i = 0; i < equation.length(); i++) {
          if(equation.charAt(i)){
              
          } else {
              return true;
          } 
          
  }
      
  }
  
  public static String solve(String puzzle) {
      return puzzle.evaluate();
  }
  
  
}
