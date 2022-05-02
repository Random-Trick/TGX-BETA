package me;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import org.thunderdog.challegram.Log;
import p056e1.C4108a;
import p056e1.C4109b;
import p108hb.C5070i;

public class C7012r1 {

    public class C7013a extends InputConnectionWrapper {
        public final InputConnection f22234a;

        public C7013a(InputConnection inputConnection, boolean z, InputConnection inputConnection2) {
            super(inputConnection, z);
            this.f22234a = inputConnection2;
        }

        @Override
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (C5070i.m24067c(str, "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT") && bundle != null) {
                try {
                    int i = bundle.getInt("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                    bundle.putParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER", (ResultReceiver) bundle.getParcelable("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"));
                    bundle.putParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI", (Uri) bundle.getParcelable("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"));
                    bundle.putParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION", (ClipDescription) bundle.getParcelable("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"));
                    bundle.putParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI", (Uri) bundle.getParcelable("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"));
                    bundle.putInt("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS", i);
                    bundle.putParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS", (Bundle) bundle.getParcelable("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"));
                    str = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
                } catch (Throwable th) {
                    Log.m14710w("Cannot patch event", th, new Object[0]);
                }
            }
            return this.f22234a.performPrivateCommand(str, bundle);
        }
    }

    public static InputConnection m18099a(InputConnection inputConnection, EditorInfo editorInfo, C4109b.AbstractC4112c cVar) {
        if (Build.VERSION.SDK_INT >= 25) {
            return C4109b.m28900a(inputConnection, editorInfo, cVar);
        }
        return new C7013a(inputConnection, false, C4109b.m28900a(inputConnection, editorInfo, cVar));
    }

    public static void m18098b(EditorInfo editorInfo, String[] strArr) {
        C4108a.m28901b(editorInfo, strArr);
        if (Build.VERSION.SDK_INT < 25) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        }
    }
}
