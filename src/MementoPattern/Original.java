package MementoPattern;
/**
 * 原始类
 * @author admin
 *
 */
public class Original {
	private String value;//需要备份的字段

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
