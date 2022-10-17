package staticDemo;

public class ProductValidator {
	// ana sınıflar javada statik olamaz.
	static {
		System.out.println("Statik Yapıcı blok çalıştı.");
	}// birden fazla oluşturulabilir. yaygın değil kodların birbirine karışmaması
		// için kullanılabilir

	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı.");
	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public void birsey() {

	}
//	public static class BaskaBirSinif{ //inner class, statik olabilir.Gruplandırma amaçlı kullanılır.
//		public static void sil() {}
//	}
}

//bir metod static anahtar kelimesi ile oluşturulursa sınıf ismi ile çağırılabilir.
//static method kullanımı çok yaygın değildir. Utility(araç(?)yapımında kullanımı uygundur