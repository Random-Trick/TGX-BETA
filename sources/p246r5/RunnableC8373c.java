package p246r5;

import android.os.Process;

public final class RunnableC8373c implements Runnable {
    public final Runnable f27140a;

    public RunnableC8373c(Runnable runnable, int i) {
        this.f27140a = runnable;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(0);
        this.f27140a.run();
    }
}
