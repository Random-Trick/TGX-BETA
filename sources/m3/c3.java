package m3;

import android.annotation.SuppressLint;
import org.thunderdog.challegram.Log;

public final class c3 {
    public static int a(int i10) {
        return b(i10, 0, 0);
    }

    public static int b(int i10, int i11, int i12) {
        return c(i10, i11, i12, 0, Log.TAG_YOUTUBE);
    }

    @SuppressLint({"WrongConstant"})
    public static int c(int i10, int i11, int i12, int i13, int i14) {
        return i10 | i11 | i12 | i13 | i14;
    }

    @SuppressLint({"WrongConstant"})
    public static int d(int i10) {
        return i10 & Log.TAG_YOUTUBE;
    }

    @SuppressLint({"WrongConstant"})
    public static int e(int i10) {
        return i10 & 7;
    }

    @SuppressLint({"WrongConstant"})
    public static int f(int i10) {
        return i10 & 64;
    }

    @SuppressLint({"WrongConstant"})
    public static int g(int i10) {
        return i10 & 32;
    }
}
