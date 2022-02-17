package _02_Generics_Store;

import javax.swing.JLabel;

public abstract class Product {
	int price;
	public abstract JLabel getProduct();
	public int getPrice () {
		return price;
	}
}
