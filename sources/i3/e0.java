package i3;

import android.database.sqlite.SQLiteDatabase;
import i3.h0;

public final class e0 implements h0.a {
    public static final e0 f13952a = new e0();

    @Override
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
