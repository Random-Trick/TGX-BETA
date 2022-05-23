package c5;

import java.util.Arrays;

public abstract class o {
    public String[] f4873a;
    public boolean f4874b;
    public boolean f4875c;

    public o(String... strArr) {
        this.f4873a = strArr;
    }

    public synchronized boolean a() {
        if (this.f4874b) {
            return this.f4875c;
        }
        this.f4874b = true;
        try {
            for (String str : this.f4873a) {
                b(str);
            }
            this.f4875c = true;
        } catch (UnsatisfiedLinkError unused) {
            String valueOf = String.valueOf(Arrays.toString(this.f4873a));
            s.i("LibraryLoader", valueOf.length() != 0 ? "Failed to load ".concat(valueOf) : new String("Failed to load "));
        }
        return this.f4875c;
    }

    public abstract void b(String str);

    public synchronized void c(String... strArr) {
        a.g(!this.f4874b, "Cannot set libraries after loading");
        this.f4873a = strArr;
    }
}
