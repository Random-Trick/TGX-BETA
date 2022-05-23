package fb;

import android.text.Spannable;
import android.text.Spanned;

public final class c {
    public static void a(Spanned spanned, int i10, int i11, Class<?> cls, Spannable spannable, int i12) {
        if (cls == null) {
            cls = Object.class;
        }
        Object[] spans = spanned.getSpans(i10, i11, cls);
        if (!(spans == null || spans.length == 0)) {
            for (Object obj : spans) {
                int spanStart = spanned.getSpanStart(obj);
                int spanEnd = spanned.getSpanEnd(obj);
                int spanFlags = spanned.getSpanFlags(obj);
                if (spanStart < i10) {
                    spanStart = i10;
                }
                if (spanEnd > i11) {
                    spanEnd = i11;
                }
                try {
                    spannable.setSpan(obj, (spanStart - i10) + i12, (spanEnd - i10) + i12, spanFlags);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}
