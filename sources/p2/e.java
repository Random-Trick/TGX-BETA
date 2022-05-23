package p2;

import android.content.ComponentName;
import android.content.Context;
import f2.j;

public class e {
    public static final String f20418a = j.f("PackageManagerHelper");

    public static void a(Context context, Class<?> cls, boolean z10) {
        String str = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            j c10 = j.c();
            String str2 = f20418a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z10 ? str : "disabled";
            c10.a(str2, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e10) {
            j c11 = j.c();
            String str3 = f20418a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z10) {
                str = "disabled";
            }
            objArr2[1] = str;
            c11.a(str3, String.format("%s could not be %s", objArr2), e10);
        }
    }
}
