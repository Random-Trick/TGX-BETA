package p336y;

import android.graphics.Rect;
import androidx.camera.core.AbstractC0615m;
import java.util.Collections;
import java.util.List;
import p015b0.C1111f;
import p022b7.AbstractFutureC1291a;

public interface AbstractC10312x extends AbstractC0615m {
    public static final AbstractC10312x f33169a = new C10313a();

    public class C10313a implements AbstractC10312x {
        @Override
        public AbstractFutureC1291a<List<Void>> mo5492a(List<C10245j0> list, int i, int i2) {
            return C1111f.m38354h(Collections.emptyList());
        }

        @Override
        public AbstractFutureC1291a<Void> mo5491b(float f) {
            return C1111f.m38354h(null);
        }

        @Override
        public Rect mo5490c() {
            return new Rect();
        }

        @Override
        public void mo5489d(int i) {
        }

        @Override
        public AbstractFutureC1291a<Void> mo5488e(boolean z) {
            return C1111f.m38354h(null);
        }

        @Override
        public AbstractC10268n0 mo5487f() {
            return null;
        }

        @Override
        public void mo5486g() {
        }

        @Override
        public void mo5485h(AbstractC10268n0 n0Var) {
        }
    }

    public static final class C10314b extends Exception {
        public C10243j f33170a;

        public C10314b(C10243j jVar) {
            this.f33170a = jVar;
        }
    }

    public interface AbstractC10315c {
        void mo5484a();

        void mo5483b(List<C10245j0> list);
    }

    AbstractFutureC1291a<List<Void>> mo5492a(List<C10245j0> list, int i, int i2);

    Rect mo5490c();

    void mo5489d(int i);

    AbstractC10268n0 mo5487f();

    void mo5486g();

    void mo5485h(AbstractC10268n0 n0Var);
}
