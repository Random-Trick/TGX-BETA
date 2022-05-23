package vc;

import ae.j;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import ce.a0;
import ce.p0;
import ce.x;
import id.d;
import ne.b2;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.v.EditTextBase;
import ud.v4;

public class g extends ViewGroup implements ViewTreeObserver.OnPreDrawListener, View.OnClickListener {
    public boolean P;
    public a Q;
    public v4<?> R;
    public int T;
    public int U;
    public int V;
    public boolean f24946a;
    public int f24947b;
    public int[] f24948c;
    public int M = a0.i(15.0f);
    public int N = a0.i(10.0f);
    public int O = a0.i(42.0f);
    public int S = x.a();

    public interface a {
        void A1(int i10);

        void f1();

        void o3(boolean z10);

        void p2(boolean z10, boolean z11, boolean z12);

        void q6(boolean z10);

        void r5(String str);
    }

    public g(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, this.S));
    }

    public final void a(TdApi.KeyboardButton[][] keyboardButtonArr) {
        TextView textView;
        int length = keyboardButtonArr.length;
        this.f24947b = length;
        this.f24948c = new int[length];
        this.P = true;
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        for (TdApi.KeyboardButton[] keyboardButtonArr2 : keyboardButtonArr) {
            i11++;
            this.f24948c[i11] = keyboardButtonArr2.length;
            for (TdApi.KeyboardButton keyboardButton : keyboardButtonArr2) {
                if (i10 >= childCount) {
                    textView = b();
                    addView(textView);
                } else {
                    textView = (TextView) getChildAt(i10);
                    textView.setVisibility(0);
                }
                textView.setTag(keyboardButton);
                textView.setText(keyboardButton.text != null ? d.z().I(keyboardButton.text) : "");
                i10++;
            }
        }
        if (childCount > i10) {
            for (int i12 = childCount - 1; i12 >= i10; i12--) {
                View childAt = getChildAt(i12);
                if (childAt != null) {
                    if (i12 > 10) {
                        v4<?> v4Var = this.R;
                        if (v4Var != null) {
                            v4Var.qd(childAt);
                        }
                        removeViewAt(i12);
                    } else {
                        childAt.setVisibility(8);
                    }
                }
            }
        }
        this.P = false;
    }

    public final TextView b() {
        b2 b2Var = new b2(getContext());
        db.g.d(b2Var, j.K0(4.0f, 0.0f, R.id.theme_color_chatKeyboardButton));
        v4<?> v4Var = this.R;
        if (v4Var != null) {
            v4Var.t8(b2Var);
        }
        b2Var.setGravity(17);
        b2Var.setTextColor(j.P0());
        v4<?> v4Var2 = this.R;
        if (v4Var2 != null) {
            v4Var2.y8(b2Var);
        }
        b2Var.setTextSize(1, 16.0f);
        b2Var.setOnClickListener(this);
        b2Var.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        p0.T(b2Var);
        return b2Var;
    }

    public void c(EditTextBase editTextBase) {
        this.U = 2;
        x.c(editTextBase);
    }

    public final void d(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.leftMargin != i10 || marginLayoutParams.topMargin != i11 || marginLayoutParams.width != i12 || marginLayoutParams.height != i13) {
            marginLayoutParams.leftMargin = i10;
            marginLayoutParams.topMargin = i11;
            marginLayoutParams.width = i12;
            marginLayoutParams.height = i13;
            view.requestLayout();
        }
    }

    public final void e(int i10, boolean z10, int i11) {
        int childCount = getChildCount();
        int max = Math.max(getParentSize(), this.S);
        int i12 = this.M;
        int i13 = this.N;
        int i14 = this.f24947b;
        int i15 = (int) (((i10 - (this.M * 2)) - (this.N * (this.f24948c[0] - 1))) / this.f24948c[0]);
        int i16 = (int) (((max - (i12 * 2)) - (i13 * (i14 - 1))) / i14);
        int i17 = i12;
        int i18 = i17;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i19 < childCount) {
            if (this.f24948c[i20] == 0) {
                i20++;
            } else {
                View childAt = getChildAt(i19);
                d(childAt, i17, i18, i15, i16);
                if (z10) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i15, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(i16, Log.TAG_TDLIB_OPTIONS));
                    int i22 = i11 + i18;
                    childAt.layout(i17, i22, i15 + i17, i22 + i16);
                }
                i19++;
                i21++;
                int[] iArr = this.f24948c;
                if (i21 == iArr[i20]) {
                    i20++;
                    if (i20 != this.f24947b) {
                        int i23 = this.M;
                        int i24 = this.N;
                        i18 = i18 + i24 + i16;
                        i15 = (int) (((i10 - (i23 * 2)) - (i24 * (iArr[i20] - 1))) / iArr[i20]);
                        i17 = i23;
                        i21 = 0;
                    } else {
                        return;
                    }
                } else {
                    i17 += this.N + i15;
                }
            }
        }
    }

    public void f(boolean z10) {
        int i10 = this.U;
        if (i10 == 1 && z10) {
            this.V = 35;
        } else if (i10 == 2 && !z10) {
            this.U = 0;
        }
    }

    public final void g(boolean z10) {
        int i10 = this.O;
        int i11 = this.f24947b;
        int i12 = (i10 * i11) + (this.N * (i11 - 1)) + (this.M * 2);
        h(i12, z10 ? i12 : x.a());
    }

    public int getParentSize() {
        ViewParent parent = getParent();
        if (parent != null) {
            return ((View) parent).getLayoutParams().height;
        }
        return 0;
    }

    public int getSize() {
        return this.S;
    }

    public void h(int i10, int i11) {
        a aVar;
        boolean z10 = getParent() != null;
        if (z10) {
            ((View) getParent()).getLayoutParams().height = Math.min(i11, this.O * 7);
        }
        if (this.S != i10) {
            this.S = i10;
            getLayoutParams().height = i10;
            requestLayout();
        } else if (z10) {
            getParent().requestLayout();
        }
        if (z10 && (aVar = this.Q) != null) {
            aVar.A1(getParentSize());
        }
    }

    public void i(EditTextBase editTextBase) {
        this.U = 1;
        x.f(editTextBase);
    }

    @Override
    public void onClick(View view) {
        if (this.Q != null) {
            TdApi.KeyboardButton keyboardButton = (TdApi.KeyboardButton) view.getTag();
            switch (keyboardButton.type.getConstructor()) {
                case TdApi.KeyboardButtonTypeText.CONSTRUCTOR:
                    this.Q.r5(keyboardButton.text);
                    if (this.f24946a) {
                        this.Q.f1();
                        return;
                    }
                    return;
                case TdApi.KeyboardButtonTypeRequestPhoneNumber.CONSTRUCTOR:
                    this.Q.q6(this.f24946a);
                    return;
                case TdApi.KeyboardButtonTypeRequestLocation.CONSTRUCTOR:
                    this.Q.o3(this.f24946a);
                    return;
                case TdApi.KeyboardButtonTypeRequestPoll.CONSTRUCTOR:
                    TdApi.KeyboardButtonTypeRequestPoll keyboardButtonTypeRequestPoll = (TdApi.KeyboardButtonTypeRequestPoll) keyboardButton.type;
                    this.Q.p2(this.f24946a, keyboardButtonTypeRequestPoll.forceQuiz, keyboardButtonTypeRequestPoll.forceRegular);
                    return;
                default:
                    return;
            }
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        if (!this.P) {
            int i15 = this.T;
            if (i15 != 0) {
                this.T = 0;
                i14 = i15;
                z10 = true;
            }
            if (z10) {
                e(i14, true, i11);
                return;
            }
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                View childAt = getChildAt(i16);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(marginLayoutParams.width, Log.TAG_TDLIB_OPTIONS), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.height, Log.TAG_TDLIB_OPTIONS));
                    int i17 = marginLayoutParams.leftMargin;
                    int i18 = marginLayoutParams.topMargin;
                    childAt.layout(i17, i11 + i18, marginLayoutParams.width + i17, i18 + i11 + marginLayoutParams.height);
                }
            }
        } else if (z10) {
            this.T = i14;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(i10, View.MeasureSpec.makeMeasureSpec(Math.max(getParentSize(), this.S), Log.TAG_TDLIB_OPTIONS));
    }

    @Override
    public boolean onPreDraw() {
        int i10 = this.U;
        if (i10 == 1) {
            int i11 = this.V + 1;
            this.V = i11;
            if (i11 < 40) {
                return false;
            }
            this.V = 0;
            this.U = 0;
            return true;
        } else if (i10 != 2) {
            return true;
        } else {
            int i12 = this.V + 1;
            this.V = i12;
            if (i12 < 40) {
                return false;
            }
            this.V = 0;
            this.U = 0;
            return true;
        }
    }

    public void setCallback(a aVar) {
        this.Q = aVar;
    }

    public void setKeyboard(TdApi.ReplyMarkupShowKeyboard replyMarkupShowKeyboard) {
        this.f24946a = replyMarkupShowKeyboard.oneTime;
        a(replyMarkupShowKeyboard.rows);
        g(replyMarkupShowKeyboard.resizeKeyboard);
        e(a0.g(), false, 0);
        requestLayout();
        if (getParent() != null) {
            ((ScrollView) getParent()).scrollTo(0, 0);
        }
    }

    public void setThemeProvider(v4<?> v4Var) {
        this.R = v4Var;
    }
}
