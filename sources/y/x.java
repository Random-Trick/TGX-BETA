package y;

import android.graphics.Rect;
import androidx.camera.core.m;
import b0.f;
import java.util.Collections;
import java.util.List;

public interface x extends m {
    public static final x f26439a = new a();

    public class a implements x {
        @Override
        public c7.a<List<Void>> a(List<j0> list, int i10, int i11) {
            return f.h(Collections.emptyList());
        }

        @Override
        public c7.a<Void> b(float f10) {
            return f.h(null);
        }

        @Override
        public Rect c() {
            return new Rect();
        }

        @Override
        public void d(int i10) {
        }

        @Override
        public c7.a<Void> e(boolean z10) {
            return f.h(null);
        }

        @Override
        public n0 f() {
            return null;
        }

        @Override
        public void g() {
        }

        @Override
        public void h(n0 n0Var) {
        }
    }

    public static final class b extends Exception {
        public j f26440a;

        public b(j jVar) {
            this.f26440a = jVar;
        }
    }

    public interface c {
        void a();

        void b(List<j0> list);
    }

    c7.a<List<Void>> a(List<j0> list, int i10, int i11);

    Rect c();

    void d(int i10);

    n0 f();

    void g();

    void h(n0 n0Var);
}
