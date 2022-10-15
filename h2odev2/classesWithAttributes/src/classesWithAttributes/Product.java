package classesWithAttributes;

public class Product {
	public Product(int _id,String _name,String _description,double _price,int _unitsInStock,String _renk) {
		System.out.println("Yapıcı Blok Çalıştı!");
		this._id = _id;
		this._name = _name;
		this._description = _description;
		this._price = _price;
		this._unitsInStock = _unitsInStock;
		this._renk = _renk;
	}
	public Product() {
		
	}
	//Yukarıdaki işleme overloading adı verilir. Aynı isimli ancak farklı parametrelere sahip metodların kullanımını sağlar.
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _unitsInStock;
	private String _renk;
	private String _kod;
	//attribute veya field olarak adlandırılır
	
	//public ve private farkı: public herhangi bir yerden erişilebilir. private yalnızca tanımlandığı
	//blokta geçerlidir.
	//getter ve setterlar encapsulation'un en önemli kısmı
	//yalnızca getter kurulursa read only, yalnızca set kurulursa write only
	public int getId() {
		return _id;
	}
	
	public void setId(int id) {
		/*this.id = id; this ifadesi içerisinde bulunduğum sınıfa yönelimdir.
		 * bu da kötü kullanımdır. programcı hatalarına açık bırakıyor. bunun yerine değişken adımızın başına
		 * ayırt edici bir işaret koymak daha iyi bir çözüm olabilir.*/
		this._id = id;
		
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public int get_unitsInStock() {
		return _unitsInStock;
	}

	public void set_unitsInStock(int _unitsInStock) {
		this._unitsInStock = _unitsInStock;
	}

	public String get_renk() {
		return _renk;
	}

	public void set_renk(String _renk) {
		this._renk = _renk;
	}

	public String get_kod() {
		return this._name.substring(0, 1) + _id;
	}
//idenin isimlendirmesi ile çalışmak önemli
	
}
