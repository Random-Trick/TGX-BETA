package p020b5;

import java.util.Arrays;

public final class C1223o {
    public String[] f4543a;
    public boolean f4544b;
    public boolean f4545c;

    public C1223o(String... strArr) {
        this.f4543a = strArr;
    }

    public synchronized boolean m37905a() {
        if (this.f4544b) {
            return this.f4545c;
        }
        this.f4544b = true;
        try {
            for (String str : this.f4543a) {
                System.loadLibrary(str);
            }
            this.f4545c = true;
        } catch (UnsatisfiedLinkError unused) {
            String valueOf = String.valueOf(Arrays.toString(this.f4543a));
            C1230s.m37881i("LibraryLoader", valueOf.length() != 0 ? "Failed to load ".concat(valueOf) : new String("Failed to load "));
        }
        return this.f4545c;
    }

    public synchronized void m37904b(String... strArr) {
        C1186a.m38183g(!this.f4544b, "Cannot set libraries after loading");
        this.f4543a = strArr;
    }
}
