package p4;

import android.net.Uri;
import android.os.Bundle;
import c5.l0;
import java.util.ArrayList;
import java.util.Arrays;
import m3.h;

public final class c implements h {
    public static final c P = new c(null, new a[0], 0, -9223372036854775807L, 0);
    public static final a Q = new a(0).j(0);
    public static final h.a<c> R = p4.a.f20510a;
    public final long M;
    public final int N;
    public final a[] O;
    public final Object f20512a;
    public final int f20513b;
    public final long f20514c;

    public static final class a implements h {
        public static final h.a<a> Q = b.f20511a;
        public final int[] M;
        public final long[] N;
        public final long O;
        public final boolean P;
        public final long f20515a;
        public final int f20516b;
        public final Uri[] f20517c;

        public a(long j10) {
            this(j10, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public static long[] b(long[] jArr, int i10) {
            int length = jArr.length;
            int max = Math.max(i10, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        public static int[] c(int[] iArr, int i10) {
            int length = iArr.length;
            int max = Math.max(i10, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public static a d(Bundle bundle) {
            Uri[] uriArr;
            long j10 = bundle.getLong(h(0));
            int i10 = bundle.getInt(h(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(h(2));
            int[] intArray = bundle.getIntArray(h(3));
            long[] longArray = bundle.getLongArray(h(4));
            long j11 = bundle.getLong(h(5));
            boolean z10 = bundle.getBoolean(h(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            int[] iArr = intArray;
            if (parcelableArrayList == null) {
                uriArr = new Uri[0];
            } else {
                uriArr = (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            }
            return new a(j10, i10, iArr, uriArr, longArray == null ? new long[0] : longArray, j11, z10);
        }

        public static String h(int i10) {
            return Integer.toString(i10, 36);
        }

        public int e() {
            return f(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f20515a == aVar.f20515a && this.f20516b == aVar.f20516b && Arrays.equals(this.f20517c, aVar.f20517c) && Arrays.equals(this.M, aVar.M) && Arrays.equals(this.N, aVar.N) && this.O == aVar.O && this.P == aVar.P;
        }

        public int f(int i10) {
            int i11 = i10 + 1;
            while (true) {
                int[] iArr = this.M;
                if (i11 >= iArr.length || this.P || iArr[i11] == 0 || iArr[i11] == 1) {
                    break;
                }
                i11++;
            }
            return i11;
        }

        public boolean g() {
            if (this.f20516b == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f20516b; i10++) {
                int[] iArr = this.M;
                if (iArr[i10] == 0 || iArr[i10] == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.f20515a;
            long j11 = this.O;
            return (((((((((((this.f20516b * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f20517c)) * 31) + Arrays.hashCode(this.M)) * 31) + Arrays.hashCode(this.N)) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.P ? 1 : 0);
        }

        public boolean i() {
            return this.f20516b == -1 || e() < this.f20516b;
        }

        public a j(int i10) {
            int[] c10 = c(this.M, i10);
            long[] b10 = b(this.N, i10);
            return new a(this.f20515a, i10, c10, (Uri[]) Arrays.copyOf(this.f20517c, i10), b10, this.O, this.P);
        }

        public a(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            c5.a.a(iArr.length == uriArr.length);
            this.f20515a = j10;
            this.f20516b = i10;
            this.M = iArr;
            this.f20517c = uriArr;
            this.N = jArr;
            this.O = j11;
            this.P = z10;
        }
    }

    public c(Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f20512a = obj;
        this.f20514c = j10;
        this.M = j11;
        this.f20513b = aVarArr.length + i10;
        this.O = aVarArr;
        this.N = i10;
    }

    public static c b(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(g(1));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = a.Q.a((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        return new c(null, aVarArr, bundle.getLong(g(2), 0L), bundle.getLong(g(3), -9223372036854775807L), bundle.getInt(g(4)));
    }

    public static String g(int i10) {
        return Integer.toString(i10, 36);
    }

    public a c(int i10) {
        int i11 = this.N;
        if (i10 < i11) {
            return Q;
        }
        return this.O[i10 - i11];
    }

    public int d(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return -1;
        }
        int i10 = this.N;
        while (i10 < this.f20513b && ((c(i10).f20515a != Long.MIN_VALUE && c(i10).f20515a <= j10) || !c(i10).i())) {
            i10++;
        }
        if (i10 < this.f20513b) {
            return i10;
        }
        return -1;
    }

    public int e(long j10, long j11) {
        int i10 = this.f20513b - 1;
        while (i10 >= 0 && f(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !c(i10).g()) {
            return -1;
        }
        return i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return l0.c(this.f20512a, cVar.f20512a) && this.f20513b == cVar.f20513b && this.f20514c == cVar.f20514c && this.M == cVar.M && this.N == cVar.N && Arrays.equals(this.O, cVar.O);
    }

    public final boolean f(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = c(i10).f20515a;
        return j12 == Long.MIN_VALUE ? j11 == -9223372036854775807L || j10 < j11 : j10 < j12;
    }

    public int hashCode() {
        int i10 = this.f20513b * 31;
        Object obj = this.f20512a;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f20514c)) * 31) + ((int) this.M)) * 31) + this.N) * 31) + Arrays.hashCode(this.O);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f20512a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f20514c);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.O.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.O[i10].f20515a);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.O[i10].M.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.O[i10].M[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.O[i10].N[i11]);
                sb2.append(')');
                if (i11 < this.O[i10].M.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.O.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
