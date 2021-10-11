package com.shx99717.dummycomponent;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;

@CssImport("./module.css")
public class DummyComponent extends Div {

	public DummyComponent() {
		addClassName("dummy-component");
		loadClassicJavascripts();

		H1 dummyLabel = new H1("I am a dummy component with classic javascripts");
		add(dummyLabel);

		Button dummyButton = new Button("call some functions in the classic javascript");
		add(dummyButton);

		dummyButton.addClickListener(e -> {
			UI.getCurrent().getPage().executeJs("dummyMethod()");
		});
	}

	private void loadClassicJavascripts() {
		UI.getCurrent().getPage().addJavaScript("context://js/dummy-classic-js.js");
	}

}
