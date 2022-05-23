package l5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import k5.k;

public final class j2 {
    public static final Status f16120c = new Status(8, "The connection to Google Play services was lost");
    public final Set<BasePendingResult<?>> f16121a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    public final i2 f16122b = new i2(this);

    public final void a(BasePendingResult<? extends k> basePendingResult) {
        this.f16121a.add(basePendingResult);
        basePendingResult.p(this.f16122b);
    }

    public final void b() {
        BasePendingResult[] basePendingResultArr;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f16121a.toArray(new BasePendingResult[0])) {
            basePendingResult.p(null);
            if (basePendingResult.l()) {
                this.f16121a.remove(basePendingResult);
            }
        }
    }
}
