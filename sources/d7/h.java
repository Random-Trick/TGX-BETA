package d7;

import androidx.annotation.RecentlyNonNull;
import m5.r;

public class h extends Exception {
    @Deprecated
    public h() {
    }

    public h(@RecentlyNonNull String str) {
        super(str);
        r.h(str, "Detail message must not be empty");
    }
}
