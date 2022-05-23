package w1;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import u1.e;
import x1.b;

public class c {
    public static void a(b bVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor T = bVar.T("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (T.moveToNext()) {
            try {
                arrayList.add(T.getString(0));
            } catch (Throwable th) {
                T.close();
                throw th;
            }
        }
        T.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.p("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor b(e eVar, x1.e eVar2, boolean z10, CancellationSignal cancellationSignal) {
        Cursor s10 = eVar.s(eVar2, cancellationSignal);
        if (!z10 || !(s10 instanceof AbstractWindowedCursor)) {
            return s10;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) s10;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? b.a(abstractWindowedCursor) : s10;
    }

    public static int c(File file) {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i10 = allocate.getInt();
                channel.close();
                return i10;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
