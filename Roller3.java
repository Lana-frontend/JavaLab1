package demo;

public class Roller {
	protected int bevel;
	protected int power;
	
	private int volumes;
	private String name;
	private double guarantee;
	private String model;

	private static int price;

	public Roller() {
		this(0,0,null,0);
	}

	public Roller(int bevel, int power, String model, int volumes) {
		this(bevel, power, model, volumes, null,0);


	}

	public Roller(int bevel, int power, String model, int volumes, String name, double guarantee) {
		this.bevel = bevel;
		this.power = power;
		this.model = model;
		this.volumes = volumes;
		this.name = name;
		this.guarantee = guarantee;
	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGuarante() {
		return guarantee;
	}

	public void setGuarantee(double guarantee) {
		this.guarantee = guarantee;
	}

	

	@Override
	public String toString() {
		return "Roller [bevel=" + bevel + ", power=" + power + ", model=" + model + ", volumes=" + volumes + ", name="
				+ name + ", guarantee=" + guarantee   + "]";
	}

	public static void printStaticPrice() {
		price = 5000;
		System.out.println("\n" + "The static price is: " + price);
	}

	public void resetValues(int bevel, int power, String model, int volumes, String name, double guarantee,
			String color, String address) {
		this.bevel = bevel;
		this.power = power;
		this.model = model;
		this.volumes = volumes;
		this.name = name;
		this.guarantee = guarantee;
		
	}

	public static void main(String[] args) {
		Roller rollerBosch = new Roller(36, 550, "Bosch", 50, "Push", 12 );
		Roller roller = new Roller();
		Roller rollerAlko = new Roller(40, 750, "Al-Ko", 65, "Lock", 24);
		System.out.println("First one: " + "\n" + rollerBosch.toString());
		System.out.println("Second one: " + "\n" + roller.toString());
		System.out.println("Third one: " + "\n" + rollerAlko.toString());
		Roller roller_bosch1 = new Roller();
		roller_bosch1.resetValues(84, 950, "Bosch", 30, "I87B", 6, "Red", "Lychakivska 8");
		System.out.println("Resetted values: " + "\n" + roller_bosch1.toString());
		printStaticPrice();

	}

}
