package bb;

import android.database.Cursor;

public class C1305b {
    public static void m37781a(Cursor cursor) {
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }
}
