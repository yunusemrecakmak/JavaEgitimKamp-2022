package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String stringDemoMesaj = "Bugün hava çok güzel!";
		
		System.out.println(stringDemoMesaj);
		
		//stringler bir karakter dizisidir. yani char array'i dirler.
		
		System.out.println("Eleman sayısı = " + stringDemoMesaj.length());
		System.out.println("5. eleman = " + stringDemoMesaj.charAt(4));
		System.out.println(stringDemoMesaj.concat(" Yaşasın!"));
		System.out.println(stringDemoMesaj.startsWith("B"));
		System.out.println(stringDemoMesaj.endsWith("!"));
		
		char[] stringDemoKarakterler= new char[5];
		stringDemoMesaj.getChars(0,5,stringDemoKarakterler,0);
		System.out.println(stringDemoKarakterler);
		//stringDemoMesaj.getChars(0,5,stringDemoKarakterler,0);
		//sırasıyla '0' başlangıç karakteri, 5 bitiş karakteri(6. eleman dahil değil),nereye aktarılacak,kaçıncı karakterden başlayarak aktarılacak)
		System.out.println(stringDemoMesaj.indexOf('a'));
		System.out.println(stringDemoMesaj.lastIndexOf('a'));

		System.out.println("------------");
		
		/* bu işaretler arasındaki metin '//' gibi not olarak düşer. farkı // tek satırı etkilerken, bu özellik iki işaret arasındaki tüm metni etkiler*/
		
		String yeniStringDemoMesaj = stringDemoMesaj.replace(' ', '-');
		//yeni bir değişken oluşturarak, kodun farklı bir yerinde ilk değişkeni değiştirerek kullanabiliriz
		//String fonksiyonları farklı bir çıktı olmasını sağlar, ilk değişkeni etkilemez.
		System.out.println(yeniStringDemoMesaj);
		System.out.println(stringDemoMesaj.substring(2));
		System.out.println(stringDemoMesaj.substring(2, 5)); //ilk değer dahil, son değer hariç
		for(String stringDemoKelime : stringDemoMesaj.split(" ")) {
			System.out.println(stringDemoKelime);
		}
		
		System.out.println(stringDemoMesaj.toLowerCase());
		System.out.println(stringDemoMesaj.toUpperCase()); //veri tabanı aramalarında bu iki yöntem önemli.
		System.out.println(stringDemoMesaj.trim()); //baş ve sondaki boşlukları siler.
	}

}
