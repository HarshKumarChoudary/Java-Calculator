/* This is a specially designed calcultor which is based on JAVA AWT and EVENT class.
	This calculator can calculate Fibonacci, Factorials, nth root and many more of any number .
	This make this calculator separate from others
	This is made by 	
				**	HARSH KUMAR CHOUDHARY			**
				**	IT 19118034 				**
				**	NATIONAL INSTITUTE OF TECHNOLOGY RAIPUR **
*/
/*
					General instructions 
					
					* FACT: to find the factorial of a given number the number shoud be entered in text field of first number
					
					* FIB:  to find fibonacci tern of given number enterd in first text fields
					
					* POW: to find power of given number to the number in second field
							for example
								first field : 2
								second field : 3
								result = 8(2^3)
					
					* LOG : to find the log of any number in first field to natural base

					* PRIME : to tell whether the number enterd in first text field is prime or not
					
					* COMBIN & PERMU refers to combination and permutation of two given numbers 
							here first number refer to n and secondnumberrefers to r for nPr or nCr;
					
					* for sine cosine or tangent only enter the first number 
					
					* for NTHROOT enter the first number which is the number whose root is to be ound and the second number 
							is the nth term of rot
							first number =81
							second number = 4
							ans =3 (fouth root of 81 is 3)
					
					* for rest where two numbers are required enter two numbers
					
					* THERE IS A TOTAL OF 18 FUNCTIONS AND AONG THEM 10 ARE SPECIAL ONE 
*/		
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
public class calculator extends WindowAdapter {
	
	//Declarations of components in container : Button,TextFields and frame and list.
	// Labels are also declared 
	
	Button b1;
	TextField t1,t2,t3;
	Frame f;
	List l =new List(18,false);
	Label label2=new Label("use only first number for fib ,log, fact and Prime.Here Log is natural log");
	Label l1=new Label("CALCULATOR");
	Label label5=new Label("firstnumber");
	Label label3 =new Label("secondnumber");
	Label label4=new Label("result");
	
	//counstructor of class;
	
	calculator(){
		// initialization of all fields
		b1=new Button("Calculate");
		t1=new TextField();
		t2=new TextField();
		t3 =new TextField();
		f=new Frame("CALCULATOR");
		
		//addition of properties to the fields
		//for frame;
		f.setVisible(true);
		f.setLayout(null);
		f.setSize(500,500);
		f.addWindowListener(this);
		
		//for list we are initializating it with the names of functions the calculator can perform
		l.setBounds(10,200,70,300);
		
		l.add("+");
		l.add("-");
		l.add("*");
		l.add("/");
		l.add("FACT");
		l.add("FIB");
		l.add("POW");
		l.add("NTHROOT");
		l.add("PRIME");
		l.add("SIN");
		l.add("COS");
		l.add("TAN");
		l.add("HCF");
		l.add("LCM");
		l.add("COPRM");
		l.add("COMBIN");
		l.add("PERMU");
		l.add("LOG");
		
		// adding properties to the labels 
		l1.setAlignment(Label.CENTER);
		l1.setSize(500,100);
		label5.setBounds(300,100,70,20 );
		label3.setBounds(300,150,80,20);
		label4.setBounds(300,250,70,20);
		label2.setBounds(50,200,450,50);
		
		// adding properties to the textafileds and buttons
		t1.setBounds(100,100,150,20);
		t2.setBounds(100,150,150,20);
		t3.setBounds(100,250,150,20);
		b1.setBounds(200,400,50,50);
		
		//adding components to the contianer frame
		f.add(l);
		f.add(l1);
		f.add(label3);
		f.add(label4);
		f.add(label5);
		f.add(label2);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
	
		
		//addition of event handling properties to button;
		b1.addActionListener(new ActionListener(){
			//overriding the Actionperformed class
				public void actionPerformed(ActionEvent e)
				{
					//getting input from textfields
					String s1=t1.getText();
					Double x=Double.parseDouble(s1);
					String s3=l.getItem(l.getSelectedIndex());
					//using switch cases for list
					switch(s3)
						{
										//code fo raddition and display
							case "+":	{
						
										String s2=t2.getText();
										Double y=Double.parseDouble(s2);
										x=x+y;
										s1=Double.toString(x);
										t3.setText(s1);
										break;
					
										}
										//code for substraction and display
							case "-":   {
										
										String s2=t2.getText();
										Double y=Double.parseDouble(s2);
										x=x-y;
										s1=Double.toString(x);
										t3.setText(s1);
										break;
										
										}
										// code for multiplication and display
							case "*":	{
										
										String s2=t2.getText();
										Double y=Double.parseDouble(s2);
										x=x*y;
										s1=Double.toString(x);
										t3.setText(s1);
										break;
										
										}
										//code for division and display
							case "/":   {
										String s2=t2.getText();
										Double y=Double.parseDouble(s2);
										x=x/y;
										s1=Double.toString(x);
										t3.setText(s1);
										break;
										}
										//code for finding factorial of given number and display
							case "FACT": {
										int ans=1;
										while(x>1)
										{ans*=x;--x;}
										s1=Double.toString(ans);
										t3.setText(s1);
										break;
										}	
										// code for finding the fibonacci number upto given term and display
							case "FIB": {
										int a=0,b=1;
										int y=0;;
										for(int i=1;i<x;++i)
										{y=a+b;b=a;a=y;}
										s1=Integer.toString(y);
										t3.setText(s1);
										break;
										}
										// cade to find the power of any two  number and display
							case "POW": {
										String s2=t2.getText();
										int y =Integer.parseInt(s2);
										Double r=1.0;
										while(y>0)
										{r*=x;--y;}
										s1=Double.toString(r);
										t3.setText(s1);
										break;
										}
										// code the logarithm of agiven number to the natural base
										// code to tell whether a number is prime or not
							case "PRIME": {
											int ok=0;
											if(x!=1||x!=2)
											for(int i=2;i<x;++i)
											{if(x%i==0){ok=1;break;}}
											if(x==2||ok==0)
												s1="YES";
											else
												s1="NO";
											if(x==1)
												s1="NO";
											t3.setText(s1);
											break;
										}
									//NTHROOT finding code
							case "NThROOT":{
								        Double y=  Double.parseDouble(t2.getText());
										x=Math.log(x);
										x/=y;
										x=Math.pow(2.718281828,x);
										x=Math.ceil(x);
										s1=Double.toString(x);
										t3.setText(s1);
										break;}
						
			
							//case for finding log
							case "LOG":{
										x=Math.log(x);
										s1=Double.toString(x);
										t3.setText(s1);
										break;
										
										}
										//CASE FOR FIDING SINE
							case "SIN":{
										x=Math.sin(x);
										s1=Double.toString(x);
										t3.setText(s1);
										break;
										}
										//case for cosine
							case "COS":{
										x=Math.cos(x);
										s1=Double.toString(x);
										t3.setText(s1);
										break;
										}
										//case for tangent
							case "TAN":{
										x=Math.tan(x);
										s1=Double.toString(x);
										t3.setText(s1);
										break;
										}
										//case for finding coprime between two numbers
							case "COPRM":{
										Double a=x,b=Double.parseDouble(t2.getText());
										Double y;
										while(true)
										{
											if (a == 0)
											{y=b;break;}
											if(b == 0)
											{y=a;break;}	
											if (a == b)
											{y= a;break;}
											if (a > b)
												a=a-b; 
											b=b-a;
										}
										if(y==1)
											s1="YES";
										else
											s1="NO";
										t3.setText(s1);
										break;
										}
										// findign HCF of two given numbers
							case "HCF":{Double a=x,b=Double.parseDouble(t2.getText());
										Double y;
										while(true)
										{
											if (a == 0)
											{y=b;break;}
											if(b == 0)
											{y=a;break;}	
											if (a == b)
											{y= a;break;}
											if (a > b)
												a=a-b; 
											b=b-a;
										}
										s1=Double.toString(y);
										t3.setText(s1);
										break;
										}
										// findign LCM] of two given numbers
							case "LCM":{
										Double a =x,b=Double.parseDouble(t2.getText());
										Double y;
										while(true)
										{
											if (a == 0)
											{y=b;break;}
											if(b == 0)
											{y=a;break;}	
											if (a == b)
											{y= a;break;}
											if (a > b)
												a=a-b; 
											b=b-a;
										}
										y=(x*Double.parseDouble(t2.getText()))/y;
										s1=Double.toString(y);
										t3.setText(s1);
										break;
										}
									// findign COMBIANTION OF nCr of two given numbers
							case "COMBIN":{
										Double z1,z2;z1=x;
										Double ans=1.0;
										while(x>1)
										{ans*=x;--x;}
										Double ans2=1.0;
										Double y= Double.parseDouble(t2.getText());
										z2=y;Double ans3=1.0;
										while(y>1)
										{ans2*=y;--y;}
										z1=z1-z2;
										while(z1>1)
										{ans3*=z1;--z1;}
										y=ans/(ans3*ans2);
										s1=Double.toString(y);
										t3.setText(s1);
											break;
										}
										// findign permutation nPr of two given numbers
							case "PERMU":{
										Double ans=1.0;
										while(x>1)
										{ans*=x;--x;}
										Double ans2=1.0;
										Double y= Double.parseDouble(t2.getText());
										while(y>1)
										{ans2*=y;--y;}
										y=ans/ans2;
										s1=Double.toString(y);
										t3.setText(s1);
										break;
										}
						
					
						}
		
				}
		});
	
		}
	//code for window closing action to be performed
	public void windowClosing(WindowEvent e){
	f.dispose();
	}
	
	// main method to run the instance of the calculator
	public static void main(String[] args){
		new calculator();
	}
	//end
}
