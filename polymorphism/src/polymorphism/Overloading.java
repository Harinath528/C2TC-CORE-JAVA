package polymorphism;
public class Overloading {
	
		int id;
		String name;
		int age;
		Overloading(int i, String n){
			id=i;
			name=n;
			
		}
		Overloading(int i, String n,int a)
		{
			id=i;
			name=n;
			age=a;
		}
		void display()
		{
			System.out.println(id+" "+name+" "+age);
		}



	public static void main(String[] args) {
		Overloading s1=new Overloading(111,"arun");
		Overloading s2=new Overloading(222,"hari",22);
		s1.display();
		s2.display();
		
		
	}

}
