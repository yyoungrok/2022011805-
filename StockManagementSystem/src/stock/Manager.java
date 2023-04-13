package stock;

import java.util.Scanner;
import stock.Stock;

public class Manager {
	Stock stock;
	Scanner input;
	Manager(Scanner input){		
	}
	public void addStock() {
		Stock stock = new Stock();
		System.out.print("Stock ID: ");
		stock.id = input.nextInt();
		
		System.out.print("Stock name: ");
		stock.name = input.next();
		
		System.out.print("Today Sale: ");
		stock.sale = input.nextInt();
		
		System.out.print("Today input");
		stock.stockinput = input.nextInt();	
	}
	public void deleteStock() {
		System.out.print("Stock ID: ");
		int stockId = input.nextInt();
		if (stock ==null) {
			return;
		}
		if(stock.id == stockId) {
			stock =null;
			System.out.println("the stock is deleted");
		}
	}
	public void editStock() {
		Scanner input = new Scanner(System.in);
		System.out.print("Stock ID: ");
		int stockId = input.nextInt();	
		if(stock.id == stockId) {
			System.out.println("the stock to be edited is"+ stock.id);
		}
	}
	public void viewStock() {
		System.out.print("Stock ID: ");
		int stockId = input.nextInt();	
		if(stock.id == stockId) {
			stock.PrintInfo();
		}
	}
}
