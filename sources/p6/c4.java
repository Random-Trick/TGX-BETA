package p6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import t6.b0;
import t6.c0;

public final class c4 implements c0 {
    @Override
    public final Object zza() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(t3.f20812a);
        b0.a(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }
}
