package i5;

import java.util.concurrent.Executor;

public final class d0 implements Executor {
    public static final Executor f14007a = new d0();

    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
