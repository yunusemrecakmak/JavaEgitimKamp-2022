package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
	
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		//sayı iki ne olarak yazdırılır? cevap 10
		/*
		 *Değer tipinde bir değişken oluşturduğumuzda bütün operasyonlar belleğin stack kısmında olur.
		 *Kod satır satır ilerlediği için ve sayi2'ye yeni değer atatığımızda sayi1'in değeri 10 olduğu için, sonrasında sayi1'in değerini
		 *değiştirsek bile sayi2'nin değeri güncellenmez.
		 *
		 *1.Adım:integer tipinde sayi1 değişkenini tanımla ve değer ver(10)
		 *2.Adım:integer tipinde sayi2 değişkenini tanımla ve değer ver(20)
		 *3.Adım:sayi2 değişkeninin değerini sayi1 değişkeninin değeri ile değiştir(10)
		 *4.Adım:sayi1 değişkeninin değerini değiştir(30
		 *5.Adım:sayi2 değişkeninin çıktısını al
		 *
		 *3.Adımdaki kod satırı çalıştıktan sonra sayi2 değişkeninde herhangi bir güncelleme olmadığı için
		 *sayi2 değişkeninin değeri 10 olarak kaldı.
		*/
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		//çıktı ne olacak? cevap=10
		
		/*Neden 10? çünkü diziler referans tiptir. Değerler heapta tutuluyor.
		 *Kod çalışırken 3. satırında referans numaralarını birbirine eşitledik.
		 *sayilar2 dizisinin çıktısını alırken önce referans numarasına bağlı, heap kısmına gidiyor
		 *sonrasında ise yazdırıyo. Yaptığımız değişiklik heap bellekte olduğu için 4. satırda yaptığımız
		 *güncellemeyi de içeriyor.
		*/
	}

}
/*
 * Sürdürülebilir yazılım: Nesnel altyapıları öğrenmek ve anlamak önemlidir.
 * İnsanların ihtiyaçları her geçen gün değişmektedir. Bu nedenle yazdığımız programa
 * sürekli olarak yeni istek ve ihtiyaçlar eklenir. Sonuç olarak yazdığımız programlar
 * insanların istek ve ihtiyaçlarını bilgisayar desteği ile kolaylaştırmayı sağlar.
 * Alışveriş örneği...
 */

//Javada iş yapan herşey classtır.Nesnedir.
//classların ilk özelliği, gruplamadır.
//Bir programcı asla kısaltmalar kullanmamalıdır. Okunabilirliği azaltır. Örneğin; CustomerManager sınıfını
//CM olarak kısalttığımı düşünelim. Ben veya başka bir programcı sonrasında kodu düzenlemeye çalışırken onun ne olduğunu anlamayabilir.

//classlar referans tiplerdir.
//Stack ve heap
//CustomerManager customerManager = new CustomerManager();
//stack kısmı bir referans numarası alır ve heap kısmı bellekte o referans numarası ile ilgili bir kısım oluşturarak oraya erişimi kısıtlar(?)
//customerManager = customerManager2; customerManager'ın referans numarasının customerManager2 ile aynı olduğunu duyurduk.
//bu nedenle customerManager'a ayrılan heap kısmı GarbageCollector tarafından kısıtlaması kaldırılır, boş hale getirilir.