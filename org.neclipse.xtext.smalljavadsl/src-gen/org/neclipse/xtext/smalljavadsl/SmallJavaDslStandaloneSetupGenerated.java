/*
 * generated by Xtext 2.10.0-SNAPSHOT
 */
package org.neclipse.xtext.smalljavadsl;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.TerminalsStandaloneSetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.neclipse.xtext.smalljavadsl.smallJavaDsl.SmallJavaDslPackage;

@SuppressWarnings("all")
public class SmallJavaDslStandaloneSetupGenerated implements ISetup {

	@Override
	public Injector createInjectorAndDoEMFRegistration() {
		TerminalsStandaloneSetup.doSetup();

		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new SmallJavaDslRuntimeModule());
	}
	
	public void register(Injector injector) {
		if (!EPackage.Registry.INSTANCE.containsKey("http://www.neclipse.org/xtext/smalljavadsl/SmallJavaDsl")) {
			EPackage.Registry.INSTANCE.put("http://www.neclipse.org/xtext/smalljavadsl/SmallJavaDsl", SmallJavaDslPackage.eINSTANCE);
		}
		IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
		IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("smalljava", resourceFactory);
		IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("smalljava", serviceProvider);
	}
}
