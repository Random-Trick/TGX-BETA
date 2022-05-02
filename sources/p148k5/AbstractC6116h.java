package p148k5;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public interface AbstractC6116h {
    void m21275a(@RecentlyNonNull String str, @RecentlyNonNull LifecycleCallback lifecycleCallback);

    @RecentlyNullable
    <T extends LifecycleCallback> T m21274b(@RecentlyNonNull String str, @RecentlyNonNull Class<T> cls);

    @RecentlyNonNull
    Activity m21273c();

    void m21272d(@RecentlyNonNull Intent intent, int i);
}
