/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.core;


/**
 * 模型元素位置交换位置器
 * 
 * @author tdan 2009-10-26
 * 
 */
public interface IExchanger {

	/**
	 * 是否可以与指定位置的模型元素交换位置。
	 * 
	 * @param tObject
	 *            指定位置的模型元素
	 * @return
	 */
	public boolean exchangeable(ITObject tObject);

	/**
	 * 与指定位置的模型元素交换位置。
	 * 
	 * @param tObject
	 *            指定位置的模型元素
	 * @throws Exception
	 */
	public void exchangeto(ITObject tObject) throws Exception;
}
