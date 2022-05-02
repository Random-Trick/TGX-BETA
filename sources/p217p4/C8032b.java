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
    public static final C8032b f26155a0 = new C8034b().m13743o("").m13757a();
    public static final AbstractC6609h.AbstractC6610a<C8032b> f26156b0 = C8031a.f26154a;
    public final Bitmap f26157M;
    public final float f26158N;
    public final int f26159O;
    public final int f26160P;
    public final float f26161Q;
    public final int f26162R;
    public final float f26163S;
    public final float f26164T;
    public final boolean f26165U;
    public final int f26166V;
    public final int f26167W;
    public final float f26168X;
    public final int f26169Y;
    public final float f26170Z;
    public final CharSequence f26171a;
    public final Layout.Alignment f26172b;
    public final Layout.Alignment f26173c;

    public static final class C8034b {
        public CharSequence f26174a;
        public Bitmap f26175b;
        public Layout.Alignment f26176c;
        public Layout.Alignment f26177d;
        public float f26178e;
        public int f26179f;
        public int f26180g;
        public float f26181h;
        public int f26182i;
        public int f26183j;
        public float f26184k;
        public float f26185l;
        public float f26186m;
        public boolean f26187n;
        public int f26188o;
        public int f26189p;
        public float f26190q;

        public C8032b m13757a() {
            return new C8032b(this.f26174a, this.f26176c, this.f26177d, this.f26175b, this.f26178e, this.f26179f, this.f26180g, this.f26181h, this.f26182i, this.f26183j, this.f26184k, this.f26185l, this.f26186m, this.f26187n, this.f26188o, this.f26189p, this.f26190q);
        }

        public C8034b m13756b() {
            this.f26187n = false;
            return this;
        }

        @Pure
        public int m13755c() {
            return this.f26180g;
        }

        @Pure
        public int m13754d() {
            return this.f26182i;
        }

        @Pure
        public CharSequence m13753e() {
            return this.f26174a;
        }

        public C8034b m13752f(Bitmap bitmap) {
            this.f26175b = bitmap;
            return this;
        }

        public C8034b m13751g(float f) {
            this.f26186m = f;
            return this;
        }

        public C8034b m13750h(float f, int i) {
            this.f26178e = f;
            this.f26179f = i;
            return this;
        }

        public C8034b m13749i(int i) {
            this.f26180g = i;
            return this;
        }

        public C8034b m13748j(Layout.Alignment alignment) {
            this.f26177d = alignment;
            return this;
        }

        public C8034b m13747k(float f) {
            this.f26181h = f;
            return this;
        }

        public C8034b m13746l(int i) {
            this.f26182i = i;
            return this;
        }

        public C8034b m13745m(float f) {
            this.f26190q = f;
            return this;
        }

        public C8034b m13744n(float f) {
            this.f26185l = f;
            return this;
        }

        public C8034b m13743o(CharSequence charSequence) {
            this.f26174a = charSequence;
            return this;
        }

        public C8034b m13742p(Layout.Alignment alignment) {
            this.f26176c = alignment;
            return this;
        }

        public C8034b m13741q(float f, int i) {
            this.f26184k = f;
            this.f26183j = i;
            return this;
        }

        public C8034b m13740r(int i) {
            this.f26189p = i;
            return this;
        }

        public C8034b m13739s(int i) {
            this.f26188o = i;
            this.f26187n = true;
            return this;
        }

        public C8034b() {
            this.f26174a = null;
            this.f26175b = null;
            this.f26176c = null;
            this.f26177d = null;
            this.f26178e = -3.4028235E38f;
            this.f26179f = Integer.MIN_VALUE;
            this.f26180g = Integer.MIN_VALUE;
            this.f26181h = -3.4028235E38f;
            this.f26182i = Integer.MIN_VALUE;
            this.f26183j = Integer.MIN_VALUE;
            this.f26184k = -3.4028235E38f;
            this.f26185l = -3.4028235E38f;
            this.f26186m = -3.4028235E38f;
            this.f26187n = false;
            this.f26188o = -16777216;
            this.f26189p = Integer.MIN_VALUE;
        }

        public C8034b(C8032b bVar) {
            this.f26174a = bVar.f26171a;
            this.f26175b = bVar.f26157M;
            this.f26176c = bVar.f26172b;
            this.f26177d = bVar.f26173c;
            this.f26178e = bVar.f26158N;
            this.f26179f = bVar.f26159O;
            this.f26180g = bVar.f26160P;
            this.f26181h = bVar.f26161Q;
            this.f26182i = bVar.f26162R;
            this.f26183j = bVar.f26167W;
            this.f26184k = bVar.f26168X;
            this.f26185l = bVar.f26163S;
            this.f26186m = bVar.f26164T;
            this.f26187n = bVar.f26165U;
            this.f26188o = bVar.f26166V;
            this.f26189p = bVar.f26169Y;
            this.f26190q = bVar.f26170Z;
        }
    }

    public static final C8032b m13759c(Bundle bundle) {
        C8034b bVar = new C8034b();
        CharSequence charSequence = bundle.getCharSequence(m13758d(0));
        if (charSequence != null) {
            bVar.m13743o(charSequence);
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(m13758d(1));
        if (alignment != null) {
            bVar.m13742p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(m13758d(2));
        if (alignment2 != null) {
            bVar.m13748j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(m13758d(3));
        if (bitmap != null) {
            bVar.m13752f(bitmap);
        }
        if (bundle.containsKey(m13758d(4)) && bundle.containsKey(m13758d(5))) {
            bVar.m13750h(bundle.getFloat(m13758d(4)), bundle.getInt(m13758d(5)));
        }
        if (bundle.containsKey(m13758d(6))) {
            bVar.m13749i(bundle.getInt(m13758d(6)));
        }
        if (bundle.containsKey(m13758d(7))) {
            bVar.m13747k(bundle.getFloat(m13758d(7)));
        }
        if (bundle.containsKey(m13758d(8))) {
            bVar.m13746l(bundle.getInt(m13758d(8)));
        }
        if (bundle.containsKey(m13758d(10)) && bundle.containsKey(m13758d(9))) {
            bVar.m13741q(bundle.getFloat(m13758d(10)), bundle.getInt(m13758d(9)));
        }
        if (bundle.containsKey(m13758d(11))) {
            bVar.m13744n(bundle.getFloat(m13758d(11)));
        }
        if (bundle.containsKey(m13758d(12))) {
            bVar.m13751g(bundle.getFloat(m13758d(12)));
        }
        if (bundle.containsKey(m13758d(13))) {
            bVar.m13739s(bundle.getInt(m13758d(13)));
        }
        if (!bundle.getBoolean(m13758d(14), false)) {
            bVar.m13756b();
        }
        if (bundle.containsKey(m13758d(15))) {
            bVar.m13740r(bundle.getInt(m13758d(15)));
        }
        if (bundle.containsKey(m13758d(16))) {
            bVar.m13745m(bundle.getFloat(m13758d(16)));
        }
        return bVar.m13757a();
    }

    public static String m13758d(int i) {
        return Integer.toString(i, 36);
    }

    public C8034b m13760b() {
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
        return TextUtils.equals(this.f26171a, bVar.f26171a) && this.f26172b == bVar.f26172b && this.f26173c == bVar.f26173c && ((bitmap = this.f26157M) != null ? !((bitmap2 = bVar.f26157M) == null || !bitmap.sameAs(bitmap2)) : bVar.f26157M == null) && this.f26158N == bVar.f26158N && this.f26159O == bVar.f26159O && this.f26160P == bVar.f26160P && this.f26161Q == bVar.f26161Q && this.f26162R == bVar.f26162R && this.f26163S == bVar.f26163S && this.f26164T == bVar.f26164T && this.f26165U == bVar.f26165U && this.f26166V == bVar.f26166V && this.f26167W == bVar.f26167W && this.f26168X == bVar.f26168X && this.f26169Y == bVar.f26169Y && this.f26170Z == bVar.f26170Z;
    }

    public int hashCode() {
        return C10432h.m5138b(this.f26171a, this.f26172b, this.f26173c, this.f26157M, Float.valueOf(this.f26158N), Integer.valueOf(this.f26159O), Integer.valueOf(this.f26160P), Float.valueOf(this.f26161Q), Integer.valueOf(this.f26162R), Float.valueOf(this.f26163S), Float.valueOf(this.f26164T), Boolean.valueOf(this.f26165U), Integer.valueOf(this.f26166V), Integer.valueOf(this.f26167W), Float.valueOf(this.f26168X), Integer.valueOf(this.f26169Y), Float.valueOf(this.f26170Z));
    }

    public C8032b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6) {
        if (charSequence == null) {
            C1186a.m38185e(bitmap);
        } else {
            C1186a.m38189a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f26171a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f26171a = charSequence.toString();
        } else {
            this.f26171a = null;
        }
        this.f26172b = alignment;
        this.f26173c = alignment2;
        this.f26157M = bitmap;
        this.f26158N = f;
        this.f26159O = i;
        this.f26160P = i2;
        this.f26161Q = f2;
        this.f26162R = i3;
        this.f26163S = f4;
        this.f26164T = f5;
        this.f26165U = z;
        this.f26166V = i5;
        this.f26167W = i4;
        this.f26168X = f3;
        this.f26169Y = i6;
        this.f26170Z = f6;
    }
}
