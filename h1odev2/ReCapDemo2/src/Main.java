
public class Main {

	public static void main(String[] args) {
		double[] reCapDemo2List = {1.2,1.3,4.3,5.6};
		
		//sayıları tek tek ekrana yazdır.
		//sayıların toplamını yazdır
		//en büyük sayıyı yazdır
		
		double totalReCapDemo2=0;
		double maxReCapDemo2= reCapDemo2List[0];
		for(double reCapDemo2Numbers: reCapDemo2List) {
			if(maxReCapDemo2<reCapDemo2Numbers) {
				maxReCapDemo2=reCapDemo2Numbers;
			}
			totalReCapDemo2 = totalReCapDemo2 + reCapDemo2Numbers;
			System.out.println(reCapDemo2Numbers);
		}
		
		System.out.println("Toplam = " + totalReCapDemo2);
		System.out.println("En büyük sayı = " + maxReCapDemo2);
	}

}
