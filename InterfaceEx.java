import java.util.*;
interface StackQueue
{
  void push(int d);
  void pop();
  void display();
  void enqueue(int n1);
  void dequeue();
  void peek();
  void Qdisplay();
}
class Test implements StackQueue
{
	int top=-1;
	int front=-1;
	int rear=-1;
	int size;
	int[] arr;
	Test()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size:");
	size=sc.nextInt();
	arr=new int[size];
         }
	public void push(int data)
	{
	if(top==size-1)
	{
	System.out.println("The stack is empty");
	}
	else
	{
	top++;
	arr[top]=data;
	}
	}
	public void pop()
	{
	
	if(top==0)
	{
	System.out.println("Stack is empty");
	}
	else
	{
	int ele=arr[top];
	top--;
	}
	}
	public void display()
	{	
	for(int i=top;i>=0;i--)
	{
	System.out.println(arr[i]);
	}
	}
	public void enqueue(int d1)
	{
	if(rear==size-1)
	{	
	System.out.println("Queue is overflow");
	}
	else if(front==-1 && rear==-1)
	{
	front=rear=0;
	arr[rear]=d1;
	}
	else
	{
	rear++;
	arr[rear]=d1;
	}
	}
	public void dequeue()
	{
	if((front==-1)&&(rear==-1))
	{
	System.out.println("Queue is underflow");
	}
	else if(front==rear)
	{
	front=rear=-1;
	}		
	else
	{
	System.out.println(arr[front]);
	front++;
	}
	}
	public void peek()
	{
	if(front==-1 && rear==-1)
	{	
	System.out.println("Queue is empty");
	}
	else
	{
	System.out.println(arr[front]);
	}
	}
		
        public void Qdisplay()
	{
	if((front==-1)&&(rear==-1))
	{
	System.out.println("Queue is empty");
	}
	else{
	for(int i=front;i<=rear;i++)
	{
	System.out.println(arr[i]);
	}	
	}
}
}
public class InterfaceEx
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	Test t=new Test();
	while(true)
	{
	System.out.println("1.Push\n");
	System.out.println("2.Pop\n");
	System.out.println("3.Display\n");
	System.out.println("4.enqueue\n");
	System.out.println("5.dequeue\n");
	System.out.println("6.Peek\n");
	System.out.println("7.QDisplay\n");
	System.out.println("8.Exit\n");
	System.out.println("Enter the choice:");
	int ch=sc.nextInt();

	switch(ch)
	{
	case 1:System.out.println("Enter the data to pushed:");
		int n=sc.nextInt();
		t.push(n);
		break;
	case 2:	t.pop();
		break;
	case 3:t.display();
		break;
	case 4:System.out.println("Enter the data to enqueued:");
		int n2=sc.nextInt();
		t.enqueue(n2);
		break;
	case 5:t.dequeue();
		break;
	case 6:t.peek();
		break;
	case 7:t.Qdisplay();
		break;
	case 8:System.exit(0);
	default:System.out.println("Invalid choice");
	}
      }
   }
}
	