/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.core;

/**
 * ���ӽڵ�
 * 
 * @author tdan 2009-10-26
 * 
 * @implements SDD_IDE_RUNTIME_CORE_033,SDD_DESC_IDE_RUNTIME_CORE_034
 */
public interface ITObject extends ITResourceObject, IOperation {
	/** ��Ŀ·���ָ�� */
	public final static String SLASH = "/";

	/**
	 * ���ڵ�״̬.
	 * 
	 * @return ���󷵻�false������true
	 */
	public boolean checkState();

	/**
	 * ɾ���ڵ�
	 * 
	 * @throws Exception
	 * 
	 */
	public void delete() throws Exception;

	/**
	 * ��ýڵ�����
	 * 
	 * @return
	 * 
	 */
	public String getName();

	/**
	 * ��ø��ڵ�
	 * 
	 * @return
	 */
	public ITParent getParent();

	/**
	 * ��ø��ڵ����·������SLASH�ָ��testProject/sysConfig/thisName��
	 * 
	 * @return ��Ŀ���·��
	 */
	public String getPath();

	/**
	 * �����Ŀ�ڵ㡣
	 * <p>
	 * �ж�����������׷�ݣ��ҵ����ڵ�Ϊ�յ����Ƚڵ㡣
	 * 
	 * @return
	 * 
	 */
	public ITParent getProject();

	/**
	 * ��ýڵ�UI��������
	 * 
	 * @return �ڵ�UI��������
	 * 
	 */
	public ITObjectUI getTObjectUI();

	/**
	 * ���ýڵ�����
	 * 
	 * @param newName
	 * 
	 */
	public void setName(String newName);

	/**
	 * ���ø��ڵ�
	 * 
	 * @param parent
	 * 
	 */
	public void setParent(ITParent parent);

	/**
	 * ����UI��������
	 * 
	 * @param tObjUI
	 * 
	 */
	public void setTObjectUI(ITObjectUI tObjUI);
}
