package p325x3;

import java.util.List;
import p162l4.C6310b;

public final class C10089b {
    public final long f32775a;
    public final List<C10090a> f32776b;

    public static final class C10090a {
        public final String f32777a;
        public final String f32778b;
        public final long f32779c;
        public final long f32780d;

        public C10090a(String str, String str2, long j, long j2) {
            this.f32777a = str;
            this.f32778b = str2;
            this.f32779c = j;
            this.f32780d = j2;
        }
    }

    public C10089b(long j, List<C10090a> list) {
        this.f32775a = j;
        this.f32776b = list;
    }

    public C6310b m6047a(long j) {
        long j2;
        if (this.f32776b.size() < 2) {
            return null;
        }
        long j3 = j;
        long j4 = -1;
        long j5 = -1;
        long j6 = -1;
        long j7 = -1;
        boolean z = false;
        for (int size = this.f32776b.size() - 1; size >= 0; size--) {
            C10090a aVar = this.f32776b.get(size);
            boolean equals = "video/mp4".equals(aVar.f32777a) | z;
            if (size == 0) {
                j3 = 0;
                j2 = j3 - aVar.f32780d;
            } else {
                j3 -= aVar.f32779c;
                j2 = j3;
            }
            if (!equals || j3 == j2) {
                z = equals;
            } else {
                j7 = j2 - j3;
                j6 = j3;
                z = false;
            }
            if (size == 0) {
                j4 = j3;
                j5 = j2;
            }
        }
        if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
            return null;
        }
        return new C6310b(j4, j5, this.f32775a, j6, j7);
    }
}
