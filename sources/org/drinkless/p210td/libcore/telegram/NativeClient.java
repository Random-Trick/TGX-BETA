package org.drinkless.p210td.libcore.telegram;

import android.util.Log;
import org.drinkless.p210td.libcore.telegram.TdApi;

final class NativeClient {
    static {
        try {
            System.loadLibrary("tdjni");
            Log.w("DLTD", "TDJNI loaded");
        } catch (UnsatisfiedLinkError e) {
            Log.w("DLTD", "Can't find tdjni", e);
        }
    }

    public static native TdApi.Object clientExecute(TdApi.Object object);

    public static native int clientReceive(long j, long[] jArr, TdApi.Object[] objectArr, double d);

    public static native void clientSend(long j, long j2, TdApi.Object object);

    public static native long createClient();

    public static native void destroyClient(long j);

    public static native void ping(TdApi.Object object);

    public static native TdApi.Object pingPong(TdApi.Object object);

    public static native boolean setLogFilePath(String str);

    public static native void setLogMaxFileSize(long j);

    public static native void setLogVerbosityLevel(int i);
}
