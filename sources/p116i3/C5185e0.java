package p116i3;

import android.database.sqlite.SQLiteDatabase;
import p116i3.C5194h0;

public final class C5185e0 implements C5194h0.AbstractC5195a {
    public static final C5185e0 f17310a = new C5185e0();

    @Override
    public final void mo23626a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
