package p267t0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import p126j$.util.concurrent.ConcurrentHashMap;
import p256s0.C8606e;
import p352z0.C11216f;

public class C8941j {
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, C8606e.C8608b> f28818a = new ConcurrentHashMap<>();

    public class C8942a implements AbstractC8944c<C11216f.C11218b> {
        public C8942a() {
        }

        public int mo10866a(C11216f.C11218b bVar) {
            return bVar.m1197e();
        }

        public boolean mo10865b(C11216f.C11218b bVar) {
            return bVar.m1196f();
        }
    }

    public class C8943b implements AbstractC8944c<C8606e.C8609c> {
        public C8943b() {
        }

        public int mo10866a(C8606e.C8609c cVar) {
            return cVar.m11934e();
        }

        public boolean mo10865b(C8606e.C8609c cVar) {
            return cVar.m11933f();
        }
    }

    public interface AbstractC8944c<T> {
        int mo10866a(T t);

        boolean mo10865b(T t);
    }

    public static <T> T m10874g(T[] tArr, int i, AbstractC8944c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo10866a(t2) - i2) * 2) + (cVar.mo10865b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    public static long m10871j(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    public final void m10880a(Typeface typeface, C8606e.C8608b bVar) {
        long j = m10871j(typeface);
        if (j != 0) {
            this.f28818a.put(Long.valueOf(j), bVar);
        }
    }

    public Typeface mo10879b(Context context, C8606e.C8608b bVar, Resources resources, int i) {
        C8606e.C8609c f = m10875f(bVar, i);
        if (f == null) {
            return null;
        }
        Typeface d = C8934d.m10908d(context, resources, f.m11937b(), f.m11938a(), i);
        m10880a(d, bVar);
        return d;
    }

    public Typeface mo10878c(Context context, CancellationSignal cancellationSignal, C11216f.C11218b[] bVarArr, int i) {
        InputStream inputStream;
        Throwable th;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo10873h(bVarArr, i).m1198d());
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Typeface d = mo10877d(context, inputStream);
            C8945k.m10864a(inputStream);
            return d;
        } catch (IOException unused2) {
            C8945k.m10864a(inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
            C8945k.m10864a(inputStream2);
            throw th;
        }
    }

    public Typeface mo10877d(Context context, InputStream inputStream) {
        File e = C8945k.m10860e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C8945k.m10861d(e, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(e.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    public Typeface mo10876e(Context context, Resources resources, int i, String str, int i2) {
        File e = C8945k.m10860e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C8945k.m10862c(e, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(e.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    public final C8606e.C8609c m10875f(C8606e.C8608b bVar, int i) {
        return (C8606e.C8609c) m10874g(bVar.m11939a(), i, new C8943b());
    }

    public C11216f.C11218b mo10873h(C11216f.C11218b[] bVarArr, int i) {
        return (C11216f.C11218b) m10874g(bVarArr, i, new C8942a());
    }

    public C8606e.C8608b m10872i(Typeface typeface) {
        long j = m10871j(typeface);
        if (j == 0) {
            return null;
        }
        return this.f28818a.get(Long.valueOf(j));
    }
}
