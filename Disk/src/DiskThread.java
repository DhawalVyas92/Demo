
public class DiskThread extends Thread
{

	private Thread t;
	private String threadName;
	DiskMap  Dm;

	DiskThread( String name,  DiskMap  Dm) {
		threadName = name;
		this.Dm = Dm;
	}

	public void run()
	{
		synchronized(Dm)
		{
			for (long i = 0; i < 1000000000; i++) 
			{
				Dm.insertElement(i,"Thread-"+i);
			}
		}
		System.out.println("Thread " +threadName+  " exiting.");
	}

	public void start () {
		System.out.println("Starting " +  threadName );
		if (t == null) {
			t = new Thread (this, threadName);
			t.start ();
		}
	}

}
