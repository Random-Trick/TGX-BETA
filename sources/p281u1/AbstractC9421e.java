package p281u1;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.room.C0999c;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p126j$.util.concurrent.ConcurrentHashMap;
import p157l.C6269a;
import p295v1.AbstractC9832a;
import p323x1.AbstractC10066b;
import p323x1.AbstractC10067c;
import p323x1.AbstractC10073e;
import p323x1.AbstractC10074f;
import p338y1.C10348c;

public abstract class AbstractC9421e {
    @Deprecated
    public volatile AbstractC10066b f30493a;
    public Executor f30494b;
    public Executor f30495c;
    public AbstractC10067c f30496d;
    public boolean f30498f;
    public boolean f30499g;
    @Deprecated
    public List<AbstractC9423b> f30500h;
    public final ReentrantReadWriteLock f30501i = new ReentrantReadWriteLock();
    public final ThreadLocal<Integer> f30502j = new ThreadLocal<>();
    public final Map<String, Object> f30503k = new ConcurrentHashMap();
    public final C0999c f30497e = mo8729e();

    public static class C9422a<T extends AbstractC9421e> {
        public final Class<T> f30504a;
        public final String f30505b;
        public final Context f30506c;
        public ArrayList<AbstractC9423b> f30507d;
        public Executor f30508e;
        public Executor f30509f;
        public AbstractC10067c.AbstractC10071c f30510g;
        public boolean f30511h;
        public boolean f30513j;
        public boolean f30515l;
        public Set<Integer> f30517n;
        public Set<Integer> f30518o;
        public String f30519p;
        public File f30520q;
        public EnumC9424c f30512i = EnumC9424c.AUTOMATIC;
        public boolean f30514k = true;
        public final C9425d f30516m = new C9425d();

        public C9422a(Context context, Class<T> cls, String str) {
            this.f30506c = context;
            this.f30504a = cls;
            this.f30505b = str;
        }

        public C9422a<T> m8713a(AbstractC9423b bVar) {
            if (this.f30507d == null) {
                this.f30507d = new ArrayList<>();
            }
            this.f30507d.add(bVar);
            return this;
        }

        public C9422a<T> m8712b(AbstractC9832a... aVarArr) {
            if (this.f30518o == null) {
                this.f30518o = new HashSet();
            }
            for (AbstractC9832a aVar : aVarArr) {
                this.f30518o.add(Integer.valueOf(aVar.f32092a));
                this.f30518o.add(Integer.valueOf(aVar.f32093b));
            }
            this.f30516m.m8700b(aVarArr);
            return this;
        }

        public C9422a<T> m8711c() {
            this.f30511h = true;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public T m8710d() {
            Executor executor;
            if (this.f30506c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f30504a != null) {
                Executor executor2 = this.f30508e;
                if (executor2 == null && this.f30509f == null) {
                    Executor e = C6269a.m20748e();
                    this.f30509f = e;
                    this.f30508e = e;
                } else if (executor2 != null && this.f30509f == null) {
                    this.f30509f = executor2;
                } else if (executor2 == null && (executor = this.f30509f) != null) {
                    this.f30508e = executor;
                }
                Set<Integer> set = this.f30518o;
                if (!(set == null || this.f30517n == null)) {
                    for (Integer num : set) {
                        if (this.f30517n.contains(num)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                        }
                    }
                }
                if (this.f30510g == null) {
                    this.f30510g = new C10348c();
                }
                String str = this.f30519p;
                if (!(str == null && this.f30520q == null)) {
                    if (this.f30505b == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    } else if (str == null || this.f30520q == null) {
                        this.f30510g = new C9432j(str, this.f30520q, this.f30510g);
                    } else {
                        throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                    }
                }
                Context context = this.f30506c;
                C9417a aVar = new C9417a(context, this.f30505b, this.f30510g, this.f30516m, this.f30507d, this.f30511h, this.f30512i.m8702b(context), this.f30508e, this.f30509f, this.f30513j, this.f30514k, this.f30515l, this.f30517n, this.f30519p, this.f30520q);
                T t = (T) C9420d.m8735b(this.f30504a, "_Impl");
                t.m8720n(aVar);
                return t;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        public C9422a<T> m8709e() {
            this.f30514k = false;
            this.f30515l = true;
            return this;
        }

        public C9422a<T> m8708f(AbstractC10067c.AbstractC10071c cVar) {
            this.f30510g = cVar;
            return this;
        }

        public C9422a<T> m8707g(Executor executor) {
            this.f30508e = executor;
            return this;
        }
    }

    public static abstract class AbstractC9423b {
        public void m8706a(AbstractC10066b bVar) {
        }

        public void m8705b(AbstractC10066b bVar) {
        }

        public void mo8704c(AbstractC10066b bVar) {
        }
    }

    public enum EnumC9424c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public static boolean m8703a(ActivityManager activityManager) {
            if (Build.VERSION.SDK_INT >= 19) {
                return activityManager.isLowRamDevice();
            }
            return false;
        }

        @SuppressLint({"NewApi"})
        public EnumC9424c m8702b(Context context) {
            ActivityManager activityManager;
            if (this != AUTOMATIC) {
                return this;
            }
            if (Build.VERSION.SDK_INT < 16 || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || m8703a(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }
    }

    public static class C9425d {
        public HashMap<Integer, TreeMap<Integer, AbstractC9832a>> f30525a = new HashMap<>();

        public final void m8701a(AbstractC9832a aVar) {
            int i = aVar.f32092a;
            int i2 = aVar.f32093b;
            TreeMap<Integer, AbstractC9832a> treeMap = this.f30525a.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f30525a.put(Integer.valueOf(i), treeMap);
            }
            AbstractC9832a aVar2 = treeMap.get(Integer.valueOf(i2));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i2), aVar);
        }

        public void m8700b(AbstractC9832a... aVarArr) {
            for (AbstractC9832a aVar : aVarArr) {
                m8701a(aVar);
            }
        }

        public List<AbstractC9832a> m8699c(int i, int i2) {
            if (i == i2) {
                return Collections.emptyList();
            }
            return m8698d(new ArrayList(), i2 > i, i, i2);
        }

        public final java.util.List<p295v1.AbstractC9832a> m8698d(java.util.List<p295v1.AbstractC9832a> r7, boolean r8, int r9, int r10) {
            throw new UnsupportedOperationException("Method not decompiled: p281u1.AbstractC9421e.C9425d.m8698d(java.util.List, boolean, int, int):java.util.List");
        }
    }

    public static boolean m8718p() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void m8733a() {
        if (!this.f30498f && m8718p()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void m8732b() {
        if (!m8721m() && this.f30502j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void m8731c() {
        m8733a();
        AbstractC10066b Q = this.f30496d.mo5382Q();
        this.f30497e.m38656o(Q);
        Q.mo5390e();
    }

    public AbstractC10074f m8730d(String str) {
        m8733a();
        m8732b();
        return this.f30496d.mo5382Q().mo5383v(str);
    }

    public abstract C0999c mo8729e();

    public abstract AbstractC10067c mo8728f(C9417a aVar);

    @Deprecated
    public void m8727g() {
        this.f30496d.mo5382Q().mo5392V();
        if (!m8721m()) {
            this.f30497e.m38663h();
        }
    }

    public Lock m8726h() {
        return this.f30501i.readLock();
    }

    public C0999c m8725i() {
        return this.f30497e;
    }

    public AbstractC10067c m8724j() {
        return this.f30496d;
    }

    public Executor m8723k() {
        return this.f30494b;
    }

    public Executor m8722l() {
        return this.f30495c;
    }

    public boolean m8721m() {
        return this.f30496d.mo5382Q().mo5388i0();
    }

    public void m8720n(C9417a aVar) {
        AbstractC10067c f = mo8728f(aVar);
        this.f30496d = f;
        if (f instanceof C9431i) {
            ((C9431i) f).m8679t(aVar);
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 16) {
            if (aVar.f30482g == EnumC9424c.WRITE_AHEAD_LOGGING) {
                z = true;
            }
            this.f30496d.setWriteAheadLoggingEnabled(z);
        }
        this.f30500h = aVar.f30480e;
        this.f30494b = aVar.f30483h;
        this.f30495c = new ExecutorC9434l(aVar.f30484i);
        this.f30498f = aVar.f30481f;
        this.f30499g = z;
        if (aVar.f30485j) {
            this.f30497e.m38660k(aVar.f30477b, aVar.f30478c);
        }
    }

    public void m8719o(AbstractC10066b bVar) {
        this.f30497e.m38665f(bVar);
    }

    public boolean m8717q() {
        AbstractC10066b bVar = this.f30493a;
        return bVar != null && bVar.isOpen();
    }

    public Cursor m8716r(AbstractC10073e eVar) {
        return m8715s(eVar, null);
    }

    public Cursor m8715s(AbstractC10073e eVar, CancellationSignal cancellationSignal) {
        m8733a();
        m8732b();
        if (cancellationSignal == null || Build.VERSION.SDK_INT < 16) {
            return this.f30496d.mo5382Q().mo5384p0(eVar);
        }
        return this.f30496d.mo5382Q().mo5391d(eVar, cancellationSignal);
    }

    @Deprecated
    public void m8714t() {
        this.f30496d.mo5382Q().mo5395K();
    }
}
