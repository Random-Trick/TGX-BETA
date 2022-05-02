package p187n4;

import android.os.Bundle;
import java.util.Arrays;
import p020b5.C1190c;
import p174m3.AbstractC6609h;
import p358z6.AbstractC11396q;

public final class C7233t0 implements AbstractC6609h {
    public static final C7233t0 f23027M = new C7233t0(new C7227r0[0]);
    public static final AbstractC6609h.AbstractC6610a<C7233t0> f23028N = C7229s0.f23026a;
    public final int f23029a;
    public final C7227r0[] f23030b;
    public int f23031c;

    public C7233t0(C7227r0... r0VarArr) {
        this.f23030b = r0VarArr;
        this.f23029a = r0VarArr.length;
    }

    public static String m17243d(int i) {
        return Integer.toString(i, 36);
    }

    public static C7233t0 m17242e(Bundle bundle) {
        return new C7233t0((C7227r0[]) C1190c.m38114c(C7227r0.f23022M, bundle.getParcelableArrayList(m17243d(0)), AbstractC11396q.m768D()).toArray(new C7227r0[0]));
    }

    public C7227r0 m17245b(int i) {
        return this.f23030b[i];
    }

    public int m17244c(C7227r0 r0Var) {
        for (int i = 0; i < this.f23029a; i++) {
            if (this.f23030b[i] == r0Var) {
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
        return this.f23029a == t0Var.f23029a && Arrays.equals(this.f23030b, t0Var.f23030b);
    }

    public int hashCode() {
        if (this.f23031c == 0) {
            this.f23031c = Arrays.hashCode(this.f23030b);
        }
        return this.f23031c;
    }
}
