package _02_Generics_Store;

import java.util.Random;

import javax.swing.JLabel;

public class Toy extends NonFood {
	public Toy() {
		if(new Random().nextBoolean()) {
			this.item = "toy1.jpeg";
		}
		else {
			this.item = "toy2.jpeg";
		}
		price = 20;
	}

	@Override
	public JLabel getProduct() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	
	public String toString () {
		return "Toy";
	}
}
