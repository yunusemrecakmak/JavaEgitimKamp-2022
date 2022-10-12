package conditionals;

public class Main {

	public static void main(String[] args) {
		int ifBlokOrnek = 20;
		
		// ifBlokOrnek değişkeninin değeri ile oynayarak aşağıdaki programı çalıştır.
		if (ifBlokOrnek<20) {
			System.out.println("Sayı 20'den küçüktür.");
		}else if(ifBlokOrnek==20){
			System.out.println("Sayı 20'ye eşittir.");
		}else {
			System.out.println("Sayı 20'den büyüktür.");
		}
		//defensive programming: açıksız program yazma çabası, ifBlokOrnek adlı değişkene hangi TAMSAYI değeri verilirse verilsin
		//bu program çalışacaktır.
		
		
		// aynı değişken farklı şart blokları için kullanılabilir.
		if (ifBlokOrnek<15) {
			System.out.println("Sayı 15'ten küçüktür.");
		}else if(ifBlokOrnek==15){
			System.out.println("Sayı 15'e eşittir.");
		}else {
			System.out.println("Sayı 15'ten büyüktür.");
		}

	}

}
