package org.thunderdog.challegram.voip.gui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import p350yd.C10536ab;

public class VoIPPermissionActivity extends Activity {
    private int accountId;
    private int callId;
    private boolean isVideo;

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            this.accountId = intent.getIntExtra("account_id", -1);
            this.callId = intent.getIntExtra("call_id", 0);
            this.isVideo = intent.getBooleanExtra("is_video", false);
        } else {
            this.accountId = -1;
            this.callId = 0;
            this.isVideo = false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 101);
        }
    }

    @Override
    @TargetApi(23)
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i != 101) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            if (!shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                C10536ab.m4756R0(this.accountId).m2930B4().m4713c0().m4606G(C10536ab.m4756R0(this.accountId), this.callId, this.isVideo);
            }
            finish();
            return;
        }
        C10536ab.m4756R0(this.accountId).m2930B4().m4713c0().m4613B(C10536ab.m4756R0(this.accountId), this.callId);
        finish();
    }
}
