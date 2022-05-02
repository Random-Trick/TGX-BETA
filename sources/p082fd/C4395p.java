package p082fd;

import android.gesture.Gesture;
import android.gesture.GestureStore;
import android.gesture.Prediction;
import be.C1379j0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.thunderdog.challegram.Log;
import p108hb.C5070i;

public class C4395p {
    public final GestureStore f14563a;
    public final String f14564b;
    public boolean f14565c;
    public GestureStore f14566d;
    public Gesture f14567e;

    public interface AbstractC4396a {
        void mo28014A5();
    }

    public C4395p(String str) {
        this.f14564b = str;
        GestureStore gestureStore = new GestureStore();
        this.f14563a = gestureStore;
        gestureStore.setOrientationStyle(2);
        gestureStore.setSequenceType(2);
    }

    public static boolean m28017d(GestureStore gestureStore, Gesture gesture) {
        ArrayList<Prediction> recognize = gestureStore.recognize(gesture);
        if (recognize.size() == 0) {
            return false;
        }
        double d = 100.0d;
        Iterator<Prediction> it = recognize.iterator();
        while (it.hasNext()) {
            d = Math.min(it.next().score, d);
        }
        return d >= 2.35d;
    }

    public boolean m28020a(Gesture gesture, boolean z, AbstractC4396a aVar) {
        if (z) {
            GestureStore gestureStore = this.f14566d;
            return gestureStore != null && m28017d(gestureStore, gesture);
        }
        m28018c();
        if (this.f14565c) {
            return m28017d(this.f14563a, gesture);
        }
        if (aVar != null) {
            aVar.mo28014A5();
        }
        return false;
    }

    public final File m28019b() {
        String str;
        String path = C1379j0.m37318n().getFilesDir().getPath();
        if (path.charAt(path.length() - 1) == '/') {
            str = path + "int/temp.g";
        } else {
            str = path + "/int/temp.g";
        }
        if (!C5070i.m24062i(this.f14564b)) {
            str = str + "." + this.f14564b;
        }
        File file = new File(str);
        File parentFile = file.getParentFile();
        if (parentFile.exists() || parentFile.mkdirs()) {
            return file;
        }
        return null;
    }

    public final void m28018c() {
        File b;
        if (!this.f14565c && (b = m28019b()) != null && b.exists()) {
            try {
                this.f14563a.load(new FileInputStream(b), true);
                this.f14565c = true;
            } catch (Throwable th) {
                Log.m14725e("Cannot load gesture", th, new Object[0]);
            }
        }
    }

    public boolean m28016e(Gesture gesture) {
        File b = m28019b();
        if (b != null) {
            try {
                if (b.exists()) {
                    b.delete();
                }
                b.createNewFile();
                this.f14563a.removeEntry("main");
                this.f14563a.addGesture("main", gesture);
                Gesture gesture2 = this.f14567e;
                if (gesture2 != null) {
                    this.f14563a.addGesture("main", gesture2);
                }
                this.f14563a.save(new FileOutputStream(b), true);
                return true;
            } catch (FileNotFoundException e) {
                Log.m14710w("File not found", e, new Object[0]);
            } catch (IOException e2) {
                Log.m14710w("IO Exception", e2, new Object[0]);
            }
        }
        return false;
    }

    public void m28015f(Gesture gesture) {
        GestureStore gestureStore = this.f14566d;
        if (gestureStore == null) {
            GestureStore gestureStore2 = new GestureStore();
            this.f14566d = gestureStore2;
            gestureStore2.setOrientationStyle(2);
            this.f14566d.setSequenceType(2);
        } else {
            gestureStore.removeEntry("main");
        }
        this.f14566d.addGesture("main", gesture);
        this.f14567e = gesture;
    }
}
