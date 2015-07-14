package MementoPattern;
/**
 * ±¸ÍüÂ¼Àà
 * @author admin
 *
 */
public class Memento {
	private String value;  
	  
    public Memento(String value) {  
        this.value = value;  
    }  
  
    public String getValue() {  
        return value;  
    }  
  
    public void setValue(String value) {  
        this.value = value;  
    }  
}
