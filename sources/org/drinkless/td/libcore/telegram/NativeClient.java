package org.drinkless.td.libcore.telegram;

import android.util.Log;
import org.drinkless.td.libcore.telegram.TdApi;

final class NativeClient {
    static {
        try {
            System.loadLibrary("tdjni");
            Log.w("DLTD", "TDJNI loaded");
        } catch (UnsatisfiedLinkError e10) {
            Log.w("DLTD", "Can't find tdjni", e10);
        }
    }

    public static native TdApi.Object clientExecute(TdApi.Object object);

    public static native int clientReceive(long j10, long[] jArr, TdApi.Object[] objectArr, double d10);

    public static native void clientSend(long j10, long j11, TdApi.Object object);

    public static native long createClient();

    public static native void destroyClient(long j10);

    public static native void ping(TdApi.Object object);

    public static native TdApi.Object pingPong(TdApi.Object object);

    public static native boolean setLogFilePath(String str);

    public static native void setLogMaxFileSize(long j10);

    public static native void setLogVerbosityLevel(int i10);
}
