package p163l5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import p272t5.AbstractC8988f;
import p272t5.BinderC8986d;

public final class C6388u0 extends AbstractC8988f<C6363m0> {
    public static final C6388u0 f20036c = new C6388u0();

    public C6388u0() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View m20485c(Context context, int i, int i2) {
        C6388u0 u0Var = f20036c;
        try {
            C6382s0 s0Var = new C6382s0(1, i, i2, null);
            return (View) BinderC8986d.m10763t(u0Var.m10761b(context).m20544G1(BinderC8986d.m10764E0(context), s0Var));
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("Could not get button with size ");
            sb2.append(i);
            sb2.append(" and color ");
            sb2.append(i2);
            throw new AbstractC8988f.C8989a(sb2.toString(), e);
        }
    }

    @Override
    public final C6363m0 mo10762a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof C6363m0 ? (C6363m0) queryLocalInterface : new C6363m0(iBinder);
    }
}
