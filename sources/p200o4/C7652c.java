package p200o4;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import p020b5.C1186a;
import p020b5.C1216l0;
import p174m3.AbstractC6609h;

public final class C7652c implements AbstractC6609h {
    public static final C7652c f24524P = new C7652c(null, new C7653a[0], 0, -9223372036854775807L, 0);
    public static final C7653a f24525Q = new C7653a(0).m15284j(0);
    public static final AbstractC6609h.AbstractC6610a<C7652c> f24526R = C7650a.f24522a;
    public final long f24527M;
    public final int f24528N;
    public final C7653a[] f24529O;
    public final Object f24530a;
    public final int f24531b;
    public final long f24532c;

    public static final class C7653a implements AbstractC6609h {
        public static final AbstractC6609h.AbstractC6610a<C7653a> f24533Q = C7651b.f24523a;
        public final int[] f24534M;
        public final long[] f24535N;
        public final long f24536O;
        public final boolean f24537P;
        public final long f24538a;
        public final int f24539b;
        public final Uri[] f24540c;

        public C7653a(long j) {
            this(j, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public static long[] m15292b(long[] jArr, int i) {
            int length = jArr.length;
            int max = Math.max(i, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        public static int[] m15291c(int[] iArr, int i) {
            int length = iArr.length;
            int max = Math.max(i, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public static C7653a m15290d(Bundle bundle) {
            Uri[] uriArr;
            long j = bundle.getLong(m15286h(0));
            int i = bundle.getInt(m15286h(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(m15286h(2));
            int[] intArray = bundle.getIntArray(m15286h(3));
            long[] longArray = bundle.getLongArray(m15286h(4));
            long j2 = bundle.getLong(m15286h(5));
            boolean z = bundle.getBoolean(m15286h(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            int[] iArr = intArray;
            if (parcelableArrayList == null) {
                uriArr = new Uri[0];
            } else {
                uriArr = (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            }
            return new C7653a(j, i, iArr, uriArr, longArray == null ? new long[0] : longArray, j2, z);
        }

        public static String m15286h(int i) {
            return Integer.toString(i, 36);
        }

        public int m15289e() {
            return m15288f(-1);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C7653a.class != obj.getClass()) {
                return false;
            }
            C7653a aVar = (C7653a) obj;
            return this.f24538a == aVar.f24538a && this.f24539b == aVar.f24539b && Arrays.equals(this.f24540c, aVar.f24540c) && Arrays.equals(this.f24534M, aVar.f24534M) && Arrays.equals(this.f24535N, aVar.f24535N) && this.f24536O == aVar.f24536O && this.f24537P == aVar.f24537P;
        }

        public int m15288f(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.f24534M;
                if (i2 >= iArr.length || this.f24537P || iArr[i2] == 0 || iArr[i2] == 1) {
                    break;
                }
                i2++;
            }
            return i2;
        }

        public boolean m15287g() {
            if (this.f24539b == -1) {
                return true;
            }
            for (int i = 0; i < this.f24539b; i++) {
                int[] iArr = this.f24534M;
                if (iArr[i] == 0 || iArr[i] == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            long j = this.f24538a;
            long j2 = this.f24536O;
            return (((((((((((this.f24539b * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f24540c)) * 31) + Arrays.hashCode(this.f24534M)) * 31) + Arrays.hashCode(this.f24535N)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f24537P ? 1 : 0);
        }

        public boolean m15285i() {
            return this.f24539b == -1 || m15289e() < this.f24539b;
        }

        public C7653a m15284j(int i) {
            int[] c = m15291c(this.f24534M, i);
            long[] b = m15292b(this.f24535N, i);
            return new C7653a(this.f24538a, i, c, (Uri[]) Arrays.copyOf(this.f24540c, i), b, this.f24536O, this.f24537P);
        }

        public C7653a(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            C1186a.m38189a(iArr.length == uriArr.length);
            this.f24538a = j;
            this.f24539b = i;
            this.f24534M = iArr;
            this.f24540c = uriArr;
            this.f24535N = jArr;
            this.f24536O = j2;
            this.f24537P = z;
        }
    }

    public C7652c(Object obj, C7653a[] aVarArr, long j, long j2, int i) {
        this.f24530a = obj;
        this.f24532c = j;
        this.f24527M = j2;
        this.f24531b = aVarArr.length + i;
        this.f24529O = aVarArr;
        this.f24528N = i;
    }

    public static C7652c m15299b(Bundle bundle) {
        C7653a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(m15294g(1));
        if (parcelableArrayList == null) {
            aVarArr = new C7653a[0];
        } else {
            C7653a[] aVarArr2 = new C7653a[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                aVarArr2[i] = C7653a.f24533Q.mo998a((Bundle) parcelableArrayList.get(i));
            }
            aVarArr = aVarArr2;
        }
        return new C7652c(null, aVarArr, bundle.getLong(m15294g(2), 0L), bundle.getLong(m15294g(3), -9223372036854775807L), bundle.getInt(m15294g(4)));
    }

    public static String m15294g(int i) {
        return Integer.toString(i, 36);
    }

    public C7653a m15298c(int i) {
        int i2 = this.f24528N;
        if (i < i2) {
            return f24525Q;
        }
        return this.f24529O[i - i2];
    }

    public int m15297d(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = this.f24528N;
        while (i < this.f24531b && ((m15298c(i).f24538a != Long.MIN_VALUE && m15298c(i).f24538a <= j) || !m15298c(i).m15285i())) {
            i++;
        }
        if (i < this.f24531b) {
            return i;
        }
        return -1;
    }

    public int m15296e(long j, long j2) {
        int i = this.f24531b - 1;
        while (i >= 0 && m15295f(j, j2, i)) {
            i--;
        }
        if (i < 0 || !m15298c(i).m15287g()) {
            return -1;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7652c.class != obj.getClass()) {
            return false;
        }
        C7652c cVar = (C7652c) obj;
        return C1216l0.m37982c(this.f24530a, cVar.f24530a) && this.f24531b == cVar.f24531b && this.f24532c == cVar.f24532c && this.f24527M == cVar.f24527M && this.f24528N == cVar.f24528N && Arrays.equals(this.f24529O, cVar.f24529O);
    }

    public final boolean m15295f(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = m15298c(i).f24538a;
        return j3 == Long.MIN_VALUE ? j2 == -9223372036854775807L || j < j2 : j < j3;
    }

    public int hashCode() {
        int i = this.f24531b * 31;
        Object obj = this.f24530a;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f24532c)) * 31) + ((int) this.f24527M)) * 31) + this.f24528N) * 31) + Arrays.hashCode(this.f24529O);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f24530a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f24532c);
        sb2.append(", adGroups=[");
        for (int i = 0; i < this.f24529O.length; i++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f24529O[i].f24538a);
            sb2.append(", ads=[");
            for (int i2 = 0; i2 < this.f24529O[i].f24534M.length; i2++) {
                sb2.append("ad(state=");
                int i3 = this.f24529O[i].f24534M[i2];
                if (i3 == 0) {
                    sb2.append('_');
                } else if (i3 == 1) {
                    sb2.append('R');
                } else if (i3 == 2) {
                    sb2.append('S');
                } else if (i3 == 3) {
                    sb2.append('P');
                } else if (i3 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f24529O[i].f24535N[i2]);
                sb2.append(')');
                if (i2 < this.f24529O[i].f24534M.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i < this.f24529O.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}