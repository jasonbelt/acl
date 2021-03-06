/**
 * generated by Xtext 2.20.0
 */
package org.sireum.aadl.osate.acl.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sireum.aadl.osate.acl.aCL.AclSubclause;
import org.sireum.aadl.osate.acl.tests.ACLInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(ACLInjectorProvider.class)
@SuppressWarnings("all")
public class ACLParsingTest {
  @Inject
  private ParseHelper<AclSubclause> parseHelper;
  
  @Test
  public void simplePeriodic() {
    this.test("periodic");
  }
  
  @Test
  public void loadPeriodic() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("periodic");
    _builder.newLine();
    _builder.newLine();
    _builder.append("flows ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("flow1: a -fun-> d");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("flow2: a -fun-> e, f ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("flow3: b, c -fun-> d");
    _builder.newLine();
    _builder.newLine();
    _builder.append("contracts");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("assume for portA \"everything\" : TODO_predicates tracesTo <some_id>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("assume \"no \'for\'\" : TODO_predicates tracesTo <some_id>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("assume \"no tracesTo\" : TODO_predicates");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("guarantee \"a further title\" : a or b and c implies d and c orelse e");
    _builder.newLine();
    this.test(_builder.toString());
  }
  
  @Test
  public void loadHyperperiod() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("hyperperiod ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("with p1 < p2");
    _builder.newLine();
    _builder.newLine();
    _builder.append("flows ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("flow1: a -fun-> d");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("flow2 : a -fun-> e, f ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("flow3: b, c -fun-> d");
    _builder.newLine();
    _builder.newLine();
    _builder.append("contracts");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("guarantee \"a title\": a => b");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("assume for portA \"everything\" : TODO_predicates tracesTo <some_id>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("guarantee \"another title\" : a or b and c implies d");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("guarantee \"a further title\" : a or b and c implies d and c orelse e");
    _builder.newLine();
    this.test(_builder.toString());
  }
  
  public void test(final String s) {
    try {
      final AclSubclause result = this.parseHelper.parse(s);
      Assert.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder.append(_join);
      Assert.assertTrue(_builder.toString(), errors.isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
