package p009a8;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RecentlyNonNull;
import java.util.UUID;
import p047d7.C3865d;
import p047d7.C3890q;

public class C0223n {
    @RecentlyNonNull
    public static final C3865d<?> f706b = C3865d.m29707c(C0223n.class).m29692b(C3890q.m29633i(C0218i.class)).m29692b(C3890q.m29633i(Context.class)).m29689e(C0206b0.f680a).m29690d();
    public final Context f707a;

    public C0223n(@RecentlyNonNull Context context) {
        this.f707a = context;
    }

    @RecentlyNonNull
    public synchronized String m42064a() {
        String string = m42063b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        m42063b().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    public final SharedPreferences m42063b() {
        return this.f707a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
