package p040d0;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

public final class C3565b {
    public static void m30048a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    public static Image m30047b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    public static ImageWriter m30046c(Surface surface, int i) {
        return ImageWriter.newInstance(surface, i);
    }

    public static void m30045d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
