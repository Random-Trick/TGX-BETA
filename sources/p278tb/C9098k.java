package p278tb;

import java.util.concurrent.TimeUnit;
import p333xb.C10180e;
import p348yb.C10491h;
import qa.C8298k;

public final class C9098k {
    public final C10491h f29284a;

    public C9098k(C10491h hVar) {
        C8298k.m12933e(hVar, "delegate");
        this.f29284a = hVar;
    }

    public final C10491h m10453a() {
        return this.f29284a;
    }

    public C9098k(int i, long j, TimeUnit timeUnit) {
        this(new C10491h(C10180e.f32910h, i, j, timeUnit));
        C8298k.m12933e(timeUnit, "timeUnit");
    }

    public C9098k() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
