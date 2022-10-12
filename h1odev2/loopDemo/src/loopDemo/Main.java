package loopDemo;

public class Main {

	public static void main(String[] args) {
		//dönlgüler bir programda birbirine benzeyen işlemleri tekrarlamayı sağlar.
		// Döngüler birkaç tane versiyonu olan yapılardır, özellikle birçok dilde for döngüsü ve while döngüsü bulunur.
		
		//For Dongusu
		for(int iForDongu=1;iForDongu<10;iForDongu++) {
			System.out.println(iForDongu);
		}
		System.out.println("For 1. Döngü Bitti");
		//int iForDongu=1;iForDongu<10;iForDongu++
		//int=veri tipi, iForDongu=tanımlanan değişken,sırasıyla
		//iForDongu 1'den başlar,10'dan küçüktür,tek tek artar.
				
		for(int iForDongu2=0;iForDongu2<=10;iForDongu2+=2) {
			System.out.println(iForDongu2);
		}
		System.out.println("For 2. Döngü Bitti");
			
		//iForDongu2=0;iForDongu2<=10;iForDongu2+=2
		//iForDongu2 değişkeni 0'dan başlar. 10'dan küçük veya 10'a eşit oluncaya kadar devam eder.
		//+=2 değişkeni al ve iki ile topla. += 3 olsaydı değişkene 3 ekleyecekti.

		
		//While döngüsü
		//while döngüsü
		
		int iWhileDongu=1;
				
		while(iWhileDongu<10) {
			System.out.println(iWhileDongu);
			iWhileDongu++;
		}
		System.out.println("While Döngüsü Bitti!");
		//bir değişken eğer döngü içerisinde tanımlanırsa o döngünün dışında tanımsız kalabilir.
		//örn;for(int i=1;i<10;i++) {} şeklinde bir 'i' değişkeni tanımlarsam o i değişkeni kodun diğer kısımlarında kullanılamaz
		//eğer bir while döngüsünü i değişkenini kullanarak oluşturmak isteseydim main class altında bir 'i' değişkeni tanımlamam gerekirdi
		
		//Do-While döngüsü
		
		//do-while döngüsü
		
		int iDoDongusu=1;
				
		do {
			System.out.println(iDoDongusu);
			iDoDongusu+=2;
		}while(iDoDongusu<10);
		System.out.println("Do-While Döngüsü Bitti");
				
		//do-while döngüsü ile while döngüsü arasındaki fark;do-while döngüsünde ilk değer şartı sağlamıyorsa bile program 1 kere çalışır.
		//ancak while döngüsünde program hiç çalışmaz.
		//kayıt(log) oluşturmak için kullanışlıdır.
	}

}
