package org.sireum.aadl.osate.acl.scoping;

import java.util.List;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.osate.aadl2.modelsupport.util.AadlUtil;

@SuppressWarnings("all")
public class ACLImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @Override
  protected List<ImportNormalizer> getImplicitImports(final boolean ignoreCase) {
    final Function1<String, ImportNormalizer> _function = (String it) -> {
      QualifiedName _create = QualifiedName.create(it);
      return new ImportNormalizer(_create, true, ignoreCase);
    };
    return IterableExtensions.<ImportNormalizer>toList(IterableExtensions.<String, ImportNormalizer>map(AadlUtil.getPredeclaredPropertySetNames(), _function));
  }
}
