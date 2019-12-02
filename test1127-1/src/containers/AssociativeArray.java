package containers;
import static lzp.tools.*;

public class AssociativeArray<K, V> {
	private Object[][] pairs;
	private int growstep=10;
	private int index;
	public AssociativeArray(){
		pairs=new Object[10][2];
	}
	public AssociativeArray(int length){
		pairs=new Object[length][2];
	}
	public void put(K key,V value){
		if(index>=pairs.length)
		{
		//	throw new ArrayIndexOutOfBoundsException("Too many objects");	
			Object[][] temp=pairs;
			pairs=new Object[temp.length+growstep][2];
		//	print("pairs.length = "+pairs.length);
			System.arraycopy(temp, 0, pairs, 0, temp.length);
		}
		pairs[index++]=new Object[]{key,value};
	}
	public V get(K key){
		for(int i=0;i<index;i++)
			if(key.equals(pairs[i][0]))
				return (V)pairs[i][1];
		return null;

	}
	public String toString(){
		StringBuilder result=new StringBuilder();
		for(int i=0;i<index;i++)
		{
			result.append(pairs[i][0].toString());
			result.append(" : ");
			result.append(pairs[i][1].toString());
			if(i<index-1)
				result.append("\n");
		}
		return result.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssociativeArray<String,String> map=new AssociativeArray<String,String>(6);
		map.put("sky", "blue");
		map.put("gress", "grenn");
		map.put("ocean", "dancing");
		map.put("tree", "tall");
		map.put("earth", "brown");
		map.put("sun", "warm");
		try{
			map.put("extra","object");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
//		for(int i=0;i<50;i++)
//			map.put(Integer.toString(i), Integer.toString(i));
		print(map);
		print(map.get("ocean"));
		
	}

}
