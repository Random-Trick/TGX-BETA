package org.thunderdog.challegram.voip.gui;

import android.view.View;
import gd.w;
import hd.t2;
import ie.g0;
import ie.h0;
import org.drinkless.td.libcore.telegram.TdApi;
import org.thunderdog.challegram.R;
import org.thunderdog.challegram.service.TGCallService;
import org.thunderdog.challegram.voip.gui.CallSettings;
import ud.v4;
import zd.o6;

public class CallSettings {
    public static final int SPEAKER_MODE_BLUETOOTH = 2;
    public static final int SPEAKER_MODE_NONE = 0;
    public static final int SPEAKER_MODE_SPEAKER = 3;
    public static final int SPEAKER_MODE_SPEAKER_DEFAULT = 1;
    private final int callId;
    private boolean micMuted;
    private int speakerMode;
    private final o6 tdlib;

    public CallSettings(o6 o6Var, int i10) {
        this.tdlib = o6Var;
        this.callId = i10;
    }

    private boolean isCallActive() {
        TdApi.Call g02 = this.tdlib.e2().g0(this.callId);
        return g02 != null && !t2.Z2(g02);
    }

    public boolean lambda$toggleSpeakerMode$0(View view, int i10) {
        switch (i10) {
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

    public void setMicMuted(boolean z10) {
        if (this.micMuted != z10) {
            this.micMuted = z10;
            this.tdlib.e2().j1(this.callId, this);
        }
    }

    public void setSpeakerMode(int i10) {
        if (this.speakerMode != i10 && isCallActive()) {
            this.speakerMode = i10;
            this.tdlib.e2().j1(this.callId, this);
        }
    }

    public void toggleSpeakerMode(v4<?> v4Var) {
        TGCallService w10 = TGCallService.w();
        if (w10 != null) {
            if (!w10.G() || !w10.E()) {
                setSpeakerMode(!isSpeakerModeEnabled());
            } else {
                v4Var.ee(null, new int[]{R.id.btn_routingBluetooth, R.id.btn_routingEarpiece, R.id.btn_routingSpeaker}, new String[]{w.i1(R.string.VoipAudioRoutingBluetooth), w.i1(R.string.VoipAudioRoutingEarpiece), w.i1(R.string.VoipAudioRoutingSpeaker)}, null, new int[]{R.drawable.baseline_bluetooth_24, R.drawable.baseline_phone_in_talk_24, R.drawable.baseline_volume_up_24}, new h0() {
                    @Override
                    public boolean P() {
                        return g0.a(this);
                    }

                    @Override
                    public Object a2(int i10) {
                        return g0.b(this, i10);
                    }

                    @Override
                    public final boolean r3(View view, int i10) {
                        boolean lambda$toggleSpeakerMode$0;
                        lambda$toggleSpeakerMode$0 = CallSettings.this.lambda$toggleSpeakerMode$0(view, i10);
                        return lambda$toggleSpeakerMode$0;
                    }
                });
            }
        }
    }
}
