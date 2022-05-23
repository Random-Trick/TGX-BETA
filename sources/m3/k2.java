package m3;

import java.io.IOException;

public class k2 extends IOException {
    public final boolean f16763a;
    public final int f16764b;

    public k2(String str, Throwable th, boolean z10, int i10) {
        super(str, th);
        this.f16763a = z10;
        this.f16764b = i10;
    }

    public static k2 a(String str, Throwable th) {
        return new k2(str, th, true, 1);
    }

    public static k2 b(String str, Throwable th) {
        return new k2(str, th, true, 0);
    }

    public static k2 c(String str) {
        return new k2(str, null, false, 1);
    }
}
