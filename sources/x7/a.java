package x7;

import androidx.annotation.RecentlyNonNull;
import m5.r;

public class a extends Exception {
    public final int f26064a;

    public a(@RecentlyNonNull String str, int i10) {
        super(r.h(str, "Provided message must not be empty."));
        this.f26064a = i10;
    }

    public int a() {
        return this.f26064a;
    }

    public a(@RecentlyNonNull String str, int i10, Throwable th) {
        super(r.h(str, "Provided message must not be empty."), th);
        this.f26064a = i10;
    }
}
