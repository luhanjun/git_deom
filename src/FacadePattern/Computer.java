package FacadePattern;
/**
 * 外观类（外观模式）
 * @author admin
 *
 */
public class Computer {
	private Cpu cpu;
	private Memory memory;
	
	//在创建电脑是就创建出CPU 和内存等装置
	public Computer(){
		this.cpu=new Cpu();
		this.memory=new Memory();
	}
	
	public void computerStartup(){
		cpu.startup();
		memory.startup();
		System.out.println("Computer startup");
	}
	
	public void computerShowdown(){
		cpu.showdown();
		memory.showdown();
		System.out.println("Computer showdown");
	}

}
