package sc;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import be.C1405v;
import org.thunderdog.challegram.R;
import p038ce.C2546iq;
import p038ce.C2964ra;
import p082fd.C4403w;
import p335xd.C10192g;
import tc.C9137c;
import td.AbstractC9323v4;

public class View$OnClickListenerC8803m2 extends AbstractC8809o<Void> implements View.OnClickListener {
    public C2546iq f28426I0;

    public class C8804a extends C2546iq {
        public C8804a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            if (raVar.m32838j() == R.id.btn_openLink) {
                cVar.setIconColorId(R.id.theme_color_textNeutral);
            } else {
                cVar.setIconColorId(R.id.theme_color_icon);
            }
        }
    }

    public class C8805b extends C2546iq {
        public C8805b(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            if (raVar.m32838j() == R.id.btn_close) {
                cVar.setIconColorId(R.id.theme_color_textNeutral);
            } else {
                cVar.setIconColorId(R.id.theme_color_icon);
            }
        }
    }

    public View$OnClickListenerC8803m2(View$OnClickListenerC8851y1 y1Var, int i) {
        super(y1Var, i);
    }

    @Override
    public int mo408A9() {
        return 4;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_sponsoredMessagesInfo;
    }

    @Override
    public ViewGroup mo405hf() {
        RecyclerView recyclerView = new RecyclerView(this.f30168a);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f30168a));
        C8805b bVar = new C8805b(this);
        recyclerView.setAdapter(bVar);
        bVar.m34116y2(new C2964ra[]{new C2964ra(2), new C2964ra(4, R.id.btn_close, R.drawable.baseline_check_circle_24, R.string.Continue).m32846d0(R.id.theme_color_textNeutral), new C2964ra(4, R.id.btn_openLink, R.drawable.baseline_help_24, R.string.SponsoredInfoAction)}, false);
        return recyclerView;
    }

    @Override
    public boolean mo404jc(boolean z) {
        this.f28443n0.m11111u2(false);
        return true;
    }

    @Override
    public View mo403oc(Context context) {
        m11300bf(false);
        m11288jg(new LinearLayoutManager(mo4347s(), 1, false));
        C8804a aVar = new C8804a(this);
        this.f28426I0 = aVar;
        m11292hg(aVar);
        C10192g.m5781j(this.f28453x0, R.id.theme_color_background);
        this.f28426I0.m34116y2(new C2964ra[]{new C2964ra(14), new C2964ra(9, 0, 0, R.string.SponsoredInfoText), new C2964ra(2), new C2964ra(4, (int) R.id.btn_openLink, (int) R.drawable.baseline_language_24, (CharSequence) C4403w.m27871i1(R.string.url_promote), false).m32846d0(R.id.theme_color_textNeutral), new C2964ra(3), new C2964ra(9, 0, 0, R.string.SponsoredInfoText2)}, false);
        return this.f28451v0;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_openLink) {
            this.f28443n0.m11111u2(false);
            C1405v.m37140F(Uri.parse(C4403w.m27871i1(R.string.url_promote)));
        }
    }
}
