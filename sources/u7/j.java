package u7;

import java.util.concurrent.Executor;

public final class j implements Executor {
    public static final Executor f23638a = new j();

    @Override
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
