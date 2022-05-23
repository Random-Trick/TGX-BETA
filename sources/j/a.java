package j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import d.b;
import d.d;
import d.j;

public class a {
    public Context f14918a;

    public a(Context context) {
        this.f14918a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f14918a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f14918a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f14918a.getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        int i11 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i10 > 600) {
            return 5;
        }
        if (i10 > 960 && i11 > 720) {
            return 5;
        }
        if (i10 > 720 && i11 > 960) {
            return 5;
        }
        if (i10 >= 500) {
            return 4;
        }
        if (i10 > 640 && i11 > 480) {
            return 4;
        }
        if (i10 <= 480 || i11 <= 640) {
            return i10 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int e() {
        return this.f14918a.getResources().getDimensionPixelSize(d.b_res_0x7f05000a);
    }

    public int f() {
        TypedArray obtainStyledAttributes = this.f14918a.obtainStyledAttributes(null, j.f5969a, d.a.c_res_0x7f020005, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j.f6015j, 0);
        Resources resources = this.f14918a.getResources();
        if (!g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(d.a_res_0x7f050009));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean g() {
        return this.f14918a.getResources().getBoolean(b.a_res_0x7f030000);
    }

    public boolean h() {
        return true;
    }
}
