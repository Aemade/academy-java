package com.bptn.course._challege_week04_04;

//hiddenWord stores the word to be guessed.
//The constructor initializes the hiddenWord with the provided word.
//getHint Method:
/*Compares each character of the guess to the corresponding character 
in the hidden word*/

public class HiddenWord{

  /** Declare any fields (instance variables) **/
private String hiddenWord;
  /** Declare a constructor */
public HiddenWord(String word) {
      this.hiddenWord = word;
  }

  /** Write the getHint method */
public String getHint(String guess) {
      StringBuilder hint = new StringBuilder();
 // Loop through each character in the guess
      for (int i = 0; i < hiddenWord.length(); i++) {
          char hiddenChar = hiddenWord.charAt(i);
          char guessChar = guess.charAt(i);

          // Check if the character is in the correct position
          if (hiddenChar == guessChar) {
              hint.append(hiddenChar);
          }
          // Check if the character is in the word but in the wrong position
          else if (hiddenWord.indexOf(guessChar) != -1) {
              hint.append('+');
          }
          // Character is not in the word
          else {
              hint.append('*');
          }
      }
      return hint.toString();
  }

  /** This is a main method for testing the class */
  public static void main(String[] args) {
      HiddenWord puzzle = new HiddenWord("HARPS");
      System.out.println(puzzle.getHint("AAAAA") + " it should print +A+++");
      System.out.println(puzzle.getHint("HELLO") + " it should print H****");
      System.out.println(puzzle.getHint("HEART") + " it should print H*++*");
      System.out.println(puzzle.getHint("HARMS") + " it should print HAR*S");
      System.out.println(puzzle.getHint("HARPS") + " it should print HARPS");

  } // end of main

} // end of class

