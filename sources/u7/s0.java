package u7;

import java.util.concurrent.Executor;

public final class s0 implements Executor {
    public static final Executor f23693a = new s0();

    @Override
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
