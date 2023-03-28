package example;

import java.util.List;
import java.util.ArrayList;

interface Reduction<T>{
	T reduce(T x, T y);
} 

interface Usloviye<T>{
	boolean fit(T x);
}

interface Changer<T,R>{
	R change(T x);
}

public class Funs{
	
	public static <T,R> List<R> map(List<T> args, Changer<T,R> changer){
		List<R> res = new ArrayList<>();
		for(T arg:args) 
			res.add(changer.change(arg));
		return res;
	}
	
	public static <T> List<T> filter(List<T> args, Usloviye<T> usloviye){
		List<T> res = new ArrayList<T>();
		for(T arg:args) 
			if(usloviye.fit(arg)) 
				res.add(arg);
		return res;
	}
	
	public static<T> T reduce(T startVal, List<T> args, Reduction<T> reduction){
		T res = startVal;
		for (int i=0;i<args.size(); i++)	res=reduction.reduce(res, args.get(i));
		return res;
	}
}