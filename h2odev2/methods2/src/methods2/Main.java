package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		
		String yeniMesaj = sehirVer();// sorun cıkmadı, çünkü operasyon uygun datatypeta.
		System.out.println(yeniMesaj);
		
		/*
		String yeniMesaj = 	mesaj.substring(0,2); //bir değer döndürüyor.
		System.out.println(yeniMesaj);
		
		String yeniMesaj = ekle(); //program izin vermiyor, void olan operasyonlar bir değişkene atanamaz
		System.out.println(yeniMesaj); 
		
		*dilin kurallarına göre bir string eklemem gerekirdi.
		*int tipinde bir değer vermeye çalıştığımda yine dil kurallarına uymamış oluyorum.
		*/
		
		int sayi =topla(5,7);
		
		//metoda uygun yazmak gerekiyor. topla operasyonunda herhangi bir parametre girmemişken yukarıdaki girdiyi yaptığımızda
		//hata verir.
		System.out.println(sayi);
		//fonksiyonun iyi yanı; farklı yerlerde uygun data tipinde operasyonlar oluşturarak topla metodunu çağırabilirim.
		
		int toplam = topla2(2,3,4,5,6,10);
		System.out.println(toplam);
		// variable arguments
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1 + sayi2;
	}
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	public static String sehirVer( ) {
		return "Ankara";
	}
}
