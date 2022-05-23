package b8;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Executor;
import n7.b;

public class d {
    public final b<? extends Executor> f4028a;

    public d(@RecentlyNonNull b<? extends Executor> bVar) {
        this.f4028a = bVar;
    }

    @RecentlyNonNull
    public Executor a(Executor executor) {
        return executor != null ? executor : this.f4028a.get();
    }
}
