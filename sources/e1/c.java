package e1;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

public final class c {
    public final AbstractC0093c f10440a;

    public static final class b implements AbstractC0093c {
        public final Uri f10442a;
        public final ClipDescription f10443b;
        public final Uri f10444c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f10442a = uri;
            this.f10443b = clipDescription;
            this.f10444c = uri2;
        }

        @Override
        public Uri a() {
            return this.f10442a;
        }

        @Override
        public void b() {
        }

        @Override
        public ClipDescription c() {
            return this.f10443b;
        }
    }

    public interface AbstractC0093c {
        Uri a();

        void b();

        ClipDescription c();
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f10440a = new a(uri, clipDescription, uri2);
        } else {
            this.f10440a = new b(uri, clipDescription, uri2);
        }
    }

    public static c d(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new c(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f10440a.a();
    }

    public ClipDescription b() {
        return this.f10440a.c();
    }

    public void c() {
        this.f10440a.b();
    }

    public static final class a implements AbstractC0093c {
        public final InputContentInfo f10441a;

        public a(Object obj) {
            this.f10441a = (InputContentInfo) obj;
        }

        @Override
        public Uri a() {
            return this.f10441a.getContentUri();
        }

        @Override
        public void b() {
            this.f10441a.requestPermission();
        }

        @Override
        public ClipDescription c() {
            return this.f10441a.getDescription();
        }

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f10441a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public c(AbstractC0093c cVar) {
        this.f10440a = cVar;
    }
}
