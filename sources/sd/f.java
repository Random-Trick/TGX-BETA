package sd;

import android.graphics.Canvas;
import android.util.Base64;
import ce.j0;
import gd.l;
import ib.i;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import k0.h;
import org.thunderdog.challegram.Log;

public class f {
    public static h<f> f22722e;
    public List<g> f22723a;
    public List<c> f22724b;
    public List<Reference<a>> f22725c;
    public List<Reference<b>> f22726d;

    public interface a {
        void a(f fVar);
    }

    public interface b {
        void h7(f fVar, boolean z10, int i10);
    }

    public f() {
    }

    public f(f fVar) {
        List<g> list = fVar.f22723a;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(fVar.f22723a.size());
            this.f22723a = arrayList;
            arrayList.addAll(fVar.f22723a);
        }
        List<c> list2 = fVar.f22724b;
        if (list2 != null && !list2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(fVar.f22724b.size());
            this.f22724b = arrayList2;
            arrayList2.addAll(fVar.f22724b);
        }
    }

    public static boolean f(List<g> list, List<g> list2) {
        boolean z10 = list == null || list.isEmpty();
        if (z10 != (list2 == null || list2.isEmpty())) {
            return false;
        }
        if (z10) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int i10 = 0;
        for (g gVar : list) {
            if (!gVar.c(list2.get(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static File h() {
        return new File(j0.n().getFilesDir(), "paints");
    }

    public void j(java.io.File r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: sd.f.j(java.io.File, int):void");
    }

    public static f n(int i10) {
        synchronized (f.class) {
            h<f> hVar = f22722e;
            if (hVar == null) {
                return null;
            }
            int g10 = hVar.g(i10);
            if (g10 < 0) {
                return null;
            }
            f o10 = f22722e.o(g10);
            f22722e.l(g10);
            return o10;
        }
    }

    public static f o(String str) {
        if (i.i(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 1);
            if (decode == null || decode.length == 0) {
                Log.w("Decoded painting is null", new Object[0]);
                return null;
            }
            try {
                nb.a aVar = new nb.a(decode);
                int s10 = aVar.s();
                if (s10 != 0) {
                    f n10 = n(s10);
                    if (n10 == null) {
                        File h10 = h();
                        if (h10.exists()) {
                            File file = new File(h10, s10 + ".bin");
                            if (file.exists()) {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                                int t10 = nb.a.t(randomAccessFile);
                                ArrayList arrayList = new ArrayList(t10);
                                for (int i10 = 0; i10 < t10; i10++) {
                                    arrayList.add(g.q(randomAccessFile));
                                }
                                f fVar = new f();
                                fVar.f22723a = arrayList;
                                try {
                                    randomAccessFile.close();
                                } catch (Throwable unused) {
                                }
                                return fVar;
                            }
                        }
                    }
                    if (n10 != null) {
                        return n10;
                    }
                    throw new IllegalStateException("Unable to find paints/" + s10 + ".bin");
                }
                int s11 = aVar.s();
                if (s11 <= 0) {
                    Log.w("Decoded painting count is empty: %d", Integer.valueOf(s11));
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(s11);
                for (int i11 = 0; i11 < s11; i11++) {
                    arrayList2.add(g.r(aVar));
                }
                f fVar2 = new f();
                fVar2.f22723a = arrayList2;
                return fVar2;
            } catch (Throwable th) {
                Log.e("Unable to decode painting: %s", th, str);
                return null;
            }
        } catch (Throwable th2) {
            Log.e("Unable to decode painting", th2, new Object[0]);
            return null;
        }
    }

    public static void p(int i10, f fVar) {
        synchronized (f.class) {
            if (f22722e == null) {
                f22722e = new h<>();
            }
            f22722e.j(i10, fVar);
        }
    }

    public void b(g gVar) {
        if (this.f22723a == null) {
            this.f22723a = new ArrayList();
        }
        this.f22723a.add(gVar);
        k();
    }

    public void c(a aVar) {
        if (this.f22725c == null) {
            this.f22725c = new ArrayList();
        }
        lb.i.a(this.f22725c, aVar);
    }

    public void d(b bVar) {
        if (this.f22726d == null) {
            this.f22726d = new ArrayList();
        }
        lb.i.a(this.f22726d, bVar);
    }

    public boolean e(f fVar) {
        if (fVar == null) {
            return false;
        }
        if (fVar == this) {
            return true;
        }
        if (i() != fVar.i()) {
            return false;
        }
        if (i()) {
            return true;
        }
        return f(fVar.f22723a, this.f22723a);
    }

    public void g(Canvas canvas, int i10, int i11, int i12, int i13) {
        List<g> list = this.f22723a;
        if (!(list == null || list.isEmpty())) {
            for (g gVar : this.f22723a) {
                gVar.f(canvas, i10, i11, i10 + i12, i11 + i13);
            }
        }
    }

    public boolean i() {
        List<g> list = this.f22723a;
        return list == null || list.isEmpty();
    }

    public void k() {
        l(-1, -1, -1, -1);
    }

    public void l(int i10, int i11, int i12, int i13) {
        List<Reference<a>> list = this.f22725c;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f22725c.get(size).get();
                if (aVar != null) {
                    aVar.a(this);
                } else {
                    this.f22725c.remove(size);
                }
            }
        }
    }

    public void m() {
        if (this.f22726d != null) {
            List<c> list = this.f22724b;
            int size = list != null ? list.size() : 0;
            for (int size2 = this.f22726d.size() - 1; size2 >= 0; size2--) {
                b bVar = this.f22726d.get(size2).get();
                if (bVar != null) {
                    bVar.h7(this, size > 0, size);
                } else {
                    this.f22726d.remove(size2);
                }
            }
        }
    }

    public final c q() {
        List<c> list = this.f22724b;
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<c> list2 = this.f22724b;
        return list2.remove(list2.size() - 1);
    }

    public final void r() {
        if (!i()) {
            List<g> list = this.f22723a;
            list.remove(list.size() - 1);
            k();
        }
    }

    public void s(g gVar) {
        if (!i() && this.f22723a.remove(gVar)) {
            k();
        }
    }

    public void t(a aVar) {
        List<Reference<a>> list = this.f22725c;
        if (list != null) {
            lb.i.e(list, aVar);
        }
    }

    public String toString() {
        return i() ? "" : Base64.encodeToString(v(), 1);
    }

    public void u(b bVar) {
        List<Reference<b>> list = this.f22726d;
        if (list != null) {
            lb.i.e(list, bVar);
        }
    }

    public byte[] v() {
        final File file;
        boolean z10;
        final int w10 = nb.a.w(this.f22723a.size());
        for (g gVar : this.f22723a) {
            w10 += gVar.g();
        }
        nb.a aVar = null;
        if (w10 >= 256) {
            int s12 = he.i.c2().s1();
            File file2 = new File(j0.n().getFilesDir(), "paints");
            if (file2.exists() || file2.mkdir()) {
                do {
                    s12++;
                    he.i.c2().p5(s12);
                    file = new File(file2, s12 + ".bin");
                } while (file.exists());
                nb.a aVar2 = new nb.a(nb.a.w(s12));
                aVar2.M(s12);
                p(s12, this);
                try {
                    z10 = file.createNewFile();
                } catch (Throwable th) {
                    Log.w("Cannot create %d.bin paint file", th, Integer.valueOf(s12));
                    z10 = false;
                }
                if (z10) {
                    l.a().b(new Runnable() {
                        @Override
                        public final void run() {
                            f.this.j(file, w10);
                        }
                    });
                }
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            return aVar.y();
        }
        nb.a aVar3 = new nb.a(w10);
        aVar3.M(0);
        aVar3.M(this.f22723a.size());
        for (g gVar2 : this.f22723a) {
            gVar2.v(aVar3);
        }
        return aVar3.y();
    }

    public final void w(c cVar) {
        if (this.f22724b == null) {
            this.f22724b = new ArrayList();
        }
        this.f22724b.add(cVar);
        m();
    }

    public void x(g gVar) {
        w(new c(0, gVar));
    }

    public void y() {
        List<g> list = this.f22723a;
        boolean z10 = false;
        int size = list != null ? list.size() : 0;
        if (size > 0) {
            z10 = true;
        }
        for (int size2 = this.f22724b.size() - 1; size2 >= 0; size2--) {
            if (this.f22724b.get(size2).a() == 0 && size > 0) {
                size--;
                this.f22723a.remove(size);
            }
            this.f22724b.remove(size2);
        }
        if (z10) {
            k();
        }
        m();
    }

    public void z() {
        c q10 = q();
        if (q10 != null) {
            if (q10.a() == 0) {
                r();
            }
            m();
        }
    }
}
