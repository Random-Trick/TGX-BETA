package o4;

import android.net.Uri;
import b5.o;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class k {
    public static final AtomicLong f19125h = new AtomicLong();
    public final long f19126a;
    public final o f19127b;
    public final Uri f19128c;
    public final Map<String, List<String>> f19129d;
    public final long f19130e;
    public final long f19131f;
    public final long f19132g;

    public k(long j10, o oVar, long j11) {
        this(j10, oVar, oVar.f3904a, Collections.emptyMap(), j11, 0L, 0L);
    }

    public static long a() {
        return f19125h.getAndIncrement();
    }

    public k(long j10, o oVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f19126a = j10;
        this.f19127b = oVar;
        this.f19128c = uri;
        this.f19129d = map;
        this.f19130e = j11;
        this.f19131f = j12;
        this.f19132g = j13;
    }
}
