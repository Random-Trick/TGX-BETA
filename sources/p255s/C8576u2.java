package p255s;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p022b7.AbstractFutureC1291a;
import p255s.AbstractC8508j2;
import p279u.C9398b;
import p279u.C9407g;
import p336y.AbstractC10287q0;

public final class C8576u2 {
    public final AbstractC8578b f27791a;

    public static class C8577a {
        public final Executor f27792a;
        public final ScheduledExecutorService f27793b;
        public final Handler f27794c;
        public final C8569t1 f27795d;
        public final int f27796e;
        public final Set<String> f27797f;

        public C8577a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C8569t1 t1Var, int i) {
            HashSet hashSet = new HashSet();
            this.f27797f = hashSet;
            this.f27792a = executor;
            this.f27793b = scheduledExecutorService;
            this.f27794c = handler;
            this.f27795d = t1Var;
            this.f27796e = i;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 23) {
                hashSet.add("force_close");
            }
            if (i == 2 || i2 <= 23) {
                hashSet.add("deferrableSurface_close");
            }
            if (i == 2) {
                hashSet.add("wait_for_request");
            }
        }

        public C8576u2 m12051a() {
            if (this.f27797f.isEmpty()) {
                return new C8576u2(new C8544p2(this.f27795d, this.f27792a, this.f27793b, this.f27794c));
            }
            return new C8576u2(new C8571t2(this.f27797f, this.f27795d, this.f27792a, this.f27793b, this.f27794c));
        }
    }

    public interface AbstractC8578b {
        Executor mo12050b();

        AbstractFutureC1291a<Void> mo12049e(CameraDevice cameraDevice, C9407g gVar, List<AbstractC10287q0> list);

        C9407g mo12048g(int i, List<C9398b> list, AbstractC8508j2.AbstractC8509a aVar);

        AbstractFutureC1291a<List<Surface>> mo12047m(List<AbstractC10287q0> list, long j);

        boolean stop();
    }

    public C8576u2(AbstractC8578b bVar) {
        this.f27791a = bVar;
    }

    public C9407g m12056a(int i, List<C9398b> list, AbstractC8508j2.AbstractC8509a aVar) {
        return this.f27791a.mo12048g(i, list, aVar);
    }

    public Executor m12055b() {
        return this.f27791a.mo12050b();
    }

    public AbstractFutureC1291a<Void> m12054c(CameraDevice cameraDevice, C9407g gVar, List<AbstractC10287q0> list) {
        return this.f27791a.mo12049e(cameraDevice, gVar, list);
    }

    public AbstractFutureC1291a<List<Surface>> m12053d(List<AbstractC10287q0> list, long j) {
        return this.f27791a.mo12047m(list, j);
    }

    public boolean m12052e() {
        return this.f27791a.stop();
    }
}
