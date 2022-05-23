package org.thunderdog.challegram.loader.gif;

import android.view.View;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k0.b;
import kb.j;
import md.e;
import md.h;
import md.m;
import md.n;
import md.o;
import md.p;
import md.r;
import md.s;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.N;
import org.thunderdog.challegram.loader.gif.GifBridge;
import zd.o6;

public class GifBridge {
    public static GifBridge f20092h;
    public int f20097e;
    public final p[] f20099g;
    public final HashMap<String, n> f20094b = new HashMap<>();
    public final HashMap<Integer, ArrayList<n>> f20095c = new HashMap<>();
    public final ArrayList<n> f20096d = new ArrayList<>();
    @Keep
    private final Set<r> tempWatchers = new b();
    public final h f20093a = new h();
    public final p[] f20098f = new p[2];

    public GifBridge() {
        N.gifInit();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            p[] pVarArr = this.f20098f;
            if (i11 >= pVarArr.length) {
                break;
            }
            pVarArr[i11] = new p(i11);
            i11++;
        }
        this.f20099g = new p[2];
        while (true) {
            p[] pVarArr2 = this.f20099g;
            if (i10 < pVarArr2.length) {
                pVarArr2[i10] = new p(i10);
                i10++;
            } else {
                return;
            }
        }
    }

    public static GifBridge f() {
        if (f20092h == null) {
            f20092h = new GifBridge();
        }
        return f20092h;
    }

    public static void g(j jVar, AtomicReference atomicReference, md.j jVar2, o oVar) {
        jVar.a((s) atomicReference.get());
    }

    public boolean b(e eVar, int i10) {
        return this.f20093a.i(eVar, i10);
    }

    public void c(md.j jVar, o oVar) {
        m.i().a(jVar, oVar);
    }

    public View d(md.j jVar) {
        synchronized (this.f20094b) {
            n nVar = this.f20094b.get(jVar.toString());
            if (nVar != null && nVar.e()) {
                Iterator<s> it = nVar.d().iterator();
                while (it.hasNext()) {
                    View a10 = it.next().a(jVar);
                    if (a10 != null) {
                        return a10;
                    }
                }
                return null;
            }
            return null;
        }
    }

    public h e() {
        return this.f20093a;
    }

    public void h(md.j jVar, final j<s> jVar2) {
        final AtomicReference atomicReference = new AtomicReference();
        r fVar = new r() {
            @Override
            public View a(j jVar3) {
                return q.a(this, jVar3);
            }

            @Override
            public final void c(j jVar3, o oVar) {
                GifBridge.g(j.this, atomicReference, jVar3, oVar);
            }

            @Override
            public void d(j jVar3) {
                q.b(this, jVar3);
            }

            @Override
            public void f(j jVar3, float f10) {
                q.c(this, jVar3, f10);
            }
        };
        this.tempWatchers.add(fVar);
        atomicReference.set(new s(fVar));
        p(jVar, (s) atomicReference.get());
    }

    public void i(e eVar) {
        this.f20093a.j(eVar);
    }

    public final p j(md.j jVar) {
        if (jVar.h() == 3) {
            return this.f20099g[jVar.w() ? 1 : 0];
        }
        int i10 = this.f20097e + 1;
        this.f20097e = i10;
        if (i10 == 2) {
            this.f20097e = 0;
        }
        return this.f20098f[this.f20097e];
    }

    public void k(md.j jVar, o oVar) {
        synchronized (this.f20094b) {
            oVar.r();
            n nVar = this.f20094b.get(jVar.toString());
            if (nVar != null) {
                Iterator<s> it = nVar.d().iterator();
                while (it.hasNext()) {
                    it.next().b(jVar);
                }
            }
        }
    }

    public void l(md.j jVar, o oVar) {
        if (this.f20093a != Thread.currentThread()) {
            this.f20093a.k(jVar, oVar);
            return;
        }
        synchronized (this.f20094b) {
            n nVar = this.f20094b.get(jVar.toString());
            if (nVar != null) {
                Iterator<s> it = nVar.d().iterator();
                while (it.hasNext()) {
                    it.next().c(jVar, oVar);
                }
                nVar.b().F(oVar);
            }
        }
    }

    public boolean m(o6 o6Var, TdApi.File file) {
        synchronized (this.f20094b) {
            ArrayList<n> arrayList = this.f20095c.get(Integer.valueOf(file.f19913id));
            if (arrayList == null) {
                return false;
            }
            Iterator<n> it = arrayList.iterator();
            while (it.hasNext()) {
                n next = it.next();
                if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
                    Log.i((int) Log.TAG_GIF_LOADER, "#%d: onLoad", Integer.valueOf(file.f19913id));
                }
                ob.e.v(file, next.c().d());
                this.f20093a.l(next.b(), file);
            }
            return true;
        }
    }

    public boolean n(o6 o6Var, int i10, float f10) {
        boolean z10;
        synchronized (this.f20094b) {
            ArrayList<n> arrayList = this.f20095c.get(Integer.valueOf(i10));
            if (arrayList != null) {
                Iterator<n> it = arrayList.iterator();
                while (it.hasNext()) {
                    n next = it.next();
                    Iterator<s> it2 = next.d().iterator();
                    while (it2.hasNext()) {
                        it2.next().d(next.c(), f10);
                    }
                    next.b().p(f10);
                }
                z10 = true;
            } else {
                z10 = false;
            }
        }
        if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
            Log.d((int) Log.TAG_GIF_LOADER, "#%d: onProgress, progress: %f found: %b", Integer.valueOf(i10), Float.valueOf(f10), Boolean.valueOf(z10));
        }
        return z10;
    }

    public void o(s sVar) {
        if (this.f20093a != Thread.currentThread()) {
            this.f20093a.m(sVar);
            return;
        }
        synchronized (this.f20094b) {
            ArrayList arrayList = null;
            for (Map.Entry<String, n> entry : this.f20094b.entrySet()) {
                n value = entry.getValue();
                if (value.f(sVar) && !value.e()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(entry.getKey());
                    int e10 = value.c().e();
                    ArrayList<n> arrayList2 = this.f20095c.get(Integer.valueOf(e10));
                    if (arrayList2 != null && arrayList2.remove(value) && arrayList2.isEmpty()) {
                        this.f20095c.remove(Integer.valueOf(e10));
                    }
                    if (value.c().p()) {
                        this.f20096d.remove(value);
                    }
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    n remove = this.f20094b.remove((String) it.next());
                    if (remove != null) {
                        remove.b().q();
                        if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
                            Log.i((int) Log.TAG_GIF_LOADER, "#%s: actor cancelled", remove.c().toString());
                        }
                    }
                }
            }
        }
    }

    public void p(md.j jVar, s sVar) {
        if (this.f20093a != Thread.currentThread()) {
            this.f20093a.n(jVar, sVar);
            return;
        }
        String jVar2 = jVar.toString();
        if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
            Log.i((int) Log.TAG_GIF_LOADER, "#%s: requestFile, type: %s, path: %s", jVar2, jVar.getClass().getSimpleName(), jVar.f());
        }
        n nVar = this.f20094b.get(jVar2);
        if (nVar == null) {
            e eVar = new e(jVar, j(jVar));
            n nVar2 = new n(jVar, eVar, sVar);
            synchronized (this.f20094b) {
                this.f20094b.put(jVar2, nVar2);
                ArrayList<n> arrayList = this.f20095c.get(Integer.valueOf(jVar.e()));
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f20095c.put(Integer.valueOf(jVar.e()), arrayList);
                }
                arrayList.add(nVar2);
                if (jVar.p()) {
                    this.f20096d.add(nVar2);
                }
            }
            if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
                Log.i((int) Log.TAG_GIF_LOADER, "#%s: actor started", jVar2);
            }
            eVar.l();
            return;
        }
        if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
            Log.i((int) Log.TAG_GIF_LOADER, "#%s: watched joined existing actor", jVar2);
        }
        synchronized (this.f20094b) {
            nVar.a(sVar);
        }
    }

    public boolean q(e eVar, int i10, int i11, boolean z10) {
        return this.f20093a.o(eVar, i10, i11, z10);
    }
}
