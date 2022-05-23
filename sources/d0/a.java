package d0;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;

public final class a {
    public static void a(ImageWriter imageWriter) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            b.a(imageWriter);
            return;
        }
        throw new RuntimeException("Unable to call close() on API " + i10 + ". Version 23 or higher required.");
    }

    public static Image b(ImageWriter imageWriter) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            return b.b(imageWriter);
        }
        throw new RuntimeException("Unable to call dequeueInputImage() on API " + i10 + ". Version 23 or higher required.");
    }

    public static ImageWriter c(Surface surface, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23) {
            return b.c(surface, i10);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int) on API " + i11 + ". Version 23 or higher required.");
    }

    public static ImageWriter d(Surface surface, int i10, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            return d.a(surface, i10, i11);
        }
        if (i12 >= 26) {
            return c.a(surface, i10, i11);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int, int) on API " + i12 + ". Version 26 or higher required.");
    }

    public static void e(ImageWriter imageWriter, Image image) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 23) {
            b.d(imageWriter, image);
            return;
        }
        throw new RuntimeException("Unable to call queueInputImage() on API " + i10 + ". Version 23 or higher required.");
    }
}
