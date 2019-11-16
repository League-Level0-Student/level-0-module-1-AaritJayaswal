package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String riddle1 = JOptionPane.showInputDialog(null, "Which word in the dictionary is spelled incorrectly? (do not add any capital letters in your answer.)");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (riddle1.equals ("incorrectly")) {
	JOptionPane.showMessageDialog(null, "Correct! You got a point!");
	score++;
	JOptionPane.showMessageDialog(null,"Your score is:" + score);
}
else {
		// 5. Otherwise, say "wrong" and tell them the answer
JOptionPane.showMessageDialog(null,"WRONG! The correct answer is 'incorrectly'");
JOptionPane.showMessageDialog(null,"Your score is:" + score);
}
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

