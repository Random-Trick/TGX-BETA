package p200o4;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import p020b5.C1186a;
import p020b5.C1216l0;
import p174m3.AbstractC6609h;

public final class C7652c implements AbstractC6609h {
    public static final C7652c f24527P = new C7652c(null, new C7653a[0], 0, -9223372036854775807L, 0);
    public static final C7653a f24528Q = new C7653a(0).m15284j(0);
    public static final AbstractC6609h.AbstractC6610a<C7652c> f24529R = C7650a.f24525a;
    public final long f24530M;
    public final int f24531N;
    public final C7653a[] f24532O;
    public final Object f24533a;
    public final int f24534b;
    public final long f24535c;

    public static final class C7653a implements AbstractC6609h {
        public static final AbstractC6609h.AbstractC6610a<C7653a> f24536Q = C7651b.f24526a;
        public final int[] f24537M;
        public final long[] f24538N;
        public final long f24539O;
        public final boolean f24540P;
        public final long f24541a;
        public final int f24542b;
        public final Uri[] f24543c;

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
            return this.f24541a == aVar.f24541a && this.f24542b == aVar.f24542b && Arrays.equals(this.f24543c, aVar.f24543c) && Arrays.equals(this.f24537M, aVar.f24537M) && Arrays.equals(this.f24538N, aVar.f24538N) && this.f24539O == aVar.f24539O && this.f24540P == aVar.f24540P;
        }

        public int m15288f(int i) {
            int i2 = i + 1;
            while (true) {
                int[] iArr = this.f24537M;
                if (i2 >= iArr.length || this.f24540P || iArr[i2] == 0 || iArr[i2] == 1) {
                    break;
                }
                i2++;
            }
            return i2;
        }

        public boolean m15287g() {
            if (this.f24542b == -1) {
                return true;
            }
            for (int i = 0; i < this.f24542b; i++) {
                int[] iArr = this.f24537M;
                if (iArr[i] == 0 || iArr[i] == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            long j = this.f24541a;
            long j2 = this.f24539O;
            return (((((((((((this.f24542b * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.f24543c)) * 31) + Arrays.hashCode(this.f24537M)) * 31) + Arrays.hashCode(this.f24538N)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f24540P ? 1 : 0);
        }

        public boolean m15285i() {
            return this.f24542b == -1 || m15289e() < this.f24542b;
        }

        public C7653a m15284j(int i) {
            int[] c = m15291c(this.f24537M, i);
            long[] b = m15292b(this.f24538N, i);
            return new C7653a(this.f24541a, i, c, (Uri[]) Arrays.copyOf(this.f24543c, i), b, this.f24539O, this.f24540P);
        }

        public C7653a(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            C1186a.m38192a(iArr.length == uriArr.length);
            this.f24541a = j;
            this.f24542b = i;
            this.f24537M = iArr;
            this.f24543c = uriArr;
            this.f24538N = jArr;
            this.f24539O = j2;
            this.f24540P = z;
        }
    }

    public C7652c(Object obj, C7653a[] aVarArr, long j, long j2, int i) {
        this.f24533a = obj;
        this.f24535c = j;
        this.f24530M = j2;
        this.f24534b = aVarArr.length + i;
        this.f24532O = aVarArr;
        this.f24531N = i;
    }

    public static C7652c m15299b(Bundle bundle) {
        C7653a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(m15294g(1));
        if (parcelableArrayList == null) {
            aVarArr = new C7653a[0];
        } else {
            C7653a[] aVarArr2 = new C7653a[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                aVarArr2[i] = C7653a.f24536Q.mo998a((Bundle) parcelableArrayList.get(i));
            }
            aVarArr = aVarArr2;
        }
        return new C7652c(null, aVarArr, bundle.getLong(m15294g(2), 0L), bundle.getLong(m15294g(3), -9223372036854775807L), bundle.getInt(m15294g(4)));
    }

    public static String m15294g(int i) {
        return Integer.toString(i, 36);
    }

    public C7653a m15298c(int i) {
        int i2 = this.f24531N;
        if (i < i2) {
            return f24528Q;
        }
        return this.f24532O[i - i2];
    }

    public int m15297d(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = this.f24531N;
        while (i < this.f24534b && ((m15298c(i).f24541a != Long.MIN_VALUE && m15298c(i).f24541a <= j) || !m15298c(i).m15285i())) {
            i++;
        }
        if (i < this.f24534b) {
            return i;
        }
        return -1;
    }

    public int m15296e(long j, long j2) {
        int i = this.f24534b - 1;
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
        return C1216l0.m37985c(this.f24533a, cVar.f24533a) && this.f24534b == cVar.f24534b && this.f24535c == cVar.f24535c && this.f24530M == cVar.f24530M && this.f24531N == cVar.f24531N && Arrays.equals(this.f24532O, cVar.f24532O);
    }

    public final boolean m15295f(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = m15298c(i).f24541a;
        return j3 == Long.MIN_VALUE ? j2 == -9223372036854775807L || j < j2 : j < j3;
    }

    public int hashCode() {
        int i = this.f24534b * 31;
        Object obj = this.f24533a;
        return ((((((((i + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f24535c)) * 31) + ((int) this.f24530M)) * 31) + this.f24531N) * 31) + Arrays.hashCode(this.f24532O);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f24533a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f24535c);
        sb2.append(", adGroups=[");
        for (int i = 0; i < this.f24532O.length; i++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f24532O[i].f24541a);
            sb2.append(", ads=[");
            for (int i2 = 0; i2 < this.f24532O[i].f24537M.length; i2++) {
                sb2.append("ad(state=");
                int i3 = this.f24532O[i].f24537M[i2];
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
                sb2.append(this.f24532O[i].f24538N[i2]);
                sb2.append(')');
                if (i2 < this.f24532O[i].f24537M.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i < this.f24532O.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}
