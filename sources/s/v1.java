package s;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import w.g;

public class v1 {
    public static final Size f22317d = new Size(1920, 1080);
    public static final Object f22318e = new Object();
    public static volatile v1 f22319f;
    public final DisplayManager f22320a;
    public volatile Size f22321b = null;
    public final g f22322c = new g();

    public v1(Context context) {
        this.f22320a = (DisplayManager) context.getSystemService("display");
    }

    public static v1 b(Context context) {
        if (f22319f == null) {
            synchronized (f22318e) {
                if (f22319f == null) {
                    f22319f = new v1(context);
                }
            }
        }
        return f22319f;
    }

    public final Size a() {
        Size size;
        Point point = new Point();
        c().getRealSize(point);
        if (point.x > point.y) {
            size = new Size(point.x, point.y);
        } else {
            size = new Size(point.y, point.x);
        }
        int width = size.getWidth() * size.getHeight();
        Size size2 = f22317d;
        if (width > size2.getWidth() * size2.getHeight()) {
            size = size2;
        }
        return this.f22322c.a(size);
    }

    public Display c() {
        Display[] displays = this.f22320a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display display = null;
        int i10 = -1;
        for (Display display2 : displays) {
            Point point = new Point();
            display2.getRealSize(point);
            int i11 = point.x;
            int i12 = point.y;
            if (i11 * i12 > i10) {
                i10 = i11 * i12;
                display = display2;
            }
        }
        if (display != null) {
            return display;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public Size d() {
        if (this.f22321b != null) {
            return this.f22321b;
        }
        this.f22321b = a();
        return this.f22321b;
    }

    public void e() {
        this.f22321b = a();
    }
}
