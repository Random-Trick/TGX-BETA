package u7;

import java.util.concurrent.Executor;

public final class g implements Executor {
    public static final Executor f23625a = new g();

    @Override
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
