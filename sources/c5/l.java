package c5;

import android.util.SparseBooleanArray;

public final class l {
    public final SparseBooleanArray f4838a;

    public static final class b {
        public final SparseBooleanArray f4839a = new SparseBooleanArray();
        public boolean f4840b;

        public b a(int i10) {
            c5.a.f(!this.f4840b);
            this.f4839a.append(i10, true);
            return this;
        }

        public b b(l lVar) {
            for (int i10 = 0; i10 < lVar.b(); i10++) {
                a(lVar.a(i10));
            }
            return this;
        }

        public b c(int... iArr) {
            for (int i10 : iArr) {
                a(i10);
            }
            return this;
        }

        public b d(int i10, boolean z10) {
            return z10 ? a(i10) : this;
        }

        public l e() {
            c5.a.f(!this.f4840b);
            this.f4840b = true;
            return new l(this.f4839a);
        }
    }

    public int a(int i10) {
        c5.a.c(i10, 0, b());
        return this.f4838a.keyAt(i10);
    }

    public int b() {
        return this.f4838a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (l0.f4841a >= 24) {
            return this.f4838a.equals(lVar.f4838a);
        }
        if (b() != lVar.b()) {
            return false;
        }
        for (int i10 = 0; i10 < b(); i10++) {
            if (a(i10) != lVar.a(i10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (l0.f4841a >= 24) {
            return this.f4838a.hashCode();
        }
        int b10 = b();
        for (int i10 = 0; i10 < b(); i10++) {
            b10 = (b10 * 31) + a(i10);
        }
        return b10;
    }

    public l(SparseBooleanArray sparseBooleanArray) {
        this.f4838a = sparseBooleanArray;
    }
}
