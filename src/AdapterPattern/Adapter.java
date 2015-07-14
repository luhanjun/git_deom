package AdapterPattern;
/**
 * ÊÊÅäÆ÷(ÀàÊÊÅäÆ÷)
 * @author admin
 *
 */
public class Adapter extends Source implements Targetable {

	@Override
	public void method2() {
		System.out.println("Targetable method2");
		
	}
}
