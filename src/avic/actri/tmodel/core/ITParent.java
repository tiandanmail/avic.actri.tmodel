/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.core;

import java.util.Iterator;
import java.util.List;

/**
 * 父亲节点
 * 
 * @author tdan 2009-10-26
 * 
 * @implements SDD_IDE_RUNTIME_CORE_032,SDD_DESC_IDE_RUNTIME_CORE_033
 */
public interface ITParent extends ITObject {

	/**
	 * 添加孩子节点表
	 * 
	 * @param children
	 */
	public void addAll(ITObject[] children);

	/**
	 * 添加孩子节点
	 * 
	 * @param child
	 * 
	 */
	public void addChild(ITObject child);

	/**
	 * 获得指定位置的子节点
	 * 
	 * @param index
	 *            指定位置
	 * @return 指定位置子节点，或位置错误时空
	 */
	public ITObject getChild(int index);

	/**
	 * 根据名字查找子节点
	 * 
	 * @param childName
	 *            子节点名字
	 * @return 指定名字子节点或空
	 */
	public ITObject getChild(String childName);

	/**
	 * 根据名字和类型查找子节点
	 * 
	 * @param childName
	 *            子节点名字
	 * @param clss
	 *            子节点类型
	 * @return
	 * 
	 */
	public ITObject getChild(String childName, Class<?> clss);

	/**
	 * 获得子节点位置
	 * 
	 * @param child
	 *            子节点
	 * @return 子节点位置或不存在时返回-1
	 */
	public int getChildIndex(ITObject child);

	/**
	 * 获得孩子节点列表器
	 * 
	 * @return
	 */
	public Iterator<ITObject> getChildIterator();

	/**
	 * 获得孩子节点表
	 * 
	 * @return
	 * 
	 */
	public ITObject[] getChildren();

	/**
	 * 获得指定类型的子节点列表
	 * 
	 * @param clss
	 *            类型
	 * @return 子节点列表
	 */
	public List<ITObject> getChildren(Class<?> clss);

	/**
	 * 获得指定类型组的子节点列表
	 * 
	 * @param clsses
	 *            类型组
	 * @return 子节点列表
	 */
	public List<ITObject> getChildren(Class<?>[] clsses);

	/**
	 * 根据节点类型深层次查找孩子节点
	 * 
	 * @param clss
	 *            节点类型
	 * @return 孩子节点表
	 */
	public List<ITObject> getDeepChild(Class<?> clss);

	/**
	 * 深层次查找孩子节点
	 * 
	 * @param childName
	 *            子节点
	 * @return
	 */
	public ITObject getDeepChild(String childName);

	/**
	 * 深层次查找孩子节点
	 * 
	 * @param childName
	 *            子节点
	 * @param clss
	 *            子节点类型
	 * @return
	 */
	public ITObject getDeepChild(String childName, Class<?> clss);

	/**
	 * 获得孩子结点表
	 * 
	 * @return
	 */
	public List<ITObject> getListChildren();

	/**
	 * 根据类型获得子结点表
	 * 
	 * @param clss
	 *            子节点类型
	 * 
	 * @return
	 */
	public List<ITObject> getListChildren(Class<?> clss);

	/**
	 * 根据子节点路径查找孩子节点
	 * 
	 * @param childpath
	 *            子节点路径
	 * @return
	 */

	public ITObject getPathChild(String childpath);

	/**
	 * 根据子节点路径查找孩子节点
	 * 
	 * @param childpath
	 *            子节点路径
	 * @param clss
	 *            子节点类型
	 * @return
	 */
	public ITObject getPathChild(String childpath, Class<?> clss);

	/**
	 * 是否包含孩子节点child
	 * 
	 * @param child
	 * @return
	 */
	public boolean hasChild(ITObject child);

	/**
	 * 是否包含孩子节点
	 * 
	 * @return
	 * 
	 */
	public boolean hasChildren();

	public boolean hasDeepChild(Class<?>[] lastLevelClsss);

	/**
	 * 刷新。重新构造子节点列表。
	 * 
	 * @throws Exception
	 */
	public void refresh() throws Exception;

	/**
	 * 移除所有孩子节点
	 */
	public void removeAll();

	/**
	 * 移除孩子节点
	 * 
	 * @param child
	 */
	public void removeChild(ITObject child);
}
