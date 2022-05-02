package p309w2;

import java.util.Arrays;

public class C9950b extends RuntimeException {
    public C9950b(String str, String[] strArr, String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + Arrays.toString(strArr) + ", but only found: " + Arrays.toString(strArr2) + ".");
    }
}
