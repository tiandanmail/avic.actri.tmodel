/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.core;

/**
 * 过滤器
 * 
 * @author tdan 2009-10-26
 * 
 */
public interface ITreeFilter {

	/**
	 * 判断该节点能否过滤。
	 * 
	 * @return
	 */
	public boolean canFilter();

	/**
	 * 获得节点过滤器模式匹配字符串。
	 * 
	 * @return
	 */
	public String getFilter();
}
