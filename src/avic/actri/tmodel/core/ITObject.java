/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.core;

/**
 * 孩子节点
 * 
 * @author tdan 2009-10-26
 * 
 * @implements SDD_IDE_RUNTIME_CORE_033,SDD_DESC_IDE_RUNTIME_CORE_034
 */
public interface ITObject extends ITResourceObject, IOperation {
	/** 项目路径分割点 */
	public final static String SLASH = "/";

	/**
	 * 检查节点状态.
	 * 
	 * @return 错误返回false，否则true
	 */
	public boolean checkState();

	/**
	 * 删除节点
	 * 
	 * @throws Exception
	 * 
	 */
	public void delete() throws Exception;

	/**
	 * 获得节点名字
	 * 
	 * @return
	 * 
	 */
	public String getName();

	/**
	 * 获得父节点
	 * 
	 * @return
	 */
	public ITParent getParent();

	/**
	 * 获得根节点相对路径，以SLASH分割，如testProject/sysConfig/thisName。
	 * 
	 * @return 项目相对路径
	 */
	public String getPath();

	/**
	 * 获得项目节点。
	 * <p>
	 * 判断依据是向上追溯，找到父节点为空的祖先节点。
	 * 
	 * @return
	 * 
	 */
	public ITParent getProject();

	/**
	 * 获得节点UI描述对象。
	 * 
	 * @return 节点UI描述对象
	 * 
	 */
	public ITObjectUI getTObjectUI();

	/**
	 * 设置节点名字
	 * 
	 * @param newName
	 * 
	 */
	public void setName(String newName);

	/**
	 * 设置父节点
	 * 
	 * @param parent
	 * 
	 */
	public void setParent(ITParent parent);

	/**
	 * 设置UI描述对象。
	 * 
	 * @param tObjUI
	 * 
	 */
	public void setTObjectUI(ITObjectUI tObjUI);
}
