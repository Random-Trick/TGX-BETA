package t0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.InputStream;
import s0.e;
import z0.f;

public class j {
    @SuppressLint({"BanConcurrentHashMap"})
    public ConcurrentHashMap<Long, e.b> f22861a = new ConcurrentHashMap<>();

    public class a implements b<f.b> {
        public a() {
        }

        public int a(f.b bVar) {
            return bVar.e();
        }

        public boolean b(f.b bVar) {
            return bVar.f();
        }
    }

    public interface b<T> {
        int a(T t10);

        boolean b(T t10);
    }

    public static <T> T e(T[] tArr, int i10, b<T> bVar) {
        int i11 = (i10 & 1) == 0 ? 400 : 700;
        boolean z10 = (i10 & 2) != 0;
        T t10 = null;
        int i12 = Integer.MAX_VALUE;
        for (T t11 : tArr) {
            int abs = (Math.abs(bVar.a(t11) - i11) * 2) + (bVar.b(t11) == z10 ? 0 : 1);
            if (t10 == null || i12 > abs) {
                t10 = t11;
                i12 = abs;
            }
        }
        return t10;
    }

    public Typeface a(Context context, e.b bVar, Resources resources, int i10) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, f.b[] bVarArr, int i10) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File e10 = k.e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (!k.d(e10, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(e10.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e10.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File e10 = k.e(context);
        if (e10 == null) {
            return null;
        }
        try {
            if (!k.c(e10, resources, i10)) {
                return null;
            }
            return Typeface.createFromFile(e10.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e10.delete();
        }
    }

    public f.b f(f.b[] bVarArr, int i10) {
        return (f.b) e(bVarArr, i10, new a());
    }
}
