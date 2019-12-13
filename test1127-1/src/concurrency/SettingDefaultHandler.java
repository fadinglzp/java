package concurrency;
import java.util.concurrent.*;

public class SettingDefaultHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
		ExecutorService exec=Executors.newCachedThreadPool();
		exec.execute(new ExceptionThread());
	}

}
