/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.qualificationdata.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.qualificationdata.ui.internal.QualificationdataActivator;

public class MyUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return QualificationdataActivator.getInstance().getInjector("org.xtext.example.qualificationdata.My");
	}

}
