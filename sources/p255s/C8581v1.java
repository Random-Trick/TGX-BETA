package p255s;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import p306w.C9929g;

public class C8581v1 {
    public static final Size f27801d = new Size(1920, 1080);
    public static final Object f27802e = new Object();
    public static volatile C8581v1 f27803f;
    public final DisplayManager f27804a;
    public volatile Size f27805b = null;
    public final C9929g f27806c = new C9929g();

    public C8581v1(Context context) {
        this.f27804a = (DisplayManager) context.getSystemService("display");
    }

    public static C8581v1 m12042b(Context context) {
        if (f27803f == null) {
            synchronized (f27802e) {
                if (f27803f == null) {
                    f27803f = new C8581v1(context);
                }
            }
        }
        return f27803f;
    }

    public final Size m12043a() {
        Size size;
        Point point = new Point();
        m12041c().getRealSize(point);
        if (point.x > point.y) {
            size = new Size(point.x, point.y);
        } else {
            size = new Size(point.y, point.x);
        }
        int width = size.getWidth() * size.getHeight();
        Size size2 = f27801d;
        if (width > size2.getWidth() * size2.getHeight()) {
            size = size2;
        }
        return this.f27806c.m6471a(size);
    }

    public Display m12041c() {
        Display[] displays = this.f27804a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display display = null;
        int i = -1;
        for (Display display2 : displays) {
            Point point = new Point();
            display2.getRealSize(point);
            int i2 = point.x;
            int i3 = point.y;
            if (i2 * i3 > i) {
                i = i2 * i3;
                display = display2;
            }
        }
        if (display != null) {
            return display;
        }
        throw new IllegalArgumentException("No display can be found from the input display manager!");
    }

    public Size m12040d() {
        if (this.f27805b != null) {
            return this.f27805b;
        }
        this.f27805b = m12043a();
        return this.f27805b;
    }

    public void m12039e() {
        this.f27805b = m12043a();
    }
}
