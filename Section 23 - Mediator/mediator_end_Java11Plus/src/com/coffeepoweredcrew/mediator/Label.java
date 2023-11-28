package com.coffeepoweredcrew.mediator;

public class Label extends javafx.scene.control.Label implements UIControl{

	private UIMediator mediator;
	
	public Label(UIMediator mediator) {
		this.mediator = mediator;
		this.setMinWidth(100);
		this.setText("Label");
		mediator.register(this); //label is read only
	}
	
	@Override
	public void controlChanged(UIControl control) {
		setText(control.getControlValue());
	}

	@Override
	public String getControlValue() {
		return getText();
	}

	@Override
	public String getControlName() {
		return "Label";
	}

	
}
