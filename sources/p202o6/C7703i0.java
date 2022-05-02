package p202o6;

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
import p262s6.AbstractC8687w;

public final class C7703i0 extends AbstractC8687w {
    public final File f24688a;
    public final File f24689b;
    public final NavigableMap f24690c = new TreeMap();

    public C7703i0(File file, File file2) {
        this.f24688a = file;
        this.f24689b = file2;
        List<File> a = C7706i3.m15201a(file, file2);
        if (!a.isEmpty()) {
            long j = 0;
            for (File file3 : a) {
                this.f24690c.put(Long.valueOf(j), file3);
                j += file3.length();
            }
            return;
        }
        throw new C7694g1(String.format("Virtualized slice archive empty for %s, %s", file, file2));
    }

    @Override
    public final void close() {
    }

    @Override
    public final long mo11733m() {
        Map.Entry lastEntry = this.f24690c.lastEntry();
        return ((Long) lastEntry.getKey()).longValue() + ((File) lastEntry.getValue()).length();
    }

    @Override
    public final InputStream mo11732t(long j, long j2) {
        if (j < 0 || j2 < 0) {
            throw new C7694g1(String.format("Invalid input parameters %s, %s", Long.valueOf(j), Long.valueOf(j2)));
        }
        long j3 = j + j2;
        if (j3 <= mo11733m()) {
            Long l = (Long) this.f24690c.floorKey(Long.valueOf(j));
            Long l2 = (Long) this.f24690c.floorKey(Long.valueOf(j3));
            if (l.equals(l2)) {
                return new C7698h0(m15202z0(j, l), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m15202z0(j, l));
            Collection values = this.f24690c.subMap(l, false, l2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new C7715k2(Collections.enumeration(values)));
            }
            arrayList.add(new C7698h0(new FileInputStream((File) this.f24690c.get(l2)), j2 - (l2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new C7694g1(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(mo11733m()), Long.valueOf(j3)));
    }

    public final InputStream m15202z0(long j, Long l) {
        FileInputStream fileInputStream = new FileInputStream((File) this.f24690c.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new C7694g1(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l));
    }
}
