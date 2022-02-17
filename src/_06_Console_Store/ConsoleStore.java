package _06_Console_Store;

import java.util.Iterator;
import java.util.Scanner;

import _02_Generics_Store.Candy;
import _02_Generics_Store.Cart;
import _02_Generics_Store.Cereal;
import _02_Generics_Store.Clothing;
import _02_Generics_Store.Toy;

public class ConsoleStore {

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */

    public static void main(String[] args) {
    	boolean keepShopping = true;
    	int budget = 100;
    	int totalSpent = 0;
    	Scanner scan = new Scanner (System.in);
    	Cart cart = new Cart ();
    	do {
    		System.out.println("Would you like to add items, remove items, view your items, or check out?");
    		String input = scan.nextLine ();
    		
    		if (input.equalsIgnoreCase("add")) {
    			System.out.println("What would you like to add? Options are:");
    			System.out.println("Candy ($5)");
    			System.out.println("Cereal ($10)");
    			System.out.println("Clothing ($30)");
    			System.out.println("Toy ($20)");
    			String add = scan.nextLine();
    			
    			if (add.equals ("candy")) {
    				cart.add(new Candy ());
    			}else if (add.equals("cereal")) {
    				cart.add(new Cereal ());
    			}else if (add.equals ("clothing")) {
    				cart.add(new Clothing ());
    			}else if (add.equals ("toy")) {
    				cart.add(new Toy ());
    			}
    		}else if (input.equals("remove")) {
    			System.out.println("What would you like to remove? Type the number of the product");
    			for (int i = 0; i < cart.length(); i++) {
					System.out.println(i + ": " + cart.shopping.get(i).toString());
				}
    			int index = scan.nextInt();
    			cart.remove(index);
    		}else if (input.equals("view")) {
    			cart.showCart();
    		}else if (input.equals("check out")) {
    			keepShopping = false;
    		}
    	}while (keepShopping);
    	
    	totalSpent = cart.totalPrice();
    	
    	if (totalSpent > budget) {
    		System.out.println("You have spent too much, would you like to remove all items?");
    		String removeAll = scan.nextLine();
    		if (removeAll.contains("y")) {
    			cart.shopping.clear();
    		}
    	}else {
    		budget -= totalSpent;
    		cart.showCart();
    		cart.printCart();
    		System.out.println(cart.totalPrice());
    	}
    }

}
