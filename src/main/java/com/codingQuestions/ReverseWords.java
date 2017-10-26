package main.java.com.codingQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Link to understand the question : 
// http://practice.geeksforgeeks.org/problems/reverse-words-in-a-given-string/0
public class ReverseWords {
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    List<String> input = new ArrayList<String>();
    input.add("i.like.this.program.very.much");
    input.add("pqr.mno");
    input.add("heloisa.eh.muito.chata.demais.meu.deus.deixa.o.bebe.em.paz.salve.ele.senhor");
    for(String words: input) {
      String[] allWords = words.split("\\.");
      Stack<String> stack = new Stack<String>();
      for(int i=0; i < allWords.length; i++ ) {
        stack.push(allWords[i]);
      }
      String concat = "";
      while ( !stack.isEmpty() ) {
        concat += stack.pop();
        if ( !stack.isEmpty() ) {
          concat += ".";
        }
      }
      System.out.println(concat);
    }
  }
}
