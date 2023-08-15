/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.core;

import java.util.Iterator;
import java.util.List;

/**
 * ���׽ڵ�
 * 
 * @author tdan 2009-10-26
 * 
 * @implements SDD_IDE_RUNTIME_CORE_032,SDD_DESC_IDE_RUNTIME_CORE_033
 */
public interface ITParent extends ITObject {

	/**
	 * ��Ӻ��ӽڵ��
	 * 
	 * @param children
	 */
	public void addAll(ITObject[] children);

	/**
	 * ��Ӻ��ӽڵ�
	 * 
	 * @param child
	 * 
	 */
	public void addChild(ITObject child);

	/**
	 * ���ָ��λ�õ��ӽڵ�
	 * 
	 * @param index
	 *            ָ��λ��
	 * @return ָ��λ���ӽڵ㣬��λ�ô���ʱ��
	 */
	public ITObject getChild(int index);

	/**
	 * �������ֲ����ӽڵ�
	 * 
	 * @param childName
	 *            �ӽڵ�����
	 * @return ָ�������ӽڵ���
	 */
	public ITObject getChild(String childName);

	/**
	 * �������ֺ����Ͳ����ӽڵ�
	 * 
	 * @param childName
	 *            �ӽڵ�����
	 * @param clss
	 *            �ӽڵ�����
	 * @return
	 * 
	 */
	public ITObject getChild(String childName, Class<?> clss);

	/**
	 * ����ӽڵ�λ��
	 * 
	 * @param child
	 *            �ӽڵ�
	 * @return �ӽڵ�λ�û򲻴���ʱ����-1
	 */
	public int getChildIndex(ITObject child);

	/**
	 * ��ú��ӽڵ��б���
	 * 
	 * @return
	 */
	public Iterator<ITObject> getChildIterator();

	/**
	 * ��ú��ӽڵ��
	 * 
	 * @return
	 * 
	 */
	public ITObject[] getChildren();

	/**
	 * ���ָ�����͵��ӽڵ��б�
	 * 
	 * @param clss
	 *            ����
	 * @return �ӽڵ��б�
	 */
	public List<ITObject> getChildren(Class<?> clss);

	/**
	 * ���ָ����������ӽڵ��б�
	 * 
	 * @param clsses
	 *            ������
	 * @return �ӽڵ��б�
	 */
	public List<ITObject> getChildren(Class<?>[] clsses);

	/**
	 * ���ݽڵ��������β��Һ��ӽڵ�
	 * 
	 * @param clss
	 *            �ڵ�����
	 * @return ���ӽڵ��
	 */
	public List<ITObject> getDeepChild(Class<?> clss);

	/**
	 * ���β��Һ��ӽڵ�
	 * 
	 * @param childName
	 *            �ӽڵ�
	 * @return
	 */
	public ITObject getDeepChild(String childName);

	/**
	 * ���β��Һ��ӽڵ�
	 * 
	 * @param childName
	 *            �ӽڵ�
	 * @param clss
	 *            �ӽڵ�����
	 * @return
	 */
	public ITObject getDeepChild(String childName, Class<?> clss);

	/**
	 * ��ú��ӽ���
	 * 
	 * @return
	 */
	public List<ITObject> getListChildren();

	/**
	 * �������ͻ���ӽ���
	 * 
	 * @param clss
	 *            �ӽڵ�����
	 * 
	 * @return
	 */
	public List<ITObject> getListChildren(Class<?> clss);

	/**
	 * �����ӽڵ�·�����Һ��ӽڵ�
	 * 
	 * @param childpath
	 *            �ӽڵ�·��
	 * @return
	 */

	public ITObject getPathChild(String childpath);

	/**
	 * �����ӽڵ�·�����Һ��ӽڵ�
	 * 
	 * @param childpath
	 *            �ӽڵ�·��
	 * @param clss
	 *            �ӽڵ�����
	 * @return
	 */
	public ITObject getPathChild(String childpath, Class<?> clss);

	/**
	 * �Ƿ�������ӽڵ�child
	 * 
	 * @param child
	 * @return
	 */
	public boolean hasChild(ITObject child);

	/**
	 * �Ƿ�������ӽڵ�
	 * 
	 * @return
	 * 
	 */
	public boolean hasChildren();

	public boolean hasDeepChild(Class<?>[] lastLevelClsss);

	/**
	 * ˢ�¡����¹����ӽڵ��б�
	 * 
	 * @throws Exception
	 */
	public void refresh() throws Exception;

	/**
	 * �Ƴ����к��ӽڵ�
	 */
	public void removeAll();

	/**
	 * �Ƴ����ӽڵ�
	 * 
	 * @param child
	 */
	public void removeChild(ITObject child);
}
