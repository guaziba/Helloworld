public class Homework03{
public static void	main(String[] args) {
	Book book01 = new Book("笑傲江湖",300);
	book01.info();
	book01.updatePrice();
	book01.info();   
	}
}
class Book {
	String name;
	double price;
	public Book(String name,double price) {
	this.name =name;
	this.price = price;
	}
	public void updatePrice() {
		if(this.price>150) {
			this.price = 150;
			
		}else if(this.price>100) {
			this.price =100;
			
		}
	}
public void info() {
	System.out.println("书名="+this.name+"价格="+this.price);
}
}