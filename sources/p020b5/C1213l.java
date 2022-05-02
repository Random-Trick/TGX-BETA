package p020b5;

import android.util.SparseBooleanArray;

public final class C1213l {
    public final SparseBooleanArray f4523a;

    public static final class C1215b {
        public final SparseBooleanArray f4524a = new SparseBooleanArray();
        public boolean f4525b;

        public C1215b m38029a(int i) {
            C1186a.m38187f(!this.f4525b);
            this.f4524a.append(i, true);
            return this;
        }

        public C1215b m38028b(C1213l lVar) {
            for (int i = 0; i < lVar.m38030b(); i++) {
                m38029a(lVar.m38031a(i));
            }
            return this;
        }

        public C1215b m38027c(int... iArr) {
            for (int i : iArr) {
                m38029a(i);
            }
            return this;
        }

        public C1215b m38026d(int i, boolean z) {
            return z ? m38029a(i) : this;
        }

        public C1213l m38025e() {
            C1186a.m38187f(!this.f4525b);
            this.f4525b = true;
            return new C1213l(this.f4524a);
        }
    }

    public int m38031a(int i) {
        C1186a.m38190c(i, 0, m38030b());
        return this.f4523a.keyAt(i);
    }

    public int m38030b() {
        return this.f4523a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1213l)) {
            return false;
        }
        C1213l lVar = (C1213l) obj;
        if (C1216l0.f4526a >= 24) {
            return this.f4523a.equals(lVar.f4523a);
        }
        if (m38030b() != lVar.m38030b()) {
            return false;
        }
        for (int i = 0; i < m38030b(); i++) {
            if (m38031a(i) != lVar.m38031a(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (C1216l0.f4526a >= 24) {
            return this.f4523a.hashCode();
        }
        int b = m38030b();
        for (int i = 0; i < m38030b(); i++) {
            b = (b * 31) + m38031a(i);
        }
        return b;
    }

    public C1213l(SparseBooleanArray sparseBooleanArray) {
        this.f4523a = sparseBooleanArray;
    }
}
