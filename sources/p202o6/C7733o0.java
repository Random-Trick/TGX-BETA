package p202o6;

public final class C7733o0 {
    public static int m15157a(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static long m15156b(byte[] bArr, int i) {
        return ((m15157a(bArr, i + 2) << 16) | m15157a(bArr, i)) & 4294967295L;
    }
}
