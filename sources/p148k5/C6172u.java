package p148k5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p126j$.util.DesugarCollections;
import p133j5.AbstractC5876k;
import p133j5.C5861b;
import p177m6.C6777m;

public final class C6172u {
    public final Map<BasePendingResult<?>, Boolean> f19551a = DesugarCollections.synchronizedMap(new WeakHashMap());
    public final Map<C6777m<?>, Boolean> f19552b = DesugarCollections.synchronizedMap(new WeakHashMap());

    public final void m21128a(BasePendingResult<? extends AbstractC5876k> basePendingResult, boolean z) {
        this.f19551a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo21902b(new C6110f3(this, basePendingResult));
    }

    public final <TResult> void m21127b(C6777m<TResult> mVar, boolean z) {
        this.f19552b.put(mVar, Boolean.valueOf(z));
        mVar.m19087a().mo19079c(new C6115g3(this, mVar));
    }

    public final boolean m21126c() {
        return !this.f19551a.isEmpty() || !this.f19552b.isEmpty();
    }

    public final void m21125d() {
        m21121h(false, C6106f.f19366a0);
    }

    public final void m21124e(int i, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        m21121h(true, new Status(20, sb2.toString()));
    }

    public final void m21121h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f19551a) {
            hashMap = new HashMap(this.f19551a);
        }
        synchronized (this.f19552b) {
            hashMap2 = new HashMap(this.f19552b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m30391f(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C6777m) entry2.getKey()).m19084d(new C5861b(status));
            }
        }
    }
}
