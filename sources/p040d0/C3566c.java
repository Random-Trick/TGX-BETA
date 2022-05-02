package p040d0;

import android.media.ImageWriter;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p016b1.C1132h;

public final class C3566c {
    public static Method f12162a;

    static {
        try {
            Class cls = Integer.TYPE;
            f12162a = ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException e) {
            Log.i("ImageWriterCompatApi26", "Unable to initialize via reflection.", e);
        }
    }

    public static ImageWriter m30044a(Surface surface, int i, int i2) {
        Throwable e = null;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return (ImageWriter) C1132h.m38325e(f12162a.invoke(null, surface, Integer.valueOf(i), Integer.valueOf(i2)));
            } catch (IllegalAccessException | InvocationTargetException e2) {
                e = e2;
            }
        }
        throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", e);
    }
}
