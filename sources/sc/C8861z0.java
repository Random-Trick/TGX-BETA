package sc;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import gd.C4618d7;
import gd.C4779t2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.drinkless.p210td.libcore.telegram.Client;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import p053dd.View$OnClickListenerC4013l;

public class C8861z0 extends AbstractC8809o<Void> implements Client.AbstractC7865g, View$OnClickListenerC4013l.AbstractC4014a {
    public static final String[] f28607K0 = {"bing", "wiki", "gif", "nephobot", "vid"};
    public View$OnClickListenerC4013l f28608I0;
    public ArrayList<C4618d7> f28609J0 = new ArrayList<>(f28607K0.length);

    public C8861z0(View$OnClickListenerC8851y1 y1Var) {
        super(y1Var, (int) R.string.InlineBot);
    }

    public void m11090yg(List list) {
        this.f28608I0.m29322h0(list);
        m11286lf(this.f28608I0);
    }

    public void m11089zg() {
        m11100Bg(this.f28609J0);
    }

    public final void m11099Cg() {
        int size = this.f28609J0.size();
        String[] strArr = f28607K0;
        if (size <= strArr.length) {
            if (this.f28609J0.size() == strArr.length) {
                m9151ud(new Runnable() {
                    @Override
                    public final void run() {
                        C8861z0.this.m11089zg();
                    }
                });
            } else {
                this.f30167b.m2270r4().m14783o(new TdApi.SearchPublicChat(strArr[this.f28609J0.size()]), this);
            }
        }
    }

    @Override
    public void mo11098O1(C4618d7 d7Var) {
        this.f28440n0.m11133i2(d7Var);
    }

    @Override
    public int mo407R9() {
        return R.id.controller_media_inlineBots;
    }

    @Override
    public void mo11097f0(int i, C4618d7 d7Var, boolean z) {
    }

    @Override
    public View mo403oc(Context context) {
        m11301bf(true);
        m11289jg(new LinearLayoutManager(mo4347s(), 1, false));
        View$OnClickListenerC4013l lVar = new View$OnClickListenerC4013l(this, this, 1, this);
        this.f28608I0 = lVar;
        m11293hg(lVar);
        this.f30167b.m2270r4().m14783o(new TdApi.GetTopChats(new TdApi.TopChatCategoryInlineBots(), 50), this);
        return this.f28448v0;
    }

    @Override
    public void mo255t2(TdApi.Object object) {
        switch (object.getConstructor()) {
            case TdApi.Error.CONSTRUCTOR:
                m11292if(C4779t2.m25378z5(object), true);
                return;
            case TdApi.Chat.CONSTRUCTOR:
                m11092wg(this.f30167b.m2525b4((TdApi.Chat) object));
                return;
            case TdApi.Users.CONSTRUCTOR:
                long[] jArr = ((TdApi.Users) object).userIds;
                if (jArr.length == 0) {
                    m11099Cg();
                    return;
                }
                ArrayList<TdApi.User> T2 = this.f30167b.m2480e2().m1686T2(jArr);
                final ArrayList arrayList = new ArrayList(jArr.length);
                Iterator<TdApi.User> it = T2.iterator();
                while (it.hasNext()) {
                    arrayList.add(C4618d7.m26883e(this.f30167b, it.next()));
                }
                m9151ud(new Runnable() {
                    @Override
                    public final void run() {
                        C8861z0.this.m11100Bg(arrayList);
                    }
                });
                return;
            case TdApi.Chats.CONSTRUCTOR:
                long[] jArr2 = ((TdApi.Chats) object).chatIds;
                if (jArr2.length == 0) {
                    m11099Cg();
                    return;
                }
                final ArrayList arrayList2 = new ArrayList(jArr2.length);
                for (TdApi.Chat chat : this.f30167b.m2414i4(jArr2)) {
                    TdApi.User b4 = this.f30167b.m2525b4(chat);
                    if (b4 != null) {
                        arrayList2.add(C4618d7.m26883e(this.f30167b, b4));
                    }
                }
                if (arrayList2.isEmpty()) {
                    this.f30167b.m2270r4().m14783o(new TdApi.GetRecentInlineBots(), this);
                    return;
                } else {
                    m9151ud(new Runnable() {
                        @Override
                        public final void run() {
                            C8861z0.this.m11101Ag(arrayList2);
                        }
                    });
                    return;
                }
            default:
                return;
        }
    }

    public final void m11092wg(TdApi.User user) {
        this.f28609J0.add(C4618d7.m26883e(this.f30167b, user));
        m11099Cg();
    }

    public void m11100Bg(final List<C4618d7> list) {
        if (list.isEmpty()) {
            m11285lg(R.string.NothingFound, true);
        } else {
            m11328Hf(new Runnable() {
                @Override
                public final void run() {
                    C8861z0.this.m11090yg(list);
                }
            });
        }
    }
}
