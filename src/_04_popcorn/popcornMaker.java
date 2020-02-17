package _04_popcorn;

import javax.swing.JOptionPane;

public class popcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor popcorn would you like?");
		String minutes = JOptionPane.showInputDialog("How many minutes do you want the popcorn to be cooked for?");
		int x = Integer.parseInt(minutes);
		Popcorn pop = new Popcorn(flavor);
		Microwave m = new Microwave();
		m.putInMicrowave(pop);
		m.setTime(x);
		m.startMicrowave();
		pop.eat();
	}

}
