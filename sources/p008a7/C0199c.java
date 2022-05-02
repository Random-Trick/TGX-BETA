package p008a7;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p343y6.C10433i;

public final class C0199c {

    public static class C0200a extends AbstractList<Integer> implements RandomAccess, Serializable {
        public final int[] f670a;
        public final int f671b;
        public final int f672c;

        public C0200a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override
        public boolean contains(Object obj) {
            return (obj instanceof Integer) && C0199c.m42099g(this.f670a, ((Integer) obj).intValue(), this.f671b, this.f672c) != -1;
        }

        @Override
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0200a)) {
                return super.equals(obj);
            }
            C0200a aVar = (C0200a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (this.f670a[this.f671b + i] != aVar.f670a[aVar.f671b + i]) {
                    return false;
                }
            }
            return true;
        }

        public Integer get(int i) {
            C10433i.m5131g(i, size());
            return Integer.valueOf(this.f670a[this.f671b + i]);
        }

        @Override
        public int hashCode() {
            int i = 1;
            for (int i2 = this.f671b; i2 < this.f672c; i2++) {
                i = (i * 31) + C0199c.m42100f(this.f670a[i2]);
            }
            return i;
        }

        public Integer set(int i, Integer num) {
            C10433i.m5131g(i, size());
            int[] iArr = this.f670a;
            int i2 = this.f671b;
            int i3 = iArr[i2 + i];
            iArr[i2 + i] = ((Integer) C10433i.m5129i(num)).intValue();
            return Integer.valueOf(i3);
        }

        @Override
        public int indexOf(Object obj) {
            int g;
            if (!(obj instanceof Integer) || (g = C0199c.m42099g(this.f670a, ((Integer) obj).intValue(), this.f671b, this.f672c)) < 0) {
                return -1;
            }
            return g - this.f671b;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public int lastIndexOf(Object obj) {
            int h;
            if (!(obj instanceof Integer) || (h = C0199c.m42098h(this.f670a, ((Integer) obj).intValue(), this.f671b, this.f672c)) < 0) {
                return -1;
            }
            return h - this.f671b;
        }

        public int[] m42094m() {
            return Arrays.copyOfRange(this.f670a, this.f671b, this.f672c);
        }

        @Override
        public int size() {
            return this.f672c - this.f671b;
        }

        @Override
        public List<Integer> subList(int i, int i2) {
            C10433i.m5125m(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            int[] iArr = this.f670a;
            int i3 = this.f671b;
            return new C0200a(iArr, i + i3, i3 + i2);
        }

        @Override
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f670a[this.f671b]);
            int i = this.f671b;
            while (true) {
                i++;
                if (i < this.f672c) {
                    sb2.append(", ");
                    sb2.append(this.f670a[i]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }

        public C0200a(int[] iArr, int i, int i2) {
            this.f670a = iArr;
            this.f671b = i;
            this.f672c = i2;
        }
    }

    public static List<Integer> m42103c(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new C0200a(iArr);
    }

    public static int m42102d(long j) {
        int i = (int) j;
        C10433i.m5132f(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int m42101e(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int m42100f(int i) {
        return i;
    }

    public static int m42099g(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int m42098h(int[] iArr, int i, int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            if (iArr[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    public static int[] m42097i(Collection<? extends Number> collection) {
        if (collection instanceof C0200a) {
            return ((C0200a) collection).m42094m();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Number) C10433i.m5129i(array[i])).intValue();
        }
        return iArr;
    }
}
