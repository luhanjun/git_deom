package MementoPattern;
/**
 * ԭʼ��
 * @author admin
 *
 */
public class Original {
	private String value;//��Ҫ���ݵ��ֶ�

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	 public Original(String value) {  
	        this.value = value;  
	    }  
	 public Memento createMemento(){  
	        return new Memento(value);  
	    }  
	      
	    public void restoreMemento(Memento memento){  
	        this.value = memento.getValue();  
	    }  
	

}
