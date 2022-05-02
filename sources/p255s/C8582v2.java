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
    public final List<AbstractC8508j2.AbstractC8509a> f27807a;

    public C8582v2(List<AbstractC8508j2.AbstractC8509a> list) {
        ArrayList arrayList = new ArrayList();
        this.f27807a = arrayList;
        arrayList.addAll(list);
    }

    public static AbstractC8508j2.AbstractC8509a m12038v(AbstractC8508j2.AbstractC8509a... aVarArr) {
        return new C8582v2(Arrays.asList(aVarArr));
    }

    @Override
    public void mo12037a(AbstractC8508j2 j2Var) {
        for (AbstractC8508j2.AbstractC8509a aVar : this.f27807a) {
            aVar.mo12037a(j2Var);
        }
    }

    @Override
    public void mo12036o(AbstractC8508j2 j2Var) {
        for (AbstractC8508j2.AbstractC8509a aVar : this.f27807a) {
            aVar.mo12036o(j2Var);
        }
    }

    @Override
    public void mo12035p(AbstractC8508j2 j2Var) {
        for (AbstractC8508j2.AbstractC8509a aVar : this.f27807a) {
            aVar.mo12035p(j2Var);
        }
    }

    @Override
    public void mo12034q(AbstractC8508j2 j2Var) {
        for (AbstractC8508j2.AbstractC8509a aVar : this.f27807a) {
            aVar.mo12034q(j2Var);
        }
    }

    @Override
    public void mo12033r(AbstractC8508j2 j2Var) {
        for (AbstractC8508j2.AbstractC8509a aVar : this.f27807a) {
            aVar.mo12033r(j2Var);
        }
    }

    @Override
    public void mo12032s(AbstractC8508j2 j2Var) {
        for (AbstractC8508j2.AbstractC8509a aVar : this.f27807a) {
            aVar.mo12032s(j2Var);
        }
    }

    @Override
    public void mo12031t(AbstractC8508j2 j2Var) {
        for (AbstractC8508j2.AbstractC8509a aVar : this.f27807a) {
            aVar.mo12031t(j2Var);
        }
    }

    @Override
    public void mo12030u(AbstractC8508j2 j2Var, Surface surface) {
        for (AbstractC8508j2.AbstractC8509a aVar : this.f27807a) {
            aVar.mo12030u(j2Var, surface);
        }
    }

    public static class C8583a extends AbstractC8508j2.AbstractC8509a {
        public final CameraCaptureSession.StateCallback f27808a;

        public C8583a(CameraCaptureSession.StateCallback stateCallback) {
            this.f27808a = stateCallback;
        }

        @Override
        public void mo12037a(AbstractC8508j2 j2Var) {
            this.f27808a.onActive(j2Var.mo12189h().m11018c());
        }

        @Override
        public void mo12036o(AbstractC8508j2 j2Var) {
            C8883d.m11028b(this.f27808a, j2Var.mo12189h().m11018c());
        }

        @Override
        public void mo12035p(AbstractC8508j2 j2Var) {
            this.f27808a.onClosed(j2Var.mo12189h().m11018c());
        }

        @Override
        public void mo12034q(AbstractC8508j2 j2Var) {
            this.f27808a.onConfigureFailed(j2Var.mo12189h().m11018c());
        }

        @Override
        public void mo12033r(AbstractC8508j2 j2Var) {
            this.f27808a.onConfigured(j2Var.mo12189h().m11018c());
        }

        @Override
        public void mo12032s(AbstractC8508j2 j2Var) {
            this.f27808a.onReady(j2Var.mo12189h().m11018c());
        }

        @Override
        public void mo12031t(AbstractC8508j2 j2Var) {
        }

        @Override
        public void mo12030u(AbstractC8508j2 j2Var, Surface surface) {
            C8879b.m11031a(this.f27808a, j2Var.mo12189h().m11018c(), surface);
        }

        public C8583a(List<CameraCaptureSession.StateCallback> list) {
            this(C8469f1.m12410a(list));
        }
    }
}
