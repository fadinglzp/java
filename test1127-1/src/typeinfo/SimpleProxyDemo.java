package typeinfo;
import static lzp.tools.*;
interface Interface{
	void doSomething();
	void somethingElse(String arg);
}
class RealObject implements Interface{
	public void doSomething(){
		print("doSomething");
	}
	public void somethingElse(String arg){
		print("somethingElse "+arg);
	}
}
class simpleProxy implements Interface{
	private Interface proxid;
	public simpleProxy(Interface proxid){
		this.proxid=proxid;
	}
	public void doSomething(){
		print("simpleProxy doSomething");
		proxid.doSomething();
	}
	public void somethingElse(String arg){
		print("simpleProxy somethingElse");
		proxid.somethingElse(arg);
	}
}
public class SimpleProxyDemo {
	public static void consumer(Interface iface){
		iface.doSomething();
		iface.somethingElse("iface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		consumer(new RealObject());
		consumer(new simpleProxy(new RealObject()));
	}

}
