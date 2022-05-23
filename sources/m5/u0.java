package m5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import u5.d;
import u5.f;

public final class u0 extends f<m0> {
    public static final u0 f17271c = new u0();

    public u0() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View c(Context context, int i10, int i11) {
        u0 u0Var = f17271c;
        try {
            s0 s0Var = new s0(1, i10, i11, null);
            return (View) d.t(u0Var.b(context).E1(d.x0(context), s0Var));
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("Could not get button with size ");
            sb2.append(i10);
            sb2.append(" and color ");
            sb2.append(i11);
            throw new f.a(sb2.toString(), e10);
        }
    }

    @Override
    public final m0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof m0 ? (m0) queryLocalInterface : new m0(iBinder);
    }
}
