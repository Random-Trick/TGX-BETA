package m5;

import android.content.Context;
import android.util.SparseIntArray;
import j5.e;
import k5.a;

public final class l0 {
    public final SparseIntArray f17222a = new SparseIntArray();
    public e f17223b;

    public l0(e eVar) {
        r.k(eVar);
        this.f17223b = eVar;
    }

    public final int a(Context context, a.f fVar) {
        r.k(context);
        r.k(fVar);
        int i10 = 0;
        if (!fVar.n()) {
            return 0;
        }
        int p10 = fVar.p();
        int b10 = b(context, p10);
        if (b10 == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f17222a.size()) {
                    i10 = -1;
                    break;
                }
                int keyAt = this.f17222a.keyAt(i11);
                if (keyAt > p10 && this.f17222a.get(keyAt) == 0) {
                    break;
                }
                i11++;
            }
            b10 = i10 == -1 ? this.f17223b.j(context, p10) : i10;
            this.f17222a.put(p10, b10);
        }
        return b10;
    }

    public final int b(Context context, int i10) {
        return this.f17222a.get(i10, -1);
    }

    public final void c() {
        this.f17222a.clear();
    }
}
