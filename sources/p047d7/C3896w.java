package p047d7;

import p178m7.AbstractC6794b;

public class C3896w<T> implements AbstractC6794b<T> {
    public static final Object f13174c = new Object();
    public volatile Object f13175a = f13174c;
    public volatile AbstractC6794b<T> f13176b;

    public C3896w(AbstractC6794b<T> bVar) {
        this.f13176b = bVar;
    }

    @Override
    public T get() {
        T t = (T) this.f13175a;
        Object obj = f13174c;
        if (t == obj) {
            synchronized (this) {
                t = this.f13175a;
                if (t == obj) {
                    t = this.f13176b.get();
                    this.f13175a = t;
                    this.f13176b = null;
                }
            }
        }
        return t;
    }
}
