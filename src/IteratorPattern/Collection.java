package IteratorPattern;


public interface Collection {
	
	public Iterator iterator();
	
	/*
	 * 取得集合元素
	 */
	public Object get(int index);
	/*
	 * 取得集合大小
	 */
	public int size();

}
