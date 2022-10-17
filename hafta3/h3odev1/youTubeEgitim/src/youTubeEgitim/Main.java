package youTubeEgitim;

public class Main {

	public static void main(String[] args) {
//		
//		  int sayi1 = 10; 
//		  int sayi2 = 20; 
//		  sayi1 = sayi2; 
//		  sayi2 = 100;
//		  
//		  System.out.println(sayi1);// Çıktı ne olur? cevap:20
//		  
//		  int[] sayilar1 = {1,2,3}; 
//		  int[] sayilar2 = {10,20,30}; 
//		  sayilar1 = sayilar2;
//		  sayilar2 [0]=1000;
//		  
//		  System.out.println(sayilar1[0]);//Çıktı ne olur? cevap 1000
//		CreditManager creditManager = new CreditManager();
//		creditManager.save();
//		creditManager.calculate();
//
//		Customer customer = new Customer(); // instance creation, örneğini oluşturmak.
//		customer.setId(1);
//		customer.setCity("Ankara");
//
//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.save();
//		customerManager.save();
//		customerManager.save();
//		customerManager.save();
//
//		Company company = new Company();
//		company.setTaxNumber("6666666666");
//		
//		CustomerManager customerManager2 = new CustomerManager(new Person() );
//		Person person = new Person();
//		person.setNationalIdendity("98989898989898");
//		person.setFirstName("Emre");
//		person.setLastName("Çakmak");
//		
//		Customer c1 = new Customer();
//		Customer c2 = new Person ();
//		Customer c3 = new Company();
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
		CustomerManager customerManager2 = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager2.giveCredit();
		customerManager.save();
	}

}
