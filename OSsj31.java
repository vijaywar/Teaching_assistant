package pack1;
import java.util.Scanner;
class OSsj extends Thread
{public static Scanner vi= new Scanner(System.in);
static OSsj31 t1=new OSsj31(); 

public void run (){  
	s();
	}  
	public void s() {
		System.out.println("Press 1 to Add students to the office for quaries"); 
		 
		int k=vi.nextInt();
		if(k==1)
		{OSsj t2=new OSsj();
			t2.start();
			t1.Q();
		
		}
}
}
public class OSsj31 extends Thread {
	
	int sem=0,q=0;
	public void P()
	{
		if(sem<3)
		{
			sem+=1;
			System.out.println("Wait in the Queue!");
		}
		else {
			System.out.println("Queue is full attend later !");
		}
	}
	public void  Q()
	{
		if(q==0)
			{q=1;
			System.out.println("Enter the Room faculty is free if sleeping please wake him up !");
			try {
				System.out.println("Processing");
				Thread.sleep(7000);
				System.out.println("Excution completed!");
				q=0;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(sem>0) {
				sem=sem-1;
				System.out.println("Next student entered studets in queue now is :"+sem);
				Q();
			}
			
			}
		else
			P();
			
	} 
	
		

	public static void main(String[] args) {
		OSsj k=new OSsj(); 
		k.s();
	}

}

