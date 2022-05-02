package p255s;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
import p306w.C9929g;

public class C8581v1 {
    public static final Size f27804d = new Size(1920, 1080);
    public static final Object f27805e = new Object();
    public static volatile C8581v1 f27806f;
    public final DisplayManager f27807a;
    public volatile Size f27808b = null;
    public final C9929g f27809c = new C9929g();

    public C8581v1(Context context) {
        this.f27807a = (DisplayManager) context.getSystemService("display");
    }

    public static C8581v1 m12041b(Context context) {
        if (f27806f == null) {
            synchronized (f27805e) {
                if (f27806f == null) {
                    f27806f = new C8581v1(context);
                }
            }
        }
        return f27806f;
    }

    public final Size m12042a() {
        Size size;
        Point point = new Point();
        m12040c().getRealSize(point);
        if (point.x > point.y) {
            size = new Size(point.x, point.y);
        } else {
            size = new Size(point.y, point.x);
        }
        int width = size.getWidth() * size.getHeight();
        Size size2 = f27804d;
        if (width > size2.getWidth() * size2.getHeight()) {
            size = size2;
        }
        return this.f27809c.m6471a(size);
    }

    public Display m12040c() {
        Display[] displays = this.f27807a.getDisplays();
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

    public Size m12039d() {
        if (this.f27808b != null) {
            return this.f27808b;
        }
        this.f27808b = m12042a();
        return this.f27808b;
    }

    public void m12038e() {
        this.f27808b = m12042a();
    }
}
