package zb;

import java.net.Proxy;

public final class g {
    public static final int[] f27122a;

    static {
        int[] iArr = new int[Proxy.Type.values().length];
        f27122a = iArr;
        iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        iArr[Proxy.Type.HTTP.ordinal()] = 2;
    }
}
