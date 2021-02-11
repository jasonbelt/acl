package org.sireum.aadl.osate.acl.parsing;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporter;
import org.osate.annexsupport.AnnexParseUtil;
import org.osate.annexsupport.AnnexParser;
import org.sireum.aadl.osate.acl.parser.antlr.ACLParser;
import org.sireum.aadl.osate.acl.services.ACLGrammarAccess;

import com.google.inject.Inject;
import com.google.inject.Injector;

import antlr.RecognitionException;

public class ACLAnnexParser implements AnnexParser {

	@Inject
	private ACLParser aclParser;

	public ACLAnnexParser() {
		Injector injector = IResourceServiceProvider.Registry.INSTANCE
				.getResourceServiceProvider(URI.createFileURI("dummy.acl")).get(Injector.class);
		injector.injectMembers(this);
	}

	protected ACLGrammarAccess getGrammarAccess() {
		return aclParser.getGrammarAccess();
	}

	@Override
	public AnnexLibrary parseAnnexLibrary(String annexName, String source, String filename, int line, int column,
			ParseErrorReporter errReporter) throws RecognitionException {
		// AnnexLibrary al (AnnexLibrary) AnnexParseUtil.isValidParseResult(aclParser,
		// source, getGrammarAccess().get.getAclModelLibraryRule(), filename, line, column, errReporter);
		return null;
	}

	@Override
	public AnnexSubclause parseAnnexSubclause(String annexName, String source, String filename, int line, int column,
			ParseErrorReporter errReporter) throws RecognitionException {
		// TODO Auto-generated method stub
		AnnexSubclause as = (AnnexSubclause) AnnexParseUtil.parse(aclParser, source,
				getGrammarAccess().getAclSubclauseRule(), filename, line, column, errReporter);
		return as;
	}

}
