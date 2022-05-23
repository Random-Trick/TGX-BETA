package org.thunderdog.challegram.loader;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import ce.j0;
import hd.t2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k0.b;
import ld.g;
import ld.h;
import ld.j;
import ld.r;
import ld.t;
import ld.w;
import ld.x;
import ld.y;
import org.drinkless.td.libcore.telegram.Client;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.loader.ImageLoader;
import org.thunderdog.challegram.loader.b;
import zd.o6;

public class ImageLoader {
    public static ImageLoader f20071d;
    public final r f20072a = new r();
    public final HashMap<String, t> f20073b = new HashMap<>();
    public final HashMap<String, ArrayList<String>> f20074c = new HashMap<>();
    @Keep
    private final Set<x> tempWatchers = new b();

    public class a implements x {
        public final b.c f20075a;
        public final AtomicReference f20076b;

        public a(b.c cVar, AtomicReference atomicReference) {
            this.f20075a = cVar;
            this.f20076b = atomicReference;
        }

        @Override
        public void d0(h hVar, boolean z10, Bitmap bitmap) {
            ImageLoader.this.tempWatchers.remove(this);
            this.f20075a.b(z10, bitmap);
            ImageLoader.this.k((y) this.f20076b.get());
        }

        @Override
        public void n5(h hVar, float f10) {
            w.a(this, hVar, f10);
        }
    }

    public ImageLoader() {
        g.k();
    }

    public static ImageLoader e() {
        if (f20071d == null) {
            f20071d = new ImageLoader();
        }
        return f20071d;
    }

    public void f(h hVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            j0.t0(object);
        } else if (constructor == 766337656) {
            d((j) hVar, (TdApi.File) object);
        }
    }

    public void c(int i10, boolean z10) {
        Thread currentThread = Thread.currentThread();
        r rVar = this.f20072a;
        if (currentThread != rVar) {
            rVar.i(i10, z10);
            return;
        }
        synchronized (this.f20073b) {
            if (i10 == -1) {
                this.f20074c.clear();
            } else {
                String str = i10 + "_";
                ArrayList arrayList = null;
                for (Map.Entry<String, ArrayList<String>> entry : this.f20074c.entrySet()) {
                    String key = entry.getKey();
                    if (key.startsWith(str)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(key);
                    }
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ArrayList<String> remove = this.f20074c.remove((String) it.next());
                        if (remove != null) {
                            remove.isEmpty();
                        }
                    }
                }
            }
            if (!this.f20073b.isEmpty()) {
                for (Map.Entry<String, t> entry2 : this.f20073b.entrySet()) {
                    t value = entry2.getValue();
                    h c10 = value.c();
                    if (i10 == -1 || c10.a() == i10) {
                        value.b().e();
                        Iterator<y> it2 = value.d().iterator();
                        while (it2.hasNext()) {
                            it2.next().a(value.c(), false, null);
                        }
                    }
                }
                this.f20073b.clear();
            }
        }
        if (i10 != -1) {
            g.k().d(i10);
        } else {
            g.k().c(z10);
        }
    }

    public void d(j jVar, TdApi.File file) {
        Thread currentThread = Thread.currentThread();
        r rVar = this.f20072a;
        if (currentThread != rVar) {
            rVar.j(jVar, file);
            return;
        }
        o6 B0 = jVar.B0();
        synchronized (this.f20073b) {
            ArrayList<String> arrayList = this.f20074c.get(jVar.l());
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f20074c.put(h.o(B0, file.f19913id), arrayList);
            }
        }
        jVar.G0(file);
        if (t2.V2(file)) {
            h(B0, file);
        } else {
            B0.v4().o(new TdApi.DownloadFile(file.f19913id, 1, 0, 0, false), B0.C6());
        }
    }

    public void g(h hVar, b.c cVar) {
        AtomicReference atomicReference = new AtomicReference();
        a aVar = new a(cVar, atomicReference);
        this.tempWatchers.add(aVar);
        atomicReference.set(new y(aVar));
        l(hVar, (y) atomicReference.get());
    }

    public boolean h(o6 o6Var, TdApi.File file) {
        boolean z10;
        synchronized (this.f20073b) {
            ArrayList<String> arrayList = this.f20074c.get(h.o(o6Var, file.f19913id));
            if (arrayList == null) {
                arrayList = this.f20074c.get(h.p(o6Var, file.remote.f19958id));
            }
            if (arrayList != null) {
                Iterator<String> it = arrayList.iterator();
                z10 = false;
                while (it.hasNext()) {
                    t tVar = this.f20073b.get(it.next());
                    if (tVar != null) {
                        this.f20072a.k(tVar.b(), file);
                        z10 = true;
                    }
                }
            } else {
                z10 = false;
            }
        }
        if (Log.isEnabled(32)) {
            if (z10) {
                Log.v(32, "#%d (raw): successfully dispatched load event", Integer.valueOf(file.f19913id));
            } else {
                Log.v(32, "#%d (raw): failed to dispatch load event (no listeners)", Integer.valueOf(file.f19913id));
            }
        }
        return z10;
    }

    public boolean i(o6 o6Var, TdApi.File file) {
        synchronized (this.f20073b) {
            ArrayList<String> arrayList = this.f20074c.get(h.o(o6Var, file.f19913id));
            if (arrayList == null) {
                arrayList = this.f20074c.get(h.p(o6Var, file.remote.f19958id));
            }
            if (arrayList == null) {
                return false;
            }
            float s12 = t2.s1(file);
            Iterator<String> it = arrayList.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                t tVar = this.f20073b.get(it.next());
                if (tVar != null) {
                    tVar.c().C0(file);
                    tVar.b().j(file);
                    Iterator<y> it2 = tVar.d().iterator();
                    while (it2.hasNext()) {
                        it2.next().b(tVar.c(), s12);
                    }
                    z10 = true;
                }
            }
            if (Log.isEnabled(32)) {
                if (z10) {
                    Log.v(32, "#%d (raw): successfully dispatched progress event", Integer.valueOf(file.f19913id));
                } else {
                    Log.v(32, "#%d (raw): failed to dispatch progress event (no listeners)", Integer.valueOf(file.f19913id));
                }
            }
            return z10;
        }
    }

    public void j(h hVar, boolean z10, Bitmap bitmap) {
        Thread currentThread = Thread.currentThread();
        r rVar = this.f20072a;
        if (currentThread != rVar) {
            rVar.l(hVar, z10, bitmap);
            return;
        }
        synchronized (this.f20073b) {
            t tVar = this.f20073b.get(hVar.toString());
            if (Log.isEnabled(32)) {
                int i10 = -1;
                if (z10) {
                    Object[] objArr = new Object[2];
                    objArr[0] = hVar.toString();
                    if (tVar != null) {
                        i10 = tVar.d().size();
                    }
                    objArr[1] = Integer.valueOf(i10);
                    Log.d(32, "#%s: completed, watches: %d", objArr);
                } else {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = hVar.toString();
                    if (tVar != null) {
                        i10 = tVar.d().size();
                    }
                    objArr2[1] = Integer.valueOf(i10);
                    Log.w(32, "#%s: failed, watches: %d", objArr2);
                }
            }
            if (tVar != null) {
                this.f20073b.remove(hVar.toString());
                Iterator<y> it = tVar.d().iterator();
                while (it.hasNext()) {
                    it.next().a(hVar, z10, bitmap);
                }
            } else {
                if (Log.isEnabled(32)) {
                    Log.d(32, "#%s: wanted to dispatch result, but there're no listeners anymore", hVar.toString());
                }
                if (z10 && !hVar.y0()) {
                    if (Log.isEnabled(32)) {
                        Log.d(32, "#%s: recycling, because there will be no references", hVar.toString());
                    }
                    bitmap.recycle();
                }
            }
            boolean z11 = hVar instanceof j;
            o6 B0 = hVar.B0();
            String l10 = hVar.l();
            ArrayList<String> arrayList = this.f20074c.get(l10);
            if (arrayList != null && arrayList.remove(hVar.toString()) && arrayList.isEmpty()) {
                this.f20074c.remove(l10);
                if (z11 && ((j) hVar).F0()) {
                    this.f20074c.remove(h.o(B0, hVar.s()));
                }
            }
        }
    }

    public void k(y yVar) {
        Thread currentThread = Thread.currentThread();
        r rVar = this.f20072a;
        if (currentThread != rVar) {
            rVar.m(yVar);
            return;
        }
        synchronized (this.f20073b) {
            ArrayList arrayList = null;
            for (Map.Entry<String, t> entry : this.f20073b.entrySet()) {
                t value = entry.getValue();
                if (value.f(yVar) && !value.e()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(entry.getKey());
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    t remove = this.f20073b.remove(str);
                    if (remove != null) {
                        remove.b().e();
                        h c10 = remove.c();
                        o6 B0 = c10.B0();
                        if (B0 != null) {
                            boolean z10 = c10 instanceof j;
                            String l10 = c10.l();
                            ArrayList<String> arrayList2 = this.f20074c.get(l10);
                            if (arrayList2 != null && arrayList2.remove(str) && arrayList2.isEmpty()) {
                                this.f20074c.remove(l10);
                                if (z10 && ((j) c10).F0()) {
                                    this.f20074c.remove(h.o(B0, c10.s()));
                                }
                                if (!z10 && c10.O()) {
                                    B0.v4().o(new TdApi.CancelDownloadFile(c10.s(), c10.G()), B0.na());
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void l(final h hVar, y yVar) {
        t tVar;
        Thread currentThread = Thread.currentThread();
        r rVar = this.f20072a;
        if (currentThread != rVar) {
            rVar.n(hVar, yVar);
            return;
        }
        if (Log.isEnabled(32)) {
            Log.d(32, "#%s: requestFile called: type: %s, %s", hVar.toString(), hVar.getClass().getSimpleName(), hVar.q());
        }
        synchronized (this.f20073b) {
            tVar = this.f20073b.get(hVar.toString());
        }
        if (tVar == null) {
            org.thunderdog.challegram.loader.a aVar = new org.thunderdog.challegram.loader.a(hVar);
            t tVar2 = new t(hVar, aVar, yVar);
            synchronized (this.f20073b) {
                this.f20073b.put(hVar.toString(), tVar2);
            }
            if (aVar.d()) {
                synchronized (this.f20073b) {
                    int s10 = hVar.s();
                    o6 B0 = hVar.B0();
                    boolean z10 = hVar instanceof j;
                    String l10 = hVar.l();
                    ArrayList<String> arrayList = this.f20074c.get(l10);
                    if (arrayList == null) {
                        ArrayList<String> arrayList2 = new ArrayList<>();
                        arrayList2.add(hVar.toString());
                        if (Log.isEnabled(32)) {
                            Log.v(32, "#%s: loading from remote", hVar.toString());
                        }
                        this.f20074c.put(l10, arrayList2);
                        if (z10) {
                            ((j) hVar).D0(new Client.g() {
                                @Override
                                public final void r2(TdApi.Object object) {
                                    ImageLoader.this.f(hVar, object);
                                }
                            });
                        } else {
                            B0.v4().o(new TdApi.DownloadFile(s10, 32, 0, 0, false), B0.C6());
                        }
                    } else if (!arrayList.contains(hVar.toString())) {
                        if (Log.isEnabled(32)) {
                            Log.v(32, "#%s: another actor added to the loading list, total: %d", hVar.toString(), Integer.valueOf(arrayList.size() + 1));
                        }
                        arrayList.add(hVar.toString());
                    }
                }
                return;
            }
            return;
        }
        synchronized (this.f20073b) {
            if (Log.isEnabled(32)) {
                Log.v(32, "#%s: another watcher joined same actor, total: %d", hVar.toString(), Integer.valueOf(this.f20073b.size() + 1));
            }
            tVar.a(yVar);
        }
    }
}
