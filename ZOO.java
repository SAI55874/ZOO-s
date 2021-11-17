package Sai;


import java.util.Scanner;


public class ZOO {

	public static void main(String[] args) {
		String x="Z";
		String y="O";
		String w="0";
		boolean areEqual=true;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter ur word : ");
		String wordString=scanner.next();
		
		for(int i=0;i<=5;i++) {
			String wordZ=new String(new char[i]).replace("\0",x);
			String wordO=new String(new char[i]).replace("\0",y.repeat(2));
			
			w=wordZ+wordO;
			
			areEqual=w.equals(wordString);
			if (areEqual) {
				System.out.println("yes ");
			}	
			
		}
		
		
		
		
		
	}

}
