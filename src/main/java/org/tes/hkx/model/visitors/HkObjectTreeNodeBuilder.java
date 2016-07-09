package org.tes.hkx.model.visitors;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.tree.DefaultMutableTreeNode;

import org.tes.hkx.lib.HkobjectType;
import org.tes.hkx.model.IHkParentVisitor;
import org.tes.hkx.model.IHkVisitable;

public class HkObjectTreeNodeBuilder implements IHkParentVisitor<DefaultMutableTreeNode> {

	private final DefaultMutableTreeNode root;

	private final Map<IHkVisitable, DefaultMutableTreeNode> nodeMap = new HashMap<>();
	private final Set<IHkVisitable> visitedSet = new HashSet<>();
	private DefaultMutableTreeNode lasthkparent = null;

	public HkObjectTreeNodeBuilder() {
		root = new DefaultMutableTreeNode();
	}

	public HkObjectTreeNodeBuilder(DefaultMutableTreeNode root) {
		this.root = root;
	}

	@Override
	public DefaultMutableTreeNode getResults() {
		return root;
	}

	@Override
	public void visit(IHkVisitable obj, IHkVisitable parent) {
		if (!visitedSet.contains(obj)) {
			DefaultMutableTreeNode parentNode = nodeMap.get(parent);
			if (parentNode == null) {
				root.setUserObject(parent);
				parentNode = root;
				lasthkparent = root;
				nodeMap.put(parent, root);
				return;
			}
			DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(obj);
//			if (obj.getClass().getSuperclass().equals(HkobjectType.class)) {
//				if (parent.getClass().getSuperclass().equals(HkobjectType.class))
//				{
//					parentNode.add(newNode);
//					lasthkparent = parentNode;
//				} else {
//					lasthkparent.add(newNode);
//				}
//				
//			}
			parentNode.add(newNode);
			nodeMap.put(obj, newNode);	
			visitedSet.add(obj);
		}
	}

}
