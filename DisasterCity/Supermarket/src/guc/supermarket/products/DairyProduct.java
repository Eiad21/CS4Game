package guc.supermarket.products;

public class DairyProduct extends GroceryProduct {
private Fat fat;
public DairyProduct(String name,double price, double discount, Fat fat){
super(name,price,discount);
this.fat=fat;
}
public String toString(){
	return super.toString() +"\n"
			+"Fat Level: "+fat;
}
public Fat getFat(){
	return fat;
}
public void setFat(Fat fat){
	this.fat=fat;
}
public String getName(){
	return super.getName();
}
public double getPrice(){
	return super.getPrice();
}
public double getDiscount(){
	return super.getDiscount();
}
public boolean refrigerate(){
	return true;
}
}