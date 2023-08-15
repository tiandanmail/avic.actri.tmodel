/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.core;

import org.eclipse.core.resources.IResource;

/**
 * 节点资源接口。
 * 
 * @author tdan 2009-10-26
 * 
 * @implements SDD_IDE_RUNTIME_CORE_031,SDD_DESC_IDE_RUNTIME_CORE_032
 */
public interface ITResourceObject {

	/**
	 * 获得节点对应的资源。
	 * 
	 * @return 节点对应的资源或null
	 */
	public IResource getResource();

	/**
	 * 设置节点对应的资源。
	 * 
	 * @param resource
	 *            待设置的资源
	 */
	public void setResource(IResource resource);
}
