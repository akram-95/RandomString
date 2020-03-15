
import java.util.*;
public class generatedRandomString {
	//@Autor Akram Chorfi
	/* method to generate Random Char A->Z  */
	public static int rand1(){
		int min=65;
		int max=90;
		Random rand=new Random();
		return rand.nextInt(max-min)+min;
	}
	/* method to generate Random Char a->z  */
	public static int rand2(){
		int min=97;
		int max=122;
		Random rand=new Random();
		return rand.nextInt(max-min)+min;
	}
	/* methode to generate Random char a->z or A->Z  */
	public static int getrand(){
		Random rand=new Random();
		boolean value=rand.nextBoolean();
		if(value){
			return rand1();
		}
		return rand2();
	}
	public static int length(String res){
		return res.length();
	}
public static String input(int length){
String result="";
for(int i=0;i<length;i++){
	Random rand=new Random();
	result=result+(char)getrand();
}
return result;
}
public static void main(String [] args){
	String cont="yes";
	while(cont.equals("yes")){
	Scanner sc=new Scanner(System.in);
	Scanner scan=new Scanner(System.in);
	System.out.println("Give the length of String please : ");
	String re=input(scan.nextInt());
	System.out.println("the random string is " + re);
	System.out.println("the length of string is " + length(re));
	System.out.println("would you like to continue   yes/no");
	cont=sc.nextLine();
}
	
}
}