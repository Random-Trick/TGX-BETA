package u;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.t1;
import b1.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import u.b;

public class f implements b.a {
    public final Object f23437a;

    public static final class a {
        public final List<Surface> f23438a;
        public final Size f23439b;
        public final int f23440c;
        public final int f23441d;
        public String f23442e;
        public boolean f23443f = false;

        public a(Surface surface) {
            h.f(surface, "Surface must not be null");
            this.f23438a = Collections.singletonList(surface);
            this.f23439b = c(surface);
            this.f23440c = a(surface);
            this.f23441d = b(surface);
        }

        @SuppressLint({"BlockedPrivateApi"})
        public static int a(Surface surface) {
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class);
                if (Build.VERSION.SDK_INT < 22) {
                    declaredMethod.setAccessible(true);
                }
                return ((Integer) declaredMethod.invoke(null, surface)).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                t1.d("OutputConfigCompat", "Unable to retrieve surface format.", e10);
                return 0;
            }
        }

        @SuppressLint({"SoonBlockedPrivateApi"})
        public static int b(Surface surface) {
            try {
                return ((Integer) Surface.class.getDeclaredMethod("getGenerationId", new Class[0]).invoke(surface, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                t1.d("OutputConfigCompat", "Unable to retrieve surface generation id.", e10);
                return -1;
            }
        }

        @SuppressLint({"BlockedPrivateApi"})
        public static Size c(Surface surface) {
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
                declaredMethod.setAccessible(true);
                return (Size) declaredMethod.invoke(null, surface);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                t1.d("OutputConfigCompat", "Unable to retrieve surface size.", e10);
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!(this.f23439b.equals(aVar.f23439b) && this.f23440c == aVar.f23440c && this.f23441d == aVar.f23441d && this.f23443f == aVar.f23443f && Objects.equals(this.f23442e, aVar.f23442e))) {
                return false;
            }
            int min = Math.min(this.f23438a.size(), aVar.f23438a.size());
            for (int i10 = 0; i10 < min; i10++) {
                if (this.f23438a.get(i10) != aVar.f23438a.get(i10)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f23438a.hashCode() ^ 31;
            int i10 = this.f23441d ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.f23439b.hashCode() ^ ((i10 << 5) - i10);
            int i11 = this.f23440c ^ ((hashCode2 << 5) - hashCode2);
            int i12 = (this.f23443f ? 1 : 0) ^ ((i11 << 5) - i11);
            int i13 = (i12 << 5) - i12;
            String str = this.f23442e;
            return (str == null ? 0 : str.hashCode()) ^ i13;
        }
    }

    public f(Surface surface) {
        this.f23437a = new a(surface);
    }

    @Override
    public String a() {
        return ((a) this.f23437a).f23442e;
    }

    @Override
    public Surface b() {
        List<Surface> list = ((a) this.f23437a).f23438a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public void c(String str) {
        ((a) this.f23437a).f23442e = str;
    }

    @Override
    public Object d() {
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        return Objects.equals(this.f23437a, ((f) obj).f23437a);
    }

    public int hashCode() {
        return this.f23437a.hashCode();
    }

    public f(Object obj) {
        this.f23437a = obj;
    }
}
