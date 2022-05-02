package p187n4;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p006a5.C0159o;

public final class C7205l {
    public static final AtomicLong f22952h = new AtomicLong();
    public final long f22953a;
    public final C0159o f22954b;
    public final Uri f22955c;
    public final Map<String, List<String>> f22956d;
    public final long f22957e;
    public final long f22958f;
    public final long f22959g;

    public C7205l(long j, C0159o oVar, long j2) {
        this(j, oVar, oVar.f553a, Collections.emptyMap(), j2, 0L, 0L);
    }

    public static long m17353a() {
        return f22952h.getAndIncrement();
    }

    public C7205l(long j, C0159o oVar, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f22953a = j;
        this.f22954b = oVar;
        this.f22955c = uri;
        this.f22956d = map;
        this.f22957e = j2;
        this.f22958f = j3;
        this.f22959g = j4;
    }
}
