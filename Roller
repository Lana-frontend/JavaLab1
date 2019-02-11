package demo;

public class Roller {
  public int bevel;
  public int power;
  public String model;
  public int volumes;
  	private String name;
  	private double guarantee;
  		protected String color;
  		protected String address;
  			static int price;
  			
  			
 public Roller() {
    	        
    }  		
  	
	
 public Roller(int bevel, int power, String model, int volumes) {
     this();
     this.bevel = bevel;
     this.power = power;
     this.model = model;
     this.volumes = volumes;
     
 }
 
 public Roller(int bevel, int power, String model, int volumes , String name, double guarantee, String color, String address ) {
     this( bevel, power, model, volumes);
     this.name = name;
     this.guarantee = guarantee;
     this.color = color;
     this.address = address;
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
 
 
 public String toString() {
     String Info =
             "Width of mowing grass: "+bevel+"\n"+
             "Its Engine power is: "+power+"\n"+
             "Model of lawn mower: "+model+"\n"+
             "Volume of fuel tank : "+volumes+"\n"+
             "The name of the lawn mower: "+name+"\n"+
             "Product warranty: "+guarantee+"\n"+
             "Is it colourful?: "+color+"\n"+
             "Address of the manufacturer: "+address+"\n";
             
     return Info;
 }
 
 public static void printStaticPrice(){
     price = 5000;
     System.out.println("\n"+"The static price is: "+price);
 }
 
 public void resetValues(int bevel, int power, String model, int volumes , String name, double guarantee, String color, String address) {
     this.bevel = bevel;
     this.power = power;
     this.model = model;
     this.volumes = volumes;
     this.name = name;
     this.guarantee = guarantee;
     this.color = color;
     this.address = address;
 }

 
 
 
 public static void main(String[] args) {
	 Roller b1 = new  Roller(36, 550, "Bosch", 50, "Push", 12, "Green", "Lazarenka 40");
	 Roller b2 = new  Roller();
	 Roller b3 = new  Roller(40, 750, "Al-Ko", 65, "Lock", 24, "Black", "Shevchenka 5");
     System.out.println("First one: "+ "\n" + b1.toString());
     System.out.println("Second one: "+ "\n" + b2.toString());
     System.out.println("Third one: "+ "\n" + b3.toString());
     Roller objectForResetting = new  Roller();
     objectForResetting.resetValues(84, 950, "Bosch", 30, "I87B", 6, "Red", "Lychakivska 8");
     System.out.println("Resetted values: "+ "\n" +objectForResetting.toString());
     printStaticPrice();	 

	}
	
	
	

}
