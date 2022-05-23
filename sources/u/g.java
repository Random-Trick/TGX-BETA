package u;

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

public final class g {
    public final c f23444a;

    public static final class b implements c {
        public final List<u.b> f23447a;
        public final CameraCaptureSession.StateCallback f23448b;
        public final Executor f23449c;
        public int f23450d;
        public u.a f23451e = null;
        public CaptureRequest f23452f = null;

        public b(int i10, List<u.b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f23450d = i10;
            this.f23447a = Collections.unmodifiableList(new ArrayList(list));
            this.f23448b = stateCallback;
            this.f23449c = executor;
        }

        @Override
        public u.a a() {
            return this.f23451e;
        }

        @Override
        public Executor b() {
            return this.f23449c;
        }

        @Override
        public CameraCaptureSession.StateCallback c() {
            return this.f23448b;
        }

        @Override
        public Object d() {
            return null;
        }

        @Override
        public int e() {
            return this.f23450d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f23451e, bVar.f23451e) && this.f23450d == bVar.f23450d && this.f23447a.size() == bVar.f23447a.size()) {
                    for (int i10 = 0; i10 < this.f23447a.size(); i10++) {
                        if (!this.f23447a.get(i10).equals(bVar.f23447a.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override
        public List<u.b> f() {
            return this.f23447a;
        }

        @Override
        public void g(CaptureRequest captureRequest) {
            this.f23452f = captureRequest;
        }

        public int hashCode() {
            int hashCode = this.f23447a.hashCode() ^ 31;
            int i10 = (hashCode << 5) - hashCode;
            u.a aVar = this.f23451e;
            int hashCode2 = (aVar == null ? 0 : aVar.hashCode()) ^ i10;
            return this.f23450d ^ ((hashCode2 << 5) - hashCode2);
        }
    }

    public interface c {
        u.a a();

        Executor b();

        CameraCaptureSession.StateCallback c();

        Object d();

        int e();

        List<u.b> f();

        void g(CaptureRequest captureRequest);
    }

    public g(int i10, List<u.b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f23444a = new b(i10, list, executor, stateCallback);
        } else {
            this.f23444a = new a(i10, list, executor, stateCallback);
        }
    }

    public static List<OutputConfiguration> g(List<u.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (u.b bVar : list) {
            arrayList.add((OutputConfiguration) bVar.d());
        }
        return arrayList;
    }

    public static List<u.b> h(List<OutputConfiguration> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (OutputConfiguration outputConfiguration : list) {
            arrayList.add(u.b.e(outputConfiguration));
        }
        return arrayList;
    }

    public Executor a() {
        return this.f23444a.b();
    }

    public u.a b() {
        return this.f23444a.a();
    }

    public List<u.b> c() {
        return this.f23444a.f();
    }

    public int d() {
        return this.f23444a.e();
    }

    public CameraCaptureSession.StateCallback e() {
        return this.f23444a.c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f23444a.equals(((g) obj).f23444a);
    }

    public void f(CaptureRequest captureRequest) {
        this.f23444a.g(captureRequest);
    }

    public int hashCode() {
        return this.f23444a.hashCode();
    }

    public Object i() {
        return this.f23444a.d();
    }

    public static final class a implements c {
        public final SessionConfiguration f23445a;
        public final List<u.b> f23446b;

        public a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f23445a = sessionConfiguration;
            this.f23446b = Collections.unmodifiableList(g.h(sessionConfiguration.getOutputConfigurations()));
        }

        @Override
        public u.a a() {
            return u.a.b(this.f23445a.getInputConfiguration());
        }

        @Override
        public Executor b() {
            return this.f23445a.getExecutor();
        }

        @Override
        public CameraCaptureSession.StateCallback c() {
            return this.f23445a.getStateCallback();
        }

        @Override
        public Object d() {
            return this.f23445a;
        }

        @Override
        public int e() {
            return this.f23445a.getSessionType();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return Objects.equals(this.f23445a, ((a) obj).f23445a);
        }

        @Override
        public List<u.b> f() {
            return this.f23446b;
        }

        @Override
        public void g(CaptureRequest captureRequest) {
            this.f23445a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f23445a.hashCode();
        }

        public a(int i10, List<u.b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i10, g.g(list), executor, stateCallback));
        }
    }
}
