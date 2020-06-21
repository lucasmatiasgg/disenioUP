package com.laboratorio.ide;

public class IdeaBuilder {
	private Idea idea;
	
	public IdeaBuilder() {
		idea = new Idea();
	}
	
	public IdeaBuilder addNombre(String nombre) {
		idea.setNombre(nombre);
		return this;
	}
	
	public IdeaBuilder addVersion(String version) {
		idea.setVersion(version);
		return this;
	}
	
	public Ide build() {
		return idea;
	}
}
