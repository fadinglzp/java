package inheriting;
import static lzp.tools.*;
class DynamicFieldException extends Exception{
	
}
public class DynamicField {
	private Object[][] fields;
	public DynamicField(int initialSize){
		fields = new Object[initialSize][2];
		for(int i = 0 ;i< initialSize;i++){
			fields[i]= new Object[]{null,null};
		}
	}
	public String toString(){
		StringBuffer result = new StringBuffer();
		for(Object[] obj : fields){
			result.append(obj[0]);
			result.append(": ");
			result.append(obj[1]);
			result.append("\n");
		}
		return result.toString();
		
	}
	private int hasField(String id){
		for(int i=0;i<fields.length;i++)
			if(id.equals(fields[i][0]))
				return i;
		return -1;
	}
	private int getFieldNumber(String id) throws NoSuchFieldException{
		int fieldNum = hasField(id);
		if(fieldNum==-1) throw new NoSuchFieldException();
		return fieldNum;
	}
	private int makeField(String id){
		int fl=fields.length;
		for(int i=0;i<fl;i++){
			if(fields[i][0]==null){
				fields[i][0]=id;
				return i;
			}
		}
		Object[][] tmp = new Object[fl+1][2];
		for(int i=0;i<fl;i++)
		{
			tmp[i]=fields[i];
		}
		fields=tmp;
		return makeField(id);
	}
	public Object getField(String id) throws NoSuchFieldException{
		return fields[getFieldNumber(id)][1];
	}
	
	public Object setField(String id, Object value)throws DynamicFieldException{
		if(value==null){
			DynamicFieldException dfe = new DynamicFieldException();
			NullPointerException npe =new NullPointerException();
			npe.initCause(new DynamicFieldException());
			dfe.initCause(npe);
//			dfe.initCause(new Exception());
			throw dfe;
		}
		int fieldNumber = hasField(id);
		if(fieldNumber==-1)
			fieldNumber=makeField(id);
		Object result =null;
		try{
			result=getField(id);
		}catch(NoSuchFieldException e){
			throw new RuntimeException();
			
		}
		fields[fieldNumber][1]=value;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynamicField df = new DynamicField(3);
		print(df);
		try{
			df.setField("d", "A value for d");
			df.setField("number", 47);
			df.setField("number2", 48);
			print(df);
			df.setField("d", "A new value for d");
			df.setField("number3", 49);
			print("df: \n"+df);
			print("df.getField(\"d\"): "+df.getField("d"));
			Object field = df.setField("d", null);
		}catch(NoSuchFieldException e){
			e.printStackTrace(System.out);
		}catch(DynamicFieldException e){
			e.printStackTrace(System.out);
		}

	}

}
