/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.impl;

import org.eclipse.core.resources.IResource;

import avic.actri.tmodel.core.ITObject;
import avic.actri.tmodel.core.ITObjectUI;
import avic.actri.tmodel.core.ITParent;

/**
 * @author tdan 2009-10-26
 * 
 */
public class TObject implements ITObject {

	protected String fName;

	private ITParent fParent;

	private IResource fResource;

	private ITObjectUI fTObjUI;

	public TObject(IResource res) {
		this(res != null ? res.getName() : "");
		setResource(res);
		initlize();
	}

	protected void initlize() {
	}

	public TObject(String name) {
		fName = name;
	}

	public boolean canCopy() {
		return true;
	}

	public boolean canDelete() {
		return true;
	}

	public boolean canPaste(ITObject[] childs) {
		return false;
	}

	public boolean canReName() {
		return true;
	}

	public boolean canReNameTo(String newName) {
		return getParent().getChild(newName) == null;
	}

	public boolean checkState() {
		return true;
	}

	public void delete() throws Exception {
		if (getParent() != null) {
			getParent().removeChild(this);
			setParent(null);
		}
	}

	public String getName() {
		return fName;
	}

	public ITParent getParent() {
		return fParent;
	}

	public String getPath() {
		StringBuffer sb = new StringBuffer();

		ITParent parent = getParent();
		if (parent != null) {
			sb.append(parent.getPath());
			sb.append(ITParent.SLASH);
		}

		sb.append(getName());

		return sb.toString();
	}

	public ITParent getProject() {
		ITParent parent = getParent();
		if ((parent.getParent() == null) && (this instanceof ITParent)) {
			return (ITParent) this;
		}

		return parent.getProject();
	}

	public IResource getResource() {
		return fResource;
	}

	public ITObjectUI getTObjectUI() {
		return fTObjUI;
	}

	public void paste(ITObject[] childs) throws Exception {
	}

	public void reName(String newName) throws Exception {
		setName(newName);
	}

	public void setName(String newName) {
		fName = newName;
	}

	public void setParent(ITParent parent) {
		fParent = parent;
	}

	public void setResource(IResource resource) {
		fResource = resource;
	}

	public void setTObjectUI(ITObjectUI tObjUI) {
		fTObjUI = tObjUI;
	}

	public String toString() {
		return getName();
	}
}
