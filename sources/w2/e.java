package w2;

import android.annotation.SuppressLint;
import android.os.Build;
import w2.c;

public final class e implements c.b {
    @Override
    public String a(String str) {
        return (!str.startsWith("lib") || !str.endsWith(".so")) ? System.mapLibraryName(str) : str;
    }

    @Override
    public void b(String str) {
        System.loadLibrary(str);
    }

    @Override
    public String c(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override
    public String[] d() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !f.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override
    @SuppressLint({"UnsafeDynamicallyLoadedCode"})
    public void e(String str) {
        System.load(str);
    }
}
