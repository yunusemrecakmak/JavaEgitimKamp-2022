package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int number = 39;
		//number değişkenine atanan değer mükemmel sayı mıdır?
		//mükemmel sayı: kendisini tam bölen sayma sayılarının toplamı, kendisine eşit olan sayılar
		int total = 0;
		
		for(int i = 1;i < number;i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		if(total == number) {
			System.out.println(number + " mükemmel sayıdır.");
		}else {
			System.out.println(number + " mükemmel sayı değildir.");
		}
	}

}
