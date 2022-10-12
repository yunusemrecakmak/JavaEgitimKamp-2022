package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String arraysOgrenci1= "Engin";
		String arraysOgrenci2= "Derin";
		String arraysOgrenci3= "Salih";
		
		System.out.println(arraysOgrenci1);
		System.out.println(arraysOgrenci2);
		System.out.println(arraysOgrenci3);
		
		//her bir öğrenci için yeni bir değişken tanımlamak ve yazdırma komutu vermek zorundayız
		//array yani diziler aynı tipte birden fazla değişkeni içerisinde tutarak kolaylık sağlarlar.
		
		String[] arrayOgrenciler= new String[5];
		arrayOgrenciler[0]="Engin";
		arrayOgrenciler[1]="Derin";
		arrayOgrenciler[2]="Salih";
		arrayOgrenciler[3]="Ahmet";
		arrayOgrenciler[4]="Kemal";
		
		System.out.println("-----------");
		//terminalde okunabilirlik için
		
		for(int i=0;i<arrayOgrenciler.length;i++) {
			System.out.println(arrayOgrenciler[i]);
		}
		
		System.out.println("-----------");
		
		for(String arrayOgrenci:arrayOgrenciler) {
		System.out.println(arrayOgrenci);	
		}


	}

}
