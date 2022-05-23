package y;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class a extends g0 {
    public final Executor f26248a;
    public final Handler f26249b;

    public a(Executor executor, Handler handler) {
        Objects.requireNonNull(executor, "Null cameraExecutor");
        this.f26248a = executor;
        Objects.requireNonNull(handler, "Null schedulerHandler");
        this.f26249b = handler;
    }

    @Override
    public Executor b() {
        return this.f26248a;
    }

    @Override
    public Handler c() {
        return this.f26249b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.f26248a.equals(g0Var.b()) && this.f26249b.equals(g0Var.c());
    }

    public int hashCode() {
        return ((this.f26248a.hashCode() ^ 1000003) * 1000003) ^ this.f26249b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f26248a + ", schedulerHandler=" + this.f26249b + "}";
    }
}
