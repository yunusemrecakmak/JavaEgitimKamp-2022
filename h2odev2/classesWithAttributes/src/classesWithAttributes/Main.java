package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","AsusLaptop",5000,3,"Siyah");
//		product.set_name("Laptop");
//		product.setId(1);
//		product.set_description("Asus Laptop");
//		product.set_price(5000);
//		product.set_unitsInStock(3);
		
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		/*productManager.Add2(1, "", "", 2, 200);
		productManager.Add2(1, "", "", 2, 200);
		productManager.Add2(1, "", "", 2, 200);
		productManager.Add2(1, "", "", 2, 200);
		productManager.Add2(1, "", "", 2, 200);
		productManager.Add2(1, "", "", 2, 200);*/
		
		System.out.println(product.get_kod());
	}

}
/*
 *Yazılım geliştirmenin prensipleri vardır. Solid(?)
 *S harfi, single responsibility demektir. Yani bir metod yalnızca bir işi yapmalıdır.
 *Örneğin Product sınıfı hem ürün özelliklerini tutup hemde ürünlerle ilgili operasyonları tutmamalı.
 *
 */