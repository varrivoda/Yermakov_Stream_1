package example;

public class Funs{
	public static int action(char ch, int ...args){
		int res=0;
		if(ch == '+'){
			for (int arg:args)	res+=arg;
		} else if (ch == '-'){
			res=args[0];
			for(int i=1;i<args.length; i++)	res-=args[i];
		}	
		
		return res;
	}
	
	public static int men(int ...args){
		int res=args[0];
		for(int i=1;i<args.length; i++){
			res-=args[i];
		}
		return res;
	}	
}