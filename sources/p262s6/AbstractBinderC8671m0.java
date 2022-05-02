package p262s6;

import android.os.IBinder;
import android.os.IInterface;

public abstract class AbstractBinderC8671m0 extends BinderC8655e0 implements AbstractC8673n0 {
    public static AbstractC8673n0 m11772s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        return queryLocalInterface instanceof AbstractC8673n0 ? (AbstractC8673n0) queryLocalInterface : new C8669l0(iBinder);
    }
}
