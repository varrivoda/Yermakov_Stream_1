package example;

import java.util.List;
//import java.util.ArrayList;

import static example.Funs.*;

public class Main{
	
	public static void main(String[] args) throws Exception {
		List<String> lst = List.of("aa", "bb", "wwwww", "vvvvvv");
		
		System.out.println(
			reduce("", filter(lst, x->x.length()>3), (x,y)->x+y)
		);
	}
}