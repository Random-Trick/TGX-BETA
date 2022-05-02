package p291uc;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import be.C1357a0;
import be.C1399s0;
import be.C1408x;
import me.C6847b2;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.p211v.EditTextBase;
import p037cb.C2065g;
import p110hd.C5078d;
import p364zd.C11524j;
import td.AbstractC9323v4;

public class ViewTreeObserver$OnPreDrawListenerC9542g extends ViewGroup implements ViewTreeObserver.OnPreDrawListener, View.OnClickListener {
    public boolean f30921P;
    public AbstractC9543a f30922Q;
    public AbstractC9323v4<?> f30923R;
    public int f30925T;
    public int f30926U;
    public int f30927V;
    public boolean f30928a;
    public int f30929b;
    public int[] f30930c;
    public int f30918M = C1357a0.m37541i(15.0f);
    public int f30919N = C1357a0.m37541i(10.0f);
    public int f30920O = C1357a0.m37541i(42.0f);
    public int f30924S = C1408x.m37090a();

    public interface AbstractC9543a {
        void mo8378C1(int i);

        void mo8377l1();

        void mo8376r2(boolean z, boolean z2, boolean z3);

        void mo8375r6(boolean z);

        void mo8374w3(boolean z);

        void mo8373y5(String str);
    }

    public ViewTreeObserver$OnPreDrawListenerC9542g(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, this.f30924S));
    }

    public final void m8387a(TdApi.KeyboardButton[][] keyboardButtonArr) {
        TextView textView;
        int length = keyboardButtonArr.length;
        this.f30929b = length;
        this.f30930c = new int[length];
        this.f30921P = true;
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        for (TdApi.KeyboardButton[] keyboardButtonArr2 : keyboardButtonArr) {
            i2++;
            this.f30930c[i2] = keyboardButtonArr2.length;
            for (TdApi.KeyboardButton keyboardButton : keyboardButtonArr2) {
                if (i >= childCount) {
                    textView = m8386b();
                    addView(textView);
                } else {
                    textView = (TextView) getChildAt(i);
                    textView.setVisibility(0);
                }
                textView.setTag(keyboardButton);
                textView.setText(keyboardButton.text != null ? C5078d.m23986z().m24024I(keyboardButton.text) : "");
                i++;
            }
        }
        if (childCount > i) {
            for (int i3 = childCount - 1; i3 >= i; i3--) {
                View childAt = getChildAt(i3);
                if (childAt != null) {
                    if (i3 > 10) {
                        AbstractC9323v4<?> v4Var = this.f30923R;
                        if (v4Var != null) {
                            v4Var.m9180qd(childAt);
                        }
                        removeViewAt(i3);
                    } else {
                        childAt.setVisibility(8);
                    }
                }
            }
        }
        this.f30921P = false;
    }

    public final TextView m8386b() {
        C6847b2 b2Var = new C6847b2(getContext());
        C2065g.m35718d(b2Var, C11524j.m229M0(4.0f, 0.0f, R.id.theme_color_chatKeyboardButton));
        AbstractC9323v4<?> v4Var = this.f30923R;
        if (v4Var != null) {
            v4Var.m9163t8(b2Var);
        }
        b2Var.setGravity(17);
        b2Var.setTextColor(C11524j.m217S0());
        AbstractC9323v4<?> v4Var2 = this.f30923R;
        if (v4Var2 != null) {
            v4Var2.m9126y8(b2Var);
        }
        b2Var.setTextSize(1, 16.0f);
        b2Var.setOnClickListener(this);
        b2Var.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        C1399s0.m37193a0(b2Var);
        return b2Var;
    }

    public void m8385c(EditTextBase editTextBase) {
        this.f30926U = 2;
        C1408x.m37088c(editTextBase);
    }

    public final void m8384d(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.leftMargin != i || marginLayoutParams.topMargin != i2 || marginLayoutParams.width != i3 || marginLayoutParams.height != i4) {
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.topMargin = i2;
            marginLayoutParams.width = i3;
            marginLayoutParams.height = i4;
            view.requestLayout();
        }
    }

    public final void m8383e(int i, boolean z, int i2) {
        int childCount = getChildCount();
        int max = Math.max(getParentSize(), this.f30924S);
        int i3 = this.f30918M;
        int i4 = this.f30919N;
        int i5 = this.f30929b;
        int i6 = (int) (((i - (this.f30918M * 2)) - (this.f30919N * (this.f30930c[0] - 1))) / this.f30930c[0]);
        int i7 = (int) (((max - (i3 * 2)) - (i4 * (i5 - 1))) / i5);
        int i8 = i3;
        int i9 = i8;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < childCount) {
            if (this.f30930c[i11] == 0) {
                i11++;
            } else {
                View childAt = getChildAt(i10);
                m8384d(childAt, i8, i9, i6, i7);
                if (z) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(i7, Log.TAG_TDLIB_OPTIONS));
                    int i13 = i2 + i9;
                    childAt.layout(i8, i13, i6 + i8, i13 + i7);
                }
                i10++;
                i12++;
                int[] iArr = this.f30930c;
                if (i12 == iArr[i11]) {
                    i11++;
                    if (i11 != this.f30929b) {
                        int i14 = this.f30918M;
                        int i15 = this.f30919N;
                        i9 = i9 + i15 + i7;
                        i6 = (int) (((i - (i14 * 2)) - (i15 * (iArr[i11] - 1))) / iArr[i11]);
                        i8 = i14;
                        i12 = 0;
                    } else {
                        return;
                    }
                } else {
                    i8 += this.f30919N + i6;
                }
            }
        }
    }

    public void m8382f(boolean z) {
        int i = this.f30926U;
        if (i == 1 && z) {
            this.f30927V = 35;
        } else if (i == 2 && !z) {
            this.f30926U = 0;
        }
    }

    public final void m8381g(boolean z) {
        int i = this.f30920O;
        int i2 = this.f30929b;
        int i3 = (i * i2) + (this.f30919N * (i2 - 1)) + (this.f30918M * 2);
        m8380h(i3, z ? i3 : C1408x.m37090a());
    }

    public int getParentSize() {
        ViewParent parent = getParent();
        if (parent != null) {
            return ((View) parent).getLayoutParams().height;
        }
        return 0;
    }

    public int getSize() {
        return this.f30924S;
    }

    public void m8380h(int i, int i2) {
        AbstractC9543a aVar;
        boolean z = getParent() != null;
        if (z) {
            ((View) getParent()).getLayoutParams().height = Math.min(i2, this.f30920O * 7);
        }
        if (this.f30924S != i) {
            this.f30924S = i;
            getLayoutParams().height = i;
            requestLayout();
        } else if (z) {
            getParent().requestLayout();
        }
        if (z && (aVar = this.f30922Q) != null) {
            aVar.mo8378C1(getParentSize());
        }
    }

    public void m8379i(EditTextBase editTextBase) {
        this.f30926U = 1;
        C1408x.m37085f(editTextBase);
    }

    @Override
    public void onClick(View view) {
        if (this.f30922Q != null) {
            TdApi.KeyboardButton keyboardButton = (TdApi.KeyboardButton) view.getTag();
            switch (keyboardButton.type.getConstructor()) {
                case TdApi.KeyboardButtonTypeText.CONSTRUCTOR:
                    this.f30922Q.mo8373y5(keyboardButton.text);
                    if (this.f30928a) {
                        this.f30922Q.mo8377l1();
                        return;
                    }
                    return;
                case TdApi.KeyboardButtonTypeRequestPhoneNumber.CONSTRUCTOR:
                    this.f30922Q.mo8375r6(this.f30928a);
                    return;
                case TdApi.KeyboardButtonTypeRequestLocation.CONSTRUCTOR:
                    this.f30922Q.mo8374w3(this.f30928a);
                    return;
                case TdApi.KeyboardButtonTypeRequestPoll.CONSTRUCTOR:
                    TdApi.KeyboardButtonTypeRequestPoll keyboardButtonTypeRequestPoll = (TdApi.KeyboardButtonTypeRequestPoll) keyboardButton.type;
                    this.f30922Q.mo8376r2(this.f30928a, keyboardButtonTypeRequestPoll.forceQuiz, keyboardButtonTypeRequestPoll.forceRegular);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        if (!this.f30921P) {
            int i6 = this.f30925T;
            if (i6 != 0) {
                this.f30925T = 0;
                i5 = i6;
                z = true;
            }
            if (z) {
                m8383e(i5, true, i2);
                return;
            }
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(marginLayoutParams.width, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.height, Log.TAG_TDLIB_OPTIONS));
                    int i8 = marginLayoutParams.leftMargin;
                    int i9 = marginLayoutParams.topMargin;
                    childAt.layout(i8, i2 + i9, marginLayoutParams.width + i8, i9 + i2 + marginLayoutParams.height);
                }
            }
        } else if (z) {
            this.f30925T = i5;
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(Math.max(getParentSize(), this.f30924S), Log.TAG_TDLIB_OPTIONS));
    }

    @Override
    public boolean onPreDraw() {
        int i = this.f30926U;
        if (i == 1) {
            int i2 = this.f30927V + 1;
            this.f30927V = i2;
            if (i2 < 40) {
                return false;
            }
            this.f30927V = 0;
            this.f30926U = 0;
            return true;
        } else if (i != 2) {
            return true;
        } else {
            int i3 = this.f30927V + 1;
            this.f30927V = i3;
            if (i3 < 40) {
                return false;
            }
            this.f30927V = 0;
            this.f30926U = 0;
            return true;
        }
    }

    public void setCallback(AbstractC9543a aVar) {
        this.f30922Q = aVar;
    }

    public void setKeyboard(TdApi.ReplyMarkupShowKeyboard replyMarkupShowKeyboard) {
        this.f30928a = replyMarkupShowKeyboard.oneTime;
        m8387a(replyMarkupShowKeyboard.rows);
        m8381g(replyMarkupShowKeyboard.resizeKeyboard);
        m8383e(C1357a0.m37543g(), false, 0);
        requestLayout();
        if (getParent() != null) {
            ((ScrollView) getParent()).scrollTo(0, 0);
        }
    }

    public void setThemeProvider(AbstractC9323v4<?> v4Var) {
        this.f30923R = v4Var;
    }
}
