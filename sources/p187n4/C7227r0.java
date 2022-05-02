package p187n4;

import android.os.Bundle;
import java.util.Arrays;
import org.thunderdog.challegram.Log;
import p020b5.C1186a;
import p020b5.C1190c;
import p020b5.C1230s;
import p174m3.AbstractC6609h;
import p174m3.C6600g1;
import p358z6.AbstractC11396q;

public final class C7227r0 implements AbstractC6609h {
    public static final AbstractC6609h.AbstractC6610a<C7227r0> f23022M = C7225q0.f23016a;
    public final int f23023a;
    public final C6600g1[] f23024b;
    public int f23025c;

    public C7227r0(C6600g1... g1VarArr) {
        C1186a.m38189a(g1VarArr.length > 0);
        this.f23024b = g1VarArr;
        this.f23023a = g1VarArr.length;
        m17265i();
    }

    public static String m17270d(int i) {
        return Integer.toString(i, 36);
    }

    public static C7227r0 m17269e(Bundle bundle) {
        return new C7227r0((C6600g1[]) C1190c.m38114c(C6600g1.f20566q0, bundle.getParcelableArrayList(m17270d(0)), AbstractC11396q.m768D()).toArray(new C6600g1[0]));
    }

    public static void m17268f(String str, String str2, String str3, int i) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 78 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append("Different ");
        sb2.append(str);
        sb2.append(" combined in one TrackGroup: '");
        sb2.append(str2);
        sb2.append("' (track 0) and '");
        sb2.append(str3);
        sb2.append("' (track ");
        sb2.append(i);
        sb2.append(")");
        C1230s.m37886d("TrackGroup", "", new IllegalStateException(sb2.toString()));
    }

    public static String m17267g(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public static int m17266h(int i) {
        return i | Log.TAG_VIDEO;
    }

    public C6600g1 m17272b(int i) {
        return this.f23024b[i];
    }

    public int m17271c(C6600g1 g1Var) {
        int i = 0;
        while (true) {
            C6600g1[] g1VarArr = this.f23024b;
            if (i >= g1VarArr.length) {
                return -1;
            }
            if (g1Var == g1VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7227r0.class != obj.getClass()) {
            return false;
        }
        C7227r0 r0Var = (C7227r0) obj;
        return this.f23023a == r0Var.f23023a && Arrays.equals(this.f23024b, r0Var.f23024b);
    }

    public int hashCode() {
        if (this.f23025c == 0) {
            this.f23025c = 527 + Arrays.hashCode(this.f23024b);
        }
        return this.f23025c;
    }

    public final void m17265i() {
        String g = m17267g(this.f23024b[0].f20585c);
        int h = m17266h(this.f23024b[0].f20568N);
        int i = 1;
        while (true) {
            C6600g1[] g1VarArr = this.f23024b;
            if (i >= g1VarArr.length) {
                return;
            }
            if (!g.equals(m17267g(g1VarArr[i].f20585c))) {
                C6600g1[] g1VarArr2 = this.f23024b;
                m17268f("languages", g1VarArr2[0].f20585c, g1VarArr2[i].f20585c, i);
                return;
            } else if (h != m17266h(this.f23024b[i].f20568N)) {
                m17268f("role flags", Integer.toBinaryString(this.f23024b[0].f20568N), Integer.toBinaryString(this.f23024b[i].f20568N), i);
                return;
            } else {
                i++;
            }
        }
    }
}
