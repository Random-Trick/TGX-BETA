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
    public final AbstractC8578b f27788a;

    public static class C8577a {
        public final Executor f27789a;
        public final ScheduledExecutorService f27790b;
        public final Handler f27791c;
        public final C8569t1 f27792d;
        public final int f27793e;
        public final Set<String> f27794f;

        public C8577a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C8569t1 t1Var, int i) {
            HashSet hashSet = new HashSet();
            this.f27794f = hashSet;
            this.f27789a = executor;
            this.f27790b = scheduledExecutorService;
            this.f27791c = handler;
            this.f27792d = t1Var;
            this.f27793e = i;
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

        public C8576u2 m12052a() {
            if (this.f27794f.isEmpty()) {
                return new C8576u2(new C8544p2(this.f27792d, this.f27789a, this.f27790b, this.f27791c));
            }
            return new C8576u2(new C8571t2(this.f27794f, this.f27792d, this.f27789a, this.f27790b, this.f27791c));
        }
    }

    public interface AbstractC8578b {
        Executor mo12051b();

        AbstractFutureC1291a<Void> mo12050e(CameraDevice cameraDevice, C9407g gVar, List<AbstractC10287q0> list);

        C9407g mo12049g(int i, List<C9398b> list, AbstractC8508j2.AbstractC8509a aVar);

        AbstractFutureC1291a<List<Surface>> mo12048m(List<AbstractC10287q0> list, long j);

        boolean stop();
    }

    public C8576u2(AbstractC8578b bVar) {
        this.f27788a = bVar;
    }

    public C9407g m12057a(int i, List<C9398b> list, AbstractC8508j2.AbstractC8509a aVar) {
        return this.f27788a.mo12049g(i, list, aVar);
    }

    public Executor m12056b() {
        return this.f27788a.mo12051b();
    }

    public AbstractFutureC1291a<Void> m12055c(CameraDevice cameraDevice, C9407g gVar, List<AbstractC10287q0> list) {
        return this.f27788a.mo12050e(cameraDevice, gVar, list);
    }

    public AbstractFutureC1291a<List<Surface>> m12054d(List<AbstractC10287q0> list, long j) {
        return this.f27788a.mo12048m(list, j);
    }

    public boolean m12053e() {
        return this.f27788a.stop();
    }
}
