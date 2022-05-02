package p174m3;

import java.io.IOException;

public class C6556a2 extends IOException {
    public final boolean f20403a;
    public final int f20404b;

    public C6556a2(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.f20403a = z;
        this.f20404b = i;
    }

    public static C6556a2 m20113a(String str, Throwable th) {
        return new C6556a2(str, th, true, 1);
    }

    public static C6556a2 m20112b(String str, Throwable th) {
        return new C6556a2(str, th, true, 0);
    }

    public static C6556a2 m20111c(String str) {
        return new C6556a2(str, null, false, 1);
    }
}
