package s;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import s.j2;
import u.g;
import y.q0;

public final class u2 {
    public final b f22304a;

    public static class a {
        public final Executor f22305a;
        public final ScheduledExecutorService f22306b;
        public final Handler f22307c;
        public final t1 f22308d;
        public final int f22309e;
        public final Set<String> f22310f;

        public a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, t1 t1Var, int i10) {
            HashSet hashSet = new HashSet();
            this.f22310f = hashSet;
            this.f22305a = executor;
            this.f22306b = scheduledExecutorService;
            this.f22307c = handler;
            this.f22308d = t1Var;
            this.f22309e = i10;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 23) {
                hashSet.add("force_close");
            }
            if (i10 == 2 || i11 <= 23) {
                hashSet.add("deferrableSurface_close");
            }
            if (i10 == 2) {
                hashSet.add("wait_for_request");
            }
        }

        public u2 a() {
            if (this.f22310f.isEmpty()) {
                return new u2(new p2(this.f22308d, this.f22305a, this.f22306b, this.f22307c));
            }
            return new u2(new t2(this.f22310f, this.f22308d, this.f22305a, this.f22306b, this.f22307c));
        }
    }

    public interface b {
        Executor b();

        c7.a<Void> e(CameraDevice cameraDevice, g gVar, List<q0> list);

        g g(int i10, List<u.b> list, j2.a aVar);

        c7.a<List<Surface>> m(List<q0> list, long j10);

        boolean stop();
    }

    public u2(b bVar) {
        this.f22304a = bVar;
    }

    public g a(int i10, List<u.b> list, j2.a aVar) {
        return this.f22304a.g(i10, list, aVar);
    }

    public Executor b() {
        return this.f22304a.b();
    }

    public c7.a<Void> c(CameraDevice cameraDevice, g gVar, List<q0> list) {
        return this.f22304a.e(cameraDevice, gVar, list);
    }

    public c7.a<List<Surface>> d(List<q0> list, long j10) {
        return this.f22304a.m(list, j10);
    }

    public boolean e() {
        return this.f22304a.stop();
    }
}
