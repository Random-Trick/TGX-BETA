package p262s6;

import android.os.IBinder;
import android.os.IInterface;

public abstract class AbstractBinderC8661h0 extends BinderC8655e0 implements AbstractC8663i0 {
    public static AbstractC8663i0 m11799s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof AbstractC8663i0 ? (AbstractC8663i0) queryLocalInterface : new C8659g0(iBinder);
    }
}
