package day11;

public class Alpha extends Thread //V V V Imp class
{
	@Override
	public void run() {
		for(int i=1;i<=1000;i++)
			System.out.println(i);
	}
}