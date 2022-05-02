package p193nb;

import org.drinkless.p210td.libcore.telegram.TdApi;

public final class C7316a {
    public static final long m17060a(long j) {
        return -j;
    }

    public static final long m17059b(long j) {
        return (-1000000000000L) - j;
    }

    public static final long m17058c(long j) {
        return j;
    }

    public static final int m17057d(long j) {
        return m17055f(j, false, 2, null);
    }

    public static final int m17056e(long j, boolean z) {
        if (1 <= j && j < 1099511627776L) {
            return TdApi.ChatTypePrivate.CONSTRUCTOR;
        }
        if (j < 0) {
            if (-999999999999L <= j) {
                return TdApi.ChatTypeBasicGroup.CONSTRUCTOR;
            }
            if (-1997852516352L <= j && j != -1000000000000L) {
                return TdApi.ChatTypeSupergroup.CONSTRUCTOR;
            }
            if (-2002147483648L <= j && j != -2000000000000L) {
                return TdApi.ChatTypeSecret.CONSTRUCTOR;
            }
            if (!z) {
                return 0;
            }
            throw new IllegalStateException(String.valueOf(j).toString());
        } else if (!z) {
            return 0;
        } else {
            throw new IllegalStateException(String.valueOf(j).toString());
        }
    }

    public static int m17055f(long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return m17056e(j, z);
    }

    public static final boolean m17054g(long j) {
        return m17048m(j) != 0;
    }

    public static final boolean m17053h(long j) {
        switch (m17056e(j, false)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                return true;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
            default:
                return false;
        }
    }

    public static final boolean m17052i(long j) {
        return m17044q(j) != 0;
    }

    public static final boolean m17051j(long j) {
        return m17047n(j) != 0;
    }

    public static final boolean m17050k(long j) {
        return m17045p(j) != 0;
    }

    public static final boolean m17049l(long j) {
        switch (m17056e(j, false)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
            default:
                return false;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                return true;
        }
    }

    public static final long m17048m(long j) {
        if (m17056e(j, false) == 973884508) {
            return -j;
        }
        return 0L;
    }

    public static final int m17047n(long j) {
        if (m17056e(j, false) == 862366513) {
            return (int) (j - (-2000000000000L));
        }
        return 0;
    }

    public static final String m17046o(long j) {
        switch (m17056e(j, false)) {
            case TdApi.ChatTypeSupergroup.CONSTRUCTOR:
                long p = m17045p(j);
                return "supergroup#" + p;
            case TdApi.ChatTypeSecret.CONSTRUCTOR:
                int n = m17047n(j);
                return "secret#" + n;
            case TdApi.ChatTypeBasicGroup.CONSTRUCTOR:
                long m = m17048m(j);
                return "group#" + m;
            case TdApi.ChatTypePrivate.CONSTRUCTOR:
                long q = m17044q(j);
                return "user#" + q;
            default:
                return "chat#" + j;
        }
    }

    public static final long m17045p(long j) {
        if (m17056e(j, false) == -1472570774) {
            return (-1000000000000L) - j;
        }
        return 0L;
    }

    public static final long m17044q(long j) {
        if (m17056e(j, false) == 1579049844) {
            return j;
        }
        return 0L;
    }
}
