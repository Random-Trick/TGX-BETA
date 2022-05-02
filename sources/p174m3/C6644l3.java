package p174m3;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import p020b5.C1186a;
import p020b5.C1190c;
import p174m3.AbstractC6609h;
import p187n4.C7227r0;
import p343y6.C10431g;
import p358z6.AbstractC11396q;

public final class C6644l3 implements AbstractC6609h {
    public static final C6644l3 f20757b = new C6644l3(AbstractC11396q.m768D());
    public static final AbstractC6609h.AbstractC6610a<C6644l3> f20758c = C6633j3.f20733a;
    public final AbstractC11396q<C6645a> f20759a;

    public static final class C6645a implements AbstractC6609h {
        public static final AbstractC6609h.AbstractC6610a<C6645a> f20760N = C6638k3.f20749a;
        public final boolean[] f20761M;
        public final C7227r0 f20762a;
        public final int[] f20763b;
        public final int f20764c;

        public C6645a(C7227r0 r0Var, int[] iArr, int i, boolean[] zArr) {
            int i2 = r0Var.f23026a;
            C1186a.m38192a(i2 == iArr.length && i2 == zArr.length);
            this.f20762a = r0Var;
            this.f20763b = (int[]) iArr.clone();
            this.f20764c = i;
            this.f20761M = (boolean[]) zArr.clone();
        }

        public static String m19686b(int i) {
            return Integer.toString(i, 36);
        }

        public static C6645a m19685c(Bundle bundle) {
            C7227r0 r0Var = (C7227r0) C1190c.m38115e(C7227r0.f23025M, bundle.getBundle(m19686b(0)));
            C1186a.m38188e(r0Var);
            return new C6645a(r0Var, (int[]) C10431g.m5140a(bundle.getIntArray(m19686b(1)), new int[r0Var.f23026a]), bundle.getInt(m19686b(2), -1), (boolean[]) C10431g.m5140a(bundle.getBooleanArray(m19686b(3)), new boolean[r0Var.f23026a]));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C6645a.class != obj.getClass()) {
                return false;
            }
            C6645a aVar = (C6645a) obj;
            return this.f20764c == aVar.f20764c && this.f20762a.equals(aVar.f20762a) && Arrays.equals(this.f20763b, aVar.f20763b) && Arrays.equals(this.f20761M, aVar.f20761M);
        }

        public int hashCode() {
            return (((((this.f20762a.hashCode() * 31) + Arrays.hashCode(this.f20763b)) * 31) + this.f20764c) * 31) + Arrays.hashCode(this.f20761M);
        }
    }

    public C6644l3(List<C6645a> list) {
        this.f20759a = AbstractC11396q.m758z(list);
    }

    public static String m19689b(int i) {
        return Integer.toString(i, 36);
    }

    public static C6644l3 m19688c(Bundle bundle) {
        return new C6644l3(C1190c.m38117c(C6645a.f20760N, bundle.getParcelableArrayList(m19689b(0)), AbstractC11396q.m768D()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6644l3.class != obj.getClass()) {
            return false;
        }
        return this.f20759a.equals(((C6644l3) obj).f20759a);
    }

    public int hashCode() {
        return this.f20759a.hashCode();
    }
}
