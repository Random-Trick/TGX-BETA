package p148k5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p133j5.AbstractC5876k;

public final class C6129j2 {
    public static final Status f19424c = new Status(8, "The connection to Google Play services was lost");
    public final Set<BasePendingResult<?>> f19425a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public final C6125i2 f19426b = new C6125i2(this);

    public final void m21252a(BasePendingResult<? extends AbstractC5876k> basePendingResult) {
        this.f19425a.add(basePendingResult);
        basePendingResult.m30379p(this.f19426b);
    }

    public final void m21251b() {
        BasePendingResult[] basePendingResultArr;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f19425a.toArray(new BasePendingResult[0])) {
            basePendingResult.m30379p(null);
            if (basePendingResult.m30383l()) {
                this.f19425a.remove(basePendingResult);
            }
        }
    }
}
