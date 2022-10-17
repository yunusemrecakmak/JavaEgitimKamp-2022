package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
//		OgretmenCreditManager ogretmenCreditManager = new OgretmenCreditManager();
//		ogretmenCreditManager.Hesapla();
		CreditUI creditUI = new CreditUI();
		creditUI.krediHesapla(new AskerCreditManager());
	}

}
