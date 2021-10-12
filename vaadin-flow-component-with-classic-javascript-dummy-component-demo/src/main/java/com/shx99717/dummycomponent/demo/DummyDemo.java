package com.shx99717.dummycomponent.demo;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.shx99717.dummycomponent.DummyComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * Visit at http://localhost:8080/dummy_demo
 */
@Route("dummy_demo")
public class DummyDemo extends VerticalLayout {
	private static final Logger LOGGER = LoggerFactory.getLogger(DummyDemo.class);

	@Inject
	private DummyComponent dummyComponent;

	public DummyDemo() {
		dummyComponent = new DummyComponent();
		LOGGER.info("Hello here " + dummyComponent);
		add(dummyComponent);
	}
}
