package IteratorPattern;


public interface Collection {
	
	public Iterator iterator();
	
	/*
	 * ȡ�ü���Ԫ��
	 */
	public Object get(int index);
	/*
	 * ȡ�ü��ϴ�С
	 */
	public int size();

}
