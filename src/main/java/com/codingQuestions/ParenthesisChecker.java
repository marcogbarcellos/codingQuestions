package main.java.com.codingQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Link to understand the question : 
// http://practice.geeksforgeeks.org/problems/parenthesis-checker/0
public class ParenthesisChecker {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    List<String> input = new ArrayList<String>();
    input.add("{}[](){[()]}");
    input.add("{}[}");
    input.add("{[()]}");
    input.add("{}[](){[()]}");
    input.add("{[(])}");
    
    for (String parenthesis : input) {
      Stack<Character> stack = new Stack<Character>();
      int index = 0;
      while( index < parenthesis.length() ) {
        if ( !stack.isEmpty() && ((Character)stack.peek()).charValue() == reverseParenthesis(parenthesis.charAt(index)) ) {
          stack.pop();
        } else {
          stack.push(new Character(parenthesis.charAt(index)));
        }
        
        index++;
      }
      if ( stack.isEmpty() ) {
        System.out.println("Balanced");
      } else {
        System.out.println("NOT Balanced");
      }
    }
    
    
  }
  
  protected static char reverseParenthesis(Character c) {
    char reverseCharacter = '0';
    switch(c) {
      case '{' :
        reverseCharacter = '}';
        break;
      case '(' :
        reverseCharacter = ')';
        break;
      case '[' :
        reverseCharacter = ']';
        break;
      case '}' :
        reverseCharacter = '{';
        break;
      case ')' :
        reverseCharacter = '(';
        break;
      case ']' :
        reverseCharacter = '[';
        break;
    }
    return reverseCharacter;
  }

}
