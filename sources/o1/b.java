package o1;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import k0.h;

public class b extends o1.a {
    public static boolean f18548c = false;
    public final g f18549a;
    public final C0164b f18550b;

    public static class a<D> extends n<D> {
        public final int f18551l;
        public final Bundle f18552m;
        public g f18553n;

        @Override
        public void i() {
            if (b.f18548c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override
        public void j() {
            if (b.f18548c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        @Override
        public void l(o<? super D> oVar) {
            super.l(oVar);
            this.f18553n = null;
        }

        @Override
        public void m(D d10) {
            super.m(d10);
        }

        public p1.a<D> n(boolean z10) {
            if (b.f18548c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void o(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f18551l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f18552m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println((Object) null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            throw null;
        }

        public void p() {
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f18551l);
            sb2.append(" : ");
            b1.b.a(null, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    public static class C0164b extends s {
        public static final t.a f18554e = new a();
        public h<a> f18555c = new h<>();
        public boolean f18556d = false;

        public static class a implements t.a {
            @Override
            public <T extends s> T a(Class<T> cls) {
                return new C0164b();
            }
        }

        public static C0164b f(u uVar) {
            return (C0164b) new t(uVar, f18554e).a(C0164b.class);
        }

        @Override
        public void d() {
            super.d();
            int n10 = this.f18555c.n();
            for (int i10 = 0; i10 < n10; i10++) {
                this.f18555c.o(i10).n(true);
            }
            this.f18555c.b();
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f18555c.n() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f18555c.n(); i10++) {
                    a o10 = this.f18555c.o(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f18555c.i(i10));
                    printWriter.print(": ");
                    printWriter.println(o10.toString());
                    o10.o(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        public void g() {
            int n10 = this.f18555c.n();
            for (int i10 = 0; i10 < n10; i10++) {
                this.f18555c.o(i10).p();
            }
        }
    }

    public b(g gVar, u uVar) {
        this.f18549a = gVar;
        this.f18550b = C0164b.f(uVar);
    }

    @Override
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f18550b.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override
    public void c() {
        this.f18550b.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((int) org.thunderdog.challegram.Log.TAG_YOUTUBE);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        b1.b.a(this.f18549a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
