package SingletonPattern;
/**
 * 单例模式(使用内部类来保证在多线程下的安全，JVM机制保证对象只被创建一次)
 */
public class SingletonThread {
	
	/*
	 * 私有的构造，防止被实例化
	 */
	private SingletonThread(){}
	
	/*
	 * 此处使用内部类来维护单例
	 */
	private static class SingletonFactory{
		private static SingletonThread instance=new SingletonThread();
	}
	
	/*
	 *静态方法，创建实例 
	 */
	public static SingletonThread getInstance(){
		return SingletonFactory.instance;
	}
	/*
	 * 如果对象被用于序列化，保证序列化前后的对象一致
	 */
	public Object readResolve(){
		return SingletonFactory.instance;
	}

}
