/*
 * generated by Xtext 2.27.0
 */
package org.xtext.example.qualificationdata.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class MyAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/xtext/example/qualificationdata/parser/antlr/internal/InternalMy.tokens");
	}
}
