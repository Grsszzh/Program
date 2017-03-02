package ER;

import java.util.Scanner;


public class Sisr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x=0;
		 
         System.out.println("请输入需要生成题目的数量"+x);
         Scanner in=new Scanner(System.in);
         x=in.nextInt();
         System.out.println("进行分数练习"+"1.是"+"0否");
         int h;
         h=in.nextInt();
         if(h==0){
             for(int i=0;i<x;i++){
     	        int a= (int)(Math.random()*100)+1;
			    int b= (int)(Math.random()*100)+1;
			    int n= (int)(Math.random()*4)+1;
     			if(n==1){
     				System.out.println(a+"+"+b);
     			}
     			if(n==2){
     				if(a>b){     			
     				System.out.println(a+"-"+b);
     				}
     				else{
     					System.out.println(b+"-"+a);
     				}
     			}
     			if(n==3){
     				System.out.println(a+"*"+b);
     			}
     			if(n==4){
     				System.out.println(a+"÷"+b);
     			}       		
      }
         }
         else if(h==1){
        	 for(int i=0;i<x;i++){
     	        int a= (int)(Math.random()*100)+1;
			    int b= (int)(Math.random()*100)+1;
			    int c= (int)(Math.random()*100)+1;
			    int d= (int)(Math.random()*100)+1;
			    int n= (int)(Math.random()*4)+1;
			   
     			if(n==1){
     				System.out.println(a+"/"+b+"+"+c+"/"+d);
     			}
     			if(n==2){
     				if(a/b>c/d){     			
     				System.out.println(a+"/"+b+"-"+c+"/"+d);
     				}
     				else{
     					System.out.println(c+"/"+d+"-"+a+"/"+b);
     				}
     			}
     			if(n==3){
     				System.out.println(a+"/"+b+"*"+c+"/"+d);
     			}
     			if(n==4){
     				System.out.println(a+"/"+b+"÷"+c+"/"+d);
     			} 
			    
      }
         }
         
	}

}

