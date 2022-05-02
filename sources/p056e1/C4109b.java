package p056e1;

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
import p016b1.C1128d;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class C4109b {

    public class C4110a extends InputConnectionWrapper {
        public final AbstractC4112c f13874a;

        public C4110a(InputConnection inputConnection, boolean z, AbstractC4112c cVar) {
            super(inputConnection, z);
            this.f13874a = cVar;
        }

        @Override
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f13874a.mo8459a(C4113c.m28895d(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    public class C4111b extends InputConnectionWrapper {
        public final AbstractC4112c f13875a;

        public C4111b(InputConnection inputConnection, boolean z, AbstractC4112c cVar) {
            super(inputConnection, z);
            this.f13875a = cVar;
        }

        @Override
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C4109b.m28899b(str, bundle, this.f13875a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    public interface AbstractC4112c {
        boolean mo8459a(C4113c cVar, int i, Bundle bundle);
    }

    @Deprecated
    public static InputConnection m28900a(InputConnection inputConnection, EditorInfo editorInfo, AbstractC4112c cVar) {
        C1128d.m38331c(inputConnection, "inputConnection must be non-null");
        C1128d.m38331c(editorInfo, "editorInfo must be non-null");
        C1128d.m38331c(cVar, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new C4110a(inputConnection, false, cVar);
        }
        return C4108a.m28902a(editorInfo).length == 0 ? inputConnection : new C4111b(inputConnection, false, cVar);
    }

    public static boolean m28899b(String str, Bundle bundle, AbstractC4112c cVar) {
        boolean z;
        Throwable th;
        ResultReceiver resultReceiver;
        boolean z2 = false;
        z2 = false;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z = false;
        } else if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            return false;
        } else {
            z = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            try {
                Uri uri = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i = bundle.getInt(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (!(uri == null || clipDescription == null)) {
                    z2 = cVar.mo8459a(new C4113c(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver != null) {
                    int i2 = z2 ? 1 : 0;
                    int i3 = z2 ? 1 : 0;
                    int i4 = z2 ? 1 : 0;
                    resultReceiver.send(i2, null);
                }
                return z2;
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
