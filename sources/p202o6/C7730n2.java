package p202o6;

import java.io.File;
import java.io.IOException;
import p262s6.C8646a;

public final class C7730n2 {
    public static final C8646a f24775b = new C8646a("MergeSliceTaskHandler");
    public final C7688f0 f24776a;

    public C7730n2(C7688f0 f0Var) {
        this.f24776a = f0Var;
    }

    public static void m15158b(File file, File file2) {
        File[] listFiles;
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                m15158b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                throw new C7694g1("Unable to delete directory: ".concat(String.valueOf(file)));
            }
        } else if (file2.exists()) {
            throw new C7694g1("File clashing with existing file from other slice: ".concat(file2.toString()));
        } else if (!file.renameTo(file2)) {
            throw new C7694g1("Unable to move file: ".concat(String.valueOf(file)));
        }
    }

    public final void m15159a(C7725m2 m2Var) {
        File D = this.f24776a.m15258D(m2Var.f24582b, m2Var.f24764c, m2Var.f24765d, m2Var.f24766e);
        if (D.exists()) {
            File w = this.f24776a.m15229w(m2Var.f24582b, m2Var.f24764c, m2Var.f24765d);
            if (!w.exists()) {
                w.mkdirs();
            }
            m15158b(D, w);
            try {
                this.f24776a.m15251a(m2Var.f24582b, m2Var.f24764c, m2Var.f24765d, this.f24776a.m15235q(m2Var.f24582b, m2Var.f24764c, m2Var.f24765d) + 1);
            } catch (IOException e) {
                f24775b.m11816b("Writing merge checkpoint failed with %s.", e.getMessage());
                throw new C7694g1("Writing merge checkpoint failed.", e, m2Var.f24581a);
            }
        } else {
            throw new C7694g1(String.format("Cannot find verified files for slice %s.", m2Var.f24766e), m2Var.f24581a);
        }
    }
}
