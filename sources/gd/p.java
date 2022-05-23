package gd;

import android.gesture.Gesture;
import android.gesture.GestureStore;
import android.gesture.Prediction;
import ce.j0;
import ib.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.thunderdog.challegram.Log;

public class p {
    public final GestureStore f12328a;
    public final String f12329b;
    public boolean f12330c;
    public GestureStore f12331d;
    public Gesture f12332e;

    public interface a {
        void t5();
    }

    public p(String str) {
        this.f12329b = str;
        GestureStore gestureStore = new GestureStore();
        this.f12328a = gestureStore;
        gestureStore.setOrientationStyle(2);
        gestureStore.setSequenceType(2);
    }

    public static boolean d(GestureStore gestureStore, Gesture gesture) {
        ArrayList<Prediction> recognize = gestureStore.recognize(gesture);
        if (recognize.size() == 0) {
            return false;
        }
        double d10 = 100.0d;
        Iterator<Prediction> it = recognize.iterator();
        while (it.hasNext()) {
            d10 = Math.min(it.next().score, d10);
        }
        return d10 >= 2.35d;
    }

    public boolean a(Gesture gesture, boolean z10, a aVar) {
        if (z10) {
            GestureStore gestureStore = this.f12331d;
            return gestureStore != null && d(gestureStore, gesture);
        }
        c();
        if (this.f12330c) {
            return d(this.f12328a, gesture);
        }
        if (aVar != null) {
            aVar.t5();
        }
        return false;
    }

    public final File b() {
        String str;
        String path = j0.n().getFilesDir().getPath();
        if (path.charAt(path.length() - 1) == '/') {
            str = path + "int/temp.g";
        } else {
            str = path + "/int/temp.g";
        }
        if (!i.i(this.f12329b)) {
            str = str + "." + this.f12329b;
        }
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile.exists() || parentFile.mkdirs()) {
            return file;
        }
        return null;
    }

    public final void c() {
        File b10;
        if (!this.f12330c && (b10 = b()) != null && b10.exists()) {
            try {
                this.f12328a.load(new FileInputStream(b10), true);
                this.f12330c = true;
            } catch (Throwable th) {
                Log.e("Cannot load gesture", th, new Object[0]);
            }
        }
    }

    public boolean e(Gesture gesture) {
        File b10 = b();
        if (b10 != null) {
            try {
                if (b10.exists()) {
                    b10.delete();
                }
                b10.createNewFile();
                this.f12328a.removeEntry("main");
                this.f12328a.addGesture("main", gesture);
                Gesture gesture2 = this.f12332e;
                if (gesture2 != null) {
                    this.f12328a.addGesture("main", gesture2);
                }
                this.f12328a.save(new FileOutputStream(b10), true);
                return true;
            } catch (FileNotFoundException e10) {
                Log.w("File not found", e10, new Object[0]);
            } catch (IOException e11) {
                Log.w("IO Exception", e11, new Object[0]);
            }
        }
        return false;
    }

    public void f(Gesture gesture) {
        GestureStore gestureStore = this.f12331d;
        if (gestureStore == null) {
            GestureStore gestureStore2 = new GestureStore();
            this.f12331d = gestureStore2;
            gestureStore2.setOrientationStyle(2);
            this.f12331d.setSequenceType(2);
        } else {
            gestureStore.removeEntry("main");
        }
        this.f12331d.addGesture("main", gesture);
        this.f12332e = gesture;
    }
}
