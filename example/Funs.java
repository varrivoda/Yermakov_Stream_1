package example;

interface Action<T>{
	T act(T x, T y);
} 

public class Funs{
	public static<T> T action(Action<T> action, T ...args){
		T res=args[0];
		for (int i=1;i<args.length; i++)	res=action.act(res, args[i]);
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