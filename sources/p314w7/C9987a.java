package p314w7;

import androidx.annotation.RecentlyNonNull;
import p163l5.C6378r;

public class C9987a extends Exception {
    public final int f32484a;

    public C9987a(@RecentlyNonNull String str, int i) {
        super(C6378r.m20510h(str, "Provided message must not be empty."));
        this.f32484a = i;
    }

    public int m6307a() {
        return this.f32484a;
    }

    public C9987a(@RecentlyNonNull String str, int i, Throwable th) {
        super(C6378r.m20510h(str, "Provided message must not be empty."), th);
        this.f32484a = i;
    }
}
