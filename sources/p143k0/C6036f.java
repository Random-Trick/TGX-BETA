package p143k0;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

public class C6036f<K, V> {
    public final LinkedHashMap<K, V> f19202a;
    public int f19203b;
    public int f19204c;
    public int f19205d;
    public int f19206e;
    public int f19207f;
    public int f19208g;
    public int f19209h;

    public C6036f(int i) {
        if (i > 0) {
            this.f19204c = i;
            this.f19202a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public V m21494a(K k) {
        return null;
    }

    public void m21493b(boolean z, K k, V v, V v2) {
    }

    public final V m21492c(K k) {
        V put;
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            V v = this.f19202a.get(k);
            if (v != null) {
                this.f19208g++;
                return v;
            }
            this.f19209h++;
            V a = m21494a(k);
            if (a == null) {
                return null;
            }
            synchronized (this) {
                this.f19206e++;
                put = this.f19202a.put(k, a);
                if (put != null) {
                    this.f19202a.put(k, put);
                } else {
                    this.f19203b += m21490e(k, a);
                }
            }
            if (put != null) {
                m21493b(false, k, a, put);
                return put;
            }
            m21488g(this.f19204c);
            return a;
        }
    }

    public final V m21491d(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f19205d++;
            this.f19203b += m21490e(k, v);
            put = this.f19202a.put(k, v);
            if (put != null) {
                this.f19203b -= m21490e(k, put);
            }
        }
        if (put != null) {
            m21493b(false, k, put, v);
        }
        m21488g(this.f19204c);
        return put;
    }

    public final int m21490e(K k, V v) {
        int f = m21489f(k, v);
        if (f >= 0) {
            return f;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    public int m21489f(K k, V v) {
        return 1;
    }

    public void m21488g(int r5) {
        throw new UnsupportedOperationException("Method not decompiled: p143k0.C6036f.m21488g(int):void");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f19208g;
        i2 = this.f19209h + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f19204c), Integer.valueOf(this.f19208g), Integer.valueOf(this.f19209h), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
