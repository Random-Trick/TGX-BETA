package ob;

import org.drinkless.td.libcore.telegram.TdApi;

public final class a {
    public static final long a(long j10) {
        return -j10;
    }

    public static final long b(long j10) {
        return (-1000000000000L) - j10;
    }

    public static final long c(long j10) {
        return j10;
    }

    public static final int d(long j10) {
        return f(j10, false, 2, null);
    }

    public static final int e(long j10, boolean z10) {
        if (1 <= j10 && j10 < 1099511627776L) {
            return TdApi.ChatTypePrivate.CONSTRUCTOR;
        }
        if (j10 < 0) {
            if (-999999999999L <= j10) {
                return TdApi.ChatTypeBasicGroup.CONSTRUCTOR;
            }
            if (-1997852516352L <= j10 && j10 != -1000000000000L) {
                return TdApi.ChatTypeSupergroup.CONSTRUCTOR;
            }
            if (-2002147483648L <= j10 && j10 != -2000000000000L) {
                return TdApi.ChatTypeSecret.CONSTRUCTOR;
            }
            if (!z10) {
                return 0;
            }
            throw new IllegalStateException(String.valueOf(j10).toString());
        } else if (!z10) {
            return 0;
        } else {
            throw new IllegalStateException(String.valueOf(j10).toString());
        }
    }

    public static int f(long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return e(j10, z10);
    }

    public static final boolean g(long j10) {
        return m(j10) != 0;
    }

    public static final boolean h(long j10) {
        switch (e(j10, false)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return true;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
            default:
                return false;
        }
    }

    public static final boolean i(long j10) {
        return q(j10) != 0;
    }

    public static final boolean j(long j10) {
        return n(j10) != 0;
    }

    public static final boolean k(long j10) {
        return p(j10) != 0;
    }

    public static final boolean l(long j10) {
        switch (e(j10, false)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
            default:
                return false;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return true;
        }
    }

    public static final long m(long j10) {
        if (e(j10, false) == 973884508) {
            return -j10;
        }
        return 0L;
    }

    public static final int n(long j10) {
        if (e(j10, false) == 862366513) {
            return (int) (j10 - (-2000000000000L));
        }
        return 0;
    }

    public static final String o(long j10) {
        switch (e(j10, false)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                long p10 = p(j10);
                return "supergroup#" + p10;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                int n10 = n(j10);
                return "secret#" + n10;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                long m10 = m(j10);
                return "group#" + m10;
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                long q10 = q(j10);
                return "user#" + q10;
            default:
                return "chat#" + j10;
        }
    }

    public static final long p(long j10) {
        if (e(j10, false) == -1472570774) {
            return (-1000000000000L) - j10;
        }
        return 0L;
    }

    public static final long q(long j10) {
        if (e(j10, false) == 1579049844) {
            return j10;
        }
        return 0L;
    }
}
