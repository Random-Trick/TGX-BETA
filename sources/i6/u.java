package i6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import j5.g;
import j6.f;
import m5.r;
import u5.d;

public final class u {
    public static final String f14043a = "u";
    @SuppressLint({"StaticFieldLeak"})
    public static Context f14044b;
    public static w f14045c;

    public static w a(Context context) {
        w wVar;
        r.k(context);
        w wVar2 = f14045c;
        if (wVar2 != null) {
            return wVar2;
        }
        int f10 = g.f(context, 13400000);
        if (f10 == 0) {
            Log.i(f14043a, "Making Creator dynamically");
            try {
                IBinder iBinder = (IBinder) c(((ClassLoader) r.k(b(context).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
                if (iBinder == null) {
                    wVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    if (queryLocalInterface instanceof w) {
                        wVar = (w) queryLocalInterface;
                    } else {
                        wVar = new v(iBinder);
                    }
                }
                f14045c = wVar;
                try {
                    wVar.U(d.x0(b(context).getResources()), g.f15077d);
                    return f14045c;
                } catch (RemoteException e10) {
                    throw new f(e10);
                }
            } catch (ClassNotFoundException unused) {
                throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
            }
        } else {
            throw new j5.f(f10);
        }
    }

    public static Context b(Context context) {
        Context context2;
        Context context3 = f14044b;
        if (context3 != null) {
            return context3;
        }
        try {
            context2 = DynamiteModule.d(context, DynamiteModule.f5655b, "com.google.android.gms.maps_dynamite").b();
        } catch (Exception e10) {
            Log.e(f14043a, "Failed to load maps module, use legacy", e10);
            context2 = g.d(context);
        }
        f14044b = context2;
        return context2;
    }

    public static <T> T c(Class cls) {
        try {
            return (T) cls.newInstance();
        } catch (IllegalAccessException unused) {
            String name = cls.getName();
            throw new IllegalStateException(name.length() != 0 ? "Unable to call the default constructor of ".concat(name) : new String("Unable to call the default constructor of "));
        } catch (InstantiationException unused2) {
            String name2 = cls.getName();
            throw new IllegalStateException(name2.length() != 0 ? "Unable to instantiate the dynamic class ".concat(name2) : new String("Unable to instantiate the dynamic class "));
        }
    }
}
