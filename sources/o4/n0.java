package o4;

import android.util.SparseArray;
import c5.a;
import c5.h;

public final class n0<V> {
    public final h<V> f19157c;
    public final SparseArray<V> f19156b = new SparseArray<>();
    public int f19155a = -1;

    public n0(h<V> hVar) {
        this.f19157c = hVar;
    }

    public void a(int i10, V v10) {
        boolean z10 = false;
        if (this.f19155a == -1) {
            a.f(this.f19156b.size() == 0);
            this.f19155a = 0;
        }
        if (this.f19156b.size() > 0) {
            SparseArray<V> sparseArray = this.f19156b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            if (i10 >= keyAt) {
                z10 = true;
            }
            a.a(z10);
            if (keyAt == i10) {
                SparseArray<V> sparseArray2 = this.f19156b;
                this.f19157c.a(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f19156b.append(i10, v10);
    }

    public void b() {
        for (int i10 = 0; i10 < this.f19156b.size(); i10++) {
            this.f19157c.a(this.f19156b.valueAt(i10));
        }
        this.f19155a = -1;
        this.f19156b.clear();
    }

    public void c(int i10) {
        for (int size = this.f19156b.size() - 1; size >= 0 && i10 < this.f19156b.keyAt(size); size--) {
            this.f19157c.a(this.f19156b.valueAt(size));
            this.f19156b.removeAt(size);
        }
        this.f19155a = this.f19156b.size() > 0 ? Math.min(this.f19155a, this.f19156b.size() - 1) : -1;
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f19156b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 >= this.f19156b.keyAt(i12)) {
                this.f19157c.a(this.f19156b.valueAt(i11));
                this.f19156b.removeAt(i11);
                int i13 = this.f19155a;
                if (i13 > 0) {
                    this.f19155a = i13 - 1;
                }
                i11 = i12;
            } else {
                return;
            }
        }
    }

    public V e(int i10) {
        if (this.f19155a == -1) {
            this.f19155a = 0;
        }
        while (true) {
            int i11 = this.f19155a;
            if (i11 <= 0 || i10 >= this.f19156b.keyAt(i11)) {
                break;
            }
            this.f19155a--;
        }
        while (this.f19155a < this.f19156b.size() - 1 && i10 >= this.f19156b.keyAt(this.f19155a + 1)) {
            this.f19155a++;
        }
        return this.f19156b.valueAt(this.f19155a);
    }

    public V f() {
        SparseArray<V> sparseArray = this.f19156b;
        return sparseArray.valueAt(sparseArray.size() - 1);
    }

    public boolean g() {
        return this.f19156b.size() == 0;
    }
}
