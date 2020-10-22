package vehicles;
public class Vehicle {
	private int passangers; // number of passengers
	int fuelcap; //fuel capacity in gallons
	int mpg; // fuel consumption in miles per gallon
	Wheel rodaDianteiraDireira;
	RodaFerro15 rodaDianteiraEsquerda;
	public void setPassangers(int passangers) {
		this.passangers = passangers;
	}
	public void setFuelcap(int fuelcap) {
		this.fuelcap = fuelcap;
	}
	public void setMpg(int mpg) {
		this.mpg = mpg;
	}
	public void setRodaDianteiraDireira(Estepe15 estepe15) {
		this.rodaDianteiraDireira = estepe15;
		estepe15.equals(null);
	}
	public void setRodaDianteiraEsquerda(RodaFerro15 rodaDianteiraEsquerda) {
		this.rodaDianteiraEsquerda = rodaDianteiraEsquerda;
	}
	public void setRodaTraseiraDireita(RodaFerro15 rodaTraseiraDireita) {
		this.rodaTraseiraDireita = rodaTraseiraDireita;
		int x = rodaTraseiraDireita.getSize();
		rodaTraseiraDireita.concluiTeste();
		x = x();
	}
	public int x() {
		return 1;
	}
	public void setRodaTraseiraEsquerda(Wheel rodaTraseiraEsquerda) {
		this.rodaTraseiraEsquerda = rodaTraseiraEsquerda;
	}
	//Wheel rodaDianteiraEsquerda;
	Wheel rodaTraseiraDireita;
	Wheel rodaTraseiraEsquerda;
	 
	//Display the Range
	
	//Cosntruction for vehicles
	public Vehicle(int p, int f, int m){
		this.passangers = p;
		this.fuelcap = f;
		this.mpg = m;
	}
	public int range() {
		return mpg * fuelcap;
	}
	public static void drivelonger(double a, double b, double c) {
		System.out.println();
		if (a > b && a > c)   {
				System.out.println("The Minivan can you drive longer than anothers");
				return;
		}
		if (b > a && b > c) {
				System.out.println("The Sportcar can you drive longer than anothers");
				return;
		}
		else {
			System.out.println("The Bus can you drive longer than anothers");
		}
	}
	//Display the distance of vehicle with comsuption
	double fullneeded(int miles) {
		return (double) miles/this.mpg;
	}
}