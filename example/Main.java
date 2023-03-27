package example;

import java.util.List;
import static example.Funs.*;

public class Main{
//	List<String> lst = new ArrayList("aa", "bb");
	
	public static void main(String[] args){
		System.out.println(
			action('-', 10, 2, action('+', 3, 3))
		);
	}
}