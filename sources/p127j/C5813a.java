package p127j;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ViewConfiguration;
import p039d.C3554a;
import p039d.C3555b;
import p039d.C3557d;
import p039d.C3563j;

public class C5813a {
    public Context f18532a;

    public C5813a(Context context) {
        this.f18532a = context;
    }

    public static C5813a m22119b(Context context) {
        return new C5813a(context);
    }

    public boolean m22120a() {
        return this.f18532a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int m22118c() {
        return this.f18532a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int m22117d() {
        Configuration configuration = this.f18532a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int m22116e() {
        return this.f18532a.getResources().getDimensionPixelSize(C3557d.b_res_0x7f05000a);
    }

    public int m22115f() {
        TypedArray obtainStyledAttributes = this.f18532a.obtainStyledAttributes(null, C3563j.f12031a, C3554a.c_res_0x7f020005, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(C3563j.f12077j, 0);
        Resources resources = this.f18532a.getResources();
        if (!m22114g()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(C3557d.a_res_0x7f050009));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public boolean m22114g() {
        return this.f18532a.getResources().getBoolean(C3555b.a_res_0x7f030000);
    }

    public boolean m22113h() {
        if (Build.VERSION.SDK_INT >= 19) {
            return true;
        }
        return !ViewConfiguration.get(this.f18532a).hasPermanentMenuKey();
    }
}
