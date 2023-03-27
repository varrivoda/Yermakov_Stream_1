package example;

interface Action{
	int act(int x, int y);
}

public class Funs{
	public static int action(Action action, int ...args){
		int res=args[0];
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