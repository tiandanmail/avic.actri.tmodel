/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.impl;

import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import avic.actri.tmodel.core.ITObject;
import avic.actri.tmodel.core.ITObjectUI;
import avic.actri.tmodel.core.ITParent;

/**
 * 节点UI
 * 
 * @author tdan 2009-10-26
 * 
 */
public class TObjectUI implements ITObjectUI {
	private static Color RED = Display.getDefault().getSystemColor(
			SWT.COLOR_RED);
	private static Color YELLOW = Display.getDefault().getSystemColor(
			SWT.COLOR_YELLOW);

	private ITObject fTObject = null;

	public TObjectUI() {
	}

	public TObjectUI(ITObject tObject) {
		setTObject(tObject);
	}

	public void createMenu(IMenuManager manager, TreeViewer viewer) {
	}

	public void createNewMenu(IMenuManager manager, TreeViewer viewer) {
	}

	public Color getBackground() {
		return null;
	}

	public String getDecorateImage() {
		return null;
	}

	public Color getForeground() {
		switch (getState()) {
		case ERROR:
			return RED;
		case WARNNING:
			return YELLOW;
		default:
			return null;
		}
	}

	public Image getImage() {
		if (getTObject() instanceof ITParent) {
			return PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_OBJ_FOLDER);
		} else {
			return PlatformUI.getWorkbench().getSharedImages()
					.getImage(ISharedImages.IMG_OBJ_ELEMENT);
		}
	}

	public ObjState getState() {
		// 默认正常状态
		return ObjState.OK;
	}

	public ITObject getTObject() {
		return fTObject;
	}

	public void setTObject(ITObject tObject) {
		fTObject = tObject;
	}

	public String toString() {
		return getTObject().getName();
	}
}
