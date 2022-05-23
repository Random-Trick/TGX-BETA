package ne;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import e1.b;
import ib.i;
import org.thunderdog.challegram.Log;

public class r1 {

    public class a extends InputConnectionWrapper {
        public final InputConnection f18357a;

        public a(InputConnection inputConnection, boolean z10, InputConnection inputConnection2) {
            super(inputConnection, z10);
            this.f18357a = inputConnection2;
        }

        @Override
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (i.c(str, "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT") && bundle != null) {
                try {
                    int i10 = bundle.getInt("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                    bundle.putParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER", (ResultReceiver) bundle.getParcelable("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER"));
                    bundle.putParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI", (Uri) bundle.getParcelable("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI"));
                    bundle.putParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION", (ClipDescription) bundle.getParcelable("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION"));
                    bundle.putParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI", (Uri) bundle.getParcelable("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI"));
                    bundle.putInt("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS", i10);
                    bundle.putParcelable("androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS", (Bundle) bundle.getParcelable("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS"));
                    str = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
                } catch (Throwable th) {
                    Log.w("Cannot patch event", th, new Object[0]);
                }
            }
            return this.f18357a.performPrivateCommand(str, bundle);
        }
    }

    public static InputConnection a(InputConnection inputConnection, EditorInfo editorInfo, b.c cVar) {
        if (Build.VERSION.SDK_INT >= 25) {
            return b.a(inputConnection, editorInfo, cVar);
        }
        return new a(inputConnection, false, b.a(inputConnection, editorInfo, cVar));
    }

    public static void b(EditorInfo editorInfo, String[] strArr) {
        e1.a.b(editorInfo, strArr);
        if (Build.VERSION.SDK_INT < 25) {
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        }
    }
}
