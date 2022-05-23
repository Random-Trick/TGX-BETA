package q4;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import m3.h;
import org.checkerframework.dataflow.qual.Pure;
import z6.i;

public final class b implements h {
    public static final b f21377a0 = new C0195b().o("").a();
    public static final h.a<b> f21378b0 = q4.a.f21376a;
    public final Bitmap M;
    public final float N;
    public final int O;
    public final int P;
    public final float Q;
    public final int R;
    public final float S;
    public final float T;
    public final boolean U;
    public final int V;
    public final int W;
    public final float X;
    public final int Y;
    public final float Z;
    public final CharSequence f21379a;
    public final Layout.Alignment f21380b;
    public final Layout.Alignment f21381c;

    public static final class C0195b {
        public CharSequence f21382a;
        public Bitmap f21383b;
        public Layout.Alignment f21384c;
        public Layout.Alignment f21385d;
        public float f21386e;
        public int f21387f;
        public int f21388g;
        public float f21389h;
        public int f21390i;
        public int f21391j;
        public float f21392k;
        public float f21393l;
        public float f21394m;
        public boolean f21395n;
        public int f21396o;
        public int f21397p;
        public float f21398q;

        public b a() {
            return new b(this.f21382a, this.f21384c, this.f21385d, this.f21383b, this.f21386e, this.f21387f, this.f21388g, this.f21389h, this.f21390i, this.f21391j, this.f21392k, this.f21393l, this.f21394m, this.f21395n, this.f21396o, this.f21397p, this.f21398q);
        }

        public C0195b b() {
            this.f21395n = false;
            return this;
        }

        @Pure
        public int c() {
            return this.f21388g;
        }

        @Pure
        public int d() {
            return this.f21390i;
        }

        @Pure
        public CharSequence e() {
            return this.f21382a;
        }

        public C0195b f(Bitmap bitmap) {
            this.f21383b = bitmap;
            return this;
        }

        public C0195b g(float f10) {
            this.f21394m = f10;
            return this;
        }

        public C0195b h(float f10, int i10) {
            this.f21386e = f10;
            this.f21387f = i10;
            return this;
        }

        public C0195b i(int i10) {
            this.f21388g = i10;
            return this;
        }

        public C0195b j(Layout.Alignment alignment) {
            this.f21385d = alignment;
            return this;
        }

        public C0195b k(float f10) {
            this.f21389h = f10;
            return this;
        }

        public C0195b l(int i10) {
            this.f21390i = i10;
            return this;
        }

        public C0195b m(float f10) {
            this.f21398q = f10;
            return this;
        }

        public C0195b n(float f10) {
            this.f21393l = f10;
            return this;
        }

        public C0195b o(CharSequence charSequence) {
            this.f21382a = charSequence;
            return this;
        }

        public C0195b p(Layout.Alignment alignment) {
            this.f21384c = alignment;
            return this;
        }

        public C0195b q(float f10, int i10) {
            this.f21392k = f10;
            this.f21391j = i10;
            return this;
        }

        public C0195b r(int i10) {
            this.f21397p = i10;
            return this;
        }

        public C0195b s(int i10) {
            this.f21396o = i10;
            this.f21395n = true;
            return this;
        }

        public C0195b() {
            this.f21382a = null;
            this.f21383b = null;
            this.f21384c = null;
            this.f21385d = null;
            this.f21386e = -3.4028235E38f;
            this.f21387f = Integer.MIN_VALUE;
            this.f21388g = Integer.MIN_VALUE;
            this.f21389h = -3.4028235E38f;
            this.f21390i = Integer.MIN_VALUE;
            this.f21391j = Integer.MIN_VALUE;
            this.f21392k = -3.4028235E38f;
            this.f21393l = -3.4028235E38f;
            this.f21394m = -3.4028235E38f;
            this.f21395n = false;
            this.f21396o = -16777216;
            this.f21397p = Integer.MIN_VALUE;
        }

        public C0195b(b bVar) {
            this.f21382a = bVar.f21379a;
            this.f21383b = bVar.M;
            this.f21384c = bVar.f21380b;
            this.f21385d = bVar.f21381c;
            this.f21386e = bVar.N;
            this.f21387f = bVar.O;
            this.f21388g = bVar.P;
            this.f21389h = bVar.Q;
            this.f21390i = bVar.R;
            this.f21391j = bVar.W;
            this.f21392k = bVar.X;
            this.f21393l = bVar.S;
            this.f21394m = bVar.T;
            this.f21395n = bVar.U;
            this.f21396o = bVar.V;
            this.f21397p = bVar.Y;
            this.f21398q = bVar.Z;
        }
    }

    public static final b c(Bundle bundle) {
        C0195b bVar = new C0195b();
        CharSequence charSequence = bundle.getCharSequence(d(0));
        if (charSequence != null) {
            bVar.o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(d(1));
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(d(2));
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(d(3));
        if (bitmap != null) {
            bVar.f(bitmap);
        }
        if (bundle.containsKey(d(4)) && bundle.containsKey(d(5))) {
            bVar.h(bundle.getFloat(d(4)), bundle.getInt(d(5)));
        }
        if (bundle.containsKey(d(6))) {
            bVar.i(bundle.getInt(d(6)));
        }
        if (bundle.containsKey(d(7))) {
            bVar.k(bundle.getFloat(d(7)));
        }
        if (bundle.containsKey(d(8))) {
            bVar.l(bundle.getInt(d(8)));
        }
        if (bundle.containsKey(d(10)) && bundle.containsKey(d(9))) {
            bVar.q(bundle.getFloat(d(10)), bundle.getInt(d(9)));
        }
        if (bundle.containsKey(d(11))) {
            bVar.n(bundle.getFloat(d(11)));
        }
        if (bundle.containsKey(d(12))) {
            bVar.g(bundle.getFloat(d(12)));
        }
        if (bundle.containsKey(d(13))) {
            bVar.s(bundle.getInt(d(13)));
        }
        if (!bundle.getBoolean(d(14), false)) {
            bVar.b();
        }
        if (bundle.containsKey(d(15))) {
            bVar.r(bundle.getInt(d(15)));
        }
        if (bundle.containsKey(d(16))) {
            bVar.m(bundle.getFloat(d(16)));
        }
        return bVar.a();
    }

    public static String d(int i10) {
        return Integer.toString(i10, 36);
    }

    public C0195b b() {
        return new C0195b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return TextUtils.equals(this.f21379a, bVar.f21379a) && this.f21380b == bVar.f21380b && this.f21381c == bVar.f21381c && ((bitmap = this.M) != null ? !((bitmap2 = bVar.M) == null || !bitmap.sameAs(bitmap2)) : bVar.M == null) && this.N == bVar.N && this.O == bVar.O && this.P == bVar.P && this.Q == bVar.Q && this.R == bVar.R && this.S == bVar.S && this.T == bVar.T && this.U == bVar.U && this.V == bVar.V && this.W == bVar.W && this.X == bVar.X && this.Y == bVar.Y && this.Z == bVar.Z;
    }

    public int hashCode() {
        return i.b(this.f21379a, this.f21380b, this.f21381c, this.M, Float.valueOf(this.N), Integer.valueOf(this.O), Integer.valueOf(this.P), Float.valueOf(this.Q), Integer.valueOf(this.R), Float.valueOf(this.S), Float.valueOf(this.T), Boolean.valueOf(this.U), Integer.valueOf(this.V), Integer.valueOf(this.W), Float.valueOf(this.X), Integer.valueOf(this.Y), Float.valueOf(this.Z));
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            c5.a.e(bitmap);
        } else {
            c5.a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f21379a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f21379a = charSequence.toString();
        } else {
            this.f21379a = null;
        }
        this.f21380b = alignment;
        this.f21381c = alignment2;
        this.M = bitmap;
        this.N = f10;
        this.O = i10;
        this.P = i11;
        this.Q = f11;
        this.R = i12;
        this.S = f13;
        this.T = f14;
        this.U = z10;
        this.V = i14;
        this.W = i13;
        this.X = f12;
        this.Y = i15;
        this.Z = f15;
    }
}
