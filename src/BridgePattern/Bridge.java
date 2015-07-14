package BridgePattern;
/**
 * 桥接类(桥接模式)
 * @author admin
 *
 */
public abstract class Bridge {
	private Sourceable source;
	
	public void method(){
		source.method();
	}

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}
	
	
}
