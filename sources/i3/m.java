package i3;

import android.database.Cursor;
import i3.b0;

public final class m implements b0.b {
    public static final m f13967a = new m();

    @Override
    public final Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
