package youTubeEgitim;

public class CustomerManager {
	private Customer customer;
	private Interface_CreditManager interface_CreditManager;
	public CustomerManager(Customer customer,Interface_CreditManager interface_CreditManager) {
		this.customer=customer;
		this.interface_CreditManager=interface_CreditManager;
	}


	public void save() {
		System.out.println("Müşteri kaydedildi : " + customer.getId());
	}
	public void delete() {
		System.out.println("Müşteri silindi : " + customer.getId());
	}
	public void giveCredit() {
		interface_CreditManager.calculate();
		System.out.println("Kredi verildi : " + customer.getId());
	}
}
