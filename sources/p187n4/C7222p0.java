package p187n4;

import android.util.SparseArray;
import p020b5.AbstractC1202h;
import p020b5.C1186a;

public final class C7222p0<V> {
    public final AbstractC1202h<V> f23015c;
    public final SparseArray<V> f23014b = new SparseArray<>();
    public int f23013a = -1;

    public C7222p0(AbstractC1202h<V> hVar) {
        this.f23015c = hVar;
    }

    public void m17296a(int i, V v) {
        boolean z = false;
        if (this.f23013a == -1) {
            C1186a.m38184f(this.f23014b.size() == 0);
            this.f23013a = 0;
        }
        if (this.f23014b.size() > 0) {
            SparseArray<V> sparseArray = this.f23014b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i >= keyAt) {
                z = true;
            }
            C1186a.m38189a(z);
            if (keyAt == i) {
                SparseArray<V> sparseArray2 = this.f23014b;
                this.f23015c.mo13333a(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f23014b.append(i, v);
    }

    public void m17295b() {
        for (int i = 0; i < this.f23014b.size(); i++) {
            this.f23015c.mo13333a(this.f23014b.valueAt(i));
        }
        this.f23013a = -1;
        this.f23014b.clear();
    }

    public void m17294c(int i) {
        for (int size = this.f23014b.size() - 1; size >= 0 && i < this.f23014b.keyAt(size); size--) {
            this.f23015c.mo13333a(this.f23014b.valueAt(size));
            this.f23014b.removeAt(size);
        }
        this.f23013a = this.f23014b.size() > 0 ? Math.min(this.f23013a, this.f23014b.size() - 1) : -1;
    }

    public void m17293d(int i) {
        int i2 = 0;
        while (i2 < this.f23014b.size() - 1) {
            int i3 = i2 + 1;
            if (i >= this.f23014b.keyAt(i3)) {
                this.f23015c.mo13333a(this.f23014b.valueAt(i2));
                this.f23014b.removeAt(i2);
                int i4 = this.f23013a;
                if (i4 > 0) {
                    this.f23013a = i4 - 1;
                }
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public V m17292e(int i) {
        if (this.f23013a == -1) {
            this.f23013a = 0;
        }
        while (true) {
            int i2 = this.f23013a;
            if (i2 <= 0 || i >= this.f23014b.keyAt(i2)) {
                break;
            }
            this.f23013a--;
        }
        while (this.f23013a < this.f23014b.size() - 1 && i >= this.f23014b.keyAt(this.f23013a + 1)) {
            this.f23013a++;
        }
        return this.f23014b.valueAt(this.f23013a);
    }

    public V m17291f() {
        SparseArray<V> sparseArray = this.f23014b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean m17290g() {
        return this.f23014b.size() == 0;
    }
}
