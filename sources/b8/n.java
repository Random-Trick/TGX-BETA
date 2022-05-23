package b8;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RecentlyNonNull;
import e7.d;
import e7.q;
import java.util.UUID;

public class n {
    @RecentlyNonNull
    public static final d<?> f4046b = d.c(n.class).b(q.i(i.class)).b(q.i(Context.class)).e(b0.f4024a).d();
    public final Context f4047a;

    public n(@RecentlyNonNull Context context) {
        this.f4047a = context;
    }

    @RecentlyNonNull
    public synchronized String a() {
        String string = b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        b().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    public final SharedPreferences b() {
        return this.f4047a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
