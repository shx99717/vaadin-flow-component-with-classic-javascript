# Vaadin Flow Component With Classic Javascript
- the component will be an self-contained project result in a jar artifact that could be referenced by other project
- the component contains classic javascript files will be later loaded by referencing project, e.g. the `demo` project
- the component also contains web resources like `css`, `images` which will be bundled by webpack, please see the `@Annotation` above the `DummyComponent.java`
- we have to manipulate the `pom.xml` of the referencing project in order to make it work, please have a look the `pom.xml` of the demo project  


run the project under sub-module `vaadin-flow-component-with-classic-javascript-dummy-component-demo`

```
mvn clean package tomee:run
```

