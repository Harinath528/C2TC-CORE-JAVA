package string;

public class Indexof {

	public static void main(String[] args) {
		String s1="this is harinath royal";
		int index1=s1.indexOf('a');
		System.out.println(index1);
		 int index2=s1.indexOf("harinath");
		 System.out.println(index2);
		int index3=s1.indexOf("royal");
		System.out.println(index3);
		int index4=s1.indexOf("is",4);
		System.out.println(index4);
	}

}
