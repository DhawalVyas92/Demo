import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class DiskMap implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Map<Long, String> diskTree=new TreeMap<>();

	public void insertElement(Long i,String s)
	{

		try
		{
			diskTree.put(i, s);
			System.out.println(diskTree);
		} 
		catch (Throwable e)
		{
			System.out.println("Exception Occured:  "+e);
			printDisk();
			System.exit(0);

		}
	}

	public void printDisk()
	{
		try{    
			File file = new File("D:\\outputfile.txt");  
			FileOutputStream f = new FileOutputStream(file);  
			ObjectOutputStream s = new ObjectOutputStream(f);          
			s.writeObject(diskTree);
			s.flush();    
			s.close();
		}
		catch (Exception e)
		{//
			System.err.println("Error: " + e.getMessage());
		}
	}


}
