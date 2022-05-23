package me.vkryl.leveldb;

public class NativeBridge {
    public static native boolean dbAsBoolean(long j10);

    public static native byte[] dbAsByteArray(long j10);

    public static native double dbAsDouble(long j10);

    public static native float dbAsFloat(long j10);

    public static native int dbAsInt(long j10);

    public static native long dbAsLong(long j10);

    public static native long[] dbAsLongArray(long j10);

    public static native String dbAsString(long j10);

    public static native void dbBatchClear(long j10, long j11);

    public static native long dbBatchCreate();

    public static native void dbBatchDestroy(long j10);

    public static native boolean dbBatchPerform(long j10, long j11);

    public static native boolean dbBatchRemove(long j10, String str);

    public static native boolean dbClear(long j10);

    public static native void dbClose(long j10);

    public static native boolean dbContains(long j10, String str);

    public static native long dbFind(long j10, String str, long j11);

    public static native byte[][] dbFindAll(long j10, String str);

    public static native String dbFindByValue(long j10, String str, byte[] bArr);

    public static native void dbFindFinish(long j10);

    public static native boolean dbGetBoolean(long j10, String str, boolean z10, boolean z11);

    public static native byte dbGetByte(long j10, String str, byte b10, boolean z10);

    public static native byte[] dbGetByteArray(long j10, String str);

    public static native double dbGetDouble(long j10, String str, double d10, boolean z10);

    public static native double[] dbGetDoubleArray(long j10, String str);

    public static native float dbGetFloat(long j10, String str, float f10, boolean z10);

    public static native float[] dbGetFloatArray(long j10, String str);

    public static native int dbGetInt(long j10, String str, int i10, boolean z10);

    public static native int[] dbGetIntArray(long j10, String str);

    public static native int dbGetIntOrLong(long j10, String str, int i10, boolean z10);

    public static native long dbGetLong(long j10, String str, long j11, boolean z10);

    public static native long[] dbGetLongArray(long j10, String str);

    public static native String dbGetProperty(long j10, String str);

    public static native long dbGetSize(long j10);

    public static native long dbGetSizeByPrefix(long j10, String str);

    public static native String dbGetString(long j10, String str, String str2, boolean z10);

    public static native String[] dbGetStringArray(long j10, String str);

    public static native long dbGetValueSize(long j10, String str, boolean z10);

    public static native String dbNextKey(long j10);

    public static native long dbOpen(LevelDB levelDB, String str);

    public static native boolean dbPutBoolean(long j10, boolean z10, String str, boolean z11);

    public static native boolean dbPutByte(long j10, boolean z10, String str, byte b10);

    public static native boolean dbPutByteArray(long j10, boolean z10, String str, byte[] bArr);

    public static native boolean dbPutDouble(long j10, boolean z10, String str, double d10);

    public static native boolean dbPutDoubleArray(long j10, boolean z10, String str, double[] dArr);

    public static native boolean dbPutFloat(long j10, boolean z10, String str, float f10);

    public static native boolean dbPutFloatArray(long j10, boolean z10, String str, float[] fArr);

    public static native boolean dbPutInt(long j10, boolean z10, String str, int i10);

    public static native boolean dbPutIntArray(long j10, boolean z10, String str, int[] iArr);

    public static native boolean dbPutLong(long j10, boolean z10, String str, long j11);

    public static native boolean dbPutLongArray(long j10, boolean z10, String str, long[] jArr);

    public static native boolean dbPutString(long j10, boolean z10, String str, String str2);

    public static native boolean dbPutStringArray(long j10, boolean z10, String str, String[] strArr);

    public static native boolean dbPutVoid(long j10, boolean z10, String str);

    public static native boolean dbRemove(long j10, String str);

    public static native int dbRemoveByAnyPrefix(long j10, long j11, String[] strArr);

    public static native int dbRemoveByPrefix(long j10, long j11, String str);

    public static native long dbRepair(LevelDB levelDB, String str);

    public static native String dbVersion();
}
