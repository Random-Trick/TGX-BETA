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
    public static GifBridge f25613h;
    public int f25618e;
    public final C6513p[] f25620g;
    public final HashMap<String, C6508n> f25615b = new HashMap<>();
    public final HashMap<Integer, ArrayList<C6508n>> f25616c = new HashMap<>();
    public final ArrayList<C6508n> f25617d = new ArrayList<>();
    @Keep
    private final Set<AbstractC6515r> tempWatchers = new C6031b();
    public final C6500h f25614a = new C6500h();
    public final C6513p[] f25619f = new C6513p[2];

    public GifBridge() {
        C7888N.gifInit();
        int i = 0;
        int i2 = 0;
        while (true) {
            C6513p[] pVarArr = this.f25619f;
            if (i2 >= pVarArr.length) {
                break;
            }
            pVarArr[i2] = new C6513p(i2);
            i2++;
        }
        this.f25620g = new C6513p[2];
        while (true) {
            C6513p[] pVarArr2 = this.f25620g;
            if (i < pVarArr2.length) {
                pVarArr2[i] = new C6513p(i);
                i++;
            } else {
                return;
            }
        }
    }

    public static GifBridge m14341f() {
        if (f25613h == null) {
            f25613h = new GifBridge();
        }
        return f25613h;
    }

    public static void m14340g(AbstractC5918j jVar, AtomicReference atomicReference, C6503j jVar2, C6509o oVar) {
        jVar.mo1330a((C6516s) atomicReference.get());
    }

    public boolean m14345b(C6496e eVar, int i) {
        return this.f25614a.m20312i(eVar, i);
    }

    public void m14344c(C6503j jVar, C6509o oVar) {
        RunnableC6507m.m20242i().m20263a(jVar, oVar);
    }

    public View m14343d(C6503j jVar) {
        synchronized (this.f25615b) {
            C6508n nVar = this.f25615b.get(jVar.toString());
            if (nVar != null && nVar.m20222e()) {
                Iterator<C6516s> it = nVar.m20223d().iterator();
                while (it.hasNext()) {
                    View a = it.next().m20180a(jVar);
                    if (a != null) {
                        return a;
                    }
                }
                return null;
            }
            return null;
        }
    }

    public C6500h m14342e() {
        return this.f25614a;
    }

    public void m14339h(C6503j jVar, final AbstractC5918j<C6516s> jVar2) {
        final AtomicReference atomicReference = new AtomicReference();
        AbstractC6515r fVar = new AbstractC6515r() {
            @Override
            public View mo20184a(C6503j jVar3) {
                return C6514q.m20187a(this, jVar3);
            }

            @Override
            public void mo20183c(C6503j jVar3) {
                C6514q.m20186b(this, jVar3);
            }

            @Override
            public final void mo20182d(C6503j jVar3, C6509o oVar) {
                GifBridge.m14340g(AbstractC5918j.this, atomicReference, jVar3, oVar);
            }

            @Override
            public void mo20181e(C6503j jVar3, float f) {
                C6514q.m20185c(this, jVar3, f);
            }
        };
        this.tempWatchers.add(fVar);
        atomicReference.set(new C6516s(fVar));
        m14331p(jVar, (C6516s) atomicReference.get());
    }

    public void m14338i(C6496e eVar) {
        this.f25614a.m20311j(eVar);
    }

    public final C6513p m14337j(C6503j jVar) {
        if (jVar.m20283h() == 3) {
            return this.f25620g[jVar.m20269w() ? 1 : 0];
        }
        int i = this.f25618e + 1;
        this.f25618e = i;
        if (i == 2) {
            this.f25618e = 0;
        }
        return this.f25619f[this.f25618e];
    }

    public void m14336k(C6503j jVar, C6509o oVar) {
        synchronized (this.f25615b) {
            oVar.m20203r();
            C6508n nVar = this.f25615b.get(jVar.toString());
            if (nVar != null) {
                Iterator<C6516s> it = nVar.m20223d().iterator();
                while (it.hasNext()) {
                    it.next().m20179b(jVar);
                }
            }
        }
    }

    public void m14335l(C6503j jVar, C6509o oVar) {
        if (this.f25614a != Thread.currentThread()) {
            this.f25614a.m20310k(jVar, oVar);
            return;
        }
        synchronized (this.f25615b) {
            C6508n nVar = this.f25615b.get(jVar.toString());
            if (nVar != null) {
                Iterator<C6516s> it = nVar.m20223d().iterator();
                while (it.hasNext()) {
                    it.next().m20178c(jVar, oVar);
                }
                nVar.m20225b().m20348F(oVar);
            }
        }
    }

    public boolean m14334m(C10930q6 q6Var, TdApi.File file) {
        synchronized (this.f25615b) {
            ArrayList<C6508n> arrayList = this.f25616c.get(Integer.valueOf(file.f25373id));
            if (arrayList == null) {
                return false;
            }
            Iterator<C6508n> it = arrayList.iterator();
            while (it.hasNext()) {
                C6508n next = it.next();
                if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
                    Log.m14721i((int) Log.TAG_GIF_LOADER, "#%d: onLoad", Integer.valueOf(file.f25373id));
                }
                C7321e.m16907u(file, next.m20224c().m20287d());
                this.f25614a.m20309l(next.m20225b(), file);
            }
            return true;
        }
    }

    public boolean m14333n(C10930q6 q6Var, int i, float f) {
        boolean z;
        synchronized (this.f25615b) {
            ArrayList<C6508n> arrayList = this.f25616c.get(Integer.valueOf(i));
            if (arrayList != null) {
                Iterator<C6508n> it = arrayList.iterator();
                while (it.hasNext()) {
                    C6508n next = it.next();
                    Iterator<C6516s> it2 = next.m20223d().iterator();
                    while (it2.hasNext()) {
                        it2.next().m20177d(next.m20224c(), f);
                    }
                    next.m20225b().m20324p(f);
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

    public void m14332o(C6516s sVar) {
        if (this.f25614a != Thread.currentThread()) {
            this.f25614a.m20308m(sVar);
            return;
        }
        synchronized (this.f25615b) {
            ArrayList arrayList = null;
            for (Map.Entry<String, C6508n> entry : this.f25615b.entrySet()) {
                C6508n value = entry.getValue();
                if (value.m20221f(sVar) && !value.m20222e()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(entry.getKey());
                    int e = value.m20224c().m20286e();
                    ArrayList<C6508n> arrayList2 = this.f25616c.get(Integer.valueOf(e));
                    if (arrayList2 != null && arrayList2.remove(value) && arrayList2.isEmpty()) {
                        this.f25616c.remove(Integer.valueOf(e));
                    }
                    if (value.m20224c().m20275p()) {
                        this.f25617d.remove(value);
                    }
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C6508n remove = this.f25615b.remove((String) it.next());
                    if (remove != null) {
                        remove.m20225b().m20323q();
                        if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
                            Log.m14721i((int) Log.TAG_GIF_LOADER, "#%s: actor cancelled", remove.m20224c().toString());
                        }
                    }
                }
            }
        }
    }

    public void m14331p(C6503j jVar, C6516s sVar) {
        if (this.f25614a != Thread.currentThread()) {
            this.f25614a.m20307n(jVar, sVar);
            return;
        }
        String jVar2 = jVar.toString();
        if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
            Log.m14721i((int) Log.TAG_GIF_LOADER, "#%s: requestFile, type: %s, path: %s", jVar2, jVar.getClass().getSimpleName(), jVar.m20285f());
        }
        C6508n nVar = this.f25615b.get(jVar2);
        if (nVar == null) {
            C6496e eVar = new C6496e(jVar, m14337j(jVar));
            C6508n nVar2 = new C6508n(jVar, eVar, sVar);
            synchronized (this.f25615b) {
                this.f25615b.put(jVar2, nVar2);
                ArrayList<C6508n> arrayList = this.f25616c.get(Integer.valueOf(jVar.m20286e()));
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f25616c.put(Integer.valueOf(jVar.m20286e()), arrayList);
                }
                arrayList.add(nVar2);
                if (jVar.m20275p()) {
                    this.f25617d.add(nVar2);
                }
            }
            if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
                Log.m14721i((int) Log.TAG_GIF_LOADER, "#%s: actor started", jVar2);
            }
            eVar.m20328l();
            return;
        }
        if (Log.isEnabled(Log.TAG_GIF_LOADER)) {
            Log.m14721i((int) Log.TAG_GIF_LOADER, "#%s: watched joined existing actor", jVar2);
        }
        synchronized (this.f25615b) {
            nVar.m20226a(sVar);
        }
    }

    public boolean m14330q(C6496e eVar, int i, int i2, boolean z) {
        return this.f25614a.m20306o(eVar, i, i2, z);
    }
}
