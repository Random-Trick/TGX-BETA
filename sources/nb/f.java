package nb;

import android.os.Looper;
import java.util.HashMap;

public class f<T> {
    public T f17826a;
    public HashMap<Looper, T> f17827b;
    public HashMap<Thread, T> f17828c;

    public T a() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == Looper.getMainLooper()) {
            return this.f17826a;
        }
        T t10 = null;
        if (myLooper != null) {
            synchronized (this) {
                HashMap<Looper, T> hashMap = this.f17827b;
                if (hashMap != null) {
                    t10 = hashMap.get(myLooper);
                }
            }
            return t10;
        }
        Thread currentThread = Thread.currentThread();
        synchronized (this) {
            HashMap<Thread, T> hashMap2 = this.f17828c;
            if (hashMap2 != null) {
                t10 = hashMap2.get(currentThread);
            }
        }
        return t10;
    }

    public void b(T t10) {
        Looper myLooper = Looper.myLooper();
        if (myLooper == Looper.getMainLooper()) {
            this.f17826a = t10;
        } else if (t10 == null) {
            if (myLooper != null) {
                synchronized (this) {
                    HashMap<Looper, T> hashMap = this.f17827b;
                    if (hashMap != null) {
                        hashMap.remove(myLooper);
                    }
                }
                return;
            }
            Thread currentThread = Thread.currentThread();
            synchronized (this) {
                HashMap<Thread, T> hashMap2 = this.f17828c;
                if (hashMap2 != null) {
                    hashMap2.remove(currentThread);
                }
            }
        } else if (myLooper != null) {
            synchronized (this) {
                if (this.f17827b == null) {
                    this.f17827b = new HashMap<>();
                }
                this.f17827b.put(myLooper, t10);
            }
        } else {
            Thread currentThread2 = Thread.currentThread();
            synchronized (this) {
                if (this.f17828c == null) {
                    this.f17828c = new HashMap<>();
                }
                this.f17828c.put(currentThread2, t10);
            }
        }
    }
}
