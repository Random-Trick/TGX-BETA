package b3;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public abstract class i {
    public static Executor a() {
        return new k(Executors.newSingleThreadExecutor());
    }
}
