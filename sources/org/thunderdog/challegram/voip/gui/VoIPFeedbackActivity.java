package org.thunderdog.challegram.voip.gui;

import ae.j;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;
import ce.a0;
import ce.j0;
import gd.w;
import ne.b2;
import ne.y1;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.Log;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.a;
import org.thunderdog.challegram.voip.gui.BetterRatingView;
import org.thunderdog.challegram.voip.gui.VoIPFeedbackActivity;
import zd.o6;
import zd.ya;

public class VoIPFeedbackActivity extends Activity {
    private void finishDelayed() {
        j0.e0(new Runnable() {
            @Override
            public final void run() {
                VoIPFeedbackActivity.this.lambda$finishDelayed$4();
            }
        }, 500L);
    }

    public void lambda$onCreate$0(BetterRatingView betterRatingView, y1 y1Var, DialogInterface dialogInterface, int i10) {
        int intExtra = getIntent().getIntExtra("account_id", -1);
        int intExtra2 = getIntent().getIntExtra("call_id", 0);
        int rating = betterRatingView.getRating();
        String charSequence = rating < 5 ? y1Var.getText().toString() : "";
        Log.i(2, "Submitting call feedback, call_id: %d, rating: %d, comment: %s", Integer.valueOf(intExtra2), Integer.valueOf(rating), charSequence);
        o6 R0 = ya.R0(intExtra);
        R0.v4().o(new TdApi.SendCallRating(intExtra2, rating, charSequence, null), R0.na());
        finishDelayed();
    }

    public void lambda$onCreate$1(DialogInterface dialogInterface, int i10) {
        Log.i(2, "User denied to give feedback", new Object[0]);
        finishDelayed();
    }

    public void lambda$onCreate$2(DialogInterface dialogInterface) {
        lambda$finishDelayed$4();
    }

    public void lambda$onCreate$3(View view, y1 y1Var, int i10) {
        InputMethodManager inputMethodManager;
        view.setEnabled(i10 > 0);
        y1Var.setVisibility((i10 >= 5 || i10 <= 0) ? 8 : 0);
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
        int i10 = a0.i(16.0f);
        linearLayout.setPadding(i10, i10, i10, i10);
        int P0 = j.P0();
        b2 b2Var = new b2(this);
        b2Var.setTextSize(2, 16.0f);
        b2Var.setTextColor(P0);
        b2Var.setGravity(17);
        b2Var.setText(w.i1(R.string.VoipRateCallAlert));
        linearLayout.addView(b2Var);
        final BetterRatingView betterRatingView = new BetterRatingView(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2, 1.0f);
        layoutParams.topMargin = a0.i(16.0f);
        linearLayout.addView(betterRatingView, layoutParams);
        final y1 y1Var = new y1(this);
        y1Var.setHint(R.string.VoipFeedbackCommentHint);
        y1Var.setVisibility(8);
        y1Var.getEditText().setInputType(147457);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams2.topMargin = a0.i(16.0f);
        linearLayout.addView(y1Var, layoutParams2);
        AlertDialog show = new AlertDialog.Builder(this, j.t()).setTitle(w.i1(R.string.AppName)).setView(linearLayout).setPositiveButton(w.P0(), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i11) {
                VoIPFeedbackActivity.this.lambda$onCreate$0(betterRatingView, y1Var, dialogInterface, i11);
            }
        }).setNegativeButton(w.i1(R.string.Cancel), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i11) {
                VoIPFeedbackActivity.this.lambda$onCreate$1(dialogInterface, i11);
            }
        }).show();
        a.P1(this, show, null);
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
            public final void onRatingChanged(int i11) {
                VoIPFeedbackActivity.this.lambda$onCreate$3(button, y1Var, i11);
            }
        });
    }
}
