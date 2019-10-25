package typeinfo;
import java.lang.reflect.*;
import static lzp.tools.*;

class DynamicProxyHandler implements InvocationHandler{
	private Object proxid;
	public DynamicProxyHandler(Object proxid){
		this.proxid=proxid;
	}
	public Object invoke(Object proxy,Method method,Object[] args)throws Throwable{
		print("****** proxy: "+proxy.getClass()+", method: "+method+", args: "+args);
		if(args!=null)
			for(Object arg:args)
				print(" "+arg);
		return method.invoke(proxid, args);
	}
}

public class SimpleDynamicProxy {
	public static void consumer(Interface iface){
		iface.doSomething();
		iface.somethingElse("iface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RealObject real =new RealObject();
		consumer(real);
		Interface proxy =(Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(),
				new Class[]{Interface.class}, new DynamicProxyHandler(real));
		consumer(proxy);
	}

}
