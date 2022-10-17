package gettersSetters;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
	
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getKod());
		
		Product product2 = new Product(2, "Laptop", "Hp Laptop", 4000, 2, "Gri");
		productManager.add(product2);
		System.out.println(product2.getKod());
	}

}
