package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Cereal extends Food{
	public Cereal() {
		if(new Random().nextBoolean()) {
			this.item = "cereal1.jpeg";
		}
		else {
			this.item = "cereal2.jpeg";
		}
		price = 10;
	}

	@Override
	public JLabel getProduct() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	
	public String toString () {
		return "Cereal";
	}
}
