package p6;

public final class o0 {
    public static int a(byte[] bArr, int i10) {
        return ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    public static long b(byte[] bArr, int i10) {
        return ((a(bArr, i10 + 2) << 16) | a(bArr, i10)) & 4294967295L;
    }
}
