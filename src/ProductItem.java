public class ProductItem {
	 int prodQuantity;  
	 String prodName;  
	 Double prodPrice;
		    
ProductItem(int quantity, String name, Double price){  
	       this.prodQuantity = quantity;  
	       this.prodName = name; 
	       this.prodPrice = price; 
	   }  
void info(){
System.out.printf("Quantity: "+prodQuantity+" Name: "+prodName, "Price"+prodPrice);
	   }  
public static <totalPrice> void main(String[] args, String Apple, String Pear) {
		ProductItem obj1 = new ProductItem(1, Apple, (double) 2);  
		ProductItem obj2 = new ProductItem(1, Pear, (double) 3);  
		obj1.info();  
		obj2.info();  
	}
}
