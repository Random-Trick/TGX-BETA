package p009a8;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Executor;
import p178m7.AbstractC6794b;

public class C0209d {
    public final AbstractC6794b<? extends Executor> f684a;

    public C0209d(@RecentlyNonNull AbstractC6794b<? extends Executor> bVar) {
        this.f684a = bVar;
    }

    @RecentlyNonNull
    public Executor m42089a(Executor executor) {
        return executor != null ? executor : this.f684a.get();
    }
}
