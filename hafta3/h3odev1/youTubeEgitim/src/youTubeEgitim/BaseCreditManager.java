package youTubeEgitim;

public abstract class BaseCreditManager implements Interface_CreditManager{

	@Override
	public abstract void calculate();

	public void save() {
		System.out.println("Kaydedildi.");
	}

}
