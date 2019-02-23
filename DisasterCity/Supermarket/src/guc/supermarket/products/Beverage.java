package guc.supermarket.products;

public class Beverage extends GroceryProduct {
private SugarLevel sugarLevel;
public Beverage(String name,double price, double discount, SugarLevel sugarlevel){
	super(name,price,discount);
	this.sugarLevel=sugarlevel;
}
public String toString(){
	return super.toString() +"\n"
			+"SugarLevel:"+sugarLevel;
}
public SugarLevel getSugarLevel(){
	return sugarLevel;
}
public void setSugarLevel(SugarLevel sugarlevel){
	this.sugarLevel=sugarlevel;
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
public double getActualPrice(double extra){
return getPrice()-getPrice() * ((getDiscount() + extra)/100);
}
 public boolean refrigerate(){
	return false;
}
}
