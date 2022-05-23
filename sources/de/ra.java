package de;

import android.text.InputFilter;
import de.g6;
import gd.w;
import ib.b;
import ib.c;
import ib.i;
import ie.r;

public class ra {
    public int f9220a;
    public final int f9221b;
    public int f9222c;
    public int f9223d;
    public CharSequence f9224e;
    public final int f9225f;
    public int f9226g;
    public long f9227h;
    public String[] f9228i;
    public int f9229j;
    public r f9230k;
    public String f9231l;
    public String f9232m;
    public int f9233n;
    public int f9234o;
    public int f9235p;
    public long f9236q;
    public int f9237r;
    public int f9238s;
    public int f9239t;
    public int f9240u;
    public Object f9241v;
    public g6.a f9242w;
    public InputFilter[] f9243x;
    public int[] f9244y;

    public ra(int i10) {
        this(i10, 0, 0, 0, null, 0, false);
    }

    public int A() {
        return this.f9220a;
    }

    public boolean B(int i10) {
        if (this.f9223d == i10) {
            return true;
        }
        int[] iArr = this.f9244y;
        return iArr != null && b.r(iArr, i10) >= 0;
    }

    public boolean C() {
        return (this.f9223d == 0 && this.f9244y == null) ? false : true;
    }

    public boolean D() {
        return (this.f9226g & 1) != 0;
    }

    public ra E(boolean z10) {
        this.f9226g = c.h(this.f9226g, 2, z10);
        return this;
    }

    public ra F(int... iArr) {
        this.f9244y = iArr;
        return this;
    }

    public ra G(Object obj) {
        this.f9241v = obj;
        return this;
    }

    public ra H(double d10) {
        return O(Double.doubleToLongBits(d10));
    }

    public ra I(r rVar) {
        this.f9230k = rVar;
        return this;
    }

    public ra J(int i10) {
        this.f9240u = i10;
        return this;
    }

    public boolean K(int i10) {
        if (this.f9222c == i10) {
            return false;
        }
        this.f9222c = i10;
        return true;
    }

    public ra L(InputFilter[] inputFilterArr) {
        this.f9243x = inputFilterArr;
        return this;
    }

    public ra M(int i10) {
        this.f9235p = i10;
        return this;
    }

    public ra N(long j10) {
        this.f9227h = j10;
        return this;
    }

    public ra O(long j10) {
        this.f9236q = j10;
        return this;
    }

    public ra P(g6.a aVar) {
        this.f9242w = aVar;
        return this;
    }

    public ra Q(int i10) {
        this.f9239t = i10;
        return this;
    }

    public void R(int i10, int i11) {
        this.f9237r = i10;
        this.f9238s = i11;
    }

    public ra S(boolean z10) {
        this.f9226g = c.h(this.f9226g, 1, z10);
        return this;
    }

    public void T(boolean z10, int i10) {
        this.f9226g = c.h(this.f9226g | 4, 1, z10);
        this.f9235p = i10;
    }

    public ra U(String[] strArr, int i10) {
        this.f9228i = strArr;
        this.f9229j = i10;
        return this;
    }

    public void V(int i10) {
        this.f9229j = i10;
    }

    public void W(int i10) {
        this.f9223d = i10;
        this.f9224e = null;
    }

    public void X(CharSequence charSequence) {
        this.f9223d = 0;
        this.f9224e = charSequence;
    }

    public boolean Y(int i10) {
        if (this.f9223d == i10) {
            return false;
        }
        boolean z10 = !i.c(u(), i10 != 0 ? w.i1(i10) : this.f9224e);
        this.f9223d = i10;
        this.f9224e = null;
        return z10;
    }

    public boolean Z(CharSequence charSequence) {
        if (i.c(this.f9224e, charSequence)) {
            return false;
        }
        boolean z10 = this.f9223d == 0 || !i.c(u(), charSequence);
        this.f9224e = charSequence;
        this.f9223d = 0;
        return z10;
    }

    public int a() {
        if ((this.f9226g & 4) != 0) {
            this.f9235p--;
        }
        return this.f9235p;
    }

    public ra a0(String str) {
        this.f9231l = str;
        return this;
    }

    public boolean b() {
        return (this.f9226g & 2) != 0;
    }

    public ra b0(String str) {
        this.f9232m = str;
        return this;
    }

    public int c() {
        return this.f9225f;
    }

    public boolean c0(String str) {
        if (i.c(this.f9232m, str)) {
            return false;
        }
        this.f9232m = str;
        return true;
    }

    public Object d() {
        return this.f9241v;
    }

    public ra d0(int i10) {
        this.f9233n = i10;
        return this;
    }

    public double e() {
        return Double.longBitsToDouble(n());
    }

    public ra e0(int i10) {
        this.f9234o = i10;
        return this;
    }

    public r f() {
        return this.f9230k;
    }

    public boolean f0(int i10) {
        if (this.f9220a == i10) {
            return false;
        }
        this.f9220a = i10;
        return true;
    }

    public int g() {
        return this.f9237r;
    }

    public int h() {
        return this.f9240u;
    }

    public int i() {
        return this.f9222c;
    }

    public int j() {
        return this.f9221b;
    }

    public InputFilter[] k() {
        return this.f9243x;
    }

    public int l() {
        return this.f9235p;
    }

    public long m() {
        return this.f9227h;
    }

    public long n() {
        return this.f9236q;
    }

    public int o() {
        return this.f9238s;
    }

    public g6.a p() {
        return this.f9242w;
    }

    public int q() {
        return this.f9239t;
    }

    public int r() {
        if ((this.f9226g & 4) != 0) {
            return this.f9235p;
        }
        return -1;
    }

    public int s() {
        return this.f9229j;
    }

    public String[] t() {
        return this.f9228i;
    }

    public CharSequence u() {
        int i10 = this.f9223d;
        return i10 != 0 ? w.i1(i10) : this.f9224e;
    }

    public String v() {
        return this.f9231l;
    }

    public int w() {
        return this.f9223d;
    }

    public String x() {
        return this.f9232m;
    }

    public int y(int i10) {
        int i11 = this.f9233n;
        return i11 != 0 ? i11 : i10;
    }

    public int z() {
        return this.f9234o;
    }

    public ra(int i10, int i11) {
        this(i10, i11, 0, 0, null, 0, false);
    }

    public ra(int i10, int i11, int i12, int i13) {
        this(i10, i11, i12, i13, null, 0, false);
    }

    public ra(int i10, int i11, int i12, int i13, boolean z10) {
        this(i10, i11, i12, i13, null, i11, z10);
    }

    public ra(int i10, int i11, int i12, CharSequence charSequence, boolean z10) {
        this(i10, i11, i12, 0, charSequence, i11, z10);
    }

    public ra(int i10, int i11, int i12, CharSequence charSequence, int i13, boolean z10) {
        this(i10, i11, i12, 0, charSequence, i13, z10);
    }

    public ra(int i10, int i11, int i12, int i13, int i14, boolean z10) {
        this(i10, i11, i12, i13, null, i14, z10);
    }

    public ra(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, boolean z10) {
        this.f9237r = -1;
        this.f9220a = i10;
        this.f9221b = i11;
        this.f9222c = i12;
        this.f9223d = i13;
        this.f9224e = charSequence;
        this.f9225f = i14;
        if (z10) {
            this.f9226g = 1;
        }
    }
}
