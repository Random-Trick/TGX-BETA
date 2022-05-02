package p279u;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class C9407g {
    public final AbstractC9410c f30454a;

    public static final class C9409b implements AbstractC9410c {
        public final List<C9398b> f30457a;
        public final CameraCaptureSession.StateCallback f30458b;
        public final Executor f30459c;
        public int f30460d;
        public C9394a f30461e = null;
        public CaptureRequest f30462f = null;

        public C9409b(int i, List<C9398b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f30460d = i;
            this.f30457a = Collections.unmodifiableList(new ArrayList(list));
            this.f30458b = stateCallback;
            this.f30459c = executor;
        }

        @Override
        public C9394a mo8774a() {
            return this.f30461e;
        }

        @Override
        public Executor mo8773b() {
            return this.f30459c;
        }

        @Override
        public CameraCaptureSession.StateCallback mo8772c() {
            return this.f30458b;
        }

        @Override
        public Object mo8771d() {
            return null;
        }

        @Override
        public int mo8770e() {
            return this.f30460d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9409b) {
                C9409b bVar = (C9409b) obj;
                if (Objects.equals(this.f30461e, bVar.f30461e) && this.f30460d == bVar.f30460d && this.f30457a.size() == bVar.f30457a.size()) {
                    for (int i = 0; i < this.f30457a.size(); i++) {
                        if (!this.f30457a.get(i).equals(bVar.f30457a.get(i))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override
        public List<C9398b> mo8769f() {
            return this.f30457a;
        }

        @Override
        public void mo8768g(CaptureRequest captureRequest) {
            this.f30462f = captureRequest;
        }

        public int hashCode() {
            int hashCode = this.f30457a.hashCode() ^ 31;
            int i = (hashCode << 5) - hashCode;
            C9394a aVar = this.f30461e;
            int hashCode2 = (aVar == null ? 0 : aVar.hashCode()) ^ i;
            return this.f30460d ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    public interface AbstractC9410c {
        C9394a mo8774a();

        Executor mo8773b();

        CameraCaptureSession.StateCallback mo8772c();

        Object mo8771d();

        int mo8770e();

        List<C9398b> mo8769f();

        void mo8768g(CaptureRequest captureRequest);
    }

    public C9407g(int i, List<C9398b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f30454a = new C9409b(i, list, executor, stateCallback);
        } else {
            this.f30454a = new C9408a(i, list, executor, stateCallback);
        }
    }

    public static List<OutputConfiguration> m8777g(List<C9398b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C9398b bVar : list) {
            arrayList.add((OutputConfiguration) bVar.m8795d());
        }
        return arrayList;
    }

    public static List<C9398b> m8776h(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (OutputConfiguration outputConfiguration : list) {
            arrayList.add(C9398b.m8794e(outputConfiguration));
        }
        return arrayList;
    }

    public Executor m8783a() {
        return this.f30454a.mo8773b();
    }

    public C9394a m8782b() {
        return this.f30454a.mo8774a();
    }

    public List<C9398b> m8781c() {
        return this.f30454a.mo8769f();
    }

    public int m8780d() {
        return this.f30454a.mo8770e();
    }

    public CameraCaptureSession.StateCallback m8779e() {
        return this.f30454a.mo8772c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9407g)) {
            return false;
        }
        return this.f30454a.equals(((C9407g) obj).f30454a);
    }

    public void m8778f(CaptureRequest captureRequest) {
        this.f30454a.mo8768g(captureRequest);
    }

    public int hashCode() {
        return this.f30454a.hashCode();
    }

    public Object m8775i() {
        return this.f30454a.mo8771d();
    }

    public static final class C9408a implements AbstractC9410c {
        public final SessionConfiguration f30455a;
        public final List<C9398b> f30456b;

        public C9408a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f30455a = sessionConfiguration;
            this.f30456b = Collections.unmodifiableList(C9407g.m8776h(sessionConfiguration.getOutputConfigurations()));
        }

        @Override
        public C9394a mo8774a() {
            return C9394a.m8800b(this.f30455a.getInputConfiguration());
        }

        @Override
        public Executor mo8773b() {
            return this.f30455a.getExecutor();
        }

        @Override
        public CameraCaptureSession.StateCallback mo8772c() {
            return this.f30455a.getStateCallback();
        }

        @Override
        public Object mo8771d() {
            return this.f30455a;
        }

        @Override
        public int mo8770e() {
            return this.f30455a.getSessionType();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9408a)) {
                return false;
            }
            return Objects.equals(this.f30455a, ((C9408a) obj).f30455a);
        }

        @Override
        public List<C9398b> mo8769f() {
            return this.f30456b;
        }

        @Override
        public void mo8768g(CaptureRequest captureRequest) {
            this.f30455a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f30455a.hashCode();
        }

        public C9408a(int i, List<C9398b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i, C9407g.m8777g(list), executor, stateCallback));
        }
    }
}
