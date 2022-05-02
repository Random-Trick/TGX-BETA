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
    public static ImageLoader f25592d;
    public final C6260r f25593a = new C6260r();
    public final HashMap<String, C6262t> f25594b = new HashMap<>();
    public final HashMap<String, ArrayList<String>> f25595c = new HashMap<>();
    @Keep
    private final Set<AbstractC6266x> tempWatchers = new C6031b();

    public class C7905a implements AbstractC6266x {
        public final C7907b.AbstractC7910c f25596a;
        public final AtomicReference f25597b;

        public C7905a(C7907b.AbstractC7910c cVar, AtomicReference atomicReference) {
            this.f25596a = cVar;
            this.f25597b = atomicReference;
        }

        @Override
        public void mo14384k0(C6246h hVar, boolean z, Bitmap bitmap) {
            ImageLoader.this.tempWatchers.remove(this);
            this.f25596a.mo14348b(z, bitmap);
            ImageLoader.this.m14386k((C6267y) this.f25597b.get());
        }

        @Override
        public void mo14383q5(C6246h hVar, float f) {
            C6265w.m20751a(this, hVar, f);
        }
    }

    public ImageLoader() {
        C6244g.m20960k();
    }

    public static ImageLoader m14392e() {
        if (f25592d == null) {
            f25592d = new ImageLoader();
        }
        return f25592d;
    }

    public void m14391f(C6246h hVar, TdApi.Object object) {
        int constructor = object.getConstructor();
        if (constructor == -1679978726) {
            C1379j0.m37302t0(object);
        } else if (constructor == 766337656) {
            m14393d((C6251j) hVar, (TdApi.File) object);
        }
    }

    public void m14394c(int i, boolean z) {
        Thread currentThread = Thread.currentThread();
        C6260r rVar = this.f25593a;
        if (currentThread != rVar) {
            rVar.m20783i(i, z);
            return;
        }
        synchronized (this.f25594b) {
            if (i == -1) {
                this.f25595c.clear();
            } else {
                String str = i + "_";
                ArrayList arrayList = null;
                for (Map.Entry<String, ArrayList<String>> entry : this.f25595c.entrySet()) {
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
                        ArrayList<String> remove = this.f25595c.remove((String) it.next());
                        if (remove != null) {
                            remove.isEmpty();
                        }
                    }
                }
            }
            if (!this.f25594b.isEmpty()) {
                for (Map.Entry<String, C6262t> entry2 : this.f25594b.entrySet()) {
                    C6262t value = entry2.getValue();
                    C6246h c = value.m20764c();
                    if (i == -1 || c.m20929a() == i) {
                        value.m20765b().m14380e();
                        Iterator<C6267y> it2 = value.m20763d().iterator();
                        while (it2.hasNext()) {
                            it2.next().m20750a(value.m20764c(), false, null);
                        }
                    }
                }
                this.f25594b.clear();
            }
        }
        if (i != -1) {
            C6244g.m20960k().m20967d(i);
        } else {
            C6244g.m20960k().m20968c(z);
        }
    }

    public void m14393d(C6251j jVar, TdApi.File file) {
        Thread currentThread = Thread.currentThread();
        C6260r rVar = this.f25593a;
        if (currentThread != rVar) {
            rVar.m20782j(jVar, file);
            return;
        }
        C10930q6 B0 = jVar.m20952B0();
        synchronized (this.f25594b) {
            ArrayList<String> arrayList = this.f25595c.get(jVar.mo20879l());
            if (arrayList != null && !arrayList.isEmpty()) {
                this.f25595c.put(C6246h.m20903o(B0, file.f25373id), arrayList);
            }
        }
        jVar.m20880G0(file);
        if (C4779t2.m25586V2(file)) {
            m14389h(B0, file);
        } else {
            B0.m2270r4().m14783o(new TdApi.DownloadFile(file.f25373id, 1, 0, 0, false), B0.m2156y6());
        }
    }

    public void m14390g(C6246h hVar, C7907b.AbstractC7910c cVar) {
        AtomicReference atomicReference = new AtomicReference();
        C7905a aVar = new C7905a(cVar, atomicReference);
        this.tempWatchers.add(aVar);
        atomicReference.set(new C6267y(aVar));
        m14385l(hVar, (C6267y) atomicReference.get());
    }

    public boolean m14389h(C10930q6 q6Var, TdApi.File file) {
        boolean z;
        synchronized (this.f25594b) {
            ArrayList<String> arrayList = this.f25595c.get(C6246h.m20903o(q6Var, file.f25373id));
            if (arrayList == null) {
                arrayList = this.f25595c.get(C6246h.m20901p(q6Var, file.remote.f25417id));
            }
            if (arrayList != null) {
                Iterator<String> it = arrayList.iterator();
                z = false;
                while (it.hasNext()) {
                    C6262t tVar = this.f25594b.get(it.next());
                    if (tVar != null) {
                        this.f25593a.m20781k(tVar.m20765b(), file);
                        z = true;
                    }
                }
            } else {
                z = false;
            }
        }
        if (Log.isEnabled(32)) {
            if (z) {
                Log.m14716v(32, "#%d (raw): successfully dispatched load event", Integer.valueOf(file.f25373id));
            } else {
                Log.m14716v(32, "#%d (raw): failed to dispatch load event (no listeners)", Integer.valueOf(file.f25373id));
            }
        }
        return z;
    }

    public boolean m14388i(C10930q6 q6Var, TdApi.File file) {
        synchronized (this.f25594b) {
            ArrayList<String> arrayList = this.f25595c.get(C6246h.m20903o(q6Var, file.f25373id));
            if (arrayList == null) {
                arrayList = this.f25595c.get(C6246h.m20901p(q6Var, file.remote.f25417id));
            }
            if (arrayList == null) {
                return false;
            }
            float s1 = C4779t2.m25431s1(file);
            Iterator<String> it = arrayList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C6262t tVar = this.f25594b.get(it.next());
                if (tVar != null) {
                    tVar.m20764c().m20951C0(file);
                    tVar.m20765b().m14375j(file);
                    Iterator<C6267y> it2 = tVar.m20763d().iterator();
                    while (it2.hasNext()) {
                        it2.next().m20749b(tVar.m20764c(), s1);
                    }
                    z = true;
                }
            }
            if (Log.isEnabled(32)) {
                if (z) {
                    Log.m14716v(32, "#%d (raw): successfully dispatched progress event", Integer.valueOf(file.f25373id));
                } else {
                    Log.m14716v(32, "#%d (raw): failed to dispatch progress event (no listeners)", Integer.valueOf(file.f25373id));
                }
            }
            return z;
        }
    }

    public void m14387j(C6246h hVar, boolean z, Bitmap bitmap) {
        Thread currentThread = Thread.currentThread();
        C6260r rVar = this.f25593a;
        if (currentThread != rVar) {
            rVar.m20780l(hVar, z, bitmap);
            return;
        }
        synchronized (this.f25594b) {
            C6262t tVar = this.f25594b.get(hVar.toString());
            if (Log.isEnabled(32)) {
                int i = -1;
                if (z) {
                    Object[] objArr = new Object[2];
                    objArr[0] = hVar.toString();
                    if (tVar != null) {
                        i = tVar.m20763d().size();
                    }
                    objArr[1] = Integer.valueOf(i);
                    Log.m14733d(32, "#%s: completed, watches: %d", objArr);
                } else {
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = hVar.toString();
                    if (tVar != null) {
                        i = tVar.m20763d().size();
                    }
                    objArr2[1] = Integer.valueOf(i);
                    Log.m14711w(32, "#%s: failed, watches: %d", objArr2);
                }
            }
            if (tVar != null) {
                this.f25594b.remove(hVar.toString());
                Iterator<C6267y> it = tVar.m20763d().iterator();
                while (it.hasNext()) {
                    it.next().m20750a(hVar, z, bitmap);
                }
            } else {
                if (Log.isEnabled(32)) {
                    Log.m14733d(32, "#%s: wanted to dispatch result, but there're no listeners anymore", hVar.toString());
                }
                if (z && !hVar.m20887y0()) {
                    if (Log.isEnabled(32)) {
                        Log.m14733d(32, "#%s: recycling, because there will be no references", hVar.toString());
                    }
                    bitmap.recycle();
                }
            }
            boolean z2 = hVar instanceof C6251j;
            C10930q6 B0 = hVar.m20952B0();
            String l = hVar.mo20879l();
            ArrayList<String> arrayList = this.f25595c.get(l);
            if (arrayList != null && arrayList.remove(hVar.toString()) && arrayList.isEmpty()) {
                this.f25595c.remove(l);
                if (z2 && ((C6251j) hVar).m20881F0()) {
                    this.f25595c.remove(C6246h.m20903o(B0, hVar.mo20825s()));
                }
            }
        }
    }

    public void m14386k(C6267y yVar) {
        Thread currentThread = Thread.currentThread();
        C6260r rVar = this.f25593a;
        if (currentThread != rVar) {
            rVar.m20779m(yVar);
            return;
        }
        synchronized (this.f25594b) {
            ArrayList arrayList = null;
            for (Map.Entry<String, C6262t> entry : this.f25594b.entrySet()) {
                C6262t value = entry.getValue();
                if (value.m20761f(yVar) && !value.m20762e()) {
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
                    C6262t remove = this.f25594b.remove(str);
                    if (remove != null) {
                        remove.m20765b().m14380e();
                        C6246h c = remove.m20764c();
                        C10930q6 B0 = c.m20952B0();
                        if (B0 != null) {
                            boolean z = c instanceof C6251j;
                            String l = c.mo20879l();
                            ArrayList<String> arrayList2 = this.f25595c.get(l);
                            if (arrayList2 != null && arrayList2.remove(str) && arrayList2.isEmpty()) {
                                this.f25595c.remove(l);
                                if (z && ((C6251j) c).m20881F0()) {
                                    this.f25595c.remove(C6246h.m20903o(B0, c.mo20825s()));
                                }
                                if (!z && c.m20941O()) {
                                    B0.m2270r4().m14783o(new TdApi.CancelDownloadFile(c.mo20825s(), c.m20948G()), B0.m2392ja());
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void m14385l(final C6246h hVar, C6267y yVar) {
        C6262t tVar;
        Thread currentThread = Thread.currentThread();
        C6260r rVar = this.f25593a;
        if (currentThread != rVar) {
            rVar.m20778n(hVar, yVar);
            return;
        }
        if (Log.isEnabled(32)) {
            Log.m14733d(32, "#%s: requestFile called: type: %s, %s", hVar.toString(), hVar.getClass().getSimpleName(), hVar.mo20875q());
        }
        synchronized (this.f25594b) {
            tVar = this.f25594b.get(hVar.toString());
        }
        if (tVar == null) {
            C7906a aVar = new C7906a(hVar);
            C6262t tVar2 = new C6262t(hVar, aVar, yVar);
            synchronized (this.f25594b) {
                this.f25594b.put(hVar.toString(), tVar2);
            }
            if (aVar.m14381d()) {
                synchronized (this.f25594b) {
                    int s = hVar.mo20825s();
                    C10930q6 B0 = hVar.m20952B0();
                    boolean z = hVar instanceof C6251j;
                    String l = hVar.mo20879l();
                    ArrayList<String> arrayList = this.f25595c.get(l);
                    if (arrayList == null) {
                        ArrayList<String> arrayList2 = new ArrayList<>();
                        arrayList2.add(hVar.toString());
                        if (Log.isEnabled(32)) {
                            Log.m14716v(32, "#%s: loading from remote", hVar.toString());
                        }
                        this.f25595c.put(l, arrayList2);
                        if (z) {
                            ((C6251j) hVar).mo258D0(new Client.AbstractC7865g() {
                                @Override
                                public final void mo255t2(TdApi.Object object) {
                                    ImageLoader.this.m14391f(hVar, object);
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
        synchronized (this.f25594b) {
            if (Log.isEnabled(32)) {
                Log.m14716v(32, "#%s: another watcher joined same actor, total: %d", hVar.toString(), Integer.valueOf(this.f25594b.size() + 1));
            }
            tVar.m20766a(yVar);
        }
    }
}
