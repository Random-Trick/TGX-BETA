package p056e1;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

public final class C4113c {
    public final AbstractC4116c f13876a;

    public static final class C4115b implements AbstractC4116c {
        public final Uri f13878a;
        public final ClipDescription f13879b;
        public final Uri f13880c;

        public C4115b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f13878a = uri;
            this.f13879b = clipDescription;
            this.f13880c = uri2;
        }

        @Override
        public Uri mo28894a() {
            return this.f13878a;
        }

        @Override
        public void mo28893b() {
        }

        @Override
        public ClipDescription mo28892c() {
            return this.f13879b;
        }
    }

    public interface AbstractC4116c {
        Uri mo28894a();

        void mo28893b();

        ClipDescription mo28892c();
    }

    public C4113c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f13876a = new C4114a(uri, clipDescription, uri2);
        } else {
            this.f13876a = new C4115b(uri, clipDescription, uri2);
        }
    }

    public static C4113c m28895d(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new C4113c(new C4114a(obj));
        }
        return null;
    }

    public Uri m28898a() {
        return this.f13876a.mo28894a();
    }

    public ClipDescription m28897b() {
        return this.f13876a.mo28892c();
    }

    public void m28896c() {
        this.f13876a.mo28893b();
    }

    public static final class C4114a implements AbstractC4116c {
        public final InputContentInfo f13877a;

        public C4114a(Object obj) {
            this.f13877a = (InputContentInfo) obj;
        }

        @Override
        public Uri mo28894a() {
            return this.f13877a.getContentUri();
        }

        @Override
        public void mo28893b() {
            this.f13877a.requestPermission();
        }

        @Override
        public ClipDescription mo28892c() {
            return this.f13877a.getDescription();
        }

        public C4114a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f13877a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    public C4113c(AbstractC4116c cVar) {
        this.f13876a = cVar;
    }
}
