package u1;

import androidx.lifecycle.LiveData;
import androidx.room.e;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;

public class c {
    public final Set<LiveData> f23479a = Collections.newSetFromMap(new IdentityHashMap());
    public final e f23480b;

    public c(e eVar) {
        this.f23480b = eVar;
    }

    public <T> LiveData<T> a(String[] strArr, boolean z10, Callable<T> callable) {
        return new e(this.f23480b, this, z10, callable, strArr);
    }

    public void b(LiveData liveData) {
        this.f23479a.add(liveData);
    }

    public void c(LiveData liveData) {
        this.f23479a.remove(liveData);
    }
}
