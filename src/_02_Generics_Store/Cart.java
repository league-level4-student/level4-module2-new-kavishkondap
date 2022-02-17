package _02_Generics_Store;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * The Cart class is a Bounded Type Generic class
 * 
 * <T extends Food> means we can only create a Cart with objects part of the 
 * Food class
 */

@SuppressWarnings("unchecked")
public class Cart<T extends Product> {
    public ArrayList <T> shopping;

    public Cart() {
        shopping = new ArrayList ();
    }

    // Adds an item to the cart
    public void add(T item) {
        shopping.add(item);
    }

    public void remove (int i) {
    	shopping.remove(i);
    }
    // Displays everything currently in the cart
    public void showCart() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < shopping.size (); i++) {
            if (shopping.get(i) != null) {
                panel.add(shopping.get(i).getProduct());
            }
        }
        frame.pack();

    }

    public int length() {
        return shopping.size ();
    }
    
    public int totalPrice () {
    	int val = 0;
    	for (int i = 0; i < shopping.size(); i++) {
			val+=shopping.get(i).getPrice();
		}
    	return val;
    }
    
    public void printCart () {
    	for (Product p : shopping) {
    		System.out.println("$" + p.price + ": " + p.toString());
    	}
    }
}

