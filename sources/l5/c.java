package l5;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import r5.k;

public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final c N = new c();
    public final AtomicBoolean f16035a = new AtomicBoolean();
    public final AtomicBoolean f16036b = new AtomicBoolean();
    @GuardedBy("sInstance")
    public final ArrayList<a> f16037c = new ArrayList<>();
    @GuardedBy("sInstance")
    public boolean M = false;

    public interface a {
        void a(boolean z10);
    }

    @RecentlyNonNull
    public static c b() {
        return N;
    }

    public static void c(@RecentlyNonNull Application application) {
        c cVar = N;
        synchronized (cVar) {
            if (!cVar.M) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.M = true;
            }
        }
    }

    public void a(@RecentlyNonNull a aVar) {
        synchronized (N) {
            this.f16037c.add(aVar);
        }
    }

    public boolean d() {
        return this.f16035a.get();
    }

    @TargetApi(16)
    public boolean e(boolean z10) {
        if (!this.f16036b.get()) {
            if (!k.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f16036b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f16035a.set(true);
            }
        }
        return d();
    }

    public final void f(boolean z10) {
        synchronized (N) {
            Iterator<a> it = this.f16037c.iterator();
            while (it.hasNext()) {
                it.next().a(z10);
            }
        }
    }

    @Override
    public final void onActivityCreated(@RecentlyNonNull Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f16035a.compareAndSet(true, false);
        this.f16036b.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override
    public final void onActivityDestroyed(@RecentlyNonNull Activity activity) {
    }

    @Override
    public final void onActivityPaused(@RecentlyNonNull Activity activity) {
    }

    @Override
    public final void onActivityResumed(@RecentlyNonNull Activity activity) {
        boolean compareAndSet = this.f16035a.compareAndSet(true, false);
        this.f16036b.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    @Override
    public final void onActivitySaveInstanceState(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle) {
    }

    @Override
    public final void onActivityStarted(@RecentlyNonNull Activity activity) {
    }

    @Override
    public final void onActivityStopped(@RecentlyNonNull Activity activity) {
    }

    @Override
    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
    }

    @Override
    public final void onLowMemory() {
    }

    @Override
    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f16035a.compareAndSet(false, true)) {
            this.f16036b.set(true);
            f(true);
        }
    }
}
