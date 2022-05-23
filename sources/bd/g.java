package bd;

import com.google.android.youtube.player.b;
import com.google.android.youtube.player.c;
import org.thunderdog.challegram.Log;

public class g extends c {
    public h P;

    public static g f(h hVar) {
        g gVar = new g();
        gVar.P = hVar;
        gVar.b("AIzaSyDEwJbUg95js_LdL-OBkg5Cw1FINlg8tQ0", hVar);
        return gVar;
    }

    public void c() {
        h hVar = this.P;
        if (hVar != null) {
            hVar.q();
        }
        try {
            onDestroy();
        } catch (Throwable unused) {
        }
        try {
            getActivity().getFragmentManager().beginTransaction().remove(this).commit();
        } catch (Throwable unused2) {
        }
    }

    public b d() {
        h hVar = this.P;
        if (hVar != null) {
            return hVar.n();
        }
        return null;
    }

    public boolean e() {
        h hVar = this.P;
        return hVar != null && hVar.p();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.i("YouTubeFragment.onResume", new Object[0]);
        }
        h hVar = this.P;
        if (hVar != null) {
            hVar.r();
        }
    }
}
