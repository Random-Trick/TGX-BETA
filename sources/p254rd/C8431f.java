package p254rd;

import android.graphics.Canvas;
import android.util.Base64;
import be.C1379j0;
import ge.C4868i;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import org.thunderdog.challegram.Log;
import p082fd.C4383l;
import p108hb.C5070i;
import p143k0.C6038h;
import p154kb.C6235i;
import p181mb.C6810a;

public class C8431f {
    public static C6038h<C8431f> f27363e;
    public List<C8434g> f27364a;
    public List<C8428c> f27365b;
    public List<Reference<AbstractC8432a>> f27366c;
    public List<Reference<AbstractC8433b>> f27367d;

    public interface AbstractC8432a {
        void mo11043a(C8431f fVar);
    }

    public interface AbstractC8433b {
        void mo12476h3(C8431f fVar, boolean z, int i);
    }

    public C8431f() {
    }

    public static boolean m12497f(List<C8434g> list, List<C8434g> list2) {
        boolean z = list == null || list.isEmpty();
        if (z != (list2 == null || list2.isEmpty())) {
            return false;
        }
        if (z) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int i = 0;
        for (C8434g gVar : list) {
            if (!gVar.m12472c(list2.get(i))) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static File m12495h() {
        return new File(C1379j0.m37315n().getFilesDir(), "paints");
    }

    public void m12493j(java.io.File r5, int r6) {
        throw new UnsupportedOperationException("Method not decompiled: p254rd.C8431f.m12493j(java.io.File, int):void");
    }

    public static C8431f m12489n(int i) {
        synchronized (C8431f.class) {
            C6038h<C8431f> hVar = f27363e;
            if (hVar == null) {
                return null;
            }
            int g = hVar.m21469g(i);
            if (g < 0) {
                return null;
            }
            C8431f o = f27363e.m21462o(g);
            f27363e.m21464l(g);
            return o;
        }
    }

    public static C8431f m12488o(String str) {
        if (C5070i.m24061i(str)) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 1);
            if (decode == null || decode.length == 0) {
                Log.m14709w("Decoded painting is null", new Object[0]);
                return null;
            }
            try {
                C6810a aVar = new C6810a(decode);
                int s = aVar.m18920s();
                if (s != 0) {
                    C8431f n = m12489n(s);
                    if (n == null) {
                        File h = m12495h();
                        if (h.exists()) {
                            File file = new File(h, s + ".bin");
                            if (file.exists()) {
                                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                                int t = C6810a.m18919t(randomAccessFile);
                                ArrayList arrayList = new ArrayList(t);
                                for (int i = 0; i < t; i++) {
                                    arrayList.add(C8434g.m12458q(randomAccessFile));
                                }
                                C8431f fVar = new C8431f();
                                fVar.f27364a = arrayList;
                                try {
                                    randomAccessFile.close();
                                } catch (Throwable unused) {
                                }
                                return fVar;
                            }
                        }
                    }
                    if (n != null) {
                        return n;
                    }
                    throw new IllegalStateException("Unable to find paints/" + s + ".bin");
                }
                int s2 = aVar.m18920s();
                if (s2 <= 0) {
                    Log.m14709w("Decoded painting count is empty: %d", Integer.valueOf(s2));
                    return null;
                }
                ArrayList arrayList2 = new ArrayList(s2);
                for (int i2 = 0; i2 < s2; i2++) {
                    arrayList2.add(C8434g.m12457r(aVar));
                }
                C8431f fVar2 = new C8431f();
                fVar2.f27364a = arrayList2;
                return fVar2;
            } catch (Throwable th) {
                Log.m14725e("Unable to decode painting: %s", th, str);
                return null;
            }
        } catch (Throwable th2) {
            Log.m14725e("Unable to decode painting", th2, new Object[0]);
            return null;
        }
    }

    public static void m12487p(int i, C8431f fVar) {
        synchronized (C8431f.class) {
            if (f27363e == null) {
                f27363e = new C6038h<>();
            }
            f27363e.m21466j(i, fVar);
        }
    }

    public void m12501b(C8434g gVar) {
        if (this.f27364a == null) {
            this.f27364a = new ArrayList();
        }
        this.f27364a.add(gVar);
        m12492k();
    }

    public void m12500c(AbstractC8432a aVar) {
        if (this.f27366c == null) {
            this.f27366c = new ArrayList();
        }
        C6235i.m21015a(this.f27366c, aVar);
    }

    public void m12499d(AbstractC8433b bVar) {
        if (this.f27367d == null) {
            this.f27367d = new ArrayList();
        }
        C6235i.m21015a(this.f27367d, bVar);
    }

    public boolean m12498e(C8431f fVar) {
        if (fVar == null) {
            return false;
        }
        if (fVar == this) {
            return true;
        }
        if (m12494i() != fVar.m12494i()) {
            return false;
        }
        if (m12494i()) {
            return true;
        }
        return m12497f(fVar.f27364a, this.f27364a);
    }

    public void m12496g(Canvas canvas, int i, int i2, int i3, int i4) {
        List<C8434g> list = this.f27364a;
        if (!(list == null || list.isEmpty())) {
            for (C8434g gVar : this.f27364a) {
                gVar.m12469f(canvas, i, i2, i + i3, i2 + i4);
            }
        }
    }

    public boolean m12494i() {
        List<C8434g> list = this.f27364a;
        return list == null || list.isEmpty();
    }

    public void m12492k() {
        m12491l(-1, -1, -1, -1);
    }

    public void m12491l(int i, int i2, int i3, int i4) {
        List<Reference<AbstractC8432a>> list = this.f27366c;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                AbstractC8432a aVar = this.f27366c.get(size).get();
                if (aVar != null) {
                    aVar.mo11043a(this);
                } else {
                    this.f27366c.remove(size);
                }
            }
        }
    }

    public void m12490m() {
        if (this.f27367d != null) {
            List<C8428c> list = this.f27365b;
            int size = list != null ? list.size() : 0;
            for (int size2 = this.f27367d.size() - 1; size2 >= 0; size2--) {
                AbstractC8433b bVar = this.f27367d.get(size2).get();
                if (bVar != null) {
                    bVar.mo12476h3(this, size > 0, size);
                } else {
                    this.f27367d.remove(size2);
                }
            }
        }
    }

    public final C8428c m12486q() {
        List<C8428c> list = this.f27365b;
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<C8428c> list2 = this.f27365b;
        return list2.remove(list2.size() - 1);
    }

    public final void m12485r() {
        if (!m12494i()) {
            List<C8434g> list = this.f27364a;
            list.remove(list.size() - 1);
            m12492k();
        }
    }

    public void m12484s(C8434g gVar) {
        if (!m12494i() && this.f27364a.remove(gVar)) {
            m12492k();
        }
    }

    public void m12483t(AbstractC8432a aVar) {
        List<Reference<AbstractC8432a>> list = this.f27366c;
        if (list != null) {
            C6235i.m21011e(list, aVar);
        }
    }

    public String toString() {
        return m12494i() ? "" : Base64.encodeToString(m12481v(), 1);
    }

    public void m12482u(AbstractC8433b bVar) {
        List<Reference<AbstractC8433b>> list = this.f27367d;
        if (list != null) {
            C6235i.m21011e(list, bVar);
        }
    }

    public byte[] m12481v() {
        final File file;
        boolean z;
        final int w = C6810a.m18916w(this.f27364a.size());
        for (C8434g gVar : this.f27364a) {
            w += gVar.m12468g();
        }
        C6810a aVar = null;
        if (w >= 256) {
            int s1 = C4868i.m24726c2().m24599s1();
            File file2 = new File(C1379j0.m37315n().getFilesDir(), "paints");
            if (file2.exists() || file2.mkdir()) {
                do {
                    s1++;
                    C4868i.m24726c2().m24619p5(s1);
                    file = new File(file2, s1 + ".bin");
                } while (file.exists());
                C6810a aVar2 = new C6810a(C6810a.m18916w(s1));
                aVar2.m18940M(s1);
                m12487p(s1, this);
                try {
                    z = file.createNewFile();
                } catch (Throwable th) {
                    Log.m14710w("Cannot create %d.bin paint file", th, Integer.valueOf(s1));
                    z = false;
                }
                if (z) {
                    C4383l.m28059a().m28058b(new Runnable() {
                        @Override
                        public final void run() {
                            C8431f.this.m12493j(file, w);
                        }
                    });
                }
                aVar = aVar2;
            }
        }
        if (aVar != null) {
            return aVar.m18914y();
        }
        C6810a aVar3 = new C6810a(w);
        aVar3.m18940M(0);
        aVar3.m18940M(this.f27364a.size());
        for (C8434g gVar2 : this.f27364a) {
            gVar2.m12453v(aVar3);
        }
        return aVar3.m18914y();
    }

    public final void m12480w(C8428c cVar) {
        if (this.f27365b == null) {
            this.f27365b = new ArrayList();
        }
        this.f27365b.add(cVar);
        m12490m();
    }

    public void m12479x(C8434g gVar) {
        m12480w(new C8428c(0, gVar));
    }

    public void m12478y() {
        List<C8434g> list = this.f27364a;
        boolean z = false;
        int size = list != null ? list.size() : 0;
        if (size > 0) {
            z = true;
        }
        for (int size2 = this.f27365b.size() - 1; size2 >= 0; size2--) {
            if (this.f27365b.get(size2).m12505a() == 0 && size > 0) {
                size--;
                this.f27364a.remove(size);
            }
            this.f27365b.remove(size2);
        }
        if (z) {
            m12492k();
        }
        m12490m();
    }

    public void m12477z() {
        C8428c q = m12486q();
        if (q != null) {
            if (q.m12505a() == 0) {
                m12485r();
            }
            m12490m();
        }
    }

    public C8431f(C8431f fVar) {
        List<C8434g> list = fVar.f27364a;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(fVar.f27364a.size());
            this.f27364a = arrayList;
            arrayList.addAll(fVar.f27364a);
        }
        List<C8428c> list2 = fVar.f27365b;
        if (list2 != null && !list2.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(fVar.f27365b.size());
            this.f27365b = arrayList2;
            arrayList2.addAll(fVar.f27365b);
        }
    }
}
