/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.core;


/**
 * ģ��Ԫ��λ�ý���λ����
 * 
 * @author tdan 2009-10-26
 * 
 */
public interface IExchanger {

	/**
	 * �Ƿ������ָ��λ�õ�ģ��Ԫ�ؽ���λ�á�
	 * 
	 * @param tObject
	 *            ָ��λ�õ�ģ��Ԫ��
	 * @return
	 */
	public boolean exchangeable(ITObject tObject);

	/**
	 * ��ָ��λ�õ�ģ��Ԫ�ؽ���λ�á�
	 * 
	 * @param tObject
	 *            ָ��λ�õ�ģ��Ԫ��
	 * @throws Exception
	 */
	public void exchangeto(ITObject tObject) throws Exception;
}
