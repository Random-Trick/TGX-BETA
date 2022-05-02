package p229q2;

import java.util.concurrent.Executor;

public enum EnumC8153b implements Executor {
    INSTANCE;

    @Override
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override
    public String toString() {
        return "DirectExecutor";
    }
}
