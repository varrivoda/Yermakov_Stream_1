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

public class Funs<T>{
	List<T> args;
	
	public Funs(List<T> args){
		this.args = args;
	}
	
	public <R> Funs<R> map(Changer<T,R> changer){
		List<R> res = new ArrayList<>();
		for(T arg:args) 
			res.add(changer.change(arg));
		return new Funs(res);
	}
	
	public Funs<T> filter(Usloviye<T> usloviye){
		List<T> res = new ArrayList<T>();
		for(T arg:args) 
			if(usloviye.fit(arg)) 
				res.add(arg);
		return new Funs(res);
	}
	
	public T reduce(T startVal, Reduction<T> reduction){
		T res = startVal;
		for (int i=0;i<args.size(); i++)	res=reduction.reduce(res, args.get(i));
		return res;
	}
}