
public class Overload_Method {
	
	public void m1(int i) {
		System.out.println(i);
	}
	public void m1(int i,int j) {
		System.out.println(i+ " "+j);
	}

	public static void main(String[] args) {
		Overload_Method om=new Overload_Method();
		om.m1(20);
		om.m1(30, 40);
		
	}

}
