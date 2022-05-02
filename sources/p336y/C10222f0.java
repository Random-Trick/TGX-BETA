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
    public final int f33000c;
    public int f33002e;
    public final StringBuilder f32998a = new StringBuilder();
    public final Object f32999b = new Object();
    public final Map<AbstractC0598k, C10223a> f33001d = new HashMap();

    public static class C10223a {
        public AbstractC10208c0.EnumC10209a f33003a;
        public final Executor f33004b;
        public final AbstractC10224b f33005c;

        public C10223a(AbstractC10208c0.EnumC10209a aVar, Executor executor, AbstractC10224b bVar) {
            this.f33003a = aVar;
            this.f33004b = executor;
            this.f33005c = bVar;
        }

        public AbstractC10208c0.EnumC10209a m5700a() {
            return this.f33003a;
        }

        public void m5699b() {
            try {
                Executor executor = this.f33004b;
                final AbstractC10224b bVar = this.f33005c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() {
                    @Override
                    public final void run() {
                        C10222f0.AbstractC10224b.this.mo5697a();
                    }
                });
            } catch (RejectedExecutionException e) {
                C0662u1.m40653d("CameraStateRegistry", "Unable to notify camera.", e);
            }
        }

        public AbstractC10208c0.EnumC10209a m5698c(AbstractC10208c0.EnumC10209a aVar) {
            AbstractC10208c0.EnumC10209a aVar2 = this.f33003a;
            this.f33003a = aVar;
            return aVar2;
        }
    }

    public interface AbstractC10224b {
        void mo5697a();
    }

    public C10222f0(int i) {
        this.f33000c = i;
        synchronized ("mLock") {
            this.f33002e = i;
        }
    }

    public static boolean m5707b(AbstractC10208c0.EnumC10209a aVar) {
        return aVar != null && aVar.m5726a();
    }

    public boolean m5708a() {
        synchronized (this.f32999b) {
            for (Map.Entry<AbstractC0598k, C10223a> entry : this.f33001d.entrySet()) {
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
        synchronized (this.f32999b) {
            int i = this.f33002e;
            if (aVar == AbstractC10208c0.EnumC10209a.RELEASED) {
                aVar2 = m5702g(kVar);
            } else {
                aVar2 = m5701h(kVar, aVar);
            }
            if (aVar2 != aVar) {
                if (i < 1 && this.f33002e > 0) {
                    hashMap = new HashMap();
                    for (Map.Entry<AbstractC0598k, C10223a> entry : this.f33001d.entrySet()) {
                        if (entry.getValue().m5700a() == AbstractC10208c0.EnumC10209a.PENDING_OPEN) {
                            hashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else if (aVar != AbstractC10208c0.EnumC10209a.PENDING_OPEN || this.f33002e <= 0) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap();
                    hashMap.put(kVar, this.f33001d.get(kVar));
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
        if (C0662u1.m40651f("CameraStateRegistry")) {
            this.f32998a.setLength(0);
            this.f32998a.append("Recalculating open cameras:\n");
            this.f32998a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f32998a.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry<AbstractC0598k, C10223a> entry : this.f33001d.entrySet()) {
            if (C0662u1.m40651f("CameraStateRegistry")) {
                this.f32998a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().m5700a() != null ? entry.getValue().m5700a().toString() : "UNKNOWN"));
            }
            if (m5707b(entry.getValue().m5700a())) {
                i++;
            }
        }
        if (C0662u1.m40651f("CameraStateRegistry")) {
            this.f32998a.append("-------------------------------------------------------------------\n");
            this.f32998a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i), Integer.valueOf(this.f33000c)));
            C0662u1.m40656a("CameraStateRegistry", this.f32998a.toString());
        }
        this.f33002e = Math.max(this.f33000c - i, 0);
    }

    public void m5704e(AbstractC0598k kVar, Executor executor, AbstractC10224b bVar) {
        synchronized (this.f32999b) {
            boolean z = !this.f33001d.containsKey(kVar);
            C1132h.m38322h(z, "Camera is already registered: " + kVar);
            this.f33001d.put(kVar, new C10223a(null, executor, bVar));
        }
    }

    public boolean m5703f(androidx.camera.core.AbstractC0598k r10) {
        throw new UnsupportedOperationException("Method not decompiled: p336y.C10222f0.m5703f(androidx.camera.core.k):boolean");
    }

    public final AbstractC10208c0.EnumC10209a m5702g(AbstractC0598k kVar) {
        C10223a remove = this.f33001d.remove(kVar);
        if (remove == null) {
            return null;
        }
        m5705d();
        return remove.m5700a();
    }

    public final AbstractC10208c0.EnumC10209a m5701h(AbstractC0598k kVar, AbstractC10208c0.EnumC10209a aVar) {
        AbstractC10208c0.EnumC10209a c = ((C10223a) C1132h.m38324f(this.f33001d.get(kVar), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).m5698c(aVar);
        AbstractC10208c0.EnumC10209a aVar2 = AbstractC10208c0.EnumC10209a.OPENING;
        if (aVar == aVar2) {
            C1132h.m38322h(m5707b(aVar) || c == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (c != aVar) {
            m5705d();
        }
        return c;
    }
}
