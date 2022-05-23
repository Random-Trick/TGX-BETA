package ca;

import java.io.FileInputStream;
import java.io.IOException;

public class f extends c {
    public FileInputStream f5018b;
    public final String f5019c;

    public f(String str) {
        this.f5019c = str;
    }

    @Override
    public void e() {
        try {
            this.f5018b = new FileInputStream(this.f5019c);
            b(new e(this.f5018b.getFD()));
            super.e();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void m() {
        try {
            this.f5018b.close();
        } catch (IOException unused) {
        }
        super.m();
    }
}
