package p085g0;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import androidx.camera.core.C0662u1;
import p016b1.C1132h;

public final class C4442b {
    public static String m27651a(ContentResolver contentResolver, Uri uri) {
        Throwable th;
        RuntimeException e;
        Cursor cursor;
        Cursor cursor2 = null;
        try {
            try {
                cursor2 = contentResolver.query(uri, new String[]{"_data"}, null, null, null);
                cursor = (Cursor) C1132h.m38322e(cursor2);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (RuntimeException e2) {
            e = e2;
        }
        try {
            int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
            cursor.moveToFirst();
            String string = cursor.getString(columnIndexOrThrow);
            cursor.close();
            return string;
        } catch (RuntimeException e3) {
            e = e3;
            cursor2 = cursor;
            C0662u1.m40651c("VideoUtil", String.format("Failed in getting absolute path for Uri %s with Exception %s", uri.toString(), e.toString()));
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
