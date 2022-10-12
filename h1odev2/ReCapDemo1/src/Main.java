
public class Main {

	public static void main(String[] args) {
		//görev: elimizde bulunan sayılardan en büyüğü hangisidir? Sayılar sırası ile 20, 25, 2
		
		int demo1Sayi1 = 20;
		int demo1Sayi2 = 25;
		int demo1Sayi3 = 2;
		int enBuyuk = demo1Sayi1;

				
		if (enBuyuk<demo1Sayi2) {
			enBuyuk = demo1Sayi2;
		}
		
		if (enBuyuk<demo1Sayi3) {
			enBuyuk = demo1Sayi3;
		}

		System.out.println("En büyük sayı: " + enBuyuk);

	}

}
