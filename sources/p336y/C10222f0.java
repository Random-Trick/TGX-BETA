package p336y;

import androidx.camera.core.AbstractC0598k;
import androidx.camera.core.C0662u1;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import p016b1.C1132h;
import p336y.AbstractC10208c0;
import p336y.C10222f0;

public final class C10222f0 {
    public final int f32997c;
    public int f32999e;
    public final StringBuilder f32995a = new StringBuilder();
    public final Object f32996b = new Object();
    public final Map<AbstractC0598k, C10223a> f32998d = new HashMap();

    public static class C10223a {
        public AbstractC10208c0.EnumC10209a f33000a;
        public final Executor f33001b;
        public final AbstractC10224b f33002c;

        public C10223a(AbstractC10208c0.EnumC10209a aVar, Executor executor, AbstractC10224b bVar) {
            this.f33000a = aVar;
            this.f33001b = executor;
            this.f33002c = bVar;
        }

        public AbstractC10208c0.EnumC10209a m5700a() {
            return this.f33000a;
        }

        public void m5699b() {
            try {
                Executor executor = this.f33001b;
                final AbstractC10224b bVar = this.f33002c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() {
                    @Override
                    public final void run() {
                        C10222f0.AbstractC10224b.this.mo5697a();
                    }
                });
            } catch (RejectedExecutionException e) {
                C0662u1.m40650d("CameraStateRegistry", "Unable to notify camera.", e);
            }
        }

        public AbstractC10208c0.EnumC10209a m5698c(AbstractC10208c0.EnumC10209a aVar) {
            AbstractC10208c0.EnumC10209a aVar2 = this.f33000a;
            this.f33000a = aVar;
            return aVar2;
        }
    }

    public interface AbstractC10224b {
        void mo5697a();
    }

    public C10222f0(int i) {
        this.f32997c = i;
        synchronized ("mLock") {
            this.f32999e = i;
        }
    }

    public static boolean m5707b(AbstractC10208c0.EnumC10209a aVar) {
        return aVar != null && aVar.m5726a();
    }

    public boolean m5708a() {
        synchronized (this.f32996b) {
            for (Map.Entry<AbstractC0598k, C10223a> entry : this.f32998d.entrySet()) {
                if (entry.getValue().m5700a() == AbstractC10208c0.EnumC10209a.CLOSING) {
                    return true;
                }
            }
            return false;
        }
    }

    public void m5706c(AbstractC0598k kVar, AbstractC10208c0.EnumC10209a aVar, boolean z) {
        AbstractC10208c0.EnumC10209a aVar2;
        HashMap hashMap;
        synchronized (this.f32996b) {
            int i = this.f32999e;
            if (aVar == AbstractC10208c0.EnumC10209a.RELEASED) {
                aVar2 = m5702g(kVar);
            } else {
                aVar2 = m5701h(kVar, aVar);
            }
            if (aVar2 != aVar) {
                if (i < 1 && this.f32999e > 0) {
                    hashMap = new HashMap();
                    for (Map.Entry<AbstractC0598k, C10223a> entry : this.f32998d.entrySet()) {
                        if (entry.getValue().m5700a() == AbstractC10208c0.EnumC10209a.PENDING_OPEN) {
                            hashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else if (aVar != AbstractC10208c0.EnumC10209a.PENDING_OPEN || this.f32999e <= 0) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap();
                    hashMap.put(kVar, this.f32998d.get(kVar));
                }
                if (hashMap != null && !z) {
                    hashMap.remove(kVar);
                }
                if (hashMap != null) {
                    for (C10223a aVar3 : hashMap.values()) {
                        aVar3.m5699b();
                    }
                }
            }
        }
    }

    public final void m5705d() {
        if (C0662u1.m40648f("CameraStateRegistry")) {
            this.f32995a.setLength(0);
            this.f32995a.append("Recalculating open cameras:\n");
            this.f32995a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f32995a.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry<AbstractC0598k, C10223a> entry : this.f32998d.entrySet()) {
            if (C0662u1.m40648f("CameraStateRegistry")) {
                this.f32995a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().m5700a() != null ? entry.getValue().m5700a().toString() : "UNKNOWN"));
            }
            if (m5707b(entry.getValue().m5700a())) {
                i++;
            }
        }
        if (C0662u1.m40648f("CameraStateRegistry")) {
            this.f32995a.append("-------------------------------------------------------------------\n");
            this.f32995a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i), Integer.valueOf(this.f32997c)));
            C0662u1.m40653a("CameraStateRegistry", this.f32995a.toString());
        }
        this.f32999e = Math.max(this.f32997c - i, 0);
    }

    public void m5704e(AbstractC0598k kVar, Executor executor, AbstractC10224b bVar) {
        synchronized (this.f32996b) {
            boolean z = !this.f32998d.containsKey(kVar);
            C1132h.m38319h(z, "Camera is already registered: " + kVar);
            this.f32998d.put(kVar, new C10223a(null, executor, bVar));
        }
    }

    public boolean m5703f(androidx.camera.core.AbstractC0598k r10) {
        throw new UnsupportedOperationException("Method not decompiled: p336y.C10222f0.m5703f(androidx.camera.core.k):boolean");
    }

    public final AbstractC10208c0.EnumC10209a m5702g(AbstractC0598k kVar) {
        C10223a remove = this.f32998d.remove(kVar);
        if (remove == null) {
            return null;
        }
        m5705d();
        return remove.m5700a();
    }

    public final AbstractC10208c0.EnumC10209a m5701h(AbstractC0598k kVar, AbstractC10208c0.EnumC10209a aVar) {
        AbstractC10208c0.EnumC10209a c = ((C10223a) C1132h.m38321f(this.f32998d.get(kVar), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).m5698c(aVar);
        AbstractC10208c0.EnumC10209a aVar2 = AbstractC10208c0.EnumC10209a.OPENING;
        if (aVar == aVar2) {
            C1132h.m38319h(m5707b(aVar) || c == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (c != aVar) {
            m5705d();
        }
        return c;
    }
}
