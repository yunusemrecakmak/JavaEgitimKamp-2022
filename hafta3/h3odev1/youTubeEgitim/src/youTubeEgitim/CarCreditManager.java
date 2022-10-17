package youTubeEgitim;

public class CarCreditManager extends BaseCreditManager implements Interface_CreditManager{

	@Override
	public void calculate() {
		System.out.println("Araba Kredisi hesaplandı");
	}
    public void save() {}
}
