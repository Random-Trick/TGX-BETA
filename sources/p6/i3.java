package p6;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class i3 {
    public static final Pattern f20669a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    public static List a(File file, File file2) {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(h3.f20647a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[listFiles.length];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split("-")[0]);
                if (parseInt > listFiles.length || fileArr2[parseInt] != null) {
                    throw new g1("Metadata folder ordering corrupt.");
                }
                fileArr2[parseInt] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    m3 s10 = new r0(fileInputStream).s();
                    if (s10.c() != null) {
                        File file5 = new File(file, s10.c());
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new g1(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                        }
                    } else {
                        throw new g1("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }
}
