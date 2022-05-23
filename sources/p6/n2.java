package p6;

import java.io.File;
import java.io.IOException;
import t6.a;

public final class n2 {
    public static final a f20729b = new a("MergeSliceTaskHandler");
    public final f0 f20730a;

    public n2(f0 f0Var) {
        this.f20730a = f0Var;
    }

    public static void b(File file, File file2) {
        File[] listFiles;
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                throw new g1("Unable to delete directory: ".concat(String.valueOf(file)));
            }
        } else if (file2.exists()) {
            throw new g1("File clashing with existing file from other slice: ".concat(file2.toString()));
        } else if (!file.renameTo(file2)) {
            throw new g1("Unable to move file: ".concat(String.valueOf(file)));
        }
    }

    public final void a(m2 m2Var) {
        File D = this.f20730a.D(m2Var.f20556b, m2Var.f20718c, m2Var.f20719d, m2Var.f20720e);
        if (D.exists()) {
            File w10 = this.f20730a.w(m2Var.f20556b, m2Var.f20718c, m2Var.f20719d);
            if (!w10.exists()) {
                w10.mkdirs();
            }
            b(D, w10);
            try {
                this.f20730a.a(m2Var.f20556b, m2Var.f20718c, m2Var.f20719d, this.f20730a.q(m2Var.f20556b, m2Var.f20718c, m2Var.f20719d) + 1);
            } catch (IOException e10) {
                f20729b.b("Writing merge checkpoint failed with %s.", e10.getMessage());
                throw new g1("Writing merge checkpoint failed.", e10, m2Var.f20555a);
            }
        } else {
            throw new g1(String.format("Cannot find verified files for slice %s.", m2Var.f20720e), m2Var.f20555a);
        }
    }
}
