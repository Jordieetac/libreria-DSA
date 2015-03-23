package edu.upc.eetac.dsa.jordieetac.lib.api;
import org.glassfish.jersey.server.ResourceConfig;

public class LibreriaApplication extends ResourceConfig{
	public LibreriaApplication() {
		super();
		register(DeclarativeLinkingFeature.class);
	}
}