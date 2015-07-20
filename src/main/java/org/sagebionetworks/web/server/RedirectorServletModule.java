package org.sagebionetworks.web.server;

import org.sagebionetworks.web.server.servlet.RedirectorServlet;

import com.google.inject.Singleton;
import com.google.inject.servlet.ServletModule;

/**
 * Binds the service servlets to their paths and any other 
 * Guice binding required on the server side.
 * 
 */
public class RedirectorServletModule extends ServletModule {
	

	@Override
	protected void configureServlets() {
		//do sftp operations
		bind(RedirectorServlet.class).in(Singleton.class);
		serve("/redirect").with(RedirectorServlet.class);
	}
}
