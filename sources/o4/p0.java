package o4;

import a7.q;
import android.os.Bundle;
import c5.a;
import c5.c;
import c5.s;
import java.util.Arrays;
import m3.h;
import m3.q1;
import org.thunderdog.challegram.Log;

public final class p0 implements h {
    public static final h.a<p0> N = o0.f19165a;
    public int M;
    public final int f19166a;
    public final String f19167b;
    public final q1[] f19168c;

    public p0(String str, q1... q1VarArr) {
        a.a(q1VarArr.length > 0);
        this.f19167b = str;
        this.f19168c = q1VarArr;
        this.f19166a = q1VarArr.length;
        i();
    }

    public static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public static p0 e(Bundle bundle) {
        return new p0(bundle.getString(d(1), ""), (q1[]) c.c(q1.f16897q0, bundle.getParcelableArrayList(d(0)), q.D()).toArray(new q1[0]));
    }

    public static void f(String str, String str2, String str3, int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 78 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append("Different ");
        sb2.append(str);
        sb2.append(" combined in one TrackGroup: '");
        sb2.append(str2);
        sb2.append("' (track 0) and '");
        sb2.append(str3);
        sb2.append("' (track ");
        sb2.append(i10);
        sb2.append(")");
        s.d("TrackGroup", "", new IllegalStateException(sb2.toString()));
    }

    public static String g(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public static int h(int i10) {
        return i10 | Log.TAG_VIDEO;
    }

    public q1 b(int i10) {
        return this.f19168c[i10];
    }

    public int c(q1 q1Var) {
        int i10 = 0;
        while (true) {
            q1[] q1VarArr = this.f19168c;
            if (i10 >= q1VarArr.length) {
                return -1;
            }
            if (q1Var == q1VarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p0.class != obj.getClass()) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return this.f19166a == p0Var.f19166a && this.f19167b.equals(p0Var.f19167b) && Arrays.equals(this.f19168c, p0Var.f19168c);
    }

    public int hashCode() {
        if (this.M == 0) {
            this.M = ((527 + this.f19167b.hashCode()) * 31) + Arrays.hashCode(this.f19168c);
        }
        return this.M;
    }

    public final void i() {
        String g10 = g(this.f19168c[0].f16902c);
        int h10 = h(this.f19168c[0].N);
        int i10 = 1;
        while (true) {
            q1[] q1VarArr = this.f19168c;
            if (i10 >= q1VarArr.length) {
                return;
            }
            if (!g10.equals(g(q1VarArr[i10].f16902c))) {
                q1[] q1VarArr2 = this.f19168c;
                f("languages", q1VarArr2[0].f16902c, q1VarArr2[i10].f16902c, i10);
                return;
            } else if (h10 != h(this.f19168c[i10].N)) {
                f("role flags", Integer.toBinaryString(this.f19168c[0].N), Integer.toBinaryString(this.f19168c[i10].N), i10);
                return;
            } else {
                i10++;
            }
        }
    }
}
