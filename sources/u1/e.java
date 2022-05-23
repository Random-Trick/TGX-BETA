package u1;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
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
import x1.c;
import x1.f;

public abstract class e {
    @Deprecated
    public volatile x1.b f23481a;
    public Executor f23482b;
    public Executor f23483c;
    public x1.c f23484d;
    public boolean f23486f;
    public boolean f23487g;
    @Deprecated
    public List<b> f23488h;
    public final ReentrantReadWriteLock f23489i = new ReentrantReadWriteLock();
    public final ThreadLocal<Integer> f23490j = new ThreadLocal<>();
    public final Map<String, Object> f23491k = new ConcurrentHashMap();
    public final androidx.room.c f23485e = e();

    public static class a<T extends e> {
        public final Class<T> f23492a;
        public final String f23493b;
        public final Context f23494c;
        public ArrayList<b> f23495d;
        public Executor f23496e;
        public Executor f23497f;
        public c.AbstractC0241c f23498g;
        public boolean f23499h;
        public boolean f23501j;
        public boolean f23503l;
        public Set<Integer> f23505n;
        public Set<Integer> f23506o;
        public String f23507p;
        public File f23508q;
        public c f23500i = c.AUTOMATIC;
        public boolean f23502k = true;
        public final d f23504m = new d();

        public a(Context context, Class<T> cls, String str) {
            this.f23494c = context;
            this.f23492a = cls;
            this.f23493b = str;
        }

        public a<T> a(b bVar) {
            if (this.f23495d == null) {
                this.f23495d = new ArrayList<>();
            }
            this.f23495d.add(bVar);
            return this;
        }

        public a<T> b(v1.a... aVarArr) {
            if (this.f23506o == null) {
                this.f23506o = new HashSet();
            }
            for (v1.a aVar : aVarArr) {
                this.f23506o.add(Integer.valueOf(aVar.f24677a));
                this.f23506o.add(Integer.valueOf(aVar.f24678b));
            }
            this.f23504m.b(aVarArr);
            return this;
        }

        public a<T> c() {
            this.f23499h = true;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public T d() {
            Executor executor;
            if (this.f23494c == null) {
                throw new IllegalArgumentException("Cannot provide null context for the database.");
            } else if (this.f23492a != null) {
                Executor executor2 = this.f23496e;
                if (executor2 == null && this.f23497f == null) {
                    Executor e10 = l.a.e();
                    this.f23497f = e10;
                    this.f23496e = e10;
                } else if (executor2 != null && this.f23497f == null) {
                    this.f23497f = executor2;
                } else if (executor2 == null && (executor = this.f23497f) != null) {
                    this.f23496e = executor;
                }
                Set<Integer> set = this.f23506o;
                if (!(set == null || this.f23505n == null)) {
                    for (Integer num : set) {
                        if (this.f23505n.contains(num)) {
                            throw new IllegalArgumentException("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + num);
                        }
                    }
                }
                if (this.f23498g == null) {
                    this.f23498g = new y1.c();
                }
                String str = this.f23507p;
                if (!(str == null && this.f23508q == null)) {
                    if (this.f23493b == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    } else if (str == null || this.f23508q == null) {
                        this.f23498g = new j(str, this.f23508q, this.f23498g);
                    } else {
                        throw new IllegalArgumentException("Both createFromAsset() and createFromFile() was called on this Builder but the database can only be created using one of the two configurations.");
                    }
                }
                Context context = this.f23494c;
                u1.a aVar = new u1.a(context, this.f23493b, this.f23498g, this.f23504m, this.f23495d, this.f23499h, this.f23500i.b(context), this.f23496e, this.f23497f, this.f23501j, this.f23502k, this.f23503l, this.f23505n, this.f23507p, this.f23508q);
                T t10 = (T) u1.d.b(this.f23492a, "_Impl");
                t10.n(aVar);
                return t10;
            } else {
                throw new IllegalArgumentException("Must provide an abstract class that extends RoomDatabase");
            }
        }

        public a<T> e() {
            this.f23502k = false;
            this.f23503l = true;
            return this;
        }

        public a<T> f(c.AbstractC0241c cVar) {
            this.f23498g = cVar;
            return this;
        }

        public a<T> g(Executor executor) {
            this.f23496e = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(x1.b bVar) {
        }

        public void b(x1.b bVar) {
        }

        public void c(x1.b bVar) {
        }
    }

    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        public static boolean a(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        @SuppressLint({"NewApi"})
        public c b(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || a(activityManager)) {
                return TRUNCATE;
            }
            return WRITE_AHEAD_LOGGING;
        }
    }

    public static class d {
        public HashMap<Integer, TreeMap<Integer, v1.a>> f23512a = new HashMap<>();

        public final void a(v1.a aVar) {
            int i10 = aVar.f24677a;
            int i11 = aVar.f24678b;
            TreeMap<Integer, v1.a> treeMap = this.f23512a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                this.f23512a.put(Integer.valueOf(i10), treeMap);
            }
            v1.a aVar2 = treeMap.get(Integer.valueOf(i11));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i11), aVar);
        }

        public void b(v1.a... aVarArr) {
            for (v1.a aVar : aVarArr) {
                a(aVar);
            }
        }

        public List<v1.a> c(int i10, int i11) {
            if (i10 == i11) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i11 > i10, i10, i11);
        }

        public final java.util.List<v1.a> d(java.util.List<v1.a> r7, boolean r8, int r9, int r10) {
            throw new UnsupportedOperationException("Method not decompiled: u1.e.d.d(java.util.List, boolean, int, int):java.util.List");
        }
    }

    public static boolean p() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f23486f && p()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!m() && this.f23490j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    public void c() {
        a();
        x1.b R = this.f23484d.R();
        this.f23485e.o(R);
        R.e();
    }

    public f d(String str) {
        a();
        b();
        return this.f23484d.R().u(str);
    }

    public abstract androidx.room.c e();

    public abstract x1.c f(u1.a aVar);

    @Deprecated
    public void g() {
        this.f23484d.R().W();
        if (!m()) {
            this.f23485e.h();
        }
    }

    public Lock h() {
        return this.f23489i.readLock();
    }

    public androidx.room.c i() {
        return this.f23485e;
    }

    public x1.c j() {
        return this.f23484d;
    }

    public Executor k() {
        return this.f23482b;
    }

    public Executor l() {
        return this.f23483c;
    }

    public boolean m() {
        return this.f23484d.R().j0();
    }

    public void n(u1.a aVar) {
        x1.c f10 = f(aVar);
        this.f23484d = f10;
        if (f10 instanceof i) {
            ((i) f10).s(aVar);
        }
        boolean z10 = aVar.f23470g == c.WRITE_AHEAD_LOGGING;
        this.f23484d.setWriteAheadLoggingEnabled(z10);
        this.f23488h = aVar.f23468e;
        this.f23482b = aVar.f23471h;
        this.f23483c = new l(aVar.f23472i);
        this.f23486f = aVar.f23469f;
        this.f23487g = z10;
        if (aVar.f23473j) {
            this.f23485e.k(aVar.f23465b, aVar.f23466c);
        }
    }

    public void o(x1.b bVar) {
        this.f23485e.f(bVar);
    }

    public boolean q() {
        x1.b bVar = this.f23481a;
        return bVar != null && bVar.isOpen();
    }

    public Cursor r(x1.e eVar) {
        return s(eVar, null);
    }

    public Cursor s(x1.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal != null) {
            return this.f23484d.R().d(eVar, cancellationSignal);
        }
        return this.f23484d.R().p0(eVar);
    }

    @Deprecated
    public void t() {
        this.f23484d.R().L();
    }
}
