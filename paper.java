/* This is a specially designed calcultor which is based on JAVA AWT and EVENT class.
	This calculator can calculate Fibonacci and Factorials of any number .
	This make this calculator separate from others
	This is made by 		HARSH KUMAR CHOUDHARY
					IT 19118034
					NATIONAL INSTITUTE OF TECHNOLOGY RAIPUR
*/
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
public class paper extends WindowAdapter {
	Button b1;
	TextField t1,t2,t3;
	Frame f;
	List l =new List(8,false);
	paper(){
	b1=new Button("Calculate");
	t1=new TextField();
	t2=new TextField();
	t3 =new TextField();
	f=new Frame();
	f.setVisible(true);
	f.setLayout(null);
	f.setSize(500,500);
	l.add("+");
	l.add("-");l.add("*");
	l.add("/");
	l.add("FACT");
	l.add("FIB");
	l.add("POW");
	l.add("LOG");
	final Label l1=new Label("CALCULATOR");
	l1.setAlignment(Label.CENTER);
	l1.setSize(500,100);
	final Label l2=new Label("firstnumber");
	l2.setBounds(300,100,70,20 );
	final Label l3 =new Label("secondnumber");
	l3.setBounds(300,150,80,20);
	final Label l4=new Label("result");
	l4.setBounds(300,250,70,20);
	f.add(l3);f.add(l4);	t1.setBounds(100,100,150,20);
	t2.setBounds(100,150,150,20);
	t3.setBounds(100,250,150,20);
	b1.setBounds(200,400,50,50);
	l.setBounds(100,300,50,150);
	f.add(t1);f.add(t2);f.add(t3);f.add(b1);f.add(l1);f.add(l);
	f.add(l2);f.addWindowListener(this);
	b1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e)
	{
		String s1=t1.getText();
		Double x=Double.parseDouble(s1);
		String s3=l.getItem(l.getSelectedIndex());
		switch(s3)
		{
			case "+":	{
						
						String s2=t2.getText();
						
						Double y=Double.parseDouble(s2);
		
						x=x+y;
						s1=Double.toString(x);
						t3.setText(s1);
						break;
					
					}
			case "-":   {
						String s2=t2.getText();
						
						Double y=Double.parseDouble(s2);
		
						x=x-y;
						s1=Double.toString(x);
						t3.setText(s1);
						break;
			}
			case "*":	{String s2=t2.getText();
						
						Double y=Double.parseDouble(s2);
						x=x*y;
						s1=Double.toString(x);
						t3.setText(s1);
						break;
			}
			case "/":   {
						String s2=t2.getText();
						
						Double y=Double.parseDouble(s2);
						x=x/y;
						s1=Double.toString(x);
						t3.setText(s1);
						break;
			}
			case "FACT": 
						int ans=1;
						while(x>1)
						{ans*=x;--x;}
						s1=Double.toString(ans);
						t3.setText(s1);
						break;

			case "FIB":
						{int a=0,b=1;
						int y=0;;
						for(int i=1;i<x;++i)
						{y=a+b;b=a;a=y;}
						s1=Integer.toString(y);
						t3.setText(s1);
						break;
						}
			case "POW": String s2=t2.getText();
						int y =Integer.parseInt(s2);
						Double r=1.0;
						while(y>0)
						{r*=x;--y;}
						s1=Double.toString(r);
						t3.setText(s1);
						break;
			case "LOG":	x=Math.log(x);
						s1=Double.toString(x);
						t3.setText(s1);
						break;
			
			}
		}
		
	
	});
	
	}
	public void windowClosing(WindowEvent e){
	f.dispose();
	}
	public static void main(String[] args){
		new paper();
	}
}
/*we have to add some general instruction in the calculatethey are first to enter which num to calculate fib fact and log and how to enter no for power
also we have to mention that the log is of e base not 10;
*/
