package classesWithAttributes;

public class ProductManager {
	public void Add(Product product) {
		System.out.println("Ürün eklendi: " + product.get_name());
	}
	public void Add2(int id,String name,String description,int unitsInStock,double price,String renk) {
	/*
	 * Bu kullanım hatalıdır. Çünkü sonradan yeni bir özellik eklemeye çalıştığımda, farklı yerlerde de bu yeni özelliği düzenlememi gerektirir
	 * örn; bir renk değişkeni ekledim ürüne (bkz. Main.java, line 17-22); diğer ekranların hepsinde de bu renk değişkenini tekrar eklememi gerektiriyor
	 * */	
	}
}
