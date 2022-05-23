package org.thunderdog.challegram.voip.gui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import zd.ya;

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
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 101) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            if (!shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                ya.R0(this.accountId).F4().c0().E(ya.R0(this.accountId), this.callId, this.isVideo);
            }
            finish();
            return;
        }
        ya.R0(this.accountId).F4().c0().z(ya.R0(this.accountId), this.callId);
        finish();
    }
}
