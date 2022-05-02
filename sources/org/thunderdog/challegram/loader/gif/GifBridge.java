package org.thunderdog.challegram.loader.gif;

import android.view.View;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.C7888N;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.loader.gif.GifBridge;
import p139jb.AbstractC5918j;
import p143k0.C6031b;
import p168ld.AbstractC6515r;
import p168ld.C6496e;
import p168ld.C6500h;
import p168ld.C6503j;
import p168ld.C6508n;
import p168ld.C6509o;
import p168ld.C6513p;
import p168ld.C6516s;
import p168ld.RunnableC6507m;
import p193nb.C7321e;
import p350yd.C10930q6;

public class GifBridge {
    public static GifBridge f25616h;
    public int f25621e;
    public final C6513p[] f25623g;
    public final HashMap<String, C6508n> f25618b = new HashMap<>();
    public final HashMap<Integer, ArrayList<C6508n>> f25619c = new HashMap<>();
    public final ArrayList<C6508n> f25620d = new ArrayList<>();
    @Keep
    private final Set<AbstractC6515r> tempWatchers = new C6031b();
    public final C6500h f25617a = new C6500h();
    public final C6513p[] f25622f = new C6513p[2];

    public GifBridge() {
        C7888N.gifInit();
        int i = 0;
        int i2 = 0;
        while (true) {
            C6513p[] pVarArr = this.f25622f;
            if (i2 >= pVarArr.length) {
                break;
            }
            pVarArr[i2] = new C6513p(i2);
            i2++;
        }
        this.f25623g = new C6513p[2];
        while (true) {
            C6513p[] pVarArr2 = this.f25623g;
            if (i < pVarArr2.length) {
                pVarArr2[i] = new C6513p(i);
                i++;
            } else {
                return;
            }
        }
    }

    public static GifBridge m14340f() {
        if (f25616h == null) {
            f25616h = new GifBridge();
        }
        return f25616h;
    }

    public static void m14339g(AbstractC5918j jVar, AtomicReference atomicReference, C6503j jVar2, C6509o oVar) {
        jVar.mo1330a((C6516s) atomicReference.get());
    }

    public boolean m14344b(C6496e eVar, int i) {
        return this.f25617a.m20313i(eVar, i);
    }

    public void m14343c(C6503j jVar, C6509o oVar) {
        RunnableC6507m.m20243i().m20264a(jVar, oVar);
    }

    public View m14342d(C6503j jVar) {
        synchronized (this.f25618b) {
            C6508n nVar = this.f25618b.get(jVar.toString());
            if (nVar != null && nVar.m20223e()) {
                Iterator<C6516s> it = nVar.m20224d().iterator();
                while (it.hasNext()) {
                    View a = it.next().m20181a(jVar);
                    if (a != null) {
                        return a;
                    }
                }
                return null;
            }
            return null;
        }
    }

    public C6500h m14341e() {
        return this.f25617a;
    }

    public void m14338h(C6503j jVar, final AbstractC5918j<C6516s> jVar2) {
        final AtomicReference atomicReference = new AtomicReference();
        AbstractC6515r fVar = new AbstractC6515r() {
            @Override
            public View mo20185a(C6503j jVar3) {
                return C6514q.m20188a(this, jVar3);
            }

            @Override
            public void mo20184c(C6503j jVar3) {
                C6514q.m20187b(this, jVar3);
            }

            @Override
            public final void mo20183d(C6503j jVar3, C6509o oVar) {
                GifBridge.m14339g(AbstractC5918j.this, atomicReference, jVar3, oVar);
            }

            @Override
            public void mo20182e(C6503j jVar3, float f) {
                C6514q.m20186c(this, jVar3, f);
            }
        };
        this.tempWatchers.add(fVar);
        atomicReference.set(new C6516s(fVar));
        m14330p(jVar, (C6516s) atomicReference.get());
    }

    public void m14337i(C6496e eVar) {
        this.f25617a.m20312j(eVar);
    }

    public final C6513p m14336j(C6503j jVar) {
        if (jVar.m20284h() == 3) {
            return this.f25623g[jVar.m20270w() ? 1 : 0];
        }
        int i = this.f25621e + 1;
        this.f25621e = i;
        if (i == 2) {
            this.f25621e = 0;
        }
        return this.f25622f[this.f25621e];
    }

    public void m14335k(C6503j jVar, C6509o oVar) {
        synchronized (this.f25618b) {
            oVar.m20204r();
            C6508n nVar = this.f25618b.get(jVar.toString());
            if (nVar != null) {
                Iterator<C6516s> it = nVar.m20224d().iterator();
                while (it.hasNext()) {
                    it.next().m20180b(jVar);
                }
            }
        }
    }

    public void m14334l(C6503j jVar, C6509o oVar) {
        if (this.f25617a != Thread.currentThread()) {
            this.f25617a.m20311k(jVar, oVar);
            return;
        }
        synchronized (this.f25618b) {
            C6508n nVar = this.f25618b.get(jVar.toString());
            if (nVar != null) {
                Iterator<C6516s> it = nVar.m20224d().iterator();
                while (it.hasNext()) {
                    it.next().m20179c(jVar, oVar);
                }
                nVar.m20226b().m20349F(oVar);
            }
        }
    }

    public boolean m14333m(C10930q6 q6Var, TdApi.File file) {
        synchronized (this.f25618b) {
            ArrayList<C6508n> arrayList = this.f25619c.get(Integer.valueOf(file.f25376id));
            if (arrayList == null) {
                return false;
            }
            Iterator<C6508n> it = arrayList.iterator();
            while (it.hasNext()) {
                C6508n next = it.next();
                if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
                    Log.m14721i((int) Log.TAG_GIF_LOADER, "#%d: onLoad", Integer.valueOf(file.f25376id));
                }
                C7321e.m16907u(file, next.m20225c().m20288d());
                this.f25617a.m20310l(next.m20226b(), file);
            }
            return true;
        }
    }

    public boolean m14332n(C10930q6 q6Var, int i, float f) {
        boolean z;
        synchronized (this.f25618b) {
            ArrayList<C6508n> arrayList = this.f25619c.get(Integer.valueOf(i));
            if (arrayList != null) {
                Iterator<C6508n> it = arrayList.iterator();
                while (it.hasNext()) {
                    C6508n next = it.next();
                    Iterator<C6516s> it2 = next.m20224d().iterator();
                    while (it2.hasNext()) {
                        it2.next().m20178d(next.m20225c(), f);
                    }
                    next.m20226b().m20325p(f);
                }
                z = true;
            } else {
                z = false;
            }
        }
        if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
            Log.m14733d((int) Log.TAG_GIF_LOADER, "#%d: onProgress, progress: %f found: %b", Integer.valueOf(i), Float.valueOf(f), Boolean.valueOf(z));
        }
        return z;
    }

    public void m14331o(C6516s sVar) {
        if (this.f25617a != Thread.currentThread()) {
            this.f25617a.m20309m(sVar);
            return;
        }
        synchronized (this.f25618b) {
            ArrayList arrayList = null;
            for (Map.Entry<String, C6508n> entry : this.f25618b.entrySet()) {
                C6508n value = entry.getValue();
                if (value.m20222f(sVar) && !value.m20223e()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(entry.getKey());
                    int e = value.m20225c().m20287e();
                    ArrayList<C6508n> arrayList2 = this.f25619c.get(Integer.valueOf(e));
                    if (arrayList2 != null && arrayList2.remove(value) && arrayList2.isEmpty()) {
                        this.f25619c.remove(Integer.valueOf(e));
                    }
                    if (value.m20225c().m20276p()) {
                        this.f25620d.remove(value);
                    }
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C6508n remove = this.f25618b.remove((String) it.next());
                    if (remove != null) {
                        remove.m20226b().m20324q();
                        if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
                            Log.m14721i((int) Log.TAG_GIF_LOADER, "#%s: actor cancelled", remove.m20225c().toString());
                        }
                    }
                }
            }
        }
    }

    public void m14330p(C6503j jVar, C6516s sVar) {
        if (this.f25617a != Thread.currentThread()) {
            this.f25617a.m20308n(jVar, sVar);
            return;
        }
        String jVar2 = jVar.toString();
        if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
            Log.m14721i((int) Log.TAG_GIF_LOADER, "#%s: requestFile, type: %s, path: %s", jVar2, jVar.getClass().getSimpleName(), jVar.m20286f());
        }
        C6508n nVar = this.f25618b.get(jVar2);
        if (nVar == null) {
            C6496e eVar = new C6496e(jVar, m14336j(jVar));
            C6508n nVar2 = new C6508n(jVar, eVar, sVar);
            synchronized (this.f25618b) {
                this.f25618b.put(jVar2, nVar2);
                ArrayList<C6508n> arrayList = this.f25619c.get(Integer.valueOf(jVar.m20287e()));
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f25619c.put(Integer.valueOf(jVar.m20287e()), arrayList);
                }
                arrayList.add(nVar2);
                if (jVar.m20276p()) {
                    this.f25620d.add(nVar2);
                }
            }
            if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
                Log.m14721i((int) Log.TAG_GIF_LOADER, "#%s: actor started", jVar2);
            }
            eVar.m20329l();
            return;
        }
        if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
            Log.m14721i((int) Log.TAG_GIF_LOADER, "#%s: watched joined existing actor", jVar2);
        }
        synchronized (this.f25618b) {
            nVar.m20227a(sVar);
        }
    }

    public boolean m14329q(C6496e eVar, int i, int i2, boolean z) {
        return this.f25617a.m20307o(eVar, i, i2, z);
    }
}
