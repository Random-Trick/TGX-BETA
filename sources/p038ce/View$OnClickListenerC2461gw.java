package p038ce;

import android.content.Context;
import android.view.View;
import be.C1363c0;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p082fd.C4403w;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p350yd.C10930q6;

public class View$OnClickListenerC2461gw extends AbstractC3204vo<Void> implements View.OnClickListener {
    public View$OnClickListenerC2461gw(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    public boolean m34498Cg(View view, int i) {
        if (i == R.id.btn_edit) {
            View$OnClickListenerC2393fk fkVar = new View$OnClickListenerC2393fk(this.f30168a, this.f30170b);
            fkVar.m34657vg(1);
            m9291ac(fkVar);
        }
        return true;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_editPhone;
    }

    @Override
    public CharSequence mo9313X9() {
        TdApi.User Z9 = this.f30170b.m2550Z9();
        return Z9 != null ? C1363c0.m37413w(Z9.phoneNumber) : C4403w.m27871i1(R.string.PhoneNumberChange);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_changePhoneNumber) {
            m9261ee(C4403w.m27871i1(R.string.PhoneNumberAlert), new int[]{R.id.btn_edit, R.id.btn_cancel}, new String[]{C4403w.m27871i1(R.string.PhoneNumberChangeDone), C4403w.m27871i1(R.string.Cancel)}, null, new int[]{R.drawable.baseline_check_circle_24, R.drawable.baseline_cancel_24}, new AbstractC5117h0() {
                @Override
                public final boolean mo493A3(View view2, int i) {
                    boolean Cg;
                    Cg = View$OnClickListenerC2461gw.this.m34498Cg(view2, i);
                    return Cg;
                }

                @Override
                public boolean mo492Q() {
                    return C5115g0.m23936a(this);
                }

                @Override
                public Object mo491b2(int i) {
                    return C5115g0.m23935b(this, i);
                }
            });
        }
    }

    @Override
    public void mo30635rg(Context context, CustomRecyclerView customRecyclerView) {
        C2546iq iqVar = new C2546iq(this);
        iqVar.m34116y2(new C2964ra[]{new C2964ra(19, (int) R.id.changePhoneText, (int) R.drawable.baseline_sim_card_96, C1363c0.m37451Z(C4403w.m27871i1(R.string.PhoneNumberHelp), R.id.theme_color_background_textLight), false), new C2964ra(2), new C2964ra(20, R.id.btn_changePhoneNumber, 0, R.string.PhoneNumberChange), new C2964ra(3)}, false);
        customRecyclerView.setAdapter(iqVar);
    }
}
