package stock;

public class Stock {
	String name;
	int id;
	int sale;
	int stockinput;

	public Stock(String name, int id, int sale, int stockinput) {
		this.name = name;
		this.id=id;
		this.sale=sale;
		this.stockinput=stockinput;
	}
	public Stock(String name, int id) {
		this.name = name;
		this.id = id;
		this.sale = sale;
		this.stockinput = stockinput;
	}
	public void PrintInfo() {
		System.out.println("name:"+name+"id:"+id+"sale"+sale+"stockinput"+stockinput);
	}

}
