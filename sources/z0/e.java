package z0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k0.f;
import k0.g;
import z0.f;

public class e {
    public static final f<String, Typeface> f26780a = new f<>(16);
    public static final ExecutorService f26781b = g.a("fonts-androidx", 10, 10000);
    public static final Object f26782c = new Object();
    public static final g<String, ArrayList<b1.a<C0256e>>> f26783d = new g<>();

    public class a implements Callable<C0256e> {
        public final String f26784a;
        public final Context f26785b;
        public final z0.d f26786c;
        public final int f26787d;

        public a(String str, Context context, z0.d dVar, int i10) {
            this.f26784a = str;
            this.f26785b = context;
            this.f26786c = dVar;
            this.f26787d = i10;
        }

        public C0256e call() {
            return e.c(this.f26784a, this.f26785b, this.f26786c, this.f26787d);
        }
    }

    public class b implements b1.a<C0256e> {
        public final z0.a f26788a;

        public b(z0.a aVar) {
            this.f26788a = aVar;
        }

        public void a(C0256e eVar) {
            if (eVar == null) {
                eVar = new C0256e(-3);
            }
            this.f26788a.b(eVar);
        }
    }

    public class c implements Callable<C0256e> {
        public final String f26789a;
        public final Context f26790b;
        public final z0.d f26791c;
        public final int f26792d;

        public c(String str, Context context, z0.d dVar, int i10) {
            this.f26789a = str;
            this.f26790b = context;
            this.f26791c = dVar;
            this.f26792d = i10;
        }

        public C0256e call() {
            try {
                return e.c(this.f26789a, this.f26790b, this.f26791c, this.f26792d);
            } catch (Throwable unused) {
                return new C0256e(-3);
            }
        }
    }

    public class d implements b1.a<C0256e> {
        public final String f26793a;

        public d(String str) {
            this.f26793a = str;
        }

        public void a(C0256e eVar) {
            synchronized (e.f26782c) {
                g<String, ArrayList<b1.a<C0256e>>> gVar = e.f26783d;
                ArrayList<b1.a<C0256e>> arrayList = gVar.get(this.f26793a);
                if (arrayList != null) {
                    gVar.remove(this.f26793a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        arrayList.get(i10).a(eVar);
                    }
                }
            }
        }
    }

    public static String a(z0.d dVar, int i10) {
        return dVar.d() + "-" + i10;
    }

    @SuppressLint({"WrongConstant"})
    public static int b(f.a aVar) {
        int i10 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        f.b[] b10 = aVar.b();
        if (!(b10 == null || b10.length == 0)) {
            i10 = 0;
            for (f.b bVar : b10) {
                int b11 = bVar.b();
                if (b11 != 0) {
                    if (b11 < 0) {
                        return -3;
                    } else {
                        return b11;
                    }
                }
            }
        }
        return i10;
    }

    public static C0256e c(String str, Context context, z0.d dVar, int i10) {
        k0.f<String, Typeface> fVar = f26780a;
        Typeface c10 = fVar.c(str);
        if (c10 != null) {
            return new C0256e(c10);
        }
        try {
            f.a d10 = z0.c.d(context, dVar, null);
            int b10 = b(d10);
            if (b10 != 0) {
                return new C0256e(b10);
            }
            Typeface b11 = t0.d.b(context, null, d10.b(), i10);
            if (b11 == null) {
                return new C0256e(-3);
            }
            fVar.d(str, b11);
            return new C0256e(b11);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0256e(-1);
        }
    }

    public static Typeface d(Context context, z0.d dVar, int i10, Executor executor, z0.a aVar) {
        String a10 = a(dVar, i10);
        Typeface c10 = f26780a.c(a10);
        if (c10 != null) {
            aVar.b(new C0256e(c10));
            return c10;
        }
        b bVar = new b(aVar);
        synchronized (f26782c) {
            g<String, ArrayList<b1.a<C0256e>>> gVar = f26783d;
            ArrayList<b1.a<C0256e>> arrayList = gVar.get(a10);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<b1.a<C0256e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            gVar.put(a10, arrayList2);
            c cVar = new c(a10, context, dVar, i10);
            if (executor == null) {
                executor = f26781b;
            }
            g.b(executor, cVar, new d(a10));
            return null;
        }
    }

    public static Typeface e(Context context, z0.d dVar, z0.a aVar, int i10, int i11) {
        String a10 = a(dVar, i10);
        Typeface c10 = f26780a.c(a10);
        if (c10 != null) {
            aVar.b(new C0256e(c10));
            return c10;
        } else if (i11 == -1) {
            C0256e c11 = c(a10, context, dVar, i10);
            aVar.b(c11);
            return c11.f26794a;
        } else {
            try {
                C0256e eVar = (C0256e) g.c(f26781b, new a(a10, context, dVar, i10), i11);
                aVar.b(eVar);
                return eVar.f26794a;
            } catch (InterruptedException unused) {
                aVar.b(new C0256e(-3));
                return null;
            }
        }
    }

    public static final class C0256e {
        public final Typeface f26794a;
        public final int f26795b;

        public C0256e(int i10) {
            this.f26794a = null;
            this.f26795b = i10;
        }

        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.f26795b == 0;
        }

        @SuppressLint({"WrongConstant"})
        public C0256e(Typeface typeface) {
            this.f26794a = typeface;
            this.f26795b = 0;
        }
    }
}
