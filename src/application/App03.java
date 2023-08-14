package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import util.PriceUpdate;

public class App03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		
		List<Product> prodList = new ArrayList<>();
		
		prodList.add(new Product("TV", 900.00));
		prodList.add(new Product("Mouse", 50.00));
		prodList.add(new Product("Tablet", 450.00));
		prodList.add(new Product("HD Case", 80.90));
		
		prodList.forEach(System.out :: println);
		System.out.println("---------------");
		
		prodList.forEach(new PriceUpdate());
		prodList.forEach(System.out :: println);
		
	}

}
