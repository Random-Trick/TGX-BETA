package p116i3;

import android.database.Cursor;
import p116i3.C5174b0;

public final class C5201m implements C5174b0.AbstractC5176b {
    public static final C5201m f17330a = new C5201m();

    @Override
    public final Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
