package oop1;

public class Main {

	public static void main(String[] args) {

		      //set value
		Product product1 = new Product(); //class değişkeni böyle atanır
		product1.setName("Delonghi Kahve Makinası");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitInStock(1);
		product1.setImageUrl("image1.jpg");
		
		Product product2 = new Product(); //class değişkeni böyle atanır
		product2.setName("Smeg Kahve Makinası");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitInStock(2);
		product2.setImageUrl("image1.jpg");
		
		Product product3 = new Product(); //class değişkeni böyle atanır
		product3.setName("Kitchen Aid Kahve Makinası");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitInStock(3);
		product3.setImageUrl("image1.jpg");
		Product[] products = {product1, product2,product3};
	    
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
	        	
		}
	    System.out.println("</ul>");
	
	    IndividualCustomer individualCustomer = new IndividualCustomer();
	    individualCustomer.setId(1);
	    individualCustomer.setPhone("052222222");
	    individualCustomer.setCustomerNumber("12345");
	    individualCustomer.setFirstName("Şermin");
	    individualCustomer.setLastName("Eldek");
	    
	    CorporateCustomer corporateCustomer = new CorporateCustomer();
	    corporateCustomer.setId(2);
	    corporateCustomer.setCompanyName("Kodlama.io");
	    corporateCustomer.setPhone("053333330");
	    corporateCustomer.setTaxNumber("111111");
	    corporateCustomer.setCustomerNumber("54321"); 
	    
	    Customer[] customers = {individualCustomer,corporateCustomer};
	    
	}

}
