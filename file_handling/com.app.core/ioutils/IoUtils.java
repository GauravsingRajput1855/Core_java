package IOutils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Item;

public class IoUtils {
	
	public static void writeDetails(Map<String, Item>map,String filename)throws IOException
	{
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename)))
		{
			out.writeObject(map);
		}
	}
	//-------------------------------
	public static Map<String, Item>readDetails(String filename)throws IOException,ClassNotFoundException
	{
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename)))
		{
			return (Map<String, Item>)in.readObject();
		}
	}

}
