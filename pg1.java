
class Counter{
int count=0;//will get memory when instance is created 3.
Counter(){
count++;
System.out.println(count);
}
}
public class pg1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter(); 
	}
}
