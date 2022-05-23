package o4;

import a7.q;
import android.os.Bundle;
import c5.c;
import c5.s;
import m3.h;

public final class r0 implements h {
    public static final r0 M = new r0(new p0[0]);
    public static final h.a<r0> N = q0.f19174a;
    public final int f19175a;
    public final q<p0> f19176b;
    public int f19177c;

    public r0(p0... p0VarArr) {
        this.f19176b = q.A(p0VarArr);
        this.f19175a = p0VarArr.length;
        f();
    }

    public static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public static r0 e(Bundle bundle) {
        return new r0((p0[]) c.c(p0.N, bundle.getParcelableArrayList(d(0)), q.D()).toArray(new p0[0]));
    }

    public p0 b(int i10) {
        return this.f19176b.get(i10);
    }

    public int c(p0 p0Var) {
        int indexOf = this.f19176b.indexOf(p0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r0.class != obj.getClass()) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f19175a == r0Var.f19175a && this.f19176b.equals(r0Var.f19176b);
    }

    public final void f() {
        int i10 = 0;
        while (i10 < this.f19176b.size()) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < this.f19176b.size(); i12++) {
                if (this.f19176b.get(i10).equals(this.f19176b.get(i12))) {
                    s.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public int hashCode() {
        if (this.f19177c == 0) {
            this.f19177c = this.f19176b.hashCode();
        }
        return this.f19177c;
    }
}
