package z0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import b1.h;

public class f {

    public static class a {
        public final int f26796a;
        public final b[] f26797b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f26796a = i10;
            this.f26797b = bVarArr;
        }

        public static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f26797b;
        }

        public int c() {
            return this.f26796a;
        }
    }

    public static class b {
        public final Uri f26798a;
        public final int f26799b;
        public final int f26800c;
        public final boolean f26801d;
        public final int f26802e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f26798a = (Uri) h.e(uri);
            this.f26799b = i10;
            this.f26800c = i11;
            this.f26801d = z10;
            this.f26802e = i12;
        }

        public static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f26802e;
        }

        public int c() {
            return this.f26799b;
        }

        public Uri d() {
            return this.f26798a;
        }

        public int e() {
            return this.f26800c;
        }

        public boolean f() {
            return this.f26801d;
        }
    }

    public static class c {
        public void a(int i10) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, d dVar, int i10, boolean z10, int i11, Handler handler, c cVar) {
        z0.a aVar = new z0.a(cVar, handler);
        if (z10) {
            return e.e(context, dVar, aVar, i10, i11);
        }
        return e.d(context, dVar, i10, null, aVar);
    }
}
