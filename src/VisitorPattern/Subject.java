package VisitorPattern;

public interface Subject {
	/**
	 * accept���������ܽ�Ҫ�������Ķ���getSubject()��ȡ��Ҫ�����ʵ����ԣ�
	 * @param visitor
	 */
	  public void accept(Visitor visitor);  
	    public String getSubject();  
}
