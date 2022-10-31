package introduction;

public class car {
	private double fuelEfficiency;
	private double fuel;
	
	public car(double fuelEff)
	{
		fuelEfficiency=fuelEff;
		fuel=0;
	}
	public void addGas(double f)
	{
		fuel=f;
	}
	public void drive(double distance)
	{
		double f1;
		f1= distance / fuelEfficiency;
		fuel = fuel - f1;
	}
	public double getGasInTank()
	{
		return fuel;
	}
	public static void main(String args[])
	{
		car mHybrid = new car(12);
		mHybrid.addGas(100);
		mHybrid.drive(60);
		System.out.println("the gas left in tank is:");
		double gasLeft = mHybrid.getGasInTank();
		System.out.println(gasLeft);
	}
}



	

