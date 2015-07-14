package FacadePattern;
/**
 * ����ࣨ���ģʽ��
 * @author admin
 *
 */
public class Computer {
	private Cpu cpu;
	private Memory memory;
	
	//�ڴ��������Ǿʹ�����CPU ���ڴ��װ��
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
