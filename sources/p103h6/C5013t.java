package p103h6;

import android.os.Bundle;
import android.os.Parcelable;
import p163l5.C6378r;

public final class C5013t {
    public static void m24320a(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable b = m24319b(bundle, "MapOptions");
            if (b != null) {
                m24318c(bundle2, "MapOptions", b);
            }
            Parcelable b2 = m24319b(bundle, "StreetViewPanoramaOptions");
            if (b2 != null) {
                m24318c(bundle2, "StreetViewPanoramaOptions", b2);
            }
            Parcelable b3 = m24319b(bundle, "camera");
            if (b3 != null) {
                m24318c(bundle2, "camera", b3);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static <T extends Parcelable> T m24319b(Bundle bundle, String str) {
        ClassLoader d = m24317d();
        bundle.setClassLoader(d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(d);
        return (T) bundle2.getParcelable(str);
    }

    public static void m24318c(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader d = m24317d();
        bundle.setClassLoader(d);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(d);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    public static ClassLoader m24317d() {
        return (ClassLoader) C6378r.m20507k(C5013t.class.getClassLoader());
    }
}
