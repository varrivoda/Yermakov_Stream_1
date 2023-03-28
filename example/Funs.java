package example;

import java.util.List;
import java.util.ArrayList;

interface Reduction<T,R>{
	R reduce(R x, T y);
} 

interface Usloviye<T>{
	boolean fit(T x);
}

public class Funs{
	public static<T,R> R reduce(R startVal, List<T> args, Reduction<T,R> reduction){
		R res = startVal;
		for (int i=0;i<args.size(); i++)	res=reduction.reduce(res, args.get(i));
		return res;
	}
	
	public static <T> List<T> filter(List<T> args, Usloviye<T> usloviye){
		List<T> res = new ArrayList<T>();
		for(T arg:args) 
			if(usloviye.fit(arg)) 
				res.add(arg);
		return res;
	}
	
	/*
	public static int men(int ...args){
		int res=args[0];
		for(int i=1;i<args.length; i++){
			res-=args[i];
		}
		return res;
	}
	*/	
	
}