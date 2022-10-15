package methods;

public class Main {
	public static void main(String[] args) {
		/*
		 * DRY: dont repeat yourself, kendini tekrar etme. sepete ekleme örneği;
		 * herhangi bir web alışveriş yerinde birden fazla yerde bu fonksiyonu
		 * çalıştırabilmek gerekir. bu nedenle temiz ve düzgün yazmak önemlidir.
		 */
		
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}

	/*
	 * int[] sayılar = {1,2,5,7,9,0}; 
	 * int aranacak = 5; 
	 * boolean varMi = false;
	 * 
	 * for (int sayı : sayılar) { 
	 * if(sayı == aranacak) { 
	 * varMi = true; break; 
	 * }
	 *  }
	 * if(varMi) { System.out.println("Sayı mevcuttur."); 
	 * }else {
	 * System.out.println("Sayı mevcut değildir"); }
	 Yukarıdaki kodu daha efektif yazmak mümkündür.
	 
	 */
	public static void sayiBulmaca() {
		int[] sayılar = { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMi = false;

		for (int sayı : sayılar) {
			if (sayı == aranacak) {
				varMi = true;
				break;
			}
		}
		String mesaj= "";
		if (varMi) {
			mesaj="Sayı mevcuttur: " + aranacak;
			mesajVer(mesaj);
		} else {
			mesaj="Sayı mevcut değildir: " + aranacak;
			mesajVer(mesaj);
		}
	}

	/*public static void mesajVer(int aranacak) {
		System.out.println("Sayı mevcuttur:" + aranacak);
	}
	Yukarıda parametreli metod örneği; aranacak değişkenine farklı bir metodun içinden ulaşıyorum.
	
	*/
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	// bu method sonuç basmıyor? Anlamadım.
	}
}
