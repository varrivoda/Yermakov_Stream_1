






//ФП это программирование в видезапроса результата
пример из Лиспа:
print(+ 2, 3,(* 4, 5 (- 7,8))) 

напишем класс Funs, который будет содержать набрр каких-н методов,
например метод для сложения и для вычитания. 
особенность в том,что он должен принимать варарг

class Funs{
	public static int sum(int ...args){
		int sum=0;
		for (int i:agrs)
			sum+=args[i];
	}
	
	public static int men(int ...agrs){
		int res=args[0];
		for(i=1;i<agrs.length(); i++){
			res-=args[i];
		}
		return res;
	}

попробуем объедтнить эти действия в одно
для уточнения действия будем передавать char ch

public static action (char ch, int ...args)
и делать условие : если ch = '+', если ch = '-'

выглядит ужасно. 
