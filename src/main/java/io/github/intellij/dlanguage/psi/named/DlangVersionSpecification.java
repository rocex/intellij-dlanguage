
package io.github.intellij.dlanguage.psi.named;

import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import io.github.intellij.dlanguage.psi.interfaces.DNamedElement;
import io.github.intellij.dlanguage.psi.interfaces.Declaration;
import io.github.intellij.dlanguage.stubs.VersionSpecificationStub;
import org.jetbrains.annotations.Nullable;


public interface DlangVersionSpecification extends PsiElement, DNamedElement, Declaration,
    StubBasedPsiElement<VersionSpecificationStub> {

    @Nullable
    PsiElement getKW_VERSION();

    @Nullable
    PsiElement getOP_EQ();

    @Nullable
    PsiElement getIdentifier();

    @Nullable
    PsiElement getOP_PAR_RIGHT();

    @Nullable
    PsiElement getOP_PAR_LEFT();

    @Nullable
    PsiElement getINTEGER_LITERAL();

    @Nullable
    PsiElement getOP_SCOLON();

}
