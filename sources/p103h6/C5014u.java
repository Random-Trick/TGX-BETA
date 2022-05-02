package p103h6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import p118i5.C5222f;
import p118i5.C5223g;
import p119i6.C5245f;
import p163l5.C6378r;
import p272t5.BinderC8986d;

public final class C5014u {
    public static final String f16932a = "u";
    @SuppressLint({"StaticFieldLeak"})
    public static Context f16933b;
    public static AbstractC5016w f16934c;

    public static AbstractC5016w m24315a(Context context) {
        AbstractC5016w wVar;
        C6378r.m20506k(context);
        AbstractC5016w wVar2 = f16934c;
        if (wVar2 != null) {
            return wVar2;
        }
        int f = C5223g.m23578f(context, 13400000);
        if (f == 0) {
            Log.i(f16932a, "Making Creator dynamically");
            try {
                IBinder iBinder = (IBinder) m24313c(((ClassLoader) C6378r.m20506k(m24314b(context).getClassLoader())).loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
                if (iBinder == null) {
                    wVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                    if (queryLocalInterface instanceof AbstractC5016w) {
                        wVar = (AbstractC5016w) queryLocalInterface;
                    } else {
                        wVar = new C5015v(iBinder);
                    }
                }
                f16934c = wVar;
                try {
                    wVar.mo24311a1(BinderC8986d.m10764E0(m24314b(context).getResources()), C5223g.f17371d);
                    return f16934c;
                } catch (RemoteException e) {
                    throw new C5245f(e);
                }
            } catch (ClassNotFoundException unused) {
                throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
            }
        } else {
            throw new C5222f(f);
        }
    }

    public static Context m24314b(Context context) {
        Context context2;
        Context context3 = f16933b;
        if (context3 != null) {
            return context3;
        }
        try {
            context2 = DynamiteModule.m30364d(context, DynamiteModule.f11601b, "com.google.android.gms.maps_dynamite").m30366b();
        } catch (Exception e) {
            Log.e(f16932a, "Failed to load maps module, use legacy", e);
            context2 = C5223g.m23580d(context);
        }
        f16933b = context2;
        return context2;
    }

    public static <T> T m24313c(Class cls) {
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
