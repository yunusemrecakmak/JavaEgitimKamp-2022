package interfaces;

public class SqlServerCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void add() {
		System.out.println("Sql Server eklendi");
	}

}
