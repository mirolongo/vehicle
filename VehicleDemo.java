package vehicles;

class VehicleDemo{
	public static void main(String args[]) {
		Vehicle minivan = new Vehicle(7, 16, 9);
		minivan.setRodaDianteiraEsquerda(new RodaFerro15(16, 10));
		minivan.setRodaDianteiraDireira(new Estepe15());
		Vehicle sportcar = new Vehicle(2, 14, 8);
		Vehicle bus = new Vehicle(40, 100, 6);
		Vehicle longbuss = bus;
		double gallons;
		int dist = 252;
		Estepe15 estepe15 = new Estepe15();
		estepe15.x = 1;
		//int range1, range2;
		/**Assign values to fields in minivan
		//minivan.passangers = 7;
		//minivan.fuelcap = 16;
		//minivan.mpg = 21;
		//Assign values to fields in sportcars
		//sportcar.passangers = 2;
		//sportcar.fuelcap = 14;
		//sportcar.mpg = 12;
		**/
		gallons = minivan.fullneeded(dist);
		double minivanGallons = gallons;
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel");
		gallons = sportcar.fullneeded(dist);
		double sportcarGallons = gallons;
		System.out.println("To go " + dist + " miles sportcar needs " + gallons + " gallons of fuel");
		gallons = bus.fullneeded(dist);
		double busGallons = gallons;
		System.out.println("To go " + dist + " miles bus needs " + gallons + " gallons of fuel");
		double longbussGallons = gallons;
		System.out.println("To go " + dist + " miles Long Bus needs " + gallons + " gallons of fuel");
		Vehicle.drivelonger(minivanGallons, sportcarGallons, busGallons);
		
		//compute the range assuming a full tank of gas
		
		/**Get the ranges
		range1 = minivan.range();
		range2 = sportcar.range();
		
		System.out.println("Minivan can carry " + minivan.passangers + " with range of " + range1 + " Miles");
		
		System.out.println("SportCar can carry " + sportcar.passangers + " witn range of " + range2 + " Miles");
**/
	}
}