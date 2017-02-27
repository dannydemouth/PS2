package base;

public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public void setiValue(int iValue) {
		this.iValue = iValue;
	}
	public boolean isEven()
	{
		return iValue%2==1 ? false : true;
	}
	public boolean isOdd()
	{
		return iValue%2==1 ? true : false;
	}
	public boolean isPrime()
	{
		for(int i=2;i<iValue;i++){
			if(iValue%i==0)
				return false;
	}
	return true;
	}
	public static boolean isEven(int iValue)
	{
		return iValue%2==1 ? false : true;
	}
	public static boolean isOdd(int iValue)
	{
		return iValue%2==1 ? true : false;
	}
	public static boolean isPrime(int iValue)
	{
		for(int i=2;i<iValue;i++){
			if(iValue%i==0)
				return false;
		}
		return true;
	}

	public static boolean equals(int iValue)
	{
		MyInteger myint1 = new MyInteger(5);
		return iValue==5 ? true : false;
	}
	
	
}