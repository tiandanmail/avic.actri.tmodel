/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.core;

import org.eclipse.core.resources.IResource;

/**
 * �ڵ���Դ�ӿڡ�
 * 
 * @author tdan 2009-10-26
 * 
 * @implements SDD_IDE_RUNTIME_CORE_031,SDD_DESC_IDE_RUNTIME_CORE_032
 */
public interface ITResourceObject {

	/**
	 * ��ýڵ��Ӧ����Դ��
	 * 
	 * @return �ڵ��Ӧ����Դ��null
	 */
	public IResource getResource();

	/**
	 * ���ýڵ��Ӧ����Դ��
	 * 
	 * @param resource
	 *            �����õ���Դ
	 */
	public void setResource(IResource resource);
}
