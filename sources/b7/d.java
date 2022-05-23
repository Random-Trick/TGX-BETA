package b7;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
import z6.j;

public final class d extends e {

    public static class a extends AbstractList<Integer> implements RandomAccess, Serializable {
        public final int[] f4015a;
        public final int f4016b;
        public final int f4017c;

        public a(int[] iArr) {
            this(iArr, 0, iArr.length);
        }

        @Override
        public boolean contains(@CheckForNull Object obj) {
            return (obj instanceof Integer) && d.g(this.f4015a, ((Integer) obj).intValue(), this.f4016b, this.f4017c) != -1;
        }

        @Override
        public boolean equals(@CheckForNull Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return super.equals(obj);
            }
            a aVar = (a) obj;
            int size = size();
            if (aVar.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f4015a[this.f4016b + i10] != aVar.f4015a[aVar.f4016b + i10]) {
                    return false;
                }
            }
            return true;
        }

        public Integer get(int i10) {
            j.g(i10, size());
            return Integer.valueOf(this.f4015a[this.f4016b + i10]);
        }

        public Integer set(int i10, Integer num) {
            j.g(i10, size());
            int[] iArr = this.f4015a;
            int i11 = this.f4016b;
            int i12 = iArr[i11 + i10];
            iArr[i11 + i10] = ((Integer) j.i(num)).intValue();
            return Integer.valueOf(i12);
        }

        @Override
        public int hashCode() {
            int i10 = 1;
            for (int i11 = this.f4016b; i11 < this.f4017c; i11++) {
                i10 = (i10 * 31) + d.f(this.f4015a[i11]);
            }
            return i10;
        }

        @Override
        public int indexOf(@CheckForNull Object obj) {
            int g10;
            if (!(obj instanceof Integer) || (g10 = d.g(this.f4015a, ((Integer) obj).intValue(), this.f4016b, this.f4017c)) < 0) {
                return -1;
            }
            return g10 - this.f4016b;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public int lastIndexOf(@CheckForNull Object obj) {
            int h10;
            if (!(obj instanceof Integer) || (h10 = d.h(this.f4015a, ((Integer) obj).intValue(), this.f4016b, this.f4017c)) < 0) {
                return -1;
            }
            return h10 - this.f4016b;
        }

        public int[] m() {
            return Arrays.copyOfRange(this.f4015a, this.f4016b, this.f4017c);
        }

        @Override
        public int size() {
            return this.f4017c - this.f4016b;
        }

        @Override
        public List<Integer> subList(int i10, int i11) {
            j.m(i10, i11, size());
            if (i10 == i11) {
                return Collections.emptyList();
            }
            int[] iArr = this.f4015a;
            int i12 = this.f4016b;
            return new a(iArr, i10 + i12, i12 + i11);
        }

        @Override
        public String toString() {
            StringBuilder sb2 = new StringBuilder(size() * 5);
            sb2.append('[');
            sb2.append(this.f4015a[this.f4016b]);
            int i10 = this.f4016b;
            while (true) {
                i10++;
                if (i10 < this.f4017c) {
                    sb2.append(", ");
                    sb2.append(this.f4015a[i10]);
                } else {
                    sb2.append(']');
                    return sb2.toString();
                }
            }
        }

        public a(int[] iArr, int i10, int i11) {
            this.f4015a = iArr;
            this.f4016b = i10;
            this.f4017c = i11;
        }
    }

    public static List<Integer> c(int... iArr) {
        if (iArr.length == 0) {
            return Collections.emptyList();
        }
        return new a(iArr);
    }

    public static int d(long j10) {
        int i10 = (int) j10;
        j.f(((long) i10) == j10, "Out of range: %s", j10);
        return i10;
    }

    public static int e(int i10, int i11) {
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }

    public static int f(int i10) {
        return i10;
    }

    public static int g(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public static int h(int[] iArr, int i10, int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            if (iArr[i13] == i10) {
                return i13;
            }
        }
        return -1;
    }

    public static int[] i(Collection<? extends Number> collection) {
        if (collection instanceof a) {
            return ((a) collection).m();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((Number) j.i(array[i10])).intValue();
        }
        return iArr;
    }
}
