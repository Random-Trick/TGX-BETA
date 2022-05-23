package d0;

import android.media.ImageWriter;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import b1.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class c {
    public static Method f6100a;

    static {
        try {
            Class cls = Integer.TYPE;
            f6100a = ImageWriter.class.getMethod("newInstance", Surface.class, cls, cls);
        } catch (NoSuchMethodException e10) {
            Log.i("ImageWriterCompatApi26", "Unable to initialize via reflection.", e10);
        }
    }

    public static ImageWriter a(Surface surface, int i10, int i11) {
        Throwable e10 = null;
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                return (ImageWriter) h.e(f6100a.invoke(null, surface, Integer.valueOf(i10), Integer.valueOf(i11)));
            } catch (IllegalAccessException | InvocationTargetException e11) {
                e10 = e11;
            }
        }
        throw new RuntimeException("Unable to invoke newInstance(Surface, int, int) via reflection.", e10);
    }
}
