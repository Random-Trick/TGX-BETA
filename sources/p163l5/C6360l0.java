package p163l5;

import android.content.Context;
import android.util.SparseIntArray;
import p118i5.C5221e;
import p133j5.C5850a;

public final class C6360l0 {
    public final SparseIntArray f19972a = new SparseIntArray();
    public C5221e f19973b;

    public C6360l0(C5221e eVar) {
        C6378r.m20507k(eVar);
        this.f19973b = eVar;
    }

    public final int m20555a(Context context, C5850a.AbstractC5859f fVar) {
        C6378r.m20507k(context);
        C6378r.m20507k(fVar);
        int i = 0;
        if (!fVar.mo21242o()) {
            return 0;
        }
        int p = fVar.mo939p();
        int b = m20554b(context, p);
        if (b == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f19972a.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.f19972a.keyAt(i2);
                if (keyAt > p && this.f19972a.get(keyAt) == 0) {
                    break;
                }
                i2++;
            }
            b = i == -1 ? this.f19973b.mo23585j(context, p) : i;
            this.f19972a.put(p, b);
        }
        return b;
    }

    public final int m20554b(Context context, int i) {
        return this.f19972a.get(i, -1);
    }

    public final void m20553c() {
        this.f19972a.clear();
    }
}
