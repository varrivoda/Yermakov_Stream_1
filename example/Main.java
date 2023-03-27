package example;

import java.util.List;
import static example.Funs.*;

public class Main{
//	List<String> lst = new ArrayList("aa", "bb");
	
	public static void main(String[] args) throws Exception {
		System.out.println(
			action((x,y)->x+y, "aa", "bb")
		);
	}
}