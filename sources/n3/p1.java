package n3;

import android.media.metrics.LogSessionId;
import c5.l0;

public final class p1 {
    public static final p1 f17651b;
    public final a f17652a;

    public static final class a {
        public static final a f17653b = new a(LogSessionId.LOG_SESSION_ID_NONE);
        public final LogSessionId f17654a;

        public a(LogSessionId logSessionId) {
            this.f17654a = logSessionId;
        }
    }

    static {
        f17651b = l0.f4841a < 31 ? new p1() : new p1(a.f17653b);
    }

    public p1() {
        this((a) null);
        c5.a.f(l0.f4841a < 31);
    }

    public LogSessionId a() {
        return ((a) c5.a.e(this.f17652a)).f17654a;
    }

    public p1(LogSessionId logSessionId) {
        this(new a(logSessionId));
    }

    public p1(a aVar) {
        this.f17652a = aVar;
    }
}
