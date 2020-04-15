package org.openxava.test.actions;

import org.openxava.actions.*;

/**
 * @author Ana Andres
 * Created on 15 abr. 2020
 */
public class ChangeNameGroupOrSection extends ViewBaseAction{
	private boolean group = true;

	@Override
	public void execute() throws Exception {
		if (isGroup()) {
			System.out.println("[ChangeNameGroupOrSection.execute] grupo..."); // tmp
			getView().getGroupView("deliveryData").setTitle("Grupo alternativo");
		}
		else {	// section
			System.out.println("[ChangeNameGroupOrSection.execute] secci�n..."); // tmp
			getView().getSectionView(1).setTitle("Secci�n alternativa");
		}
	}

	public boolean isGroup() {
		return group;
	}

	public void setGroup(boolean group) {
		this.group = group;
	}

}
