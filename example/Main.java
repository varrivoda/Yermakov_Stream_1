package example;

import java.util.List;
//import java.util.ArrayList;

import static example.Funs.*;

public class Main{
	
	public static void main(String[] args) throws Exception {
		List<String> lst = List.of("aa", "bb");
		
		System.out.println(
			action((x,y)->x+y, lst)
		);
	}
}