package methodOverloading;

public class DortIslem {
	public int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	public int topla(int sayi1,int sayi2,int sayi3) {
		return sayi1+sayi2;
	}
//Overloading metodu; farklı parametrelere sahip metodlara aynı ismi verebilmeyi sağlar
	//yukarıdaki örnekte her iki metodun da adı topla olmasına karşın, biri 3 tane değer alabiliyor öteki iki
	//tane değer alabiliyor.
}
