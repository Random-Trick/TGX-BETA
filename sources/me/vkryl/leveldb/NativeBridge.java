package me.vkryl.leveldb;

public class NativeBridge {
    public static native boolean dbAsBoolean(long j);

    public static native byte[] dbAsByteArray(long j);

    public static native double dbAsDouble(long j);

    public static native float dbAsFloat(long j);

    public static native int dbAsInt(long j);

    public static native long dbAsLong(long j);

    public static native long[] dbAsLongArray(long j);

    public static native String dbAsString(long j);

    public static native void dbBatchClear(long j, long j2);

    public static native long dbBatchCreate();

    public static native void dbBatchDestroy(long j);

    public static native boolean dbBatchPerform(long j, long j2);

    public static native boolean dbBatchRemove(long j, String str);

    public static native boolean dbClear(long j);

    public static native void dbClose(long j);

    public static native boolean dbContains(long j, String str);

    public static native long dbFind(long j, String str, long j2);

    public static native byte[][] dbFindAll(long j, String str);

    public static native String dbFindByValue(long j, String str, byte[] bArr);

    public static native void dbFindFinish(long j);

    public static native boolean dbGetBoolean(long j, String str, boolean z, boolean z2);

    public static native byte dbGetByte(long j, String str, byte b, boolean z);

    public static native byte[] dbGetByteArray(long j, String str);

    public static native double dbGetDouble(long j, String str, double d, boolean z);

    public static native double[] dbGetDoubleArray(long j, String str);

    public static native float dbGetFloat(long j, String str, float f, boolean z);

    public static native float[] dbGetFloatArray(long j, String str);

    public static native int dbGetInt(long j, String str, int i, boolean z);

    public static native int[] dbGetIntArray(long j, String str);

    public static native int dbGetIntOrLong(long j, String str, int i, boolean z);

    public static native long dbGetLong(long j, String str, long j2, boolean z);

    public static native long[] dbGetLongArray(long j, String str);

    public static native String dbGetProperty(long j, String str);

    public static native long dbGetSize(long j);

    public static native long dbGetSizeByPrefix(long j, String str);

    public static native String dbGetString(long j, String str, String str2, boolean z);

    public static native String[] dbGetStringArray(long j, String str);

    public static native long dbGetValueSize(long j, String str, boolean z);

    public static native String dbNextKey(long j);

    public static native long dbOpen(LevelDB levelDB, String str);

    public static native boolean dbPutBoolean(long j, boolean z, String str, boolean z2);

    public static native boolean dbPutByte(long j, boolean z, String str, byte b);

    public static native boolean dbPutByteArray(long j, boolean z, String str, byte[] bArr);

    public static native boolean dbPutDouble(long j, boolean z, String str, double d);

    public static native boolean dbPutDoubleArray(long j, boolean z, String str, double[] dArr);

    public static native boolean dbPutFloat(long j, boolean z, String str, float f);

    public static native boolean dbPutFloatArray(long j, boolean z, String str, float[] fArr);

    public static native boolean dbPutInt(long j, boolean z, String str, int i);

    public static native boolean dbPutIntArray(long j, boolean z, String str, int[] iArr);

    public static native boolean dbPutLong(long j, boolean z, String str, long j2);

    public static native boolean dbPutLongArray(long j, boolean z, String str, long[] jArr);

    public static native boolean dbPutString(long j, boolean z, String str, String str2);

    public static native boolean dbPutStringArray(long j, boolean z, String str, String[] strArr);

    public static native boolean dbPutVoid(long j, boolean z, String str);

    public static native boolean dbRemove(long j, String str);

    public static native int dbRemoveByAnyPrefix(long j, long j2, String[] strArr);

    public static native int dbRemoveByPrefix(long j, long j2, String str);

    public static native long dbRepair(LevelDB levelDB, String str);

    public static native String dbVersion();
}
