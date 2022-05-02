package ba;

import java.io.FileInputStream;
import java.io.IOException;

public class C1301f extends C1298c {
    public FileInputStream f4695b;
    public final String f4696c;

    public C1301f(String str) {
        this.f4696c = str;
    }

    @Override
    public void mo6290e() {
        try {
            this.f4695b = new FileInputStream(this.f4696c);
            m37790b(new C1300e(this.f4695b.getFD()));
            super.mo6290e();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void mo6282m() {
        try {
            this.f4695b.close();
        } catch (IOException unused) {
        }
        super.mo6282m();
    }
}
