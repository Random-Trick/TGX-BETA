package p040d0;

import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.view.Surface;

public final class C3564a {
    public static void m30053a(ImageWriter imageWriter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            C3565b.m30048a(imageWriter);
            return;
        }
        throw new RuntimeException("Unable to call close() on API " + i + ". Version 23 or higher required.");
    }

    public static Image m30052b(ImageWriter imageWriter) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            return C3565b.m30047b(imageWriter);
        }
        throw new RuntimeException("Unable to call dequeueInputImage() on API " + i + ". Version 23 or higher required.");
    }

    public static ImageWriter m30051c(Surface surface, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            return C3565b.m30046c(surface, i);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int) on API " + i2 + ". Version 23 or higher required.");
    }

    public static ImageWriter m30050d(Surface surface, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            return C3567d.m30043a(surface, i, i2);
        }
        if (i3 >= 26) {
            return C3566c.m30044a(surface, i, i2);
        }
        throw new RuntimeException("Unable to call newInstance(Surface, int, int) on API " + i3 + ". Version 26 or higher required.");
    }

    public static void m30049e(ImageWriter imageWriter, Image image) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            C3565b.m30045d(imageWriter, image);
            return;
        }
        throw new RuntimeException("Unable to call queueInputImage() on API " + i + ". Version 23 or higher required.");
    }
}
