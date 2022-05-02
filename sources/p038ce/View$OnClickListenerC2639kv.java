package p038ce;

import android.content.Context;
import android.view.View;
import ge.C4862d;
import java.util.ArrayList;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.CustomRecyclerView;
import p082fd.C4403w;
import p350yd.C10930q6;
import tc.C9137c;
import td.AbstractC9323v4;
import td.C9289s;

public class View$OnClickListenerC2639kv extends AbstractC3204vo<Void> implements View.OnClickListener {
    public C2546iq f8931D0;
    public C9289s f8932E0;

    public class C2640a extends C2546iq {
        public C2640a(AbstractC9323v4 v4Var) {
            super(v4Var);
        }

        @Override
        public void mo394V2(C2964ra raVar, C9137c cVar, boolean z) {
            cVar.setIconColorId(raVar.m32835j() == R.id.btn_logout ? R.id.theme_color_iconNegative : 0);
        }
    }

    public View$OnClickListenerC2639kv(Context context, C10930q6 q6Var) {
        super(context, q6Var);
    }

    @Override
    public View mo8869G9() {
        return this.f8932E0;
    }

    @Override
    public int mo407R9() {
        return R.id.controller_logOut;
    }

    @Override
    public CharSequence mo9313X9() {
        return C4403w.m27869i1(R.string.LogOut);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_addAccount:
                this.f30167b.m2485dd().m3394z2(this.f30165a, true, false);
                return;
            case R.id.btn_changePhoneNumber:
                m9291ac(new View$OnClickListenerC2461gw(this.f30165a, this.f30167b));
                return;
            case R.id.btn_help:
                this.f30167b.m2485dd().m3878C7(this);
                return;
            case R.id.btn_logout:
                this.f30167b.m2485dd().m3639a7(this, false);
                return;
            case R.id.btn_passcode:
                if (!C4862d.m24934w().m24933x()) {
                    m9291ac(new View$OnClickListenerC2714mi(this.f30165a, this.f30167b));
                    return;
                }
                return;
            case R.id.btn_storageUsage:
                m9291ac(new View$OnClickListenerC2942qs(this.f30165a, this.f30167b));
                return;
            default:
                return;
        }
    }

    @Override
    public boolean mo31074pg() {
        return true;
    }

    @Override
    public void mo30633rg(Context context, CustomRecyclerView customRecyclerView) {
        C9289s sVar = new C9289s(context);
        sVar.setThemedTextColor(this);
        sVar.m9632D1(0, true);
        sVar.setTitle(mo9313X9());
        sVar.setSubtitle(C4403w.m27869i1(R.string.SignOutAlt));
        this.f8932E0 = sVar;
        this.f8931D0 = new C2640a(this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2964ra(4, R.id.btn_addAccount, R.drawable.baseline_person_add_24, R.string.SignOutAltAddAccount));
        arrayList.add(new C2964ra(3));
        arrayList.add(new C2964ra(9, 0, 0, R.string.SignOutAltAddAccountHint));
        if (!C4862d.m24934w().m24933x()) {
            arrayList.add(new C2964ra(2));
            arrayList.add(new C2964ra(4, R.id.btn_passcode, R.drawable.baseline_lock_24, R.string.SignOutAltPasscode));
            arrayList.add(new C2964ra(3));
            arrayList.add(new C2964ra(9, 0, 0, R.string.SignOutAltPasscodeHint));
        }
        arrayList.add(new C2964ra(2));
        arrayList.add(new C2964ra(4, R.id.btn_storageUsage, R.drawable.templarian_baseline_broom_24, R.string.SignOutAltClearCache));
        arrayList.add(new C2964ra(3));
        arrayList.add(new C2964ra(9, 0, 0, R.string.SignOutAltClearCacheHint));
        arrayList.add(new C2964ra(2));
        arrayList.add(new C2964ra(4, R.id.btn_changePhoneNumber, R.drawable.baseline_sim_card_24, R.string.SignOutAltChangeNumber));
        arrayList.add(new C2964ra(3));
        arrayList.add(new C2964ra(9, 0, 0, R.string.SignOutAltChangeNumberHint));
        arrayList.add(new C2964ra(2));
        arrayList.add(new C2964ra(4, R.id.btn_help, R.drawable.baseline_help_24, R.string.SignOutAltHelp));
        arrayList.add(new C2964ra(3));
        arrayList.add(new C2964ra(9, 0, 0, R.string.SignOutAltHelpHint));
        arrayList.add(new C2964ra(2));
        arrayList.add(new C2964ra(4, R.id.btn_logout, R.drawable.baseline_delete_forever_24, R.string.LogOut).m32843d0(R.id.theme_color_textNegative));
        arrayList.add(new C2964ra(3));
        arrayList.add(new C2964ra(9, 0, 0, R.string.SignOutAltHint2));
        this.f8931D0.m34116x2(arrayList, false);
        customRecyclerView.setAdapter(this.f8931D0);
    }
}
