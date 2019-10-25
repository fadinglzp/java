package testxiancheng;
import java.util.*;
import static lzp.tools.*;
class InsertData{
	private ArrayList<Integer> al=new ArrayList<Integer>();
	public synchronized void insert(Thread thread){
		for(int i=0;i<5;i++){
			System.out.println("insertdata 0 "+thread.getName()+" insert: "+i);
		//	print("insertdata 0 "+thread.getName()+" insert: "+i);
			al.add(i);
		}
	}
}
class InsertData1{
	private ArrayList<Integer> al=new ArrayList<Integer>();
	public void insert(Thread thread){
		for(int i=0;i<5;i++){
			System.out.println("insertdata 1 "+thread.getName()+" insert: "+i);
		//	print("insertdata 1 "+thread.getName()+" insert: "+i);
			al.add(i);
		}
	}
}
class InsertData2{
	private ArrayList<Integer> al=new ArrayList<Integer>();
	public void insert(Thread thread){
		synchronized(this){
			for(int i=0;i<5;i++){
				System.out.println("insertdata 2 "+thread.getName()+" insert: "+i);
	//			print("insertdata 2 "+thread.getName()+" insert: "+i);
				al.add(i);
			}
		}
	}
}
class InsertData3{
	private ArrayList<Integer> al =new ArrayList<Integer>();
	Object obj1=new Object();
	public void insert(Thread thread){
	//	Object obj2;
		synchronized(obj1){
			for(int i=0;i<5;i++){
				System.out.println("insertData3 "+thread.getName()+" insert: "+i);
				al.add(i);
			}
			
		}
	}
}
public class synchronized01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final InsertData insertData = new InsertData();
		final InsertData1 insertData1 = new InsertData1();
		final InsertData2 insertData2 = new InsertData2();
		final InsertData3 insertData3 =new InsertData3();
		for(int i=0;i<10;i++)
			new Thread() {
				public void run() {
					insertData3.insert(Thread.currentThread());
				}
			}.start();
			
//		for (int i = 0; i < 10; i++)
//			new Thread() {
//				public void run() {
//					insertData1.insert(Thread.currentThread());
//				}
//			}.start();
//		new Thread(){
//			public void run(){
//				insertData.insert(Thread.currentThread());
//			}
//		}.start();
//		new Thread(){
//			public void run(){
//				insertData.insert(Thread.currentThread());
//			}
//		}.start();
//		new Thread(){
//			public void run(){
//				insertData.insert(Thread.currentThread());
//			}
//		}.start();
//		new Thread(){
//			public void run(){
//				insertData1.insert(Thread.currentThread());
//			}
//		}.start();
//		new Thread(){
//			public void run(){
//				insertData1.insert(Thread.currentThread());
//			}
//		}.start();
//		new Thread(){
//			public void run(){
//				insertData1.insert(Thread.currentThread());
//			}
//		}.start();
//		new Thread(){
//			public void run(){
//				insertData1.insert(Thread.currentThread());
//			}
//		}.start();
	}

}
