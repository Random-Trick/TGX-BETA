package p356z4;

import p020b5.C1216l0;
import p174m3.C6644l3;
import p174m3.C6709v2;

public final class C11282u {
    public final int f36195a;
    public final C6709v2[] f36196b;
    public final AbstractC11265j[] f36197c;
    public final C6644l3 f36198d;
    public final Object f36199e;

    public C11282u(C6709v2[] v2VarArr, AbstractC11265j[] jVarArr, C6644l3 l3Var, Object obj) {
        this.f36196b = v2VarArr;
        this.f36197c = (AbstractC11265j[]) jVarArr.clone();
        this.f36198d = l3Var;
        this.f36199e = obj;
        this.f36195a = v2VarArr.length;
    }

    public boolean m958a(C11282u uVar) {
        if (uVar == null || uVar.f36197c.length != this.f36197c.length) {
            return false;
        }
        for (int i = 0; i < this.f36197c.length; i++) {
            if (!m957b(uVar, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean m957b(C11282u uVar, int i) {
        return uVar != null && C1216l0.m37985c(this.f36196b[i], uVar.f36196b[i]) && C1216l0.m37985c(this.f36197c[i], uVar.f36197c[i]);
    }

    public boolean m956c(int i) {
        return this.f36196b[i] != null;
    }
}
