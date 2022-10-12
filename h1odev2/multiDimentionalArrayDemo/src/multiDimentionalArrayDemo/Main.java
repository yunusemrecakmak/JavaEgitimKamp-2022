package multiDimentionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		//matris tabanlı çozümler önemlidir
		
		String[][] multiDimentionalArraysDemoSehirler = new String[3][3];
		multiDimentionalArraysDemoSehirler[0][0] = "İstanbul";
		multiDimentionalArraysDemoSehirler[0][1] = "Yalova";
		multiDimentionalArraysDemoSehirler[0][2] = "Edirne";
		multiDimentionalArraysDemoSehirler[1][0] = "Ankara";
		multiDimentionalArraysDemoSehirler[1][1] = "Konya";
		multiDimentionalArraysDemoSehirler[1][2] = "Kayseri";
		multiDimentionalArraysDemoSehirler[2][0] = "Diyarbakır";
		multiDimentionalArraysDemoSehirler[2][1] = "Gaziantep";
		multiDimentionalArraysDemoSehirler[2][2] = "Kahramanmaraş";
			
		for(int i=0;i<=2;i++) {
			System.out.println("------");
			for(int j=0;j<=2;j++) {
				System.out.println(multiDimentionalArraysDemoSehirler[i][j]);
			}
		}
		//array sayısı 2 ile sınırlı değildir.'[]' ile ek boyutlar eklenebilir.

	}

}
