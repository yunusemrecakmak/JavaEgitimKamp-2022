package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = 15;
		//int remainder =number % 2;
		boolean isPrime =true;
		
		if(number == 1) {
			System.out.println("Sayı asal değildir.");
			return;
		}
		
		if(number < 2) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for(int remainder=2;remainder<number;remainder++) {
			if(number % remainder ==0) {
				isPrime=false;
			}
		}
		
		if(isPrime) {
			System.out.println(number + " asal bir sayıdır.");
		}else {
			System.out.println(number + " asal bir sayı değildir.");
		}
	}

}
