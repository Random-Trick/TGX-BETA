package l5;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.internal.LifecycleCallback;

public interface h {
    void a(@RecentlyNonNull String str, @RecentlyNonNull LifecycleCallback lifecycleCallback);

    @RecentlyNullable
    <T extends LifecycleCallback> T b(@RecentlyNonNull String str, @RecentlyNonNull Class<T> cls);

    @RecentlyNonNull
    Activity c();

    void d(@RecentlyNonNull Intent intent, int i10);
}
