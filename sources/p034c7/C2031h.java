package p034c7;

import androidx.annotation.RecentlyNonNull;
import p163l5.C6378r;

public class C2031h extends Exception {
    @Deprecated
    public C2031h() {
    }

    public C2031h(@RecentlyNonNull String str) {
        super(str);
        C6378r.m20510h(str, "Detail message must not be empty");
    }
}
