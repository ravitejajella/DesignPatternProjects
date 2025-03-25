
public class FactoryMain {

	public static void main(String[] args) {
		
		FactoryMain m = new FactoryMain();
		OS o = m.getInstance("open");
		System.out.println(o);
		o.spec();
		OS o1 = m.getInstance("opn");
		System.out.println(o1);
		o1.spec();
		
	}
	
	public OS getInstance(String ostype) {
		if(ostype == "open") {
			return new AndroidOS();
		}
		else if (ostype=="closed") {
			return new IosOS();
		}
		else {
			return new WindowsOS();
		}		
	}

}
