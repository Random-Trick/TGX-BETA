package p187n4;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p006a5.C0159o;

public final class C7205l {
    public static final AtomicLong f22949h = new AtomicLong();
    public final long f22950a;
    public final C0159o f22951b;
    public final Uri f22952c;
    public final Map<String, List<String>> f22953d;
    public final long f22954e;
    public final long f22955f;
    public final long f22956g;

    public C7205l(long j, C0159o oVar, long j2) {
        this(j, oVar, oVar.f553a, Collections.emptyMap(), j2, 0L, 0L);
    }

    public static long m17353a() {
        return f22949h.getAndIncrement();
    }

    public C7205l(long j, C0159o oVar, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f22950a = j;
        this.f22951b = oVar;
        this.f22952c = uri;
        this.f22953d = map;
        this.f22954e = j2;
        this.f22955f = j3;
        this.f22956g = j4;
    }
}
