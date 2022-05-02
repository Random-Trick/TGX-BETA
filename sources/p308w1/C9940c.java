package p308w1;

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
import p281u1.AbstractC9421e;
import p323x1.AbstractC10066b;
import p323x1.AbstractC10073e;

public class C9940c {
    public static void m6455a(AbstractC10066b bVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor S = bVar.mo5393S("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (S.moveToNext()) {
            try {
                arrayList.add(S.getString(0));
            } catch (Throwable th) {
                S.close();
                throw th;
            }
        }
        S.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.mo5385p("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor m6454b(AbstractC9421e eVar, AbstractC10073e eVar2, boolean z, CancellationSignal cancellationSignal) {
        Cursor s = eVar.m8715s(eVar2, cancellationSignal);
        if (!z || !(s instanceof AbstractWindowedCursor)) {
            return s;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) s;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? C9939b.m6458a(abstractWindowedCursor) : s;
    }

    public static int m6453c(File file) {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i = allocate.getInt();
                channel.close();
                return i;
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
