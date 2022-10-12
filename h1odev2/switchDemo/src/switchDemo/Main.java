package switchDemo;

public class Main {

	public static void main(String[] args) {
		// Örnek: öğrenci dersten kaldı mı geçti mi?
		char gradeSwitch = 'A';
		// gradeSwitch değişkeni değiştirilebilir ve çıktı değişir.
		switch(gradeSwitch) {
			case 'A':
				System.out.println("Mükemmel : Geçtiniz!");
				break;
			case 'B':
				System.out.println("Çok Güzel: Geçtiniz");
				break;
			case 'C':
				System.out.println("İyi : Geçtiniz");
				break;
			case 'D':
				System.out.println("Fena Değil : Geçtiniz");
				break;
			case 'F':
				System.out.println("Maalesef Kaldınız");
				break;
			default:
				System.out.println("Geçersiz not girdiniz.");
			}
			//case 'B':	
			//case 'C':
			//System.out.println("İyi : Geçtiniz");
			//break;
			// B ve C notlarında aynı sonucun çıkmasını istediğimizde.
	}

}
