package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	public final void gameOver() {
		System.out.println("Oyun bitti!");
	}
}
//Sınıfın abstract olabilmesi için, keyword şart
//Operasyonun abstract olabilmesi için keyword şart
//Abstract bir sınıfın içerisinde abstract bir operasyon olması zorunlu değil
//Abstract sınıflar doğrudan çağrılamaz! yani asla newlenemez.overriting ile çağırıl