package u7;

import java.util.concurrent.Executor;

public final class d implements Executor {
    public static final Executor f23612a = new d();

    @Override
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
