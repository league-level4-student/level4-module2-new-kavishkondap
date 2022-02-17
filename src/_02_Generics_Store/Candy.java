package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Candy extends Food{
	public Candy() {
		if(new Random().nextBoolean()) {
			this.item = "candy1.jpeg";
		}
		else {
			this.item = "candy2.jpeg";
		}
		price = 5;
	}

	@Override
	public JLabel getProduct() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	
	public String toString () {
		return "Candy";
	}

	}

