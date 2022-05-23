package g0;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.camera.core.t1;
import b1.h;

public final class b {
    public static String a(ContentResolver contentResolver, Uri uri) {
        Throwable th;
        RuntimeException e10;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            try {
                cursor2 = contentResolver.query(uri, new String[]{"_data"}, null, null, null);
                cursor = (Cursor) h.e(cursor2);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (RuntimeException e11) {
            e10 = e11;
        }
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
            cursor.moveToFirst();
            String string = cursor.getString(columnIndexOrThrow);
            cursor.close();
            return string;
        } catch (RuntimeException e12) {
            e10 = e12;
            cursor2 = cursor;
            t1.c("VideoUtil", String.format("Failed in getting absolute path for Uri %s with Exception %s", uri.toString(), e10.toString()));
            if (cursor2 != null) {
                cursor2.close();
            }
            return "";
        } catch (Throwable th3) {
            th = th3;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }
}
