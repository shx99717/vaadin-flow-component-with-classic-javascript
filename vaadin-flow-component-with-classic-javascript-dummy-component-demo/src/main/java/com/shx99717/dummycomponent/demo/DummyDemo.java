package com.shx99717.dummycomponent.demo;

import com.shx99717.dummycomponent.DummyComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * Visit at http://localhost:8080/dummy_demo
 */
@Route("dummy_demo")
public class DummyDemo extends VerticalLayout {

    public DummyDemo() {
    	DummyComponent dummyComponent = new DummyComponent();
    	add(dummyComponent);
        
    }
}
