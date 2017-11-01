package actions;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.Action;

/**
 * An action that can be run to enable or disable another action.
 * 
 * @author Daniel Ortyn
 * @version 1.0
 * @since Jul 11, 2017
 *
 */
public class SetActionEnable implements Action {

	private boolean enabled = true;
	private boolean stateToSet;
	private Action heldAction;

	/**
	 * Creates the action
	 * 
	 * @param the
	 *            boolean to set the action state to
	 */
	public SetActionEnable(Action heldAction, boolean setState) {
		this.heldAction = heldAction;
		stateToSet = setState;
	}

	/**
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (enabled) {
			this.heldAction.setEnabled(stateToSet);
		}
	}


	/**
	 * Does nothing
	 * 
	 * @deprecated Does nothing
	 */
	@Override
	public Object getValue(String key) {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * Does nothing
	 * 
	 * @deprecated Does nothing
	 */
	@Override
	public void putValue(String key, Object value) {

	}

	/**
	 * @see javax.swing.Action#setEnabled(boolean)
	 */
	@Override
	public void setEnabled(boolean b) {
		this.enabled = b;
	}

	/**
	 * @see javax.swing.Action#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		return this.enabled;
	}

	/**
	 * Does nothing
	 * 
	 * @deprecated Does nothing
	 */
	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
	}

	/**
	 * Does nothing
	 * 
	 * @deprecated Does nothing
	 */
	@Override
	public void removePropertyChangeListener(PropertyChangeListener listener) {
	}

}
