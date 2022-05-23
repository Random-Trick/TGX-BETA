package y;

import androidx.camera.core.k;
import androidx.camera.core.r;
import androidx.camera.core.x2;
import java.util.Collection;

public interface c0 extends k, x2.d {

    public enum a {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);
        
        public final boolean f26275a;

        a(boolean z10) {
            this.f26275a = z10;
        }

        public boolean a() {
            return this.f26275a;
        }
    }

    @Override
    r a();

    void c(s sVar);

    r1<a> g();

    x h();

    void i(boolean z10);

    void j(Collection<x2> collection);

    void k(Collection<x2> collection);

    a0 l();
}
