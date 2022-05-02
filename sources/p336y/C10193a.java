package p336y;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class C10193a extends AbstractC10228g0 {
    public final Executor f32942a;
    public final Handler f32943b;

    public C10193a(Executor executor, Handler handler) {
        Objects.requireNonNull(executor, "Null cameraExecutor");
        this.f32942a = executor;
        Objects.requireNonNull(handler, "Null schedulerHandler");
        this.f32943b = handler;
    }

    @Override
    public Executor mo5689b() {
        return this.f32942a;
    }

    @Override
    public Handler mo5688c() {
        return this.f32943b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC10228g0)) {
            return false;
        }
        AbstractC10228g0 g0Var = (AbstractC10228g0) obj;
        return this.f32942a.equals(g0Var.mo5689b()) && this.f32943b.equals(g0Var.mo5688c());
    }

    public int hashCode() {
        return ((this.f32942a.hashCode() ^ 1000003) * 1000003) ^ this.f32943b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f32942a + ", schedulerHandler=" + this.f32943b + "}";
    }
}
