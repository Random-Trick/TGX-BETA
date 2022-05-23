package l5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import k5.g;

public final class f3 implements g.a {
    public final BasePendingResult f16094a;
    public final u f16095b;

    public f3(u uVar, BasePendingResult basePendingResult) {
        this.f16095b = uVar;
        this.f16094a = basePendingResult;
    }

    @Override
    public final void a(Status status) {
        Map map;
        map = this.f16095b.f16237a;
        map.remove(this.f16094a);
    }
}
