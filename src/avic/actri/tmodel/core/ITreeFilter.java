/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.core;

/**
 * ������
 * 
 * @author tdan 2009-10-26
 * 
 */
public interface ITreeFilter {

	/**
	 * �жϸýڵ��ܷ���ˡ�
	 * 
	 * @return
	 */
	public boolean canFilter();

	/**
	 * ��ýڵ������ģʽƥ���ַ�����
	 * 
	 * @return
	 */
	public String getFilter();
}
