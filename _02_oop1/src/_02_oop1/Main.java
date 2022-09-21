package _02_oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("kahve.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("kahve.jpg");

		Product product3 = new Product();
		product3.setName("Kicthen Aid Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("kahve.jpg");

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setCustomerNumber("0709");
		individualCustomer.setPhone("0544");
		individualCustomer.setFirstNmae("apolas");
		individualCustomer.setLastName("demir");
		
		CorparateCustomer corparateCustomer=new CorparateCustomer();
		corparateCustomer.setId(2);
		corparateCustomer.setCustomerNumber("1709");
		corparateCustomer.setPhone("120544");
		corparateCustomer.setCompanyName("apple");
		corparateCustomer.setTaxNumber("i");
		
		Customer[] customers= {individualCustomer,corparateCustomer};
		for (Customer customer : customers) {
			System.out.println(customer.getCustomerNumber());
		}
		

	}

}
