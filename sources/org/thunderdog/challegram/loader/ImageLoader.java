package org.thunderdog.challegram.loader;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import be.C1379j0;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.loader.C7907b;
import org.thunderdog.challegram.loader.ImageLoader;
import p143k0.C6031b;
import p156kd.AbstractC6266x;
import p156kd.C6244g;
import p156kd.C6246h;
import p156kd.C6251j;
import p156kd.C6260r;
import p156kd.C6262t;
import p156kd.C6265w;
import p156kd.C6267y;
import p350yd.C10930q6;

public class ImageLoader {
    public static ImageLoader f25595d;
    public final C6260r f25596a = new C6260r();
    public final HashMap<String, C6262t> f25597b = new HashMap<>();
    public final HashMap<String, ArrayList<String>> f25598c = new HashMap<>();
    @Keep
    private final Set<AbstractC6266x> tempWatchers = new C6031b();

    public class C7905a implements AbstractC6266x {
        public final C7907b.AbstractC7910c f25599a;
        public final AtomicReference f25600b;

        public C7905a(C7907b.AbstractC7910c cVar, AtomicReference atomicReference) {
            this.f25599a = cVar;
            this.f25600b = atomicReference;
        }

        @Override
        public void mo14383k0(C6246h hVar, boolean z, Bitmap bitmap) {
            ImageLoader.this.tempWatchers.remove(this);
            this.f25599a.mo14347b(z, bitmap);
            ImageLoader.this.m14385k((C6267y) this.f25600b.get());
        }

        @Override
        public void mo14382q5(C6246h hVar, float f) {
            C6265w.m20752a(this, hVar, f);
        }
    }

    public ImageLoader() {
        C6244g.m20961k();
    }

    public static ImageLoader m14391e() {
        if (f25595d == null) {
            f25595d = new ImageLoader();
        }
        return f25595d;
    }

    public void m14390f(C6246h hVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37305t0(object);
        } else if (constructor == 766337656) {
            m14392d((C6251j) hVar, (TdApi.File) object);
        }
    }

    public void m14393c(int i, boolean z) {
        Thread currentThread = Thread.currentThread();
        C6260r rVar = this.f25596a;
        if (currentThread != rVar) {
            rVar.m20784i(i, z);
            return;
        }
        synchronized (this.f25597b) {
            if (i == -1) {
                this.f25598c.clear();
            } else {
                String str = i + "_";
                ArrayList arrayList = null;
                for (Map.Entry<String, ArrayList<String>> entry : this.f25598c.entrySet()) {
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
                        ArrayList<String> remove = this.f25598c.remove((String) it.next());
                        if (remove != null) {
                            remove.isEmpty();
                        }
                    }
                }
            }
            if (!this.f25597b.isEmpty()) {
                for (Map.Entry<String, C6262t> entry2 : this.f25597b.entrySet()) {
                    C6262t value = entry2.getValue();
                    C6246h c = value.m20765c();
                    if (i == -1 || c.m20930a() == i) {
                        value.m20766b().m14379e();
                        Iterator<C6267y> it2 = value.m20764d().iterator();
                        while (it2.hasNext()) {
                            it2.next().m20751a(value.m20765c(), false, null);
                        }
                    }
                }
                this.f25597b.clear();
            }
        }
        if (i != -1) {
            C6244g.m20961k().m20968d(i);
        } else {
            C6244g.m20961k().m20969c(z);
        }
    }

    public void m14392d(C6251j jVar, TdApi.File file) {
        Thread currentThread = Thread.currentThread();
        C6260r rVar = this.f25596a;
        if (currentThread != rVar) {
            rVar.m20783j(jVar, file);
            return;
        }
        C10930q6 B0 = jVar.m20953B0();
        synchronized (this.f25597b) {
            ArrayList<String> arrayList = this.f25598c.get(jVar.mo20880l());
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f25598c.put(C6246h.m20904o(B0, file.f25376id), arrayList);
            }
        }
        jVar.m20881G0(file);
        if (C4779t2.m25587V2(file)) {
            m14388h(B0, file);
        } else {
            B0.m2270r4().m14783o(new TdApi.DownloadFile(file.f25376id, 1, 0, 0, false), B0.m2156y6());
        }
    }

    public void m14389g(C6246h hVar, C7907b.AbstractC7910c cVar) {
        AtomicReference atomicReference = new AtomicReference();
        C7905a aVar = new C7905a(cVar, atomicReference);
        this.tempWatchers.add(aVar);
        atomicReference.set(new C6267y(aVar));
        m14384l(hVar, (C6267y) atomicReference.get());
    }

    public boolean m14388h(C10930q6 q6Var, TdApi.File file) {
        boolean z;
        synchronized (this.f25597b) {
            ArrayList<String> arrayList = this.f25598c.get(C6246h.m20904o(q6Var, file.f25376id));
            if (arrayList == null) {
                arrayList = this.f25598c.get(C6246h.m20902p(q6Var, file.remote.f25420id));
            }
            if (arrayList != null) {
                Iterator<String> it = arrayList.iterator();
                z = false;
                while (it.hasNext()) {
                    C6262t tVar = this.f25597b.get(it.next());
                    if (tVar != null) {
                        this.f25596a.m20782k(tVar.m20766b(), file);
                        z = true;
                    }
                }
            } else {
                z = false;
            }
        }
        if (Log.isEnabled(32)) {
            if (z) {
                Log.m14716v(32, "#%d (raw): successfully dispatched load event", Integer.valueOf(file.f25376id));
            } else {
                Log.m14716v(32, "#%d (raw): failed to dispatch load event (no listeners)", Integer.valueOf(file.f25376id));
            }
        }
        return z;
    }

    public boolean m14387i(C10930q6 q6Var, TdApi.File file) {
        synchronized (this.f25597b) {
            ArrayList<String> arrayList = this.f25598c.get(C6246h.m20904o(q6Var, file.f25376id));
            if (arrayList == null) {
                arrayList = this.f25598c.get(C6246h.m20902p(q6Var, file.remote.f25420id));
            }
            if (arrayList == null) {
                return false;
            }
            float s1 = C4779t2.m25432s1(file);
            Iterator<String> it = arrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C6262t tVar = this.f25597b.get(it.next());
                if (tVar != null) {
                    tVar.m20765c().m20952C0(file);
                    tVar.m20766b().m14374j(file);
                    Iterator<C6267y> it2 = tVar.m20764d().iterator();
                    while (it2.hasNext()) {
                        it2.next().m20750b(tVar.m20765c(), s1);
                    }
                    z = true;
                }
            }
            if (Log.isEnabled(32)) {
                if (z) {
                    Log.m14716v(32, "#%d (raw): successfully dispatched progress event", Integer.valueOf(file.f25376id));
                } else {
                    Log.m14716v(32, "#%d (raw): failed to dispatch progress event (no listeners)", Integer.valueOf(file.f25376id));
                }
            }
            return z;
        }
    }

    public void m14386j(C6246h hVar, boolean z, Bitmap bitmap) {
        Thread currentThread = Thread.currentThread();
        C6260r rVar = this.f25596a;
        if (currentThread != rVar) {
            rVar.m20781l(hVar, z, bitmap);
            return;
        }
        synchronized (this.f25597b) {
            C6262t tVar = this.f25597b.get(hVar.toString());
            if (Log.isEnabled(32)) {
                int i = -1;
                if (z) {
                    Object[] objArr = new Object[2];
                    objArr[0] = hVar.toString();
                    if (tVar != null) {
                        i = tVar.m20764d().size();
                    }
                    objArr[1] = Integer.valueOf(i);
                    Log.m14733d(32, "#%s: completed, watches: %d", objArr);
                } else {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = hVar.toString();
                    if (tVar != null) {
                        i = tVar.m20764d().size();
                    }
                    objArr2[1] = Integer.valueOf(i);
                    Log.m14711w(32, "#%s: failed, watches: %d", objArr2);
                }
            }
            if (tVar != null) {
                this.f25597b.remove(hVar.toString());
                Iterator<C6267y> it = tVar.m20764d().iterator();
                while (it.hasNext()) {
                    it.next().m20751a(hVar, z, bitmap);
                }
            } else {
                if (Log.isEnabled(32)) {
                    Log.m14733d(32, "#%s: wanted to dispatch result, but there're no listeners anymore", hVar.toString());
                }
                if (z && !hVar.m20888y0()) {
                    if (Log.isEnabled(32)) {
                        Log.m14733d(32, "#%s: recycling, because there will be no references", hVar.toString());
                    }
                    bitmap.recycle();
                }
            }
            boolean z2 = hVar instanceof C6251j;
            C10930q6 B0 = hVar.m20953B0();
            String l = hVar.mo20880l();
            ArrayList<String> arrayList = this.f25598c.get(l);
            if (arrayList != null && arrayList.remove(hVar.toString()) && arrayList.isEmpty()) {
                this.f25598c.remove(l);
                if (z2 && ((C6251j) hVar).m20882F0()) {
                    this.f25598c.remove(C6246h.m20904o(B0, hVar.mo20826s()));
                }
            }
        }
    }

    public void m14385k(C6267y yVar) {
        Thread currentThread = Thread.currentThread();
        C6260r rVar = this.f25596a;
        if (currentThread != rVar) {
            rVar.m20780m(yVar);
            return;
        }
        synchronized (this.f25597b) {
            ArrayList arrayList = null;
            for (Map.Entry<String, C6262t> entry : this.f25597b.entrySet()) {
                C6262t value = entry.getValue();
                if (value.m20762f(yVar) && !value.m20763e()) {
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
                    C6262t remove = this.f25597b.remove(str);
                    if (remove != null) {
                        remove.m20766b().m14379e();
                        C6246h c = remove.m20765c();
                        C10930q6 B0 = c.m20953B0();
                        if (B0 != null) {
                            boolean z = c instanceof C6251j;
                            String l = c.mo20880l();
                            ArrayList<String> arrayList2 = this.f25598c.get(l);
                            if (arrayList2 != null && arrayList2.remove(str) && arrayList2.isEmpty()) {
                                this.f25598c.remove(l);
                                if (z && ((C6251j) c).m20882F0()) {
                                    this.f25598c.remove(C6246h.m20904o(B0, c.mo20826s()));
                                }
                                if (!z && c.m20942O()) {
                                    B0.m2270r4().m14783o(new TdApi.CancelDownloadFile(c.mo20826s(), c.m20949G()), B0.m2392ja());
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void m14384l(final C6246h hVar, C6267y yVar) {
        C6262t tVar;
        Thread currentThread = Thread.currentThread();
        C6260r rVar = this.f25596a;
        if (currentThread != rVar) {
            rVar.m20779n(hVar, yVar);
            return;
        }
        if (Log.isEnabled(32)) {
            Log.m14733d(32, "#%s: requestFile called: type: %s, %s", hVar.toString(), hVar.getClass().getSimpleName(), hVar.mo20876q());
        }
        synchronized (this.f25597b) {
            tVar = this.f25597b.get(hVar.toString());
        }
        if (tVar == null) {
            C7906a aVar = new C7906a(hVar);
            C6262t tVar2 = new C6262t(hVar, aVar, yVar);
            synchronized (this.f25597b) {
                this.f25597b.put(hVar.toString(), tVar2);
            }
            if (aVar.m14380d()) {
                synchronized (this.f25597b) {
                    int s = hVar.mo20826s();
                    C10930q6 B0 = hVar.m20953B0();
                    boolean z = hVar instanceof C6251j;
                    String l = hVar.mo20880l();
                    ArrayList<String> arrayList = this.f25598c.get(l);
                    if (arrayList == null) {
                        ArrayList<String> arrayList2 = new ArrayList<>();
                        arrayList2.add(hVar.toString());
                        if (Log.isEnabled(32)) {
                            Log.m14716v(32, "#%s: loading from remote", hVar.toString());
                        }
                        this.f25598c.put(l, arrayList2);
                        if (z) {
                            ((C6251j) hVar).mo258D0(new Client.AbstractC7865g() {
                                @Override
                                public final void mo255t2(TdApi.Object object) {
                                    ImageLoader.this.m14390f(hVar, object);
                                }
                            });
                        } else {
                            B0.m2270r4().m14783o(new TdApi.DownloadFile(s, 32, 0, 0, false), B0.m2156y6());
                        }
                    } else if (!arrayList.contains(hVar.toString())) {
                        if (Log.isEnabled(32)) {
                            Log.m14716v(32, "#%s: another actor added to the loading list, total: %d", hVar.toString(), Integer.valueOf(arrayList.size() + 1));
                        }
                        arrayList.add(hVar.toString());
                    }
                }
                return;
            }
            return;
        }
        synchronized (this.f25597b) {
            if (Log.isEnabled(32)) {
                Log.m14716v(32, "#%s: another watcher joined same actor, total: %d", hVar.toString(), Integer.valueOf(this.f25597b.size() + 1));
            }
            tVar.m20767a(yVar);
        }
    }
}
