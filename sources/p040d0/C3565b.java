package p040d0;

import android.media.Image;
import android.media.ImageWriter;
import android.view.Surface;

public final class C3565b {
    public static void m30046a(ImageWriter imageWriter) {
        imageWriter.close();
    }

    public static Image m30045b(ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    public static ImageWriter m30044c(Surface surface, int i) {
        return ImageWriter.newInstance(surface, i);
    }

    public static void m30043d(ImageWriter imageWriter, Image image) {
        imageWriter.queueInputImage(image);
    }
}
