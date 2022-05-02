package p187n4;

import android.os.Bundle;
import java.util.Arrays;
import p020b5.C1190c;
import p174m3.AbstractC6609h;
import p358z6.AbstractC11396q;

public final class C7233t0 implements AbstractC6609h {
    public static final C7233t0 f23030M = new C7233t0(new C7227r0[0]);
    public static final AbstractC6609h.AbstractC6610a<C7233t0> f23031N = C7229s0.f23029a;
    public final int f23032a;
    public final C7227r0[] f23033b;
    public int f23034c;

    public C7233t0(C7227r0... r0VarArr) {
        this.f23033b = r0VarArr;
        this.f23032a = r0VarArr.length;
    }

    public static String m17243d(int i) {
        return Integer.toString(i, 36);
    }

    public static C7233t0 m17242e(Bundle bundle) {
        return new C7233t0((C7227r0[]) C1190c.m38117c(C7227r0.f23025M, bundle.getParcelableArrayList(m17243d(0)), AbstractC11396q.m768D()).toArray(new C7227r0[0]));
    }

    public C7227r0 m17245b(int i) {
        return this.f23033b[i];
    }

    public int m17244c(C7227r0 r0Var) {
        for (int i = 0; i < this.f23032a; i++) {
            if (this.f23033b[i] == r0Var) {
                return i;
            }
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7233t0.class != obj.getClass()) {
            return false;
        }
        C7233t0 t0Var = (C7233t0) obj;
        return this.f23032a == t0Var.f23032a && Arrays.equals(this.f23033b, t0Var.f23033b);
    }

    public int hashCode() {
        if (this.f23034c == 0) {
            this.f23034c = Arrays.hashCode(this.f23033b);
        }
        return this.f23034c;
    }
}
