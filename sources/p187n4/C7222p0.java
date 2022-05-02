package p187n4;

import android.util.SparseArray;
import p020b5.AbstractC1202h;
import p020b5.C1186a;

public final class C7222p0<V> {
    public final AbstractC1202h<V> f23018c;
    public final SparseArray<V> f23017b = new SparseArray<>();
    public int f23016a = -1;

    public C7222p0(AbstractC1202h<V> hVar) {
        this.f23018c = hVar;
    }

    public void m17296a(int i, V v) {
        boolean z = false;
        if (this.f23016a == -1) {
            C1186a.m38187f(this.f23017b.size() == 0);
            this.f23016a = 0;
        }
        if (this.f23017b.size() > 0) {
            SparseArray<V> sparseArray = this.f23017b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i >= keyAt) {
                z = true;
            }
            C1186a.m38192a(z);
            if (keyAt == i) {
                SparseArray<V> sparseArray2 = this.f23017b;
                this.f23018c.mo13332a(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f23017b.append(i, v);
    }

    public void m17295b() {
        for (int i = 0; i < this.f23017b.size(); i++) {
            this.f23018c.mo13332a(this.f23017b.valueAt(i));
        }
        this.f23016a = -1;
        this.f23017b.clear();
    }

    public void m17294c(int i) {
        for (int size = this.f23017b.size() - 1; size >= 0 && i < this.f23017b.keyAt(size); size--) {
            this.f23018c.mo13332a(this.f23017b.valueAt(size));
            this.f23017b.removeAt(size);
        }
        this.f23016a = this.f23017b.size() > 0 ? Math.min(this.f23016a, this.f23017b.size() - 1) : -1;
    }

    public void m17293d(int i) {
        int i2 = 0;
        while (i2 < this.f23017b.size() - 1) {
            int i3 = i2 + 1;
            if (i >= this.f23017b.keyAt(i3)) {
                this.f23018c.mo13332a(this.f23017b.valueAt(i2));
                this.f23017b.removeAt(i2);
                int i4 = this.f23016a;
                if (i4 > 0) {
                    this.f23016a = i4 - 1;
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public V m17292e(int i) {
        if (this.f23016a == -1) {
            this.f23016a = 0;
        }
        while (true) {
            int i2 = this.f23016a;
            if (i2 <= 0 || i >= this.f23017b.keyAt(i2)) {
                break;
            }
            this.f23016a--;
        }
        while (this.f23016a < this.f23017b.size() - 1 && i >= this.f23017b.keyAt(this.f23016a + 1)) {
            this.f23016a++;
        }
        return this.f23017b.valueAt(this.f23016a);
    }

    public V m17291f() {
        SparseArray<V> sparseArray = this.f23017b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean m17290g() {
        return this.f23017b.size() == 0;
    }
}
