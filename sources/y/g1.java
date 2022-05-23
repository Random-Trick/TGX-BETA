package y;

import android.view.Surface;
import androidx.camera.core.k1;
import java.util.concurrent.Executor;

public interface g1 {

    public interface a {
        void a(g1 g1Var);
    }

    void a(a aVar, Executor executor);

    Surface b();

    void close();

    k1 d();

    int e();

    void f();

    int g();

    int getHeight();

    int getWidth();

    k1 h();
}
