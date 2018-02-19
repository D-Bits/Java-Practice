
public class stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lineof13();
		lineofN(13, "*");
		System.out.println();
		lineofN(7, "*");
		lineofN(10, "*");
		//lineof7();
	}	
/*	public static void lineof13(){
		for (int i =1; i <=13; i++){
			System.out.println("*");
		}
	}
	
	public static void lineof7(){
		for (int i =1; i <=7; i++){
			System.out.println("*");
		}
	}*/
	
	public static void lineofN(int n, String S){
		for(int i = 1; i <= n; i++){
			System.out.print("S");
		}
	}

}
