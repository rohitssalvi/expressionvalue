package expressionvalue;

public class Expressionval {
public static void main(String[] args) {
	int x=5,y=10;
	
	
	int result1=x+y*2;
	int result2=x-y+2;
	int result3=(x+y)*2;
	int result4=y%x;
	System.out.println("First Expression x+y*2 value: "+result1);
	System.out.println("First Expression x-y+2 value: "+result2);
	System.out.println("First Expression (x+y)*2 value: "+result3);
	System.out.println("First Expression y%x value: "+result4);
}
}
