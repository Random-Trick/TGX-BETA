package p281u1;

import androidx.lifecycle.LiveData;
import androidx.room.C1013e;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

public class C9419c {
    public final Set<LiveData> f30491a = Collections.newSetFromMap(new IdentityHashMap());
    public final AbstractC9421e f30492b;

    public C9419c(AbstractC9421e eVar) {
        this.f30492b = eVar;
    }

    public <T> LiveData<T> m8739a(String[] strArr, boolean z, Callable<T> callable) {
        return new C1013e(this.f30492b, this, z, callable, strArr);
    }

    public void m8738b(LiveData liveData) {
        this.f30491a.add(liveData);
    }

    public void m8737c(LiveData liveData) {
        this.f30491a.remove(liveData);
    }
}
