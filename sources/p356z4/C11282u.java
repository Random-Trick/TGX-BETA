package p356z4;

import p020b5.C1216l0;
import p174m3.C6644l3;
import p174m3.C6709v2;

public final class C11282u {
    public final int f36192a;
    public final C6709v2[] f36193b;
    public final AbstractC11265j[] f36194c;
    public final C6644l3 f36195d;
    public final Object f36196e;

    public C11282u(C6709v2[] v2VarArr, AbstractC11265j[] jVarArr, C6644l3 l3Var, Object obj) {
        this.f36193b = v2VarArr;
        this.f36194c = (AbstractC11265j[]) jVarArr.clone();
        this.f36195d = l3Var;
        this.f36196e = obj;
        this.f36192a = v2VarArr.length;
    }

    public boolean m958a(C11282u uVar) {
        if (uVar == null || uVar.f36194c.length != this.f36194c.length) {
            return false;
        }
        for (int i = 0; i < this.f36194c.length; i++) {
            if (!m957b(uVar, i)) {
                return false;
            }
        }
        return true;
    }

    public boolean m957b(C11282u uVar, int i) {
        return uVar != null && C1216l0.m37982c(this.f36193b[i], uVar.f36193b[i]) && C1216l0.m37982c(this.f36194c[i], uVar.f36194c[i]);
    }

    public boolean m956c(int i) {
        return this.f36193b[i] != null;
    }
}
