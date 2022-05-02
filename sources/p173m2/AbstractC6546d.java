package p173m2;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p071f2.AbstractC4234j;
import p145k2.AbstractC6041a;
import p243r2.AbstractC8354a;

public abstract class AbstractC6546d<T> {
    public static final String f20377f = AbstractC4234j.m28360f("ConstraintTracker");
    public final AbstractC8354a f20378a;
    public final Context f20379b;
    public final Object f20380c = new Object();
    public final Set<AbstractC6041a<T>> f20381d = new LinkedHashSet();
    public T f20382e;

    public class RunnableC6547a implements Runnable {
        public final List f20383a;

        public RunnableC6547a(List list) {
            this.f20383a = list;
        }

        @Override
        public void run() {
            for (AbstractC6041a aVar : this.f20383a) {
                aVar.mo20703a(AbstractC6546d.this.f20382e);
            }
        }
    }

    public AbstractC6546d(Context context, AbstractC8354a aVar) {
        this.f20379b = context.getApplicationContext();
        this.f20378a = aVar;
    }

    public void m20135a(AbstractC6041a<T> aVar) {
        synchronized (this.f20380c) {
            if (this.f20381d.add(aVar)) {
                if (this.f20381d.size() == 1) {
                    this.f20382e = mo20126b();
                    AbstractC4234j.m28362c().mo28359a(f20377f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f20382e), new Throwable[0]);
                    mo20132e();
                }
                aVar.mo20703a(this.f20382e);
            }
        }
    }

    public abstract T mo20126b();

    public void m20134c(AbstractC6041a<T> aVar) {
        synchronized (this.f20380c) {
            if (this.f20381d.remove(aVar) && this.f20381d.isEmpty()) {
                mo20131f();
            }
        }
    }

    public void m20133d(T t) {
        synchronized (this.f20380c) {
            T t2 = this.f20382e;
            if (t2 != t && (t2 == null || !t2.equals(t))) {
                this.f20382e = t;
                this.f20378a.mo12683a().execute(new RunnableC6547a(new ArrayList(this.f20381d)));
            }
        }
    }

    public abstract void mo20132e();

    public abstract void mo20131f();
}
