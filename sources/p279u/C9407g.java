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
    public final AbstractC9410c f30451a;

    public static final class C9409b implements AbstractC9410c {
        public final List<C9398b> f30454a;
        public final CameraCaptureSession.StateCallback f30455b;
        public final Executor f30456c;
        public int f30457d;
        public C9394a f30458e = null;
        public CaptureRequest f30459f = null;

        public C9409b(int i, List<C9398b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f30457d = i;
            this.f30454a = Collections.unmodifiableList(new ArrayList(list));
            this.f30455b = stateCallback;
            this.f30456c = executor;
        }

        @Override
        public C9394a mo8774a() {
            return this.f30458e;
        }

        @Override
        public Executor mo8773b() {
            return this.f30456c;
        }

        @Override
        public CameraCaptureSession.StateCallback mo8772c() {
            return this.f30455b;
        }

        @Override
        public Object mo8771d() {
            return null;
        }

        @Override
        public int mo8770e() {
            return this.f30457d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9409b) {
                C9409b bVar = (C9409b) obj;
                if (Objects.equals(this.f30458e, bVar.f30458e) && this.f30457d == bVar.f30457d && this.f30454a.size() == bVar.f30454a.size()) {
                    for (int i = 0; i < this.f30454a.size(); i++) {
                        if (!this.f30454a.get(i).equals(bVar.f30454a.get(i))) {
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
            return this.f30454a;
        }

        @Override
        public void mo8768g(CaptureRequest captureRequest) {
            this.f30459f = captureRequest;
        }

        public int hashCode() {
            int hashCode = this.f30454a.hashCode() ^ 31;
            int i = (hashCode << 5) - hashCode;
            C9394a aVar = this.f30458e;
            int hashCode2 = (aVar == null ? 0 : aVar.hashCode()) ^ i;
            return this.f30457d ^ ((hashCode2 << 5) - hashCode2);
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
            this.f30451a = new C9409b(i, list, executor, stateCallback);
        } else {
            this.f30451a = new C9408a(i, list, executor, stateCallback);
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
        return this.f30451a.mo8773b();
    }

    public C9394a m8782b() {
        return this.f30451a.mo8774a();
    }

    public List<C9398b> m8781c() {
        return this.f30451a.mo8769f();
    }

    public int m8780d() {
        return this.f30451a.mo8770e();
    }

    public CameraCaptureSession.StateCallback m8779e() {
        return this.f30451a.mo8772c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9407g)) {
            return false;
        }
        return this.f30451a.equals(((C9407g) obj).f30451a);
    }

    public void m8778f(CaptureRequest captureRequest) {
        this.f30451a.mo8768g(captureRequest);
    }

    public int hashCode() {
        return this.f30451a.hashCode();
    }

    public Object m8775i() {
        return this.f30451a.mo8771d();
    }

    public static final class C9408a implements AbstractC9410c {
        public final SessionConfiguration f30452a;
        public final List<C9398b> f30453b;

        public C9408a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f30452a = sessionConfiguration;
            this.f30453b = Collections.unmodifiableList(C9407g.m8776h(sessionConfiguration.getOutputConfigurations()));
        }

        @Override
        public C9394a mo8774a() {
            return C9394a.m8800b(this.f30452a.getInputConfiguration());
        }

        @Override
        public Executor mo8773b() {
            return this.f30452a.getExecutor();
        }

        @Override
        public CameraCaptureSession.StateCallback mo8772c() {
            return this.f30452a.getStateCallback();
        }

        @Override
        public Object mo8771d() {
            return this.f30452a;
        }

        @Override
        public int mo8770e() {
            return this.f30452a.getSessionType();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9408a)) {
                return false;
            }
            return Objects.equals(this.f30452a, ((C9408a) obj).f30452a);
        }

        @Override
        public List<C9398b> mo8769f() {
            return this.f30453b;
        }

        @Override
        public void mo8768g(CaptureRequest captureRequest) {
            this.f30452a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f30452a.hashCode();
        }

        public C9408a(int i, List<C9398b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i, C9407g.m8777g(list), executor, stateCallback));
        }
    }
}
