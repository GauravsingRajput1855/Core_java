package tester;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Item;

import IOutils.IoUtils;
import Populate_data.Populate_new;
import static IOutils.IoUtils.writeDetails;

public class StoreDetails {
	public static void main(String[] args)
	{
		try(Scanner sc=new Scanner(System.in))
		{
			Map<String, Item>map=Populate_new.populatemap(Populate_new.populateList());
			System.out.println("enter a file name to store a details");
			writeDetails(map, sc.next());
			System.out.println("data stored");
			
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("tester over ");
	}
	

}
