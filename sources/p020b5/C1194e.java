package p020b5;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

public final class C1194e {
    public static final byte[] f4485a = {0, 0, 0, 1};
    public static final String[] f4486b = {"", "A", "B", "C"};

    public static String m38099a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static List<byte[]> m38098b(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static String m38097c(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = new Object[5];
        objArr[0] = f4486b[i];
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = Integer.valueOf(i3);
        objArr[3] = Character.valueOf(z ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i4);
        StringBuilder sb2 = new StringBuilder(C1216l0.m37939z("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb2.toString();
    }

    public static byte[] m38096d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f4485a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    public static Pair<Integer, Integer> m38095e(byte[] bArr) {
        C1189b0 b0Var = new C1189b0(bArr);
        b0Var.m38147P(9);
        int D = b0Var.m38159D();
        b0Var.m38147P(20);
        return Pair.create(Integer.valueOf(b0Var.m38155H()), Integer.valueOf(D));
    }

    public static boolean m38094f(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }
}
