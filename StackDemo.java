
class stack
{
	int a[];
	int max;
	int top1,top2;
	
	stack(int n)
	{
		max=n;
		a=new int[max];
		top1=-1;
		top2=n/2;
	}
	void push1(int d)
	{
		a[++top1]=d;
	}
	void push2(int d)
	{
		top2++;
		a[top2]=d;
	}
	int pop1()
	{
		int x=a[top1];
		return x;
	}
	int pop2()
	{
		int x=a[top2];
		return x;
	}
}
public class StackDemo
{

   public static void main(String args[])
   {
	   stack s=new stack(10);
	   s.push1(5);
	   s.push2(10);
	   s.push2(15);
	   s.push1(11);
	   s.push2(7);
	   s.push2(40);
	   System.out.println("Popped element from stack1 is"+s.pop1());
	   System.out.println("Popped element from stack2 is"+s.pop2());
	   
   
   }
}