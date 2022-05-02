package p009a8;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RecentlyNonNull;
import java.util.UUID;
import p047d7.C3865d;
import p047d7.C3890q;

public class C0223n {
    @RecentlyNonNull
    public static final C3865d<?> f706b = C3865d.m29709c(C0223n.class).m29694b(C3890q.m29635i(C0218i.class)).m29694b(C3890q.m29635i(Context.class)).m29691e(C0206b0.f680a).m29692d();
    public final Context f707a;

    public C0223n(@RecentlyNonNull Context context) {
        this.f707a = context;
    }

    @RecentlyNonNull
    public synchronized String m42067a() {
        String string = m42066b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        m42066b().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    public final SharedPreferences m42066b() {
        return this.f707a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
