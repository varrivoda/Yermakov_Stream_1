package example;

import java.util.List;
//import java.util.ArrayList;

import static example.Funs.*;

public class Main{
	
	public static void main(String[] args) throws Exception {
		List<String> lst = List.of("aa", "bb", "wwwww", "vvvvvv");
		
		System.out.println(
			new Funs<>(lst)
				.filter(x->x.length()>3)
				.map(x->Integer.valueOf(x.length()).toString())
				.reduce("", (x,y)->x+y)
		);	
		
/*		reduce("", 
				map(
					filter(lst, x->x.length()>3), 
					x->Integer.valueOf(x.length()).toString()
				), 
				(x,y)->x+y
			)
		);
*/

	}
}