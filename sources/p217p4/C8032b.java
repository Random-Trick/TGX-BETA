package p217p4;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import org.checkerframework.dataflow.qual.Pure;
import p020b5.C1186a;
import p174m3.AbstractC6609h;
import p343y6.C10432h;

public final class C8032b implements AbstractC6609h {
    public static final C8032b f26158a0 = new C8034b().m13742o("").m13756a();
    public static final AbstractC6609h.AbstractC6610a<C8032b> f26159b0 = C8031a.f26157a;
    public final Bitmap f26160M;
    public final float f26161N;
    public final int f26162O;
    public final int f26163P;
    public final float f26164Q;
    public final int f26165R;
    public final float f26166S;
    public final float f26167T;
    public final boolean f26168U;
    public final int f26169V;
    public final int f26170W;
    public final float f26171X;
    public final int f26172Y;
    public final float f26173Z;
    public final CharSequence f26174a;
    public final Layout.Alignment f26175b;
    public final Layout.Alignment f26176c;

    public static final class C8034b {
        public CharSequence f26177a;
        public Bitmap f26178b;
        public Layout.Alignment f26179c;
        public Layout.Alignment f26180d;
        public float f26181e;
        public int f26182f;
        public int f26183g;
        public float f26184h;
        public int f26185i;
        public int f26186j;
        public float f26187k;
        public float f26188l;
        public float f26189m;
        public boolean f26190n;
        public int f26191o;
        public int f26192p;
        public float f26193q;

        public C8032b m13756a() {
            return new C8032b(this.f26177a, this.f26179c, this.f26180d, this.f26178b, this.f26181e, this.f26182f, this.f26183g, this.f26184h, this.f26185i, this.f26186j, this.f26187k, this.f26188l, this.f26189m, this.f26190n, this.f26191o, this.f26192p, this.f26193q);
        }

        public C8034b m13755b() {
            this.f26190n = false;
            return this;
        }

        @Pure
        public int m13754c() {
            return this.f26183g;
        }

        @Pure
        public int m13753d() {
            return this.f26185i;
        }

        @Pure
        public CharSequence m13752e() {
            return this.f26177a;
        }

        public C8034b m13751f(Bitmap bitmap) {
            this.f26178b = bitmap;
            return this;
        }

        public C8034b m13750g(float f) {
            this.f26189m = f;
            return this;
        }

        public C8034b m13749h(float f, int i) {
            this.f26181e = f;
            this.f26182f = i;
            return this;
        }

        public C8034b m13748i(int i) {
            this.f26183g = i;
            return this;
        }

        public C8034b m13747j(Layout.Alignment alignment) {
            this.f26180d = alignment;
            return this;
        }

        public C8034b m13746k(float f) {
            this.f26184h = f;
            return this;
        }

        public C8034b m13745l(int i) {
            this.f26185i = i;
            return this;
        }

        public C8034b m13744m(float f) {
            this.f26193q = f;
            return this;
        }

        public C8034b m13743n(float f) {
            this.f26188l = f;
            return this;
        }

        public C8034b m13742o(CharSequence charSequence) {
            this.f26177a = charSequence;
            return this;
        }

        public C8034b m13741p(Layout.Alignment alignment) {
            this.f26179c = alignment;
            return this;
        }

        public C8034b m13740q(float f, int i) {
            this.f26187k = f;
            this.f26186j = i;
            return this;
        }

        public C8034b m13739r(int i) {
            this.f26192p = i;
            return this;
        }

        public C8034b m13738s(int i) {
            this.f26191o = i;
            this.f26190n = true;
            return this;
        }

        public C8034b() {
            this.f26177a = null;
            this.f26178b = null;
            this.f26179c = null;
            this.f26180d = null;
            this.f26181e = -3.4028235E38f;
            this.f26182f = Integer.MIN_VALUE;
            this.f26183g = Integer.MIN_VALUE;
            this.f26184h = -3.4028235E38f;
            this.f26185i = Integer.MIN_VALUE;
            this.f26186j = Integer.MIN_VALUE;
            this.f26187k = -3.4028235E38f;
            this.f26188l = -3.4028235E38f;
            this.f26189m = -3.4028235E38f;
            this.f26190n = false;
            this.f26191o = -16777216;
            this.f26192p = Integer.MIN_VALUE;
        }

        public C8034b(C8032b bVar) {
            this.f26177a = bVar.f26174a;
            this.f26178b = bVar.f26160M;
            this.f26179c = bVar.f26175b;
            this.f26180d = bVar.f26176c;
            this.f26181e = bVar.f26161N;
            this.f26182f = bVar.f26162O;
            this.f26183g = bVar.f26163P;
            this.f26184h = bVar.f26164Q;
            this.f26185i = bVar.f26165R;
            this.f26186j = bVar.f26170W;
            this.f26187k = bVar.f26171X;
            this.f26188l = bVar.f26166S;
            this.f26189m = bVar.f26167T;
            this.f26190n = bVar.f26168U;
            this.f26191o = bVar.f26169V;
            this.f26192p = bVar.f26172Y;
            this.f26193q = bVar.f26173Z;
        }
    }

    public static final C8032b m13758c(Bundle bundle) {
        C8034b bVar = new C8034b();
        CharSequence charSequence = bundle.getCharSequence(m13757d(0));
        if (charSequence != null) {
            bVar.m13742o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(m13757d(1));
        if (alignment != null) {
            bVar.m13741p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(m13757d(2));
        if (alignment2 != null) {
            bVar.m13747j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(m13757d(3));
        if (bitmap != null) {
            bVar.m13751f(bitmap);
        }
        if (bundle.containsKey(m13757d(4)) && bundle.containsKey(m13757d(5))) {
            bVar.m13749h(bundle.getFloat(m13757d(4)), bundle.getInt(m13757d(5)));
        }
        if (bundle.containsKey(m13757d(6))) {
            bVar.m13748i(bundle.getInt(m13757d(6)));
        }
        if (bundle.containsKey(m13757d(7))) {
            bVar.m13746k(bundle.getFloat(m13757d(7)));
        }
        if (bundle.containsKey(m13757d(8))) {
            bVar.m13745l(bundle.getInt(m13757d(8)));
        }
        if (bundle.containsKey(m13757d(10)) && bundle.containsKey(m13757d(9))) {
            bVar.m13740q(bundle.getFloat(m13757d(10)), bundle.getInt(m13757d(9)));
        }
        if (bundle.containsKey(m13757d(11))) {
            bVar.m13743n(bundle.getFloat(m13757d(11)));
        }
        if (bundle.containsKey(m13757d(12))) {
            bVar.m13750g(bundle.getFloat(m13757d(12)));
        }
        if (bundle.containsKey(m13757d(13))) {
            bVar.m13738s(bundle.getInt(m13757d(13)));
        }
        if (!bundle.getBoolean(m13757d(14), false)) {
            bVar.m13755b();
        }
        if (bundle.containsKey(m13757d(15))) {
            bVar.m13739r(bundle.getInt(m13757d(15)));
        }
        if (bundle.containsKey(m13757d(16))) {
            bVar.m13744m(bundle.getFloat(m13757d(16)));
        }
        return bVar.m13756a();
    }

    public static String m13757d(int i) {
        return Integer.toString(i, 36);
    }

    public C8034b m13759b() {
        return new C8034b();
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8032b.class != obj.getClass()) {
            return false;
        }
        C8032b bVar = (C8032b) obj;
        return TextUtils.equals(this.f26174a, bVar.f26174a) && this.f26175b == bVar.f26175b && this.f26176c == bVar.f26176c && ((bitmap = this.f26160M) != null ? !((bitmap2 = bVar.f26160M) == null || !bitmap.sameAs(bitmap2)) : bVar.f26160M == null) && this.f26161N == bVar.f26161N && this.f26162O == bVar.f26162O && this.f26163P == bVar.f26163P && this.f26164Q == bVar.f26164Q && this.f26165R == bVar.f26165R && this.f26166S == bVar.f26166S && this.f26167T == bVar.f26167T && this.f26168U == bVar.f26168U && this.f26169V == bVar.f26169V && this.f26170W == bVar.f26170W && this.f26171X == bVar.f26171X && this.f26172Y == bVar.f26172Y && this.f26173Z == bVar.f26173Z;
    }

    public int hashCode() {
        return C10432h.m5138b(this.f26174a, this.f26175b, this.f26176c, this.f26160M, Float.valueOf(this.f26161N), Integer.valueOf(this.f26162O), Integer.valueOf(this.f26163P), Float.valueOf(this.f26164Q), Integer.valueOf(this.f26165R), Float.valueOf(this.f26166S), Float.valueOf(this.f26167T), Boolean.valueOf(this.f26168U), Integer.valueOf(this.f26169V), Integer.valueOf(this.f26170W), Float.valueOf(this.f26171X), Integer.valueOf(this.f26172Y), Float.valueOf(this.f26173Z));
    }

    public C8032b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            C1186a.m38188e(bitmap);
        } else {
            C1186a.m38192a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f26174a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f26174a = charSequence.toString();
        } else {
            this.f26174a = null;
        }
        this.f26175b = alignment;
        this.f26176c = alignment2;
        this.f26160M = bitmap;
        this.f26161N = f;
        this.f26162O = i;
        this.f26163P = i2;
        this.f26164Q = f2;
        this.f26165R = i3;
        this.f26166S = f4;
        this.f26167T = f5;
        this.f26168U = z;
        this.f26169V = i5;
        this.f26170W = i4;
        this.f26171X = f3;
        this.f26172Y = i6;
        this.f26173Z = f6;
    }
}
