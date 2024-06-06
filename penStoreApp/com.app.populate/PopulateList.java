package com.app.populate;
import com.app.core.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PopulateList {
	
	public static List<PenStore>populateStore()
	{

		PenStore p1=new PenStore(0, "apsara	", "grey", "wood", 20, com.app.validations.Validations.parseDate("2024-01-01"), com.app.validations.Validations.parseDate("2024-03-03"), 50, 10);
		PenStore p2=new PenStore(2, "apsara	", "black..", "wood", 20, com.app.validations.Validations.parseDate("2024-01-01"), com.app.validations.Validations.parseDate("2024-03-03"), 50, 10);
		PenStore[] product= {p1,p2};
		List<PenStore>list=new ArrayList<>();
		for(PenStore p: product)
			list.add(p);
		return list;
		
	}

}
