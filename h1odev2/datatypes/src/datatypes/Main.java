package datatypes;

public class Main {

	public static void main(String[] args) {
		int a = 12; //int= 4 byte
		System.out.println(a);
		a = 13; //tamsayı bir ifade ile değiştirdiğimde herhangi bir hata vermiyor.
		System.out.println(a); //a değişkenini sonradan düzenlediğim için çıktı değişti.
		
		//primitive types: ilkel tipler= bir dilin en temel veri tipleridir. bellekte farklı alanlar tutarlar ve buna göre alabilecekleri değerler kısıtlanır.
		
		byte b = 28;
		System.out.println(b);
		b = 127;
		System.out.println(b);
		b = -128; //bellekte 1 byte yer kaplar ve sınırları -128 ile 127'dir.
		System.out.println(b);
		
		//diğer tamsayı tipleri "short(2 byte)" ve "long(8 byte)" olarak tamsayı tipinde 4 farklı bellek büyüklüğünde veri tutulabilir.
	
		double c =14.5;
		System.out.println(c);
		c = 16.7;
		System.out.println(c);
		//ondalık sayıları işleyebilmek için double ve float kullanılır.
		
		char character = 'A'; // yalnızca 1 karakter tutar. karakter '' içine yazılır. 2 Byte.
		System.out.println(character);
		
		boolean dogruVeyaYanlıs = true; //doğru veya yanlış, 0 veya 1 olarak tutar. 1 byte. true veya false olarak iki değer alabilir
		System.out.println(dogruVeyaYanlıs);

	}

}
