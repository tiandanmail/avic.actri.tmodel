/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.core;

/**
 * 复制、粘贴、删除、拖拽等操作。
 * 
 * @author tdan 2009-10-26
 * 
 */
public interface IOperation {
	/**
	 * 判断该节点是否可复制
	 * 
	 * @return 是否删除返回true，否则返回false
	 */
	public boolean canCopy();

	/**
	 * 判断节点能否删除
	 * 
	 * @return 是否删除返回true，否则返回false
	 */
	public boolean canDelete();

	/**
	 * 判断本节点是否可以粘贴子节点 列表
	 * 
	 * @param child
	 *            子节点列表
	 * @return
	 */
	public boolean canPaste(ITObject[] childs);

	/**
	 * 节点是否支持重命名
	 * 
	 * @return
	 */
	public boolean canReName();

	/**
	 * 节点是否可重命名为newName
	 * 
	 * @param newName
	 * @return
	 */
	public boolean canReNameTo(String newName);

	/**
	 * 删除节点
	 * 
	 * @throws Exception
	 */
	public void delete() throws Exception;

	/**
	 * 粘贴子节点列表到该节点
	 * 
	 * @param childs
	 *            子节点列表
	 * @throws Exception
	 */
	public void paste(ITObject[] childs) throws Exception;

	/**
	 * 重命名节点为newName
	 * 
	 * @param newName
	 * @throws Exception
	 */
	public void reName(String newName) throws Exception;
}
