package w6;

import java.util.concurrent.Executor;

public final class r implements Executor {
    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
