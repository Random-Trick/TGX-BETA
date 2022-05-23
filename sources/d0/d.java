package d0;

import android.media.ImageWriter;
import android.view.Surface;

public final class d {
    public static ImageWriter a(Surface surface, int i10, int i11) {
        return ImageWriter.newInstance(surface, i10, i11);
    }
}
