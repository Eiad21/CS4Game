package guc.supermarket.cart;
import guc.supermarket.products.GroceryProduct;
import guc.supermarket.products.Beverage;
import java.util.ArrayList;

public class Cart {
	private ArrayList<GroceryProduct>products;
	
	public Cart(){
		products = new ArrayList<>();
	}
	public void addProduct(GroceryProduct p){
		products.add(p);
	}
	public double getTotal(){
		double r=0;
		for(int i=0;i<products.size();i++){
			r+=products.get(i).getActualPrice();
		}
		return r;
	}
	public double getTotal(double extra){
		double r=0;
		for(int i=0;i<products.size();i++){
			if(products.get(i)instanceof Beverage)
				r+=((Beverage)products.get(i)).getActualPrice(extra);
			else
				r+=products.get(i).getActualPrice();
		}
		return r;
		
	}
	public String toString(){
		String s="";
		for(int i=0;i<products.size();i++){
			if(i==products.size()-1)
				s+=products.get(i).toString();
			else
			s+=products.get(i).toString()+"\n"+"_________"+"\n";
		}
		return s;
	}
	

}
