package ld;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.util.LruCache;
import ce.j0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import mb.p;
import oc.v0;
import org.thunderdog.challegram.Log;

public class g {
    public static g f16355e;
    public final HashMap<String, AtomicInteger> f16356a = new HashMap<>();
    public final HashMap<String, Integer> f16357b = new HashMap<>();
    public final a f16359d = new a(h());
    public final HashMap<String, WeakReference<Bitmap>> f16358c = new HashMap<>();

    public class a extends LruCache<String, Bitmap> {
        public a(int i10) {
            super(i10);
        }

        public void entryRemoved(boolean z10, String str, Bitmap bitmap, Bitmap bitmap2) {
            if (!g.this.f16356a.containsKey(str)) {
                if (Log.isEnabled(32)) {
                    Log.v(32, "#%s: recycling bitmap in entryRemoved", str);
                }
                v0.u2(bitmap);
            }
        }

        public int sizeOf(String str, Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                return 1;
            }
            return bitmap.getAllocationByteCount();
        }
    }

    public static String f(Bitmap bitmap) {
        if (bitmap == null) {
            return "null";
        }
        if (bitmap.isRecycled()) {
            return "recycled";
        }
        return bitmap.getWidth() + "x" + bitmap.getHeight();
    }

    public static HashMap<String, AtomicInteger> i() {
        return k().g();
    }

    public static g k() {
        if (f16355e == null) {
            f16355e = new g();
        }
        return f16355e;
    }

    public void b(h hVar, Bitmap bitmap) {
        if (hVar != null && bitmap != null) {
            synchronized (this.f16356a) {
                String hVar2 = hVar.toString();
                AtomicInteger atomicInteger = this.f16356a.get(hVar2);
                if (atomicInteger != null) {
                    atomicInteger.incrementAndGet();
                } else {
                    HashMap<String, AtomicInteger> hashMap = this.f16356a;
                    AtomicInteger atomicInteger2 = new AtomicInteger(1);
                    hashMap.put(hVar2, atomicInteger2);
                    atomicInteger = atomicInteger2;
                }
                if (Log.isEnabled(32)) {
                    Log.v(32, "#%s: reference++: %d", hVar2, Integer.valueOf(atomicInteger.get()));
                }
            }
        } else if (Log.isEnabled(32)) {
            Object[] objArr = new Object[2];
            objArr[0] = hVar != null ? hVar.toString() : "null";
            objArr[1] = f(bitmap);
            Log.w(32, "#%s: addReference failed bitmap: %s", objArr);
        }
    }

    public void c(boolean z10) {
        synchronized (this.f16356a) {
            if (z10) {
                this.f16356a.clear();
            }
        }
        if (z10) {
            this.f16359d.evictAll();
        }
    }

    public void d(int i10) {
        synchronized (this.f16356a) {
            String str = "account" + i10 + "_";
            for (String str2 : this.f16359d.snapshot().keySet()) {
                if (str2.startsWith(str)) {
                    this.f16359d.remove(str2);
                }
            }
        }
    }

    public Bitmap e(h hVar) {
        Integer num;
        String hVar2 = hVar.toString();
        Bitmap bitmap = this.f16359d.get(hVar2);
        if (!(bitmap == null || (num = this.f16357b.get(hVar2)) == null)) {
            hVar.q0(num.intValue());
        }
        if (bitmap == null) {
            synchronized (this.f16356a) {
                WeakReference<Bitmap> weakReference = this.f16358c.get(hVar2);
                Bitmap bitmap2 = weakReference != null ? weakReference.get() : null;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    return bitmap2;
                }
                this.f16358c.remove(hVar2);
            }
        }
        return bitmap;
    }

    public HashMap<String, AtomicInteger> g() {
        return this.f16356a;
    }

    public final int h() {
        return (int) p.f17347c.b(Math.min(15, ((ActivityManager) j0.n().getSystemService("activity")).getMemoryClass() / 7));
    }

    public final boolean j(String str) {
        return this.f16359d.get(str) != null;
    }

    public void l(h hVar, Bitmap bitmap) {
        String hVar2 = hVar.toString();
        this.f16359d.put(hVar2, bitmap);
        if (hVar.x() != 0) {
            this.f16357b.put(hVar2, Integer.valueOf(hVar.x()));
        }
        synchronized (this.f16356a) {
            this.f16358c.put(hVar2, new WeakReference<>(bitmap));
        }
    }

    public void m(h hVar, Bitmap bitmap) {
        if (hVar != null && bitmap != null) {
            synchronized (this.f16356a) {
                String hVar2 = hVar.toString();
                AtomicInteger atomicInteger = this.f16356a.get(hVar2);
                if (atomicInteger != null) {
                    int decrementAndGet = atomicInteger.decrementAndGet();
                    if (decrementAndGet >= 0) {
                        if (Log.isEnabled(32)) {
                            Log.v(32, "#%s: reference--: %d", hVar2, Integer.valueOf(decrementAndGet));
                        }
                        if (decrementAndGet == 0) {
                            this.f16356a.remove(hVar2);
                            if (!j(hVar2)) {
                                if (Log.isEnabled(32)) {
                                    Log.v(32, "#%s: recycling bitmap in removeReference", hVar2);
                                }
                                v0.u2(bitmap);
                            }
                            this.f16358c.remove(hVar2);
                        }
                    } else {
                        throw new IllegalStateException("key:" + hVar2);
                    }
                }
            }
        } else if (hVar == null && Log.isEnabled(32)) {
            Log.w(32, "#null: removeReference failed, bitmap: %s", f(bitmap));
        }
    }

    public String toString() {
        return "ImageCache { counters = " + this.f16356a.size() + ", memcache = " + this.f16359d.size() + " }";
    }
}
