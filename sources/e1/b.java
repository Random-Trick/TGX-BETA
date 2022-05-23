package e1;

import android.annotation.SuppressLint;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import b1.d;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class b {

    public class a extends InputConnectionWrapper {
        public final c f10438a;

        public a(InputConnection inputConnection, boolean z10, c cVar) {
            super(inputConnection, z10);
            this.f10438a = cVar;
        }

        @Override
        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            if (this.f10438a.a(e1.c.d(inputContentInfo), i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
    }

    public class C0092b extends InputConnectionWrapper {
        public final c f10439a;

        public C0092b(InputConnection inputConnection, boolean z10, c cVar) {
            super(inputConnection, z10);
            this.f10439a = cVar;
        }

        @Override
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (b.b(str, bundle, this.f10439a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    public interface c {
        boolean a(e1.c cVar, int i10, Bundle bundle);
    }

    @Deprecated
    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, c cVar) {
        d.c(inputConnection, "inputConnection must be non-null");
        d.c(editorInfo, "editorInfo must be non-null");
        d.c(cVar, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new a(inputConnection, false, cVar);
        }
        return e1.a.a(editorInfo).length == 0 ? inputConnection : new C0092b(inputConnection, false, cVar);
    }

    public static boolean b(String str, Bundle bundle, c cVar) {
        boolean z10;
        Throwable th;
        ResultReceiver resultReceiver;
        boolean z11 = false;
        z11 = false;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z10 = false;
        } else if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            return false;
        } else {
            z10 = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            try {
                Uri uri = (Uri) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i10 = bundle.getInt(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(z10 ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (!(uri == null || clipDescription == null)) {
                    z11 = cVar.a(new e1.c(uri, clipDescription, uri2), i10, bundle2);
                }
                if (resultReceiver != null) {
                    int i11 = z11 ? 1 : 0;
                    int i12 = z11 ? 1 : 0;
                    int i13 = z11 ? 1 : 0;
                    resultReceiver.send(i11, null);
                }
                return z11;
            } catch (Throwable th2) {
                th = th2;
                if (resultReceiver != null) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            resultReceiver = null;
        }
    }
}
