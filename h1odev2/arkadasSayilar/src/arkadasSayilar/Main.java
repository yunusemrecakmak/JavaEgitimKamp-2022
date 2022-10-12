package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		//Arkadaş sayılar, kendileri hariç pozitif tam bölenlerinin toplamı birbirine eşit olan sayılardır.
		//en küçük bilinen örneği 220 ve 284tür.
		
		int number1 = 220;
		int number2 = 284;
		int total1 = 0;
		int total2 = 0;
		
		for(int bolenSayı=1;bolenSayı<number1;bolenSayı++) {
			if(number1 % bolenSayı == 0) {
				total1 = total1+bolenSayı;
				System.out.print(bolenSayı+ " ");
			}
		}
		
		System.out.println(" ");
		System.out.println(" ");
		
		for(int bolenSayı=1;bolenSayı<number2;bolenSayı++){
			if(number2 % bolenSayı == 0) {
				total2 = total2+bolenSayı;
				System.out.print(bolenSayı+ " ");
			}
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(total1);
		System.out.println(" ");
		System.out.println(total2);
		System.out.println(" ");
		if (total1==number2 && total2==number1) {
			System.out.println(number1 + " ve " + number2 + " arkadaş sayılardır.");
		}else {
			System.out.println(number1 + " ve " + number2 + " arkadaş sayılar değildir.");
		}
		/*alternatif:
		if(total1==number2){
			if(total2==number1){
				System.out.println(number1 + " ve " + number2 + " arkadaş sayılardır.");
			}
		}else {
			System.out.println(number1 + " ve " + number2 + " arkadaş sayılar değildir.");
		}
		 */
	}

}
