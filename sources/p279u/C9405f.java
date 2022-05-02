package p279u;

import android.annotation.SuppressLint;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.C0662u1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p016b1.C1132h;
import p279u.C9398b;

public class C9405f implements C9398b.AbstractC9399a {
    public final Object f30447a;

    public static final class C9406a {
        public final List<Surface> f30448a;
        public final Size f30449b;
        public final int f30450c;
        public final int f30451d;
        public String f30452e;
        public boolean f30453f = false;

        public C9406a(Surface surface) {
            C1132h.m38324f(surface, "Surface must not be null");
            this.f30448a = Collections.singletonList(surface);
            this.f30449b = m8784c(surface);
            this.f30450c = m8786a(surface);
            this.f30451d = m8785b(surface);
        }

        @SuppressLint({"BlockedPrivateApi"})
        public static int m8786a(Surface surface) {
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class);
                if (Build.VERSION.SDK_INT < 22) {
                    declaredMethod.setAccessible(true);
                }
                return ((Integer) declaredMethod.invoke(null, surface)).intValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C0662u1.m40653d("OutputConfigCompat", "Unable to retrieve surface format.", e);
                return 0;
            }
        }

        @SuppressLint({"SoonBlockedPrivateApi"})
        public static int m8785b(Surface surface) {
            try {
                return ((Integer) Surface.class.getDeclaredMethod("getGenerationId", new Class[0]).invoke(surface, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C0662u1.m40653d("OutputConfigCompat", "Unable to retrieve surface generation id.", e);
                return -1;
            }
        }

        @SuppressLint({"BlockedPrivateApi"})
        public static Size m8784c(Surface surface) {
            try {
                Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
                declaredMethod.setAccessible(true);
                return (Size) declaredMethod.invoke(null, surface);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                C0662u1.m40653d("OutputConfigCompat", "Unable to retrieve surface size.", e);
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C9406a)) {
                return false;
            }
            C9406a aVar = (C9406a) obj;
            if (!(this.f30449b.equals(aVar.f30449b) && this.f30450c == aVar.f30450c && this.f30451d == aVar.f30451d && this.f30453f == aVar.f30453f && Objects.equals(this.f30452e, aVar.f30452e))) {
                return false;
            }
            int min = Math.min(this.f30448a.size(), aVar.f30448a.size());
            for (int i = 0; i < min; i++) {
                if (this.f30448a.get(i) != aVar.f30448a.get(i)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f30448a.hashCode() ^ 31;
            int i = this.f30451d ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.f30449b.hashCode() ^ ((i << 5) - i);
            int i2 = this.f30450c ^ ((hashCode2 << 5) - hashCode2);
            int i3 = (this.f30453f ? 1 : 0) ^ ((i2 << 5) - i2);
            int i4 = (i3 << 5) - i3;
            String str = this.f30452e;
            return (str == null ? 0 : str.hashCode()) ^ i4;
        }
    }

    public C9405f(Surface surface) {
        this.f30447a = new C9406a(surface);
    }

    @Override
    public String mo8790a() {
        return ((C9406a) this.f30447a).f30452e;
    }

    @Override
    public Surface mo8789b() {
        List<Surface> list = ((C9406a) this.f30447a).f30448a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public void mo8788c(String str) {
        ((C9406a) this.f30447a).f30452e = str;
    }

    @Override
    public Object mo8787d() {
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9405f)) {
            return false;
        }
        return Objects.equals(this.f30447a, ((C9405f) obj).f30447a);
    }

    public int hashCode() {
        return this.f30447a.hashCode();
    }

    public C9405f(Object obj) {
        this.f30447a = obj;
    }
}
