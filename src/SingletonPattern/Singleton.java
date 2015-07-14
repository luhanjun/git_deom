package SingletonPattern;
/**
 * ����ģʽ(���߳����г���Ŀ���)
 * @author admin
 *
 */
public class Singleton {
	/*
	 * ˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull����Ϊ���ӳټ���
	 */
	private static Singleton instance=null;
	/*
	 * ˽�еĹ��췽������ֹ��ʵ����
	 */
	private Singleton(){}
	
	/*
	 * ��̬����������ʵ��
	 */
	public static Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}
	/*
	 * ��������������л�����֤���л�ǰ��Ķ���һ��
	 */
	public Object readResolve(){
		return getInstance();
	}

}
