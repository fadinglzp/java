package typeinfo;

import java.lang.reflect.*;
import java.util.*;
import lzp.*;

class NullRobotProxyHandler implements InvocationHandler {
	private String nullname;
	private Robot proxied = new NRobot();

	NullRobotProxyHandler(Class<? extends Robot> type) {
		nullname = type.getSimpleName() + " NullRobot";
	}

	private class NRobot implements Null, Robot {
		public String name() {
			return nullname;
		}

		public String model() {
			return nullname;
		}

		public List<Operation> operations() {
			return Collections.emptyList();
		}

	
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable  {
		return method.invoke(proxied, args);
	}

}

public class NullRobot {
	public static Robot newNullRobot(Class<? extends Robot> type){
		return (Robot)Proxy.newProxyInstance(NullRobot.class.getClassLoader(),
				new Class[]{Null.class,Robot.class}, new NullRobotProxyHandler(type));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot[] bots={new SnowRemovalRobot("SnowBee"),
				newNullRobot(SnowRemovalRobot.class)};
		for(Robot bot:bots)
			Robot.Test.test(bot);
	}

}
