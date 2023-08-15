/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.core;

/**
 * ���ơ�ճ����ɾ������ק�Ȳ�����
 * 
 * @author tdan 2009-10-26
 * 
 */
public interface IOperation {
	/**
	 * �жϸýڵ��Ƿ�ɸ���
	 * 
	 * @return �Ƿ�ɾ������true�����򷵻�false
	 */
	public boolean canCopy();

	/**
	 * �жϽڵ��ܷ�ɾ��
	 * 
	 * @return �Ƿ�ɾ������true�����򷵻�false
	 */
	public boolean canDelete();

	/**
	 * �жϱ��ڵ��Ƿ����ճ���ӽڵ� �б�
	 * 
	 * @param child
	 *            �ӽڵ��б�
	 * @return
	 */
	public boolean canPaste(ITObject[] childs);

	/**
	 * �ڵ��Ƿ�֧��������
	 * 
	 * @return
	 */
	public boolean canReName();

	/**
	 * �ڵ��Ƿ��������ΪnewName
	 * 
	 * @param newName
	 * @return
	 */
	public boolean canReNameTo(String newName);

	/**
	 * ɾ���ڵ�
	 * 
	 * @throws Exception
	 */
	public void delete() throws Exception;

	/**
	 * ճ���ӽڵ��б��ýڵ�
	 * 
	 * @param childs
	 *            �ӽڵ��б�
	 * @throws Exception
	 */
	public void paste(ITObject[] childs) throws Exception;

	/**
	 * �������ڵ�ΪnewName
	 * 
	 * @param newName
	 * @throws Exception
	 */
	public void reName(String newName) throws Exception;
}
