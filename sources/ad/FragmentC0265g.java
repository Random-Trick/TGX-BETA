package ad;

import com.google.android.youtube.player.AbstractC3514b;
import com.google.android.youtube.player.FragmentC3521c;
import org.thunderdog.challegram.Log;

public class FragmentC0265g extends FragmentC3521c {
    public RunnableC0266h f798P;

    public static FragmentC0265g m41965f(RunnableC0266h hVar) {
        FragmentC0265g gVar = new FragmentC0265g();
        gVar.f798P = hVar;
        gVar.m30245b("AIzaSyDEwJbUg95js_LdL-OBkg5Cw1FINlg8tQ0", hVar);
        return gVar;
    }

    public void m41968c() {
        RunnableC0266h hVar = this.f798P;
        if (hVar != null) {
            hVar.m41961q();
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

    public AbstractC3514b m41967d() {
        RunnableC0266h hVar = this.f798P;
        if (hVar != null) {
            return hVar.m41964n();
        }
        return null;
    }

    public boolean m41966e() {
        RunnableC0266h hVar = this.f798P;
        return hVar != null && hVar.m41962p();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (Log.isEnabled(Log.TAG_YOUTUBE)) {
            Log.m14719i("YouTubeFragment.onResume", new Object[0]);
        }
        RunnableC0266h hVar = this.f798P;
        if (hVar != null) {
            hVar.m41960r();
        }
    }
}
