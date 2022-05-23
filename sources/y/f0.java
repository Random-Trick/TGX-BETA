package y;

import androidx.camera.core.k;
import androidx.camera.core.t1;
import b1.h;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import y.c0;
import y.f0;

public final class f0 {
    public final int f26300c;
    public int f26302e;
    public final StringBuilder f26298a = new StringBuilder();
    public final Object f26299b = new Object();
    public final Map<k, a> f26301d = new HashMap();

    public static class a {
        public c0.a f26303a;
        public final Executor f26304b;
        public final b f26305c;

        public a(c0.a aVar, Executor executor, b bVar) {
            this.f26303a = aVar;
            this.f26304b = executor;
            this.f26305c = bVar;
        }

        public c0.a a() {
            return this.f26303a;
        }

        public void b() {
            try {
                Executor executor = this.f26304b;
                final b bVar = this.f26305c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() {
                    @Override
                    public final void run() {
                        f0.b.this.a();
                    }
                });
            } catch (RejectedExecutionException e10) {
                t1.d("CameraStateRegistry", "Unable to notify camera.", e10);
            }
        }

        public c0.a c(c0.a aVar) {
            c0.a aVar2 = this.f26303a;
            this.f26303a = aVar;
            return aVar2;
        }
    }

    public interface b {
        void a();
    }

    public f0(int i10) {
        this.f26300c = i10;
        synchronized ("mLock") {
            this.f26302e = i10;
        }
    }

    public static boolean b(c0.a aVar) {
        return aVar != null && aVar.a();
    }

    public boolean a() {
        synchronized (this.f26299b) {
            for (Map.Entry<k, a> entry : this.f26301d.entrySet()) {
                if (entry.getValue().a() == c0.a.CLOSING) {
                    return true;
                }
            }
            return false;
        }
    }

    public void c(k kVar, c0.a aVar, boolean z10) {
        c0.a aVar2;
        HashMap hashMap;
        synchronized (this.f26299b) {
            int i10 = this.f26302e;
            if (aVar == c0.a.RELEASED) {
                aVar2 = g(kVar);
            } else {
                aVar2 = h(kVar, aVar);
            }
            if (aVar2 != aVar) {
                if (i10 < 1 && this.f26302e > 0) {
                    hashMap = new HashMap();
                    for (Map.Entry<k, a> entry : this.f26301d.entrySet()) {
                        if (entry.getValue().a() == c0.a.PENDING_OPEN) {
                            hashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else if (aVar != c0.a.PENDING_OPEN || this.f26302e <= 0) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap();
                    hashMap.put(kVar, this.f26301d.get(kVar));
                }
                if (hashMap != null && !z10) {
                    hashMap.remove(kVar);
                }
                if (hashMap != null) {
                    for (a aVar3 : hashMap.values()) {
                        aVar3.b();
                    }
                }
            }
        }
    }

    public final void d() {
        if (t1.f("CameraStateRegistry")) {
            this.f26298a.setLength(0);
            this.f26298a.append("Recalculating open cameras:\n");
            this.f26298a.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.f26298a.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry<k, a> entry : this.f26301d.entrySet()) {
            if (t1.f("CameraStateRegistry")) {
                this.f26298a.append(String.format(Locale.US, "%-45s%-22s\n", entry.getKey().toString(), entry.getValue().a() != null ? entry.getValue().a().toString() : "UNKNOWN"));
            }
            if (b(entry.getValue().a())) {
                i10++;
            }
        }
        if (t1.f("CameraStateRegistry")) {
            this.f26298a.append("-------------------------------------------------------------------\n");
            this.f26298a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i10), Integer.valueOf(this.f26300c)));
            t1.a("CameraStateRegistry", this.f26298a.toString());
        }
        this.f26302e = Math.max(this.f26300c - i10, 0);
    }

    public void e(k kVar, Executor executor, b bVar) {
        synchronized (this.f26299b) {
            boolean z10 = !this.f26301d.containsKey(kVar);
            h.h(z10, "Camera is already registered: " + kVar);
            this.f26301d.put(kVar, new a(null, executor, bVar));
        }
    }

    public boolean f(androidx.camera.core.k r10) {
        throw new UnsupportedOperationException("Method not decompiled: y.f0.f(androidx.camera.core.k):boolean");
    }

    public final c0.a g(k kVar) {
        a remove = this.f26301d.remove(kVar);
        if (remove == null) {
            return null;
        }
        d();
        return remove.a();
    }

    public final c0.a h(k kVar, c0.a aVar) {
        c0.a c10 = ((a) h.f(this.f26301d.get(kVar), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).c(aVar);
        c0.a aVar2 = c0.a.OPENING;
        if (aVar == aVar2) {
            h.h(b(aVar) || c10 == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (c10 != aVar) {
            d();
        }
        return c10;
    }
}
