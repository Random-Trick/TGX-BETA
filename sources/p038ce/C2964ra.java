package p038ce;

import android.text.InputFilter;
import p038ce.AbstractC2420g6;
import p082fd.C4403w;
import p108hb.C5062b;
import p108hb.C5063c;
import p108hb.C5070i;
import p111he.AbstractC5139r;

public class C2964ra {
    public int f9831a;
    public final int f9832b;
    public int f9833c;
    public int f9834d;
    public CharSequence f9835e;
    public final int f9836f;
    public int f9837g;
    public long f9838h;
    public String[] f9839i;
    public int f9840j;
    public AbstractC5139r f9841k;
    public String f9842l;
    public String f9843m;
    public int f9844n;
    public int f9845o;
    public int f9846p;
    public long f9847q;
    public int f9848r;
    public int f9849s;
    public int f9850t;
    public int f9851u;
    public Object f9852v;
    public AbstractC2420g6.C2421a f9853w;
    public InputFilter[] f9854x;
    public int[] f9855y;

    public C2964ra(int i) {
        this(i, 0, 0, 0, null, 0, false);
    }

    public int m32879A() {
        return this.f9831a;
    }

    public boolean m32878B(int i) {
        if (this.f9834d == i) {
            return true;
        }
        int[] iArr = this.f9855y;
        return iArr != null && C5062b.m24155r(iArr, i) >= 0;
    }

    public boolean m32877C() {
        return (this.f9834d == 0 && this.f9855y == null) ? false : true;
    }

    public boolean m32876D() {
        return (this.f9837g & 1) != 0;
    }

    public C2964ra m32875E(boolean z) {
        this.f9837g = C5063c.m24139h(this.f9837g, 2, z);
        return this;
    }

    public C2964ra m32874F(int... iArr) {
        this.f9855y = iArr;
        return this;
    }

    public C2964ra m32873G(Object obj) {
        this.f9852v = obj;
        return this;
    }

    public C2964ra m32872H(double d) {
        return m32865O(Double.doubleToLongBits(d));
    }

    public C2964ra m32871I(AbstractC5139r rVar) {
        this.f9841k = rVar;
        return this;
    }

    public C2964ra m32870J(int i) {
        this.f9851u = i;
        return this;
    }

    public boolean m32869K(int i) {
        if (this.f9833c == i) {
            return false;
        }
        this.f9833c = i;
        return true;
    }

    public C2964ra m32868L(InputFilter[] inputFilterArr) {
        this.f9854x = inputFilterArr;
        return this;
    }

    public C2964ra m32867M(int i) {
        this.f9846p = i;
        return this;
    }

    public C2964ra m32866N(long j) {
        this.f9838h = j;
        return this;
    }

    public C2964ra m32865O(long j) {
        this.f9847q = j;
        return this;
    }

    public C2964ra m32864P(AbstractC2420g6.C2421a aVar) {
        this.f9853w = aVar;
        return this;
    }

    public C2964ra m32863Q(int i) {
        this.f9850t = i;
        return this;
    }

    public void m32862R(int i, int i2) {
        this.f9848r = i;
        this.f9849s = i2;
    }

    public C2964ra m32861S(boolean z) {
        this.f9837g = C5063c.m24139h(this.f9837g, 1, z);
        return this;
    }

    public void m32860T(boolean z, int i) {
        this.f9837g = C5063c.m24139h(this.f9837g | 4, 1, z);
        this.f9846p = i;
    }

    public C2964ra m32859U(String[] strArr, int i) {
        this.f9839i = strArr;
        this.f9840j = i;
        return this;
    }

    public void m32858V(int i) {
        this.f9840j = i;
    }

    public void m32857W(int i) {
        this.f9834d = i;
        this.f9835e = null;
    }

    public void m32856X(CharSequence charSequence) {
        this.f9834d = 0;
        this.f9835e = charSequence;
    }

    public boolean m32855Y(int i) {
        if (this.f9834d == i) {
            return false;
        }
        boolean z = !C5070i.m24068c(m32827u(), i != 0 ? C4403w.m27871i1(i) : this.f9835e);
        this.f9834d = i;
        this.f9835e = null;
        return z;
    }

    public boolean m32854Z(CharSequence charSequence) {
        if (C5070i.m24068c(this.f9835e, charSequence)) {
            return false;
        }
        boolean z = this.f9834d == 0 || !C5070i.m24068c(m32827u(), charSequence);
        this.f9835e = charSequence;
        this.f9834d = 0;
        return z;
    }

    public int m32853a() {
        if ((this.f9837g & 4) != 0) {
            this.f9846p--;
        }
        return this.f9846p;
    }

    public C2964ra m32852a0(String str) {
        this.f9842l = str;
        return this;
    }

    public boolean m32851b() {
        return (this.f9837g & 2) != 0;
    }

    public C2964ra m32850b0(String str) {
        this.f9843m = str;
        return this;
    }

    public int m32849c() {
        return this.f9836f;
    }

    public boolean m32848c0(String str) {
        if (C5070i.m24068c(this.f9843m, str)) {
            return false;
        }
        this.f9843m = str;
        return true;
    }

    public Object m32847d() {
        return this.f9852v;
    }

    public C2964ra m32846d0(int i) {
        this.f9844n = i;
        return this;
    }

    public double m32845e() {
        return Double.longBitsToDouble(m32834n());
    }

    public C2964ra m32844e0(int i) {
        this.f9845o = i;
        return this;
    }

    public AbstractC5139r m32843f() {
        return this.f9841k;
    }

    public boolean m32842f0(int i) {
        if (this.f9831a == i) {
            return false;
        }
        this.f9831a = i;
        return true;
    }

    public int m32841g() {
        return this.f9848r;
    }

    public int m32840h() {
        return this.f9851u;
    }

    public int m32839i() {
        return this.f9833c;
    }

    public int m32838j() {
        return this.f9832b;
    }

    public InputFilter[] m32837k() {
        return this.f9854x;
    }

    public int m32836l() {
        return this.f9846p;
    }

    public long m32835m() {
        return this.f9838h;
    }

    public long m32834n() {
        return this.f9847q;
    }

    public int m32833o() {
        return this.f9849s;
    }

    public AbstractC2420g6.C2421a m32832p() {
        return this.f9853w;
    }

    public int m32831q() {
        return this.f9850t;
    }

    public int m32830r() {
        if ((this.f9837g & 4) != 0) {
            return this.f9846p;
        }
        return -1;
    }

    public int m32829s() {
        return this.f9840j;
    }

    public String[] m32828t() {
        return this.f9839i;
    }

    public CharSequence m32827u() {
        int i = this.f9834d;
        return i != 0 ? C4403w.m27871i1(i) : this.f9835e;
    }

    public String m32826v() {
        return this.f9842l;
    }

    public int m32825w() {
        return this.f9834d;
    }

    public String m32824x() {
        return this.f9843m;
    }

    public int m32823y(int i) {
        int i2 = this.f9844n;
        return i2 != 0 ? i2 : i;
    }

    public int m32822z() {
        return this.f9845o;
    }

    public C2964ra(int i, int i2) {
        this(i, i2, 0, 0, null, 0, false);
    }

    public C2964ra(int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4, null, 0, false);
    }

    public C2964ra(int i, int i2, int i3, int i4, boolean z) {
        this(i, i2, i3, i4, null, i2, z);
    }

    public C2964ra(int i, int i2, int i3, CharSequence charSequence, boolean z) {
        this(i, i2, i3, 0, charSequence, i2, z);
    }

    public C2964ra(int i, int i2, int i3, CharSequence charSequence, int i4, boolean z) {
        this(i, i2, i3, 0, charSequence, i4, z);
    }

    public C2964ra(int i, int i2, int i3, int i4, int i5, boolean z) {
        this(i, i2, i3, i4, null, i5, z);
    }

    public C2964ra(int i, int i2, int i3, int i4, CharSequence charSequence, int i5, boolean z) {
        this.f9848r = -1;
        this.f9831a = i;
        this.f9832b = i2;
        this.f9833c = i3;
        this.f9834d = i4;
        this.f9835e = charSequence;
        this.f9836f = i5;
        if (z) {
            this.f9837g = 1;
        }
    }
}
