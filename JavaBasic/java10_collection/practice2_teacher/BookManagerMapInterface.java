package java10_collection.practice2_teacher;

//BookManagerMap�� �������̽�
//��� �޼ҵ�鿡 ���� ������ �ڼ��� �ۼ��ص�
public interface BookManagerMapInterface {

	/**
	 * �� ���� �߰�
	 * 	�ʿ� ���ο� ������ �߰��Ѵ�
	 * 
	 * @param book - Book, ���Ӱ� �߰��� å ������ ����ִ� ��ü
	 */
	public void putBook(Book book);
	
	
	
	/**
	 * ���� ����
	 * 	å ��ȣ�� ���޹޾� �ʿ��� ���� ������ �����Ѵ�
	 * 
	 * @param bNo - String, ������ ������ �̸� 
	 */
	public void removeBook(String bNo);
	
	
	
	/**
	 * ���� ���� �˻�
	 * 	å �̸��� ���޹޾� �ش� å�� å��ȣ�� ��ȯ�Ѵ�
	 *	�������� �ʴ� å�̶�� null�� ��ȯ�Ѵ�
	 * 
	 * @param bTitle - String, �˻��Ϸ��� å �̸�
	 * @return
	 * 	String - �˻��� å��ȣ
	 * 	null - �˻��� å ������ �������� ���� ��
	 */
	public String searchBook(String bTitle);
	
	
	
	/**
	 * ��� å�� ������ ����Ѵ�
	 * 	printBook() Ȱ��
	 *  
	 */
	public void displayAll();
	
	
	
	/**
	 * å �ѱ��� ������ ����Ѵ�
	 * 
	 * @param bNo - String, ����Ϸ��� å�� å��ȣ
	 */
	public void printBook(String bNo);
	
}
