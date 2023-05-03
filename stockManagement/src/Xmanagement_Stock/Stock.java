package Xmanagement_Stock;
import java.util.Scanner;

public class Stock {
	protected StockKind kind = StockKind.FrozenFood;	// 재고 종류 - 디폴트 값 = 냉장식품
	protected String name;								// 재고 이름
	protected int id;									// 재고 고유 번호
	protected int date;									// 재고 유통기한
	protected int sale;									// 재고 판매 갯수
	protected int order;								// 재고 추가 갯수

	public Stock() {
		
	}
	
	// String name, int id
	// - 2개의 파라미터를 받아 해당 변수를 초기화하는 생성자
	public Stock(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	// String name, int id, int sale, int Order 
	// - 4개의 파라미터를 받아 해당 변수를 초기화하는 생성자
	public Stock(String name, int id, int date, int sale, int order) {
		this.name = name;
		this.id = id;
		this.date = date;
		this.sale = sale;
		this.order = order;
	}
	
	// Getter & Setter
	public StockKind getKind() {
		return kind;
	}

	public void setKind(StockKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getSale() {
		return sale;
	}

	public void setSale(int sale) {
		this.sale = sale;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	
	public void getStockInput(Scanner input) {
		
		System.out.print("Stock ID: ");
		int id = input.nextInt();
		this.setId(id);
		
		System.out.print("Stock Name: ");
		String name = input.next();
		this.setName(name);
		
		System.out.print("Expiration Date: ");
		int date = input.nextInt();
		this.setDate(date);
		
		System.out.print("Today Sale: ");
		int sale = input.nextInt();
		this.setSale(sale);
		
		System.out.print("Today Order: ");
		int order = input.nextInt();	
		this.setOrder(order);
	}
	
	// PrintInfo() - 재고 정보를 출력하는 메소드.
	public void PrintInfo() {
		System.out.println("name:" + name + " id:" + id + " date:" + date + " sale:" + sale + " order:"+ order);
	}

}
