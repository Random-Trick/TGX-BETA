package m3;

import a7.q;
import android.os.Bundle;
import c5.c;
import java.util.Arrays;
import java.util.List;
import m3.h;
import o4.p0;
import z6.g;

public final class t3 implements h {
    public static final t3 f16996b = new t3(q.D());
    public static final h.a<t3> f16997c = r3.f16951a;
    public final q<a> f16998a;

    public static final class a implements h {
        public static final h.a<a> N = s3.f16989a;
        public final boolean[] M;
        public final p0 f16999a;
        public final int[] f17000b;
        public final int f17001c;

        public a(p0 p0Var, int[] iArr, int i10, boolean[] zArr) {
            int i11 = p0Var.f19166a;
            c5.a.a(i11 == iArr.length && i11 == zArr.length);
            this.f16999a = p0Var;
            this.f17000b = (int[]) iArr.clone();
            this.f17001c = i10;
            this.M = (boolean[]) zArr.clone();
        }

        public static String b(int i10) {
            return Integer.toString(i10, 36);
        }

        public static a c(Bundle bundle) {
            p0 p0Var = (p0) c.e(p0.N, bundle.getBundle(b(0)));
            c5.a.e(p0Var);
            return new a(p0Var, (int[]) g.a(bundle.getIntArray(b(1)), new int[p0Var.f19166a]), bundle.getInt(b(2), -1), (boolean[]) g.a(bundle.getBooleanArray(b(3)), new boolean[p0Var.f19166a]));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f17001c == aVar.f17001c && this.f16999a.equals(aVar.f16999a) && Arrays.equals(this.f17000b, aVar.f17000b) && Arrays.equals(this.M, aVar.M);
        }

        public int hashCode() {
            return (((((this.f16999a.hashCode() * 31) + Arrays.hashCode(this.f17000b)) * 31) + this.f17001c) * 31) + Arrays.hashCode(this.M);
        }
    }

    public t3(List<a> list) {
        this.f16998a = q.z(list);
    }

    public static String b(int i10) {
        return Integer.toString(i10, 36);
    }

    public static t3 c(Bundle bundle) {
        return new t3(c.c(a.N, bundle.getParcelableArrayList(b(0)), q.D()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t3.class != obj.getClass()) {
            return false;
        }
        return this.f16998a.equals(((t3) obj).f16998a);
    }

    public int hashCode() {
        return this.f16998a.hashCode();
    }
}
