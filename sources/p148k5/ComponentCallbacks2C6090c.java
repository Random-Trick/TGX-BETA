package p148k5;

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
import p232q5.C8251k;

public final class ComponentCallbacks2C6090c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final ComponentCallbacks2C6090c f19321N = new ComponentCallbacks2C6090c();
    public final AtomicBoolean f19323a = new AtomicBoolean();
    public final AtomicBoolean f19324b = new AtomicBoolean();
    @GuardedBy("sInstance")
    public final ArrayList<AbstractC6091a> f19325c = new ArrayList<>();
    @GuardedBy("sInstance")
    public boolean f19322M = false;

    public interface AbstractC6091a {
        void mo21086a(boolean z);
    }

    @RecentlyNonNull
    public static ComponentCallbacks2C6090c m21381b() {
        return f19321N;
    }

    public static void m21380c(@RecentlyNonNull Application application) {
        ComponentCallbacks2C6090c cVar = f19321N;
        synchronized (cVar) {
            if (!cVar.f19322M) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f19322M = true;
            }
        }
    }

    public void m21382a(@RecentlyNonNull AbstractC6091a aVar) {
        synchronized (f19321N) {
            this.f19325c.add(aVar);
        }
    }

    public boolean m21379d() {
        return this.f19323a.get();
    }

    @TargetApi(16)
    public boolean m21378e(boolean z) {
        if (!this.f19324b.get()) {
            if (!C8251k.m13036b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f19324b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f19323a.set(true);
            }
        }
        return m21379d();
    }

    public final void m21377f(boolean z) {
        synchronized (f19321N) {
            Iterator<AbstractC6091a> it = this.f19325c.iterator();
            while (it.hasNext()) {
                it.next().mo21086a(z);
            }
        }
    }

    @Override
    public final void onActivityCreated(@RecentlyNonNull Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f19323a.compareAndSet(true, false);
        this.f19324b.set(true);
        if (compareAndSet) {
            m21377f(false);
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
        boolean compareAndSet = this.f19323a.compareAndSet(true, false);
        this.f19324b.set(true);
        if (compareAndSet) {
            m21377f(false);
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
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f19323a.compareAndSet(false, true)) {
            this.f19324b.set(true);
            m21377f(true);
        }
    }
}
