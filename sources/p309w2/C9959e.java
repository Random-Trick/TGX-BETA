package p309w2;

import android.annotation.SuppressLint;
import android.os.Build;
import p309w2.C9951c;

public final class C9959e implements C9951c.AbstractC9953b {
    @Override
    public String mo6418a(String str) {
        return (!str.startsWith("lib") || !str.endsWith(".so")) ? System.mapLibraryName(str) : str;
    }

    @Override
    public void mo6417b(String str) {
        System.loadLibrary(str);
    }

    @Override
    public String mo6416c(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override
    public String[] mo6415d() {
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr.length > 0) {
                return strArr;
            }
        }
        String str = Build.CPU_ABI2;
        return !C9960f.m6413a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override
    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public void mo6414e(String str) {
        System.load(str);
    }
}
