/**
 * @copyright actri.avic
 */
package avic.actri.tmodel.impl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import org.eclipse.core.resources.IResource;

import avic.actri.tmodel.core.ITObject;
import avic.actri.tmodel.core.ITParent;

/**
 * @author tdan 2009-10-26
 * 
 */
public class TParent extends TObject implements ITParent {

	protected List<ITObject> fChildren;

	public TParent(String name) {
		super(name);
	}

	public TParent(IResource res) {
		super(res);
	}

	protected void initlize() {
		if (fChildren == null) {
			fChildren = new LinkedList<ITObject>();
		}
	}

	public void addAll(ITObject[] children) {
		for (ITObject element : children) {
			addChild(element);
		}
	}

	synchronized public void addChild(ITObject child) {
		fChildren.add(child);
		child.setParent(this);
	}

	public boolean canCopy() {
		return true;
	}

	public boolean canDelete() {
		return true;
	}

	public boolean canPaste(ITObject[] childs) {
		for (ITObject child : childs) {
			if (getChild(child.getName()) != null) {
				return true;
			}
		}

		return false;
	}

	public boolean checkState() {
		Iterator<ITObject> iterator = fChildren.iterator();
		while (iterator.hasNext()) {
			if (!iterator.next().checkState()) {
				return false;
			}
		}

		return true;
	}

	@Override
	public ITObject getChild(int index) {
		if (0 <= index && index < (getListChildren().size() - 1)) {
			return getListChildren().get(index);
		} else {
			return null;
		}
	}

	public ITObject getChild(String childName) {
		return getChild(childName, null);
	}

	public ITObject getChild(String childName, Class<?> clss) {
		if (childName == null) {
			return null;
		}

		Iterator<ITObject> Iterator = fChildren.iterator();
		while (Iterator.hasNext()) {
			ITObject child = Iterator.next();
			if (clss == null) {
				clss = child.getClass();
			}

			if (clss.isAssignableFrom(child.getClass())
					&& child.getName().equals(childName)) {
				return child;
			} else {
				clss = null;
			}
		}

		return null;
	}

	@Override
	public int getChildIndex(ITObject child) {
		return getListChildren().indexOf(child);
	}

	public Iterator<ITObject> getChildIterator() {
		return fChildren.iterator();
	}

	public ITObject[] getChildren() {
		return fChildren.toArray(new ITObject[fChildren.size()]);
	}

	public List<ITObject> getChildren(Class<?> clss) {
		return getChildren(new Class<?>[] { clss });
	}

	public List<ITObject> getChildren(Class<?>[] clsses) {
		List<ITObject> children = new LinkedList<ITObject>();
		for (ITObject itObject : fChildren) {
			for (Class<?> clss : clsses) {
				if (clss.isAssignableFrom(itObject.getClass())) {
					children.add(itObject);
				}
			}
		}

		return children;
	}

	public List<ITObject> getDeepChild(Class<?> clss) {
		List<ITObject> children = new LinkedList<ITObject>();
		for (ITObject itObject : fChildren) {
			if (clss.isAssignableFrom(itObject.getClass())) {
				children.add(itObject);
			}

			if (itObject instanceof ITParent) {
				children.addAll(((ITParent) itObject).getDeepChild(clss));
			}
		}

		return children;
	}

	public ITObject getDeepChild(String childName) {
		return getDeepChild(childName, null);
	}

	public ITObject getDeepChild(String childName, Class<?> clss) {
		ITObject tObj = getChild(childName, clss);
		if (tObj != null) {
			return tObj;
		}

		Iterator<ITObject> iterator = getChildIterator();
		while (iterator.hasNext()) {
			ITObject child = iterator.next();
			if (child instanceof ITParent) {
				ITObject newChild = ((ITParent) child).getDeepChild(childName,
						clss);
				if (newChild != null) {
					return newChild;
				}
			}
		}

		return null;
	}

	public List<ITObject> getListChildren() {
		return fChildren;
	}

	public List<ITObject> getListChildren(Class<?> clss) {
		List<ITObject> children = new LinkedList<ITObject>();

		Iterator<ITObject> Iterator = fChildren.iterator();
		while (Iterator.hasNext()) {
			ITObject child = Iterator.next();
			if (clss.equals(child.getClass())) {
				children.add(child);
			}
		}

		return children;
	}

	public ITObject getPathChild(String path) {
		return getPathChild(path, null);
	}

	public ITObject getPathChild(String path, Class<?> clss) {
		StringTokenizer st = new StringTokenizer(path, SLASH);
		ITParent parent = this;
		while (st.hasMoreTokens()) {
			String childName = st.nextToken();
			ITObject child = parent.getChild(childName);
			if (child == null) {
				return null;
			}

			if (!st.hasMoreTokens()) {
				// 查找结束
				if ((clss == null) || child.getClass().equals(clss)) {
					return child;
				} else {
					return null;
				}
			} else {
				// 继续查找
				if (child instanceof ITParent) {
					parent = (ITParent) child;
				} else {
					return null;
				}
			}
		}

		return null;
	}

	public boolean hasChild(ITObject child) {
		if (child == null) {
			return false;
		}

		for (ITObject tObj : fChildren) {
			if (tObj.equals(child)) {
				return true;
			}
		}

		return false;
	}

	public boolean hasChildren() {
		return fChildren.size() > 0;
	}

	public boolean hasDeepChild(Class<?>[] clsses) {
		for (int i = 0; i < clsses.length; i++) {
			if (getDeepChild(clsses[i]).size() > 0) {
				return true;
			}
		}

		return false;
	}

	public void paste(ITObject[] childs) throws Exception {
		for (ITObject child : childs) {
			child.delete();
			addChild(child);
		}
	}

	public void refresh() throws Exception {
		fChildren.clear();
		initlize();
	}

	synchronized public void removeAll() {
		Iterator<ITObject> iterator = fChildren.iterator();
		while (iterator.hasNext()) {
			removeChild(iterator.next());
		}
	}

	synchronized public void removeChild(ITObject child) {
		fChildren.remove(child);
		child.setParent(null);
	}
}