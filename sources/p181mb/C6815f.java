package p181mb;

import android.os.Looper;
import java.util.HashMap;

public class C6815f<T> {
    public T f21349a;
    public HashMap<Looper, T> f21350b;
    public HashMap<Thread, T> f21351c;

    public T m18901a() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == Looper.getMainLooper()) {
            return this.f21349a;
        }
        T t = null;
        if (myLooper != null) {
            synchronized (this) {
                HashMap<Looper, T> hashMap = this.f21350b;
                if (hashMap != null) {
                    t = hashMap.get(myLooper);
                }
            }
            return t;
        }
        Thread currentThread = Thread.currentThread();
        synchronized (this) {
            HashMap<Thread, T> hashMap2 = this.f21351c;
            if (hashMap2 != null) {
                t = hashMap2.get(currentThread);
            }
        }
        return t;
    }

    public void m18900b(T t) {
        Looper myLooper = Looper.myLooper();
        if (myLooper == Looper.getMainLooper()) {
            this.f21349a = t;
        } else if (t == null) {
            if (myLooper != null) {
                synchronized (this) {
                    HashMap<Looper, T> hashMap = this.f21350b;
                    if (hashMap != null) {
                        hashMap.remove(myLooper);
                    }
                }
                return;
            }
            Thread currentThread = Thread.currentThread();
            synchronized (this) {
                HashMap<Thread, T> hashMap2 = this.f21351c;
                if (hashMap2 != null) {
                    hashMap2.remove(currentThread);
                }
            }
        } else if (myLooper != null) {
            synchronized (this) {
                if (this.f21350b == null) {
                    this.f21350b = new HashMap<>();
                }
                this.f21350b.put(myLooper, t);
            }
        } else {
            Thread currentThread2 = Thread.currentThread();
            synchronized (this) {
                if (this.f21351c == null) {
                    this.f21351c = new HashMap<>();
                }
                this.f21351c.put(currentThread2, t);
            }
        }
    }
}
