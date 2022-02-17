package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Clothing extends NonFood{
	public Clothing() {
		if(new Random().nextBoolean()) {
			this.item = "clothing1.jpeg";
		}
		else {
			this.item = "clothing2.jpeg";
		}
		price = 30;
	}

	@Override
	public JLabel getProduct() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	public String toString () {
		return "Clothing";
	}
}
