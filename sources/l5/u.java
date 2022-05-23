package l5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import k5.b;
import k5.k;
import n6.m;

public final class u {
    public final Map<BasePendingResult<?>, Boolean> f16237a = DesugarCollections.synchronizedMap(new WeakHashMap());
    public final Map<m<?>, Boolean> f16238b = DesugarCollections.synchronizedMap(new WeakHashMap());

    public final void a(BasePendingResult<? extends k> basePendingResult, boolean z10) {
        this.f16237a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.b(new f3(this, basePendingResult));
    }

    public final <TResult> void b(m<TResult> mVar, boolean z10) {
        this.f16238b.put(mVar, Boolean.valueOf(z10));
        mVar.a().c(new g3(this, mVar));
    }

    public final boolean c() {
        return !this.f16237a.isEmpty() || !this.f16238b.isEmpty();
    }

    public final void d() {
        h(false, f.Z);
    }

    public final void e(int i10, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        h(true, new Status(20, sb2.toString()));
    }

    public final void h(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f16237a) {
            hashMap = new HashMap(this.f16237a);
        }
        synchronized (this.f16238b) {
            hashMap2 = new HashMap(this.f16238b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).f(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((m) entry2.getKey()).d(new b(status));
            }
        }
    }
}
