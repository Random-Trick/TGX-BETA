package p148k5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import p133j5.AbstractC5871g;

public final class C6110f3 implements AbstractC5871g.AbstractC5872a {
    public final BasePendingResult f19397a;
    public final C6172u f19398b;

    public C6110f3(C6172u uVar, BasePendingResult basePendingResult) {
        this.f19398b = uVar;
        this.f19397a = basePendingResult;
    }

    @Override
    public final void mo21276a(Status status) {
        Map map;
        map = this.f19398b.f19551a;
        map.remove(this.f19397a);
    }
}
