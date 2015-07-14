package SingletonPattern;
/**
 * ����ģʽ(ʹ���ڲ�������֤�ڶ��߳��µİ�ȫ��JVM���Ʊ�֤����ֻ������һ��)
 */
public class SingletonThread {
	
	/*
	 * ˽�еĹ��죬��ֹ��ʵ����
	 */
	private SingletonThread(){}
	
	/*
	 * �˴�ʹ���ڲ�����ά������
	 */
	private static class SingletonFactory{
		private static SingletonThread instance=new SingletonThread();
	}
	
	/*
	 *��̬����������ʵ�� 
	 */
	public static SingletonThread getInstance(){
		return SingletonFactory.instance;
	}
	/*
	 * ��������������л�����֤���л�ǰ��Ķ���һ��
	 */
	public Object readResolve(){
		return SingletonFactory.instance;
	}

}
