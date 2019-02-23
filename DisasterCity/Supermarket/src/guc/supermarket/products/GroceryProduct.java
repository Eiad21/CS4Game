package guc.supermarket.products;

abstract public class GroceryProduct { 
private String name;
private double price;
private double discount;
abstract public boolean refrigerate();
public GroceryProduct(String name,double price,double discount){
	super();
	this.name=name;
	this.price=price;
	this.discount=discount;
	}
public final double getActualPrice(){
	return (price-(price*discount/100));
}
public String toString(){
	return "Name:"+name+"\n"
			+"Price:"+price+"\n"
			+"Discount:"+discount;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getDiscount() {
	return discount;
}
public void setDiscount(double discount) {
	this.discount = discount;
}

}
