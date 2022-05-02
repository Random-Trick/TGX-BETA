package p008a7;

import p343y6.C10433i;

public final class C0201d {
    public static int m42093a(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    public static int m42092b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static long m42091c(long... jArr) {
        C10433i.m5134d(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            if (jArr[i] > j) {
                j = jArr[i];
            }
        }
        return j;
    }
}
