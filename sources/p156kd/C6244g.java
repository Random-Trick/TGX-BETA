package p156kd;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.LruCache;
import be.C1379j0;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import lb.EnumC6459p;
import nc.C7389v0;
import org.thunderdog.challegram.Log;

public class C6244g {
    public static C6244g f19684e;
    public final HashMap<String, AtomicInteger> f19685a = new HashMap<>();
    public final HashMap<String, Integer> f19686b = new HashMap<>();
    public final C6245a f19688d = new C6245a(m20963h());
    public final HashMap<String, WeakReference<Bitmap>> f19687c = new HashMap<>();

    public class C6245a extends LruCache<String, Bitmap> {
        public C6245a(int i) {
            super(i);
        }

        public void entryRemoved(boolean z, String str, Bitmap bitmap, Bitmap bitmap2) {
            if (!C6244g.this.f19685a.containsKey(str)) {
                if (Log.isEnabled(32)) {
                    Log.m14716v(32, "#%s: recycling bitmap in entryRemoved", str);
                }
                C7389v0.m16575u2(bitmap);
            }
        }

        public int sizeOf(String str, Bitmap bitmap) {
            if (bitmap == null || bitmap.isRecycled()) {
                return 1;
            }
            int i = Build.VERSION.SDK_INT;
            if (i < 12) {
                return bitmap.getRowBytes() * bitmap.getHeight();
            }
            if (i < 19) {
                return bitmap.getByteCount();
            }
            return bitmap.getAllocationByteCount();
        }
    }

    public static String m20965f(Bitmap bitmap) {
        if (bitmap == null) {
            return "null";
        }
        if (bitmap.isRecycled()) {
            return "recycled";
        }
        return bitmap.getWidth() + "x" + bitmap.getHeight();
    }

    public static HashMap<String, AtomicInteger> m20962i() {
        return m20960k().m20964g();
    }

    public static C6244g m20960k() {
        if (f19684e == null) {
            f19684e = new C6244g();
        }
        return f19684e;
    }

    public void m20969b(C6246h hVar, Bitmap bitmap) {
        if (hVar != null && bitmap != null) {
            synchronized (this.f19685a) {
                String hVar2 = hVar.toString();
                AtomicInteger atomicInteger = this.f19685a.get(hVar2);
                if (atomicInteger != null) {
                    atomicInteger.incrementAndGet();
                } else {
                    HashMap<String, AtomicInteger> hashMap = this.f19685a;
                    AtomicInteger atomicInteger2 = new AtomicInteger(1);
                    hashMap.put(hVar2, atomicInteger2);
                    atomicInteger = atomicInteger2;
                }
                if (Log.isEnabled(32)) {
                    Log.m14716v(32, "#%s: reference++: %d", hVar2, Integer.valueOf(atomicInteger.get()));
                }
            }
        } else if (Log.isEnabled(32)) {
            Object[] objArr = new Object[2];
            objArr[0] = hVar != null ? hVar.toString() : "null";
            objArr[1] = m20965f(bitmap);
            Log.m14711w(32, "#%s: addReference failed bitmap: %s", objArr);
        }
    }

    public void m20968c(boolean z) {
        synchronized (this.f19685a) {
            if (z) {
                this.f19685a.clear();
            }
        }
        if (z) {
            this.f19688d.evictAll();
        }
    }

    public void m20967d(int i) {
        synchronized (this.f19685a) {
            String str = "account" + i + "_";
            for (String str2 : this.f19688d.snapshot().keySet()) {
                if (str2.startsWith(str)) {
                    this.f19688d.remove(str2);
                }
            }
        }
    }

    public Bitmap m20966e(C6246h hVar) {
        Integer num;
        String hVar2 = hVar.toString();
        Bitmap bitmap = this.f19688d.get(hVar2);
        if (!(bitmap == null || (num = this.f19686b.get(hVar2)) == null)) {
            hVar.mo20874q0(num.intValue());
        }
        if (bitmap == null) {
            synchronized (this.f19685a) {
                WeakReference<Bitmap> weakReference = this.f19687c.get(hVar2);
                Bitmap bitmap2 = weakReference != null ? weakReference.get() : null;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    return bitmap2;
                }
                this.f19687c.remove(hVar2);
            }
        }
        return bitmap;
    }

    public HashMap<String, AtomicInteger> m20964g() {
        return this.f19685a;
    }

    public final int m20963h() {
        long b;
        if (Build.VERSION.SDK_INT >= 11) {
            b = EnumC6459p.f20158c.mo20395b(Math.min(15, ((ActivityManager) C1379j0.m37315n().getSystemService("activity")).getMemoryClass() / 7));
        } else {
            b = EnumC6459p.f20158c.mo20395b(3.0d);
        }
        return (int) b;
    }

    public final boolean m20961j(String str) {
        return this.f19688d.get(str) != null;
    }

    public void m20959l(C6246h hVar, Bitmap bitmap) {
        String hVar2 = hVar.toString();
        this.f19688d.put(hVar2, bitmap);
        if (hVar.mo20873x() != 0) {
            this.f19686b.put(hVar2, Integer.valueOf(hVar.mo20873x()));
        }
        synchronized (this.f19685a) {
            this.f19687c.put(hVar2, new WeakReference<>(bitmap));
        }
    }

    public void m20958m(C6246h hVar, Bitmap bitmap) {
        if (hVar != null && bitmap != null) {
            synchronized (this.f19685a) {
                String hVar2 = hVar.toString();
                AtomicInteger atomicInteger = this.f19685a.get(hVar2);
                if (atomicInteger != null) {
                    int decrementAndGet = atomicInteger.decrementAndGet();
                    if (decrementAndGet >= 0) {
                        if (Log.isEnabled(32)) {
                            Log.m14716v(32, "#%s: reference--: %d", hVar2, Integer.valueOf(decrementAndGet));
                        }
                        if (decrementAndGet == 0) {
                            this.f19685a.remove(hVar2);
                            if (!m20961j(hVar2)) {
                                if (Log.isEnabled(32)) {
                                    Log.m14716v(32, "#%s: recycling bitmap in removeReference", hVar2);
                                }
                                C7389v0.m16575u2(bitmap);
                            }
                            this.f19687c.remove(hVar2);
                        }
                    } else {
                        throw new IllegalStateException("key:" + hVar2);
                    }
                }
            }
        } else if (hVar == null && Log.isEnabled(32)) {
            Log.m14711w(32, "#null: removeReference failed, bitmap: %s", m20965f(bitmap));
        }
    }

    public String toString() {
        return "ImageCache { counters = " + this.f19685a.size() + ", memcache = " + this.f19688d.size() + " }";
    }
}
