package p255s;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p255s.AbstractC8508j2;
import p266t.C8879b;
import p266t.C8883d;

public final class C8582v2 extends AbstractC8508j2.AbstractC8509a {
    public final List<AbstractC8508j2.AbstractC8509a> f27810a;

    public C8582v2(List<AbstractC8508j2.AbstractC8509a> list) {
        ArrayList arrayList = new ArrayList();
        this.f27810a = arrayList;
        arrayList.addAll(list);
    }

    public static AbstractC8508j2.AbstractC8509a m12037v(AbstractC8508j2.AbstractC8509a... aVarArr) {
        return new C8582v2(Arrays.asList(aVarArr));
    }

    @Override
    public void mo12036a(AbstractC8508j2 j2Var) {
        for (AbstractC8508j2.AbstractC8509a aVar : this.f27810a) {
            aVar.mo12036a(j2Var);
        }
    }

    @Override
    public void mo12035o(AbstractC8508j2 j2Var) {
        for (AbstractC8508j2.AbstractC8509a aVar : this.f27810a) {
            aVar.mo12035o(j2Var);
        }
    }

    @Override
    public void mo12034p(AbstractC8508j2 j2Var) {
        for (AbstractC8508j2.AbstractC8509a aVar : this.f27810a) {
            aVar.mo12034p(j2Var);
        }
    }

    @Override
    public void mo12033q(AbstractC8508j2 j2Var) {
        for (AbstractC8508j2.AbstractC8509a aVar : this.f27810a) {
            aVar.mo12033q(j2Var);
        }
    }

    @Override
    public void mo12032r(AbstractC8508j2 j2Var) {
        for (AbstractC8508j2.AbstractC8509a aVar : this.f27810a) {
            aVar.mo12032r(j2Var);
        }
    }

    @Override
    public void mo12031s(AbstractC8508j2 j2Var) {
        for (AbstractC8508j2.AbstractC8509a aVar : this.f27810a) {
            aVar.mo12031s(j2Var);
        }
    }

    @Override
    public void mo12030t(AbstractC8508j2 j2Var) {
        for (AbstractC8508j2.AbstractC8509a aVar : this.f27810a) {
            aVar.mo12030t(j2Var);
        }
    }

    @Override
    public void mo12029u(AbstractC8508j2 j2Var, Surface surface) {
        for (AbstractC8508j2.AbstractC8509a aVar : this.f27810a) {
            aVar.mo12029u(j2Var, surface);
        }
    }

    public static class C8583a extends AbstractC8508j2.AbstractC8509a {
        public final CameraCaptureSession.StateCallback f27811a;

        public C8583a(CameraCaptureSession.StateCallback stateCallback) {
            this.f27811a = stateCallback;
        }

        @Override
        public void mo12036a(AbstractC8508j2 j2Var) {
            this.f27811a.onActive(j2Var.mo12188h().m11017c());
        }

        @Override
        public void mo12035o(AbstractC8508j2 j2Var) {
            C8883d.m11027b(this.f27811a, j2Var.mo12188h().m11017c());
        }

        @Override
        public void mo12034p(AbstractC8508j2 j2Var) {
            this.f27811a.onClosed(j2Var.mo12188h().m11017c());
        }

        @Override
        public void mo12033q(AbstractC8508j2 j2Var) {
            this.f27811a.onConfigureFailed(j2Var.mo12188h().m11017c());
        }

        @Override
        public void mo12032r(AbstractC8508j2 j2Var) {
            this.f27811a.onConfigured(j2Var.mo12188h().m11017c());
        }

        @Override
        public void mo12031s(AbstractC8508j2 j2Var) {
            this.f27811a.onReady(j2Var.mo12188h().m11017c());
        }

        @Override
        public void mo12030t(AbstractC8508j2 j2Var) {
        }

        @Override
        public void mo12029u(AbstractC8508j2 j2Var, Surface surface) {
            C8879b.m11030a(this.f27811a, j2Var.mo12188h().m11017c(), surface);
        }

        public C8583a(List<CameraCaptureSession.StateCallback> list) {
            this(C8469f1.m12409a(list));
        }
    }
}
