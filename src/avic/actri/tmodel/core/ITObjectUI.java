/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.core;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

/**
 * �ڵ�UI
 * 
 * @author tdan 2009-10-26
 * 
 */
public interface ITObjectUI {

	public enum ObjState {
		OK, WARNNING, ERROR
	}

	/**
	 * ���ͼƬ��
	 * 
	 * @return
	 */
	public Image getImage();

	/**
	 * ���װ��ͼ���·����
	 * <p>
	 * ֻ֧�����½�װ��ͼ��
	 * </p>
	 * 
	 * @return
	 */
	public String getDecorateImage();

	/**
	 * ��ýڵ�״̬��
	 * <p>
	 * ״̬����Ϊ{@link ObjState}
	 * </p>
	 * 
	 * @return �ڵ�״̬��ʶ
	 */
	public ObjState getState();

	/**
	 * ���������ʾǰ��ɫ��
	 * 
	 * @return ����state�жϣ�Ĭ��null�����ɫ
	 */
	public Color getForeground();

	/**
	 * ���������ʾ����ɫ��
	 * 
	 * @return
	 */
	public Color getBackground();

	/**
	 * ��øýڵ�UI��Ӧ�ڵ㡣
	 * 
	 * @return �ڵ�
	 */
	public ITObject getTObject();

	/**
	 * ���øýڵ�UI��Ӧ�ڵ㡣
	 * 
	 * @param tObject
	 *            �ڵ�
	 */
	public void setTObject(ITObject tObject);

	/**
	 * �����ڵ�˵�
	 * 
	 * @param manager
	 * @param viewer
	 */
	public void createMenu(IMenuManager manager, TreeViewer viewer);

	/**
	 * �����ڵ��½��˵�
	 * 
	 * @param manager
	 * @param viewer
	 */
	public void createNewMenu(IMenuManager manager, TreeViewer viewer);
}
