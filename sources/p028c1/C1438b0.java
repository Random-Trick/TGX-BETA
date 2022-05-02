package p028c1;

import android.os.Build;
import android.view.ViewGroup;
import p196o0.C7524c;

public final class C1438b0 {
    public static int m36924a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return viewGroup.getLayoutMode();
        }
        return 0;
    }

    public static boolean m36923b(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C7524c.O_res_0x7f0704f2);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C1489y.m36768B(viewGroup) == null) ? false : true;
    }
}
