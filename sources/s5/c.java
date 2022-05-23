package s5;

import android.os.Process;

public final class c implements Runnable {
    public final Runnable f22533a;

    public c(Runnable runnable, int i10) {
        this.f22533a = runnable;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(0);
        this.f22533a.run();
    }
}
