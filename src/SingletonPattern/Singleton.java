package SingletonPattern;
/**
 * 单例模式(多线程下有出错的可能)
 * @author admin
 *
 */
public class Singleton {
	/*
	 * 私有静态实例，防止被引用，此处赋值为null，是为了延迟加载
	 */
	private static Singleton instance=null;
	/*
	 * 私有的构造方法，防止被实例化
	 */
	private Singleton(){}
	
	/*
	 * 静态方法，创建实例
	 */
	public static Singleton getInstance(){
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}
	/*
	 * 如果对象被用于序列化，保证序列化前后的对象一致
	 */
	public Object readResolve(){
		return getInstance();
	}

}
