package p6;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import t6.w;

public final class i0 extends w {
    public final File f20650a;
    public final File f20651b;
    public final NavigableMap f20652c = new TreeMap();

    public i0(File file, File file2) {
        this.f20650a = file;
        this.f20651b = file2;
        List<File> a10 = i3.a(file, file2);
        if (!a10.isEmpty()) {
            long j10 = 0;
            for (File file3 : a10) {
                this.f20652c.put(Long.valueOf(j10), file3);
                j10 += file3.length();
            }
            return;
        }
        throw new g1(String.format("Virtualized slice archive empty for %s, %s", file, file2));
    }

    @Override
    public final void close() {
    }

    @Override
    public final long m() {
        Map.Entry lastEntry = this.f20652c.lastEntry();
        return ((Long) lastEntry.getKey()).longValue() + ((File) lastEntry.getValue()).length();
    }

    @Override
    public final InputStream s(long j10, long j11) {
        if (j10 < 0 || j11 < 0) {
            throw new g1(String.format("Invalid input parameters %s, %s", Long.valueOf(j10), Long.valueOf(j11)));
        }
        long j12 = j10 + j11;
        if (j12 <= m()) {
            Long l10 = (Long) this.f20652c.floorKey(Long.valueOf(j10));
            Long l11 = (Long) this.f20652c.floorKey(Long.valueOf(j12));
            if (l10.equals(l11)) {
                return new h0(z0(j10, l10), j11);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(z0(j10, l10));
            Collection values = this.f20652c.subMap(l10, false, l11, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new k2(Collections.enumeration(values)));
            }
            arrayList.add(new h0(new FileInputStream((File) this.f20652c.get(l11)), j11 - (l11.longValue() - j10)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new g1(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(m()), Long.valueOf(j12)));
    }

    public final InputStream z0(long j10, Long l10) {
        FileInputStream fileInputStream = new FileInputStream((File) this.f20652c.get(l10));
        if (fileInputStream.skip(j10 - l10.longValue()) == j10 - l10.longValue()) {
            return fileInputStream;
        }
        throw new g1(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l10));
    }
}
