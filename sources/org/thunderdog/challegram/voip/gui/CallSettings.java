package org.thunderdog.challegram.voip.gui;

import android.view.View;
import gd.C4779t2;
import org.drinkless.p210td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.service.TGCallService;
import org.thunderdog.challegram.voip.gui.CallSettings;
import p082fd.C4403w;
import p111he.AbstractC5117h0;
import p111he.C5115g0;
import p350yd.C10930q6;
import td.AbstractC9323v4;

public class CallSettings {
    public static final int SPEAKER_MODE_BLUETOOTH = 2;
    public static final int SPEAKER_MODE_NONE = 0;
    public static final int SPEAKER_MODE_SPEAKER = 3;
    public static final int SPEAKER_MODE_SPEAKER_DEFAULT = 1;
    private final int callId;
    private boolean micMuted;
    private int speakerMode;
    private final C10930q6 tdlib;

    public CallSettings(C10930q6 q6Var, int i) {
        this.tdlib = q6Var;
        this.callId = i;
    }

    private boolean isCallActive() {
        TdApi.Call g0 = this.tdlib.m2480e2().m1644g0(this.callId);
        return g0 != null && !C4779t2.m25562Z2(g0);
    }

    public boolean lambda$toggleSpeakerMode$0(View view, int i) {
        switch (i) {
            case R.id.btn_routingBluetooth:
                setSpeakerMode(2);
                return true;
            case R.id.btn_routingEarpiece:
                setSpeakerMode(0);
                return true;
            case R.id.btn_routingSpeaker:
                setSpeakerMode(3);
                return true;
            default:
                return true;
        }
    }

    public int getSpeakerMode() {
        return this.speakerMode;
    }

    public boolean isEmpty() {
        return !this.micMuted && this.speakerMode == 0;
    }

    public boolean isMicMuted() {
        return this.micMuted;
    }

    public boolean isSpeakerModeEnabled() {
        return this.speakerMode != 0;
    }

    public void setMicMuted(boolean z) {
        if (this.micMuted != z) {
            this.micMuted = z;
            this.tdlib.m2480e2().m1624l1(this.callId, this);
        }
    }

    public void setSpeakerMode(int i) {
        if (this.speakerMode != i && isCallActive()) {
            this.speakerMode = i;
            this.tdlib.m2480e2().m1624l1(this.callId, this);
        }
    }

    public void toggleSpeakerMode(AbstractC9323v4<?> v4Var) {
        TGCallService w = TGCallService.m14211w();
        if (w != null) {
            if (!w.m14255G() || !w.m14257E()) {
                setSpeakerMode(!isSpeakerModeEnabled());
            } else {
                v4Var.m9261ee(null, new int[]{R.id.btn_routingBluetooth, R.id.btn_routingEarpiece, R.id.btn_routingSpeaker}, new String[]{C4403w.m27869i1(R.string.VoipAudioRoutingBluetooth), C4403w.m27869i1(R.string.VoipAudioRoutingEarpiece), C4403w.m27869i1(R.string.VoipAudioRoutingSpeaker)}, null, new int[]{R.drawable.baseline_bluetooth_24, R.drawable.baseline_phone_in_talk_24, R.drawable.baseline_volume_up_24}, new AbstractC5117h0() {
                    @Override
                    public final boolean mo493A3(View view, int i) {
                        boolean lambda$toggleSpeakerMode$0;
                        lambda$toggleSpeakerMode$0 = CallSettings.this.lambda$toggleSpeakerMode$0(view, i);
                        return lambda$toggleSpeakerMode$0;
                    }

                    @Override
                    public boolean mo492Q() {
                        return C5115g0.m23935a(this);
                    }

                    @Override
                    public Object mo491b2(int i) {
                        return C5115g0.m23934b(this, i);
                    }
                });
            }
        }
    }
}
