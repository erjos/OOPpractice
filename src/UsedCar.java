
public class UsedCar extends Car{
	//field
	private int miles;
	
	//constructor
	public UsedCar(String make, String model, int year, double price, int miles){
	setMake(make);
	setModel(model);
	setYear(year);
	setPrice(price);
	setMiles(miles);
	}

	
	//getters and setters
	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}
}
