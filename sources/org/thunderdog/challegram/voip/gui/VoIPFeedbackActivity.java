package org.thunderdog.challegram.voip.gui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import be.C1357a0;
import be.C1379j0;
import me.C6847b2;
import me.View$OnFocusChangeListenerC7069y1;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.AbstractView$OnTouchListenerC7889a;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.voip.gui.BetterRatingView;
import org.thunderdog.challegram.voip.gui.VoIPFeedbackActivity;
import p082fd.C4403w;
import p350yd.C10536ab;
import p350yd.C10930q6;
import p364zd.C11524j;

public class VoIPFeedbackActivity extends Activity {
    private void finishDelayed() {
        C1379j0.m37332e0(new Runnable() {
            @Override
            public final void run() {
                VoIPFeedbackActivity.this.lambda$finishDelayed$4();
            }
        }, 500L);
    }

    public void lambda$onCreate$0(BetterRatingView betterRatingView, View$OnFocusChangeListenerC7069y1 y1Var, DialogInterface dialogInterface, int i) {
        int intExtra = getIntent().getIntExtra("account_id", -1);
        int intExtra2 = getIntent().getIntExtra("call_id", 0);
        int rating = betterRatingView.getRating();
        String charSequence = rating < 5 ? y1Var.getText().toString() : "";
        Log.m14721i(2, "Submitting call feedback, call_id: %d, rating: %d, comment: %s", Integer.valueOf(intExtra2), Integer.valueOf(rating), charSequence);
        C10930q6 R0 = C10536ab.m4756R0(intExtra);
        R0.m2270r4().m14783o(new TdApi.SendCallRating(intExtra2, rating, charSequence, null), R0.m2392ja());
        finishDelayed();
    }

    public void lambda$onCreate$1(DialogInterface dialogInterface, int i) {
        Log.m14721i(2, "User denied to give feedback", new Object[0]);
        finishDelayed();
    }

    public void lambda$onCreate$2(DialogInterface dialogInterface) {
        lambda$finishDelayed$4();
    }

    public void lambda$onCreate$3(View view, View$OnFocusChangeListenerC7069y1 y1Var, int i) {
        InputMethodManager inputMethodManager;
        view.setEnabled(i > 0);
        y1Var.setVisibility((i >= 5 || i <= 0) ? 8 : 0);
        if (y1Var.getVisibility() == 8 && (inputMethodManager = (InputMethodManager) getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(y1Var.getWindowToken(), 0);
        }
    }

    @Override
    public void lambda$finishDelayed$4() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override
    public void onCreate(Bundle bundle) {
        getWindow().addFlags(Log.TAG_PLAYER);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new View(this));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        int i = C1357a0.m37541i(16.0f);
        linearLayout.setPadding(i, i, i, i);
        int S0 = C11524j.m217S0();
        C6847b2 b2Var = new C6847b2(this);
        b2Var.setTextSize(2, 16.0f);
        b2Var.setTextColor(S0);
        b2Var.setGravity(17);
        b2Var.setText(C4403w.m27869i1(R.string.VoipRateCallAlert));
        linearLayout.addView(b2Var);
        final BetterRatingView betterRatingView = new BetterRatingView(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        layoutParams.topMargin = C1357a0.m37541i(16.0f);
        linearLayout.addView(betterRatingView, layoutParams);
        final View$OnFocusChangeListenerC7069y1 y1Var = new View$OnFocusChangeListenerC7069y1(this);
        y1Var.setHint(R.string.VoipFeedbackCommentHint);
        y1Var.setVisibility(8);
        y1Var.getEditText().setInputType(147457);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams2.topMargin = C1357a0.m37541i(16.0f);
        linearLayout.addView(y1Var, layoutParams2);
        AlertDialog show = new AlertDialog.Builder(this, C11524j.m150v()).setTitle(C4403w.m27869i1(R.string.AppName)).setView(linearLayout).setPositiveButton(C4403w.m27950P0(), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                VoIPFeedbackActivity.this.lambda$onCreate$0(betterRatingView, y1Var, dialogInterface, i2);
            }
        }).setNegativeButton(C4403w.m27869i1(R.string.Cancel), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                VoIPFeedbackActivity.this.lambda$onCreate$1(dialogInterface, i2);
            }
        }).show();
        AbstractView$OnTouchListenerC7889a.m14556O1(this, show, null);
        show.setCanceledOnTouchOutside(true);
        show.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                VoIPFeedbackActivity.this.lambda$onCreate$2(dialogInterface);
            }
        });
        final Button button = show.getButton(-1);
        button.setEnabled(false);
        betterRatingView.setOnRatingChangeListener(new BetterRatingView.OnRatingChangeListener() {
            @Override
            public final void onRatingChanged(int i2) {
                VoIPFeedbackActivity.this.lambda$onCreate$3(button, y1Var, i2);
            }
        });
    }
}
