/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.core;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;

/**
 * 节点UI
 * 
 * @author tdan 2009-10-26
 * 
 */
public interface ITObjectUI {

	public enum ObjState {
		OK, WARNNING, ERROR
	}

	/**
	 * 获得图片。
	 * 
	 * @return
	 */
	public Image getImage();

	/**
	 * 获得装饰图标的路径。
	 * <p>
	 * 只支持左下角装饰图标
	 * </p>
	 * 
	 * @return
	 */
	public String getDecorateImage();

	/**
	 * 获得节点状态。
	 * <p>
	 * 状态描述为{@link ObjState}
	 * </p>
	 * 
	 * @return 节点状态标识
	 */
	public ObjState getState();

	/**
	 * 获得名字显示前景色。
	 * 
	 * @return 根据state判断：默认null代表黑色
	 */
	public Color getForeground();

	/**
	 * 获得名字显示背景色。
	 * 
	 * @return
	 */
	public Color getBackground();

	/**
	 * 获得该节点UI对应节点。
	 * 
	 * @return 节点
	 */
	public ITObject getTObject();

	/**
	 * 设置该节点UI对应节点。
	 * 
	 * @param tObject
	 *            节点
	 */
	public void setTObject(ITObject tObject);

	/**
	 * 创建节点菜单
	 * 
	 * @param manager
	 * @param viewer
	 */
	public void createMenu(IMenuManager manager, TreeViewer viewer);

	/**
	 * 创建节点新建菜单
	 * 
	 * @param manager
	 * @param viewer
	 */
	public void createNewMenu(IMenuManager manager, TreeViewer viewer);
}
