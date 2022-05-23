package t3;

import a4.g;
import android.net.Uri;
import c4.a0;
import c4.b;
import c4.e;
import c4.h0;
import c5.k;
import c5.o;
import com.google.android.exoplayer2.ext.flac.h;
import com.google.android.exoplayer2.ext.flac.i;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import v3.c;
import z3.f;

public final class d implements l {
    public static final int[] f22874n = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};
    public static final a f22875o = new a();
    public boolean f22876b;
    public boolean f22877c;
    public int f22878d;
    public int f22879e;
    public int f22880f;
    public int f22881g;
    public int f22882h;
    public int f22883i;
    public int f22884j;
    public int f22886l;
    public int f22885k = 1;
    public int f22887m = 112800;

    public static final class a {
        public final AtomicBoolean f22888a = new AtomicBoolean(false);
        public Constructor<? extends f> f22889b;

        public f a(int i10) {
            Constructor<? extends f> b10 = b();
            if (b10 == null) {
                return null;
            }
            try {
                return b10.newInstance(Integer.valueOf(i10));
            } catch (Exception e10) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e10);
            }
        }

        public final Constructor<? extends f> b() {
            synchronized (this.f22888a) {
                if (this.f22888a.get()) {
                    return this.f22889b;
                }
                try {
                    Boolean bool = Boolean.TRUE;
                    o oVar = i.f5519a;
                    if (bool.equals(i.class.getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                        l lVar = h.f5506k;
                        this.f22889b = h.class.asSubclass(f.class).getConstructor(Integer.TYPE);
                    }
                } catch (ClassNotFoundException unused) {
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating FLAC extension", e10);
                }
                this.f22888a.set(true);
                return this.f22889b;
            }
        }
    }

    @Override
    public synchronized f[] a() {
        return b(Uri.EMPTY, new HashMap());
    }

    @Override
    public synchronized f[] b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr;
        arrayList = new ArrayList(14);
        int b10 = k.b(map);
        if (b10 != -1) {
            c(b10, arrayList);
        }
        int c10 = k.c(uri);
        if (!(c10 == -1 || c10 == b10)) {
            c(c10, arrayList);
        }
        for (int i10 : f22874n) {
            if (!(i10 == b10 || i10 == c10)) {
                c(i10, arrayList);
            }
        }
        return (f[]) arrayList.toArray(new f[arrayList.size()]);
    }

    public final void c(int i10, List<f> list) {
        int i11 = 2;
        switch (i10) {
            case 0:
                list.add(new b());
                return;
            case 1:
                list.add(new e());
                return;
            case 2:
                int i12 = this.f22878d | (this.f22876b ? 1 : 0);
                if (!this.f22877c) {
                    i11 = 0;
                }
                list.add(new c4.h(i11 | i12));
                return;
            case 3:
                int i13 = this.f22879e | (this.f22876b ? 1 : 0);
                if (!this.f22877c) {
                    i11 = 0;
                }
                list.add(new u3.b(i11 | i13));
                return;
            case 4:
                f a10 = f22875o.a(this.f22880f);
                if (a10 != null) {
                    list.add(a10);
                    return;
                } else {
                    list.add(new c(this.f22880f));
                    return;
                }
            case 5:
                list.add(new w3.c());
                return;
            case 6:
                list.add(new y3.e(this.f22881g));
                return;
            case 7:
                int i14 = this.f22884j | (this.f22876b ? 1 : 0);
                if (!this.f22877c) {
                    i11 = 0;
                }
                list.add(new f(i11 | i14));
                return;
            case 8:
                list.add(new g(this.f22883i));
                list.add(new a4.k(this.f22882h));
                return;
            case 9:
                list.add(new b4.d());
                return;
            case 10:
                list.add(new a0());
                return;
            case 11:
                list.add(new h0(this.f22885k, this.f22886l, this.f22887m));
                return;
            case 12:
                list.add(new d4.b());
                return;
            case 13:
            default:
                return;
            case 14:
                list.add(new x3.a());
                return;
        }
    }

    public synchronized d d(boolean z10) {
        this.f22876b = z10;
        return this;
    }
}
