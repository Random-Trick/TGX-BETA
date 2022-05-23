package i6;

import android.os.Bundle;
import android.os.Parcelable;
import m5.r;

public final class t {
    public static void a(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            Parcelable b10 = b(bundle, "MapOptions");
            if (b10 != null) {
                c(bundle2, "MapOptions", b10);
            }
            Parcelable b11 = b(bundle, "StreetViewPanoramaOptions");
            if (b11 != null) {
                c(bundle2, "StreetViewPanoramaOptions", b11);
            }
            Parcelable b12 = b(bundle, "camera");
            if (b12 != null) {
                c(bundle2, "camera", b12);
            }
            if (bundle.containsKey("position")) {
                bundle2.putString("position", bundle.getString("position"));
            }
            if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
                bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
            }
        }
    }

    public static <T extends Parcelable> T b(Bundle bundle, String str) {
        ClassLoader d10 = d();
        bundle.setClassLoader(d10);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(d10);
        return (T) bundle2.getParcelable(str);
    }

    public static void c(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader d10 = d();
        bundle.setClassLoader(d10);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(d10);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }

    public static ClassLoader d() {
        return (ClassLoader) r.k(t.class.getClassLoader());
    }
}
