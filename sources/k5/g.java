package k5;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import k5.k;

public abstract class g<R extends k> {

    public interface a {
        void a(@RecentlyNonNull Status status);
    }

    public abstract void b(@RecentlyNonNull a aVar);

    public abstract void c(@RecentlyNonNull l<? super R> lVar);
}
