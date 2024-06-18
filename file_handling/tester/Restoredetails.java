package tester;

import java.util.Map;
import java.util.Scanner;

import com.app.core.Item;

public class Restoredetails {
	public static void main(String[]args)
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("enter file name to restore the data ");
			Map<String, Item>map=IOutils.IoUtils.readDetails(sc.next());
			System.out.println("student details ");
			map.forEach((k,v)->System.out.println(v));
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("restore over");
	}

}
