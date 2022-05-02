package p110hd;

import android.annotation.TargetApi;
import android.text.Editable;
import android.text.Selection;
import android.view.inputmethod.InputConnection;

@TargetApi(19)
public class C5092m {

    public static final class C5093a {
        public static int m23963a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        return z ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z = true;
                    }
                }
                return i;
            }
        }

        public static int m23962b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i < length) {
                        char charAt = charSequence.charAt(i);
                        if (z) {
                            if (!Character.isLowSurrogate(charAt)) {
                                return -1;
                            }
                            i2--;
                            i++;
                        } else if (!Character.isSurrogate(charAt)) {
                            i2--;
                            i++;
                        } else if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        } else {
                            i++;
                            z = true;
                        }
                    } else if (z) {
                        return -1;
                    } else {
                        return length;
                    }
                }
                return i;
            }
        }
    }

    public static boolean m23965a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int i3;
        int i4;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m23964b(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                i4 = C5093a.m23963a(editable, selectionStart, Math.max(i, 0));
                i3 = C5093a.m23962b(editable, selectionEnd, Math.max(i2, 0));
                if (i4 == -1 || i3 == -1) {
                    return false;
                }
            } else {
                i4 = Math.max(selectionStart - i, 0);
                i3 = Math.min(selectionEnd + i2, editable.length());
            }
            AbstractC5090k[] kVarArr = (AbstractC5090k[]) editable.getSpans(i4, i3, AbstractC5090k.class);
            if (kVarArr != null && kVarArr.length > 0) {
                for (AbstractC5090k kVar : kVarArr) {
                    int spanStart = editable.getSpanStart(kVar);
                    int spanEnd = editable.getSpanEnd(kVar);
                    i4 = Math.min(spanStart, i4);
                    i3 = Math.max(spanEnd, i3);
                }
                int max = Math.max(i4, 0);
                int min = Math.min(i3, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max, min);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    public static boolean m23964b(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }
}
