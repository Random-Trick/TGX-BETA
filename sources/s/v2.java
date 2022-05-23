package s;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import s.j2;
import t.b;
import t.d;

public final class v2 extends j2.a {
    public final List<j2.a> f22323a;

    public v2(List<j2.a> list) {
        ArrayList arrayList = new ArrayList();
        this.f22323a = arrayList;
        arrayList.addAll(list);
    }

    public static j2.a v(j2.a... aVarArr) {
        return new v2(Arrays.asList(aVarArr));
    }

    @Override
    public void a(j2 j2Var) {
        for (j2.a aVar : this.f22323a) {
            aVar.a(j2Var);
        }
    }

    @Override
    public void o(j2 j2Var) {
        for (j2.a aVar : this.f22323a) {
            aVar.o(j2Var);
        }
    }

    @Override
    public void p(j2 j2Var) {
        for (j2.a aVar : this.f22323a) {
            aVar.p(j2Var);
        }
    }

    @Override
    public void q(j2 j2Var) {
        for (j2.a aVar : this.f22323a) {
            aVar.q(j2Var);
        }
    }

    @Override
    public void r(j2 j2Var) {
        for (j2.a aVar : this.f22323a) {
            aVar.r(j2Var);
        }
    }

    @Override
    public void s(j2 j2Var) {
        for (j2.a aVar : this.f22323a) {
            aVar.s(j2Var);
        }
    }

    @Override
    public void t(j2 j2Var) {
        for (j2.a aVar : this.f22323a) {
            aVar.t(j2Var);
        }
    }

    @Override
    public void u(j2 j2Var, Surface surface) {
        for (j2.a aVar : this.f22323a) {
            aVar.u(j2Var, surface);
        }
    }

    public static class a extends j2.a {
        public final CameraCaptureSession.StateCallback f22324a;

        public a(CameraCaptureSession.StateCallback stateCallback) {
            this.f22324a = stateCallback;
        }

        @Override
        public void a(j2 j2Var) {
            this.f22324a.onActive(j2Var.h().c());
        }

        @Override
        public void o(j2 j2Var) {
            d.b(this.f22324a, j2Var.h().c());
        }

        @Override
        public void p(j2 j2Var) {
            this.f22324a.onClosed(j2Var.h().c());
        }

        @Override
        public void q(j2 j2Var) {
            this.f22324a.onConfigureFailed(j2Var.h().c());
        }

        @Override
        public void r(j2 j2Var) {
            this.f22324a.onConfigured(j2Var.h().c());
        }

        @Override
        public void s(j2 j2Var) {
            this.f22324a.onReady(j2Var.h().c());
        }

        @Override
        public void t(j2 j2Var) {
        }

        @Override
        public void u(j2 j2Var, Surface surface) {
            b.a(this.f22324a, j2Var.h().c(), surface);
        }

        public a(List<CameraCaptureSession.StateCallback> list) {
            this(f1.a(list));
        }
    }
}
