package by.grsu.by.service;

import java.io.Serializable;

import org.apache.wicket.authorization.Action;
import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeAction;
import org.apache.wicket.markup.html.basic.Label;

@AuthorizeAction(roles = { "admin", "driver" }, action = Action.RENDER)
public class InvisibleLabelDriver extends Label {

	public InvisibleLabelDriver(String id, Serializable label) {
		super(id, label);
	}
}