package n6;

import java.util.concurrent.Executor;

public final class k0 implements Executor {
    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
