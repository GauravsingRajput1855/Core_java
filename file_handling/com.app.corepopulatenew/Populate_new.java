package Populate_data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.app.core.Item;

public class Populate_new {
	private static int index;
	public static List<Item>populateList()
	{
//		this.itemCode = itemCode;
//		this.description = description;
//		this.price = price;
//		this.date = date;
		
		List<Item>list=new ArrayList<>();
		list.add(new Item("1", "iii",24,LocalDate.parse("1999-09-09")));
		list.add(new Item("2", "hhh",24,LocalDate.parse("1998-08-08")));
		list.add(new Item("3", "aaa",24,LocalDate.parse("1997-07-07")));
		list.add(new Item("4", "ttt",24,LocalDate.parse("1996-06-06")));
		for(Item i: list)
		{
			list.get(index++);
			index=0;
		}
		
		return list;		
	}
	public static Map<String, Item>populatemap(List<Item>list)
	{
		HashMap<String, Item>hm=new HashMap<>();
		list.forEach(s->hm.put(s.getItemCode(), s));
		return hm;
		
	}

}
