package k0;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

public class f<K, V> {
    public final LinkedHashMap<K, V> f15580a;
    public int f15581b;
    public int f15582c;
    public int f15583d;
    public int f15584e;
    public int f15585f;
    public int f15586g;
    public int f15587h;

    public f(int i10) {
        if (i10 > 0) {
            this.f15582c = i10;
            this.f15580a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public V a(K k10) {
        return null;
    }

    public void b(boolean z10, K k10, V v10, V v11) {
    }

    public final V c(K k10) {
        V put;
        Objects.requireNonNull(k10, "key == null");
        synchronized (this) {
            V v10 = this.f15580a.get(k10);
            if (v10 != null) {
                this.f15586g++;
                return v10;
            }
            this.f15587h++;
            V a10 = a(k10);
            if (a10 == null) {
                return null;
            }
            synchronized (this) {
                this.f15584e++;
                put = this.f15580a.put(k10, a10);
                if (put != null) {
                    this.f15580a.put(k10, put);
                } else {
                    this.f15581b += e(k10, a10);
                }
            }
            if (put != null) {
                b(false, k10, a10, put);
                return put;
            }
            g(this.f15582c);
            return a10;
        }
    }

    public final V d(K k10, V v10) {
        V put;
        if (k10 == null || v10 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f15583d++;
            this.f15581b += e(k10, v10);
            put = this.f15580a.put(k10, v10);
            if (put != null) {
                this.f15581b -= e(k10, put);
            }
        }
        if (put != null) {
            b(false, k10, put, v10);
        }
        g(this.f15582c);
        return put;
    }

    public final int e(K k10, V v10) {
        int f10 = f(k10, v10);
        if (f10 >= 0) {
            return f10;
        }
        throw new IllegalStateException("Negative size: " + k10 + "=" + v10);
    }

    public int f(K k10, V v10) {
        return 1;
    }

    public void g(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: k0.f.g(int):void");
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        i10 = this.f15586g;
        i11 = this.f15587h + i10;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f15582c), Integer.valueOf(this.f15586g), Integer.valueOf(this.f15587h), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }
}
