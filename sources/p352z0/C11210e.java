package p352z0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p016b1.AbstractC1125a;
import p143k0.C6036f;
import p143k0.C6037g;
import p267t0.C8934d;
import p352z0.C11216f;

public class C11210e {
    public static final C6036f<String, Typeface> f35909a = new C6036f<>(16);
    public static final ExecutorService f35910b = C11220g.m1193a("fonts-androidx", 10, 10000);
    public static final Object f35911c = new Object();
    public static final C6037g<String, ArrayList<AbstractC1125a<C11215e>>> f35912d = new C6037g<>();

    public class CallableC11211a implements Callable<C11215e> {
        public final String f35913a;
        public final Context f35914b;
        public final C11209d f35915c;
        public final int f35916d;

        public CallableC11211a(String str, Context context, C11209d dVar, int i) {
            this.f35913a = str;
            this.f35914b = context;
            this.f35915c = dVar;
            this.f35916d = i;
        }

        public C11215e call() {
            return C11210e.m1214c(this.f35913a, this.f35914b, this.f35915c, this.f35916d);
        }
    }

    public class C11212b implements AbstractC1125a<C11215e> {
        public final C11203a f35917a;

        public C11212b(C11203a aVar) {
            this.f35917a = aVar;
        }

        public void mo1208a(C11215e eVar) {
            if (eVar == null) {
                eVar = new C11215e(-3);
            }
            this.f35917a.m1233b(eVar);
        }
    }

    public class CallableC11213c implements Callable<C11215e> {
        public final String f35918a;
        public final Context f35919b;
        public final C11209d f35920c;
        public final int f35921d;

        public CallableC11213c(String str, Context context, C11209d dVar, int i) {
            this.f35918a = str;
            this.f35919b = context;
            this.f35920c = dVar;
            this.f35921d = i;
        }

        public C11215e call() {
            try {
                return C11210e.m1214c(this.f35918a, this.f35919b, this.f35920c, this.f35921d);
            } catch (Throwable unused) {
                return new C11215e(-3);
            }
        }
    }

    public class C11214d implements AbstractC1125a<C11215e> {
        public final String f35922a;

        public C11214d(String str) {
            this.f35922a = str;
        }

        public void mo1208a(C11215e eVar) {
            synchronized (C11210e.f35911c) {
                C6037g<String, ArrayList<AbstractC1125a<C11215e>>> gVar = C11210e.f35912d;
                ArrayList<AbstractC1125a<C11215e>> arrayList = gVar.get(this.f35922a);
                if (arrayList != null) {
                    gVar.remove(this.f35922a);
                    for (int i = 0; i < arrayList.size(); i++) {
                        arrayList.get(i).mo1208a(eVar);
                    }
                }
            }
        }
    }

    public static String m1216a(C11209d dVar, int i) {
        return dVar.m1220d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    public static int m1215b(C11216f.C11217a aVar) {
        int i = 1;
        if (aVar.m1202c() != 0) {
            return aVar.m1202c() != 1 ? -3 : -2;
        }
        C11216f.C11218b[] b = aVar.m1203b();
        if (!(b == null || b.length == 0)) {
            i = 0;
            for (C11216f.C11218b bVar : b) {
                int b2 = bVar.m1200b();
                if (b2 != 0) {
                    if (b2 < 0) {
                        return -3;
                    } else {
                        return b2;
                    }
                }
            }
        }
        return i;
    }

    public static C11215e m1214c(String str, Context context, C11209d dVar, int i) {
        C6036f<String, Typeface> fVar = f35909a;
        Typeface c = fVar.m21493c(str);
        if (c != null) {
            return new C11215e(c);
        }
        try {
            C11216f.C11217a d = C11207c.m1227d(context, dVar, null);
            int b = m1215b(d);
            if (b != 0) {
                return new C11215e(b);
            }
            Typeface b2 = C8934d.m10910b(context, null, d.m1203b(), i);
            if (b2 == null) {
                return new C11215e(-3);
            }
            fVar.m21492d(str, b2);
            return new C11215e(b2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C11215e(-1);
        }
    }

    public static Typeface m1213d(Context context, C11209d dVar, int i, Executor executor, C11203a aVar) {
        String a = m1216a(dVar, i);
        Typeface c = f35909a.m21493c(a);
        if (c != null) {
            aVar.m1233b(new C11215e(c));
            return c;
        }
        C11212b bVar = new C11212b(aVar);
        synchronized (f35911c) {
            C6037g<String, ArrayList<AbstractC1125a<C11215e>>> gVar = f35912d;
            ArrayList<AbstractC1125a<C11215e>> arrayList = gVar.get(a);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<AbstractC1125a<C11215e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            gVar.put(a, arrayList2);
            CallableC11213c cVar = new CallableC11213c(a, context, dVar, i);
            if (executor == null) {
                executor = f35910b;
            }
            C11220g.m1192b(executor, cVar, new C11214d(a));
            return null;
        }
    }

    public static Typeface m1212e(Context context, C11209d dVar, C11203a aVar, int i, int i2) {
        String a = m1216a(dVar, i);
        Typeface c = f35909a.m21493c(a);
        if (c != null) {
            aVar.m1233b(new C11215e(c));
            return c;
        } else if (i2 == -1) {
            C11215e c2 = m1214c(a, context, dVar, i);
            aVar.m1233b(c2);
            return c2.f35923a;
        } else {
            try {
                C11215e eVar = (C11215e) C11220g.m1191c(f35910b, new CallableC11211a(a, context, dVar, i), i2);
                aVar.m1233b(eVar);
                return eVar.f35923a;
            } catch (InterruptedException unused) {
                aVar.m1233b(new C11215e(-3));
                return null;
            }
        }
    }

    public static final class C11215e {
        public final Typeface f35923a;
        public final int f35924b;

        public C11215e(int i) {
            this.f35923a = null;
            this.f35924b = i;
        }

        @SuppressLint({"WrongConstant"})
        public boolean m1206a() {
            return this.f35924b == 0;
        }

        @SuppressLint({"WrongConstant"})
        public C11215e(Typeface typeface) {
            this.f35923a = typeface;
            this.f35924b = 0;
        }
    }
}
