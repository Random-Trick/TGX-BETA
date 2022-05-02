package p066eb;

import android.text.Spannable;
import android.text.Spanned;

public final class C4181c {
    public static void m28617a(Spanned spanned, int i, int i2, Class<?> cls, Spannable spannable, int i3) {
        if (cls == null) {
            cls = Object.class;
        }
        Object[] spans = spanned.getSpans(i, i2, cls);
        if (!(spans == null || spans.length == 0)) {
            for (Object obj : spans) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                int spanFlags = spanned.getSpanFlags(obj);
                if (spanStart < i) {
                    spanStart = i;
                }
                if (spanEnd > i2) {
                    spanEnd = i2;
                }
                try {
                    spannable.setSpan(obj, (spanStart - i) + i3, (spanEnd - i) + i3, spanFlags);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
