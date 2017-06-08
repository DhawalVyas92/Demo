
public class DiskMain {

	public static void main(String[] args)
	{

		DiskMap PD = new DiskMap();

		DiskThread T1 = new DiskThread( "Thread - 1 ", PD );
		DiskThread T2 = new DiskThread( "Thread - 2 ", PD );

		T1.start();
		T2.start();

		// wait for threads to end
		try 
		{
			T1.join();
			T2.join();
		}
		catch( Exception e)
		{
			System.out.println("Interrupted");
		}

	}

}
