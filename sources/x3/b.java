package x3;

import java.util.List;

public final class b {
    public final long f25971a;
    public final List<a> f25972b;

    public static final class a {
        public final String f25973a;
        public final String f25974b;
        public final long f25975c;
        public final long f25976d;

        public a(String str, String str2, long j10, long j11) {
            this.f25973a = str;
            this.f25974b = str2;
            this.f25975c = j10;
            this.f25976d = j11;
        }
    }

    public b(long j10, List<a> list) {
        this.f25971a = j10;
        this.f25972b = list;
    }

    public l4.b a(long j10) {
        long j11;
        if (this.f25972b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f25972b.size() - 1; size >= 0; size--) {
            a aVar = this.f25972b.get(size);
            boolean equals = "video/mp4".equals(aVar.f25973a) | z10;
            if (size == 0) {
                j12 = 0;
                j11 = j12 - aVar.f25976d;
            } else {
                j12 -= aVar.f25975c;
                j11 = j12;
            }
            if (!equals || j12 == j11) {
                z10 = equals;
            } else {
                j16 = j11 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j11;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new l4.b(j13, j14, this.f25971a, j15, j16);
    }
}
