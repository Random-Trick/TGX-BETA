package p020b5;

import android.util.SparseBooleanArray;

public final class C1213l {
    public final SparseBooleanArray f4523a;

    public static final class C1215b {
        public final SparseBooleanArray f4524a = new SparseBooleanArray();
        public boolean f4525b;

        public C1215b m38026a(int i) {
            C1186a.m38184f(!this.f4525b);
            this.f4524a.append(i, true);
            return this;
        }

        public C1215b m38025b(C1213l lVar) {
            for (int i = 0; i < lVar.m38027b(); i++) {
                m38026a(lVar.m38028a(i));
            }
            return this;
        }

        public C1215b m38024c(int... iArr) {
            for (int i : iArr) {
                m38026a(i);
            }
            return this;
        }

        public C1215b m38023d(int i, boolean z) {
            return z ? m38026a(i) : this;
        }

        public C1213l m38022e() {
            C1186a.m38184f(!this.f4525b);
            this.f4525b = true;
            return new C1213l(this.f4524a);
        }
    }

    public int m38028a(int i) {
        C1186a.m38187c(i, 0, m38027b());
        return this.f4523a.keyAt(i);
    }

    public int m38027b() {
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
        if (m38027b() != lVar.m38027b()) {
            return false;
        }
        for (int i = 0; i < m38027b(); i++) {
            if (m38028a(i) != lVar.m38028a(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (C1216l0.f4526a >= 24) {
            return this.f4523a.hashCode();
        }
        int b = m38027b();
        for (int i = 0; i < m38027b(); i++) {
            b = (b * 31) + m38028a(i);
        }
        return b;
    }

    public C1213l(SparseBooleanArray sparseBooleanArray) {
        this.f4523a = sparseBooleanArray;
    }
}
