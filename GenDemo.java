//GenDemo.java
class Sample<s,j>
{
    s a;
	j b;
	Sample()
	{
		a=null;
		b=null;
	}
	Sample(s a,j b)//GENERIC CONSTRUCTOR
	{
		this.a=a;
		this.b=b;
    }
	void set(s a,j b)//GENERIC METHOD
	{
		this.a=a;
		this.b=b;
	}
	s getA()
	{
		return a;
	}
	j getB()
	{
		return b;
	}
}//Sample----Gen class
class GenDemo
{
	public static void main(String args[])
	{
		Sample<Integer,Integer>si = new Sample<Integer,Integer>(10,20);//auto-boxing applied.
		Sample<Float,Float>sf = new Sample<Float,Float>(10.5f,20.5f);//auto-boxing applied.
		Sample<String,String>ss = new Sample<String,String>();//auto-boxing applied.
		             ss.set("sivakula","janardhan");
		Sample<Character,Character>sc = new Sample<Character,Character>();//auto-boxing applied.
		             sc.set('m','v');
		System.out.println("==================================");
		System.out.println("Integer object values");
	    System.out.println("==================================");
		  int x1=si.getA();
		  int x2=si.getB();
		  Float x3=sf.getA();
		  Float x4=sf.getB();
		  String x5=ss.getA();
		  String x6=ss.getB();
		  char x7=sc.getA();
		  char x8=sc.getB();

		System.out.println("Val of x1 of si="+x1);
		System.out.println("Val of x2 of si="+x2);
		System.out.println("==================================");
		System.out.println("Float object values");
		System.out.println("==================================");
		System.out.println("Val of x3 of sf="+x3);
		System.out.println("Val of x4 of sf="+x4);
		//System.out.println("Val of a of sf="+sf.getA());
		//System.out.println("Val of b of sf ="+sf.getB());
		System.out.println("***************************************************");
		System.out.println("String Object Values");
		System.out.println("***************************************************");
		System.out.println("Val of x5 of ss="+x5);
		System.out.println("Val of x6 of ss="+x6);
		//System.out.println("Val of a of ss ="+ss.getA());
		//System.out.println("Val of b of ss="+ss.getB());
		System.out.println("==================================");
		System.out.println("Character Object Values");
		System.out.println("==================================");
		System.out.println("Val of x7 of sc="+x7);
		System.out.println("Val of x8 of sc="+x8);
		//System.out.println("Val of sc ="+sc.getA());
		//System.out.println("Val of sc ="+sc.getB());
		System.out.println("==================================");
	}
}
