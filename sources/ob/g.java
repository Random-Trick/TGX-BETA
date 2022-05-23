package ob;

import org.drinkless.td.libcore.telegram.TdApi;

public final class g {
    public static final TdApi.ChatAction a(int i10) {
        switch (i10) {
            case TdApi.ChatActionChoosingLocation.CONSTRUCTOR:
                return new TdApi.ChatActionChoosingLocation();
            case TdApi.ChatActionChoosingContact.CONSTRUCTOR:
                return new TdApi.ChatActionChoosingContact();
            case TdApi.ChatActionStartPlayingGame.CONSTRUCTOR:
                return new TdApi.ChatActionStartPlayingGame();
            case TdApi.ChatActionRecordingVoiceNote.CONSTRUCTOR:
                return new TdApi.ChatActionRecordingVoiceNote();
            case TdApi.ChatActionUploadingVoiceNote.CONSTRUCTOR:
            case TdApi.ChatActionUploadingDocument.CONSTRUCTOR:
            case TdApi.ChatActionUploadingPhoto.CONSTRUCTOR:
            case TdApi.ChatActionUploadingVideoNote.CONSTRUCTOR:
            case TdApi.ChatActionUploadingVideo.CONSTRUCTOR:
            default:
                return null;
            case TdApi.ChatActionRecordingVideoNote.CONSTRUCTOR:
                return new TdApi.ChatActionRecordingVideoNote();
            case TdApi.ChatActionRecordingVideo.CONSTRUCTOR:
                return new TdApi.ChatActionRecordingVideo();
            case TdApi.ChatActionChoosingSticker.CONSTRUCTOR:
                return new TdApi.ChatActionChoosingSticker();
            case TdApi.ChatActionTyping.CONSTRUCTOR:
                return new TdApi.ChatActionTyping();
            case TdApi.ChatActionCancel.CONSTRUCTOR:
                return new TdApi.ChatActionCancel();
        }
    }

    public static final TdApi.NotificationSettingsScope b(int i10) {
        if (i10 == 548013448) {
            return new TdApi.NotificationSettingsScopeChannelChats();
        }
        if (i10 == 937446759) {
            return new TdApi.NotificationSettingsScopePrivateChats();
        }
        if (i10 == 1212142067) {
            return new TdApi.NotificationSettingsScopeGroupChats();
        }
        throw new IllegalStateException(String.valueOf(i10).toString());
    }

    public static final TdApi.SearchMessagesFilter c(int i10) {
        switch (i10) {
            case TdApi.SearchMessagesFilterUrl.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterUrl();
            case TdApi.SearchMessagesFilterChatPhoto.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterChatPhoto();
            case TdApi.SearchMessagesFilterEmpty.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterEmpty();
            case TdApi.SearchMessagesFilterFailedToSend.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterFailedToSend();
            case TdApi.SearchMessagesFilterAnimation.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterAnimation();
            case TdApi.SearchMessagesFilterUnreadMention.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterUnreadMention();
            case TdApi.SearchMessagesFilterVideo.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterVideo();
            case TdApi.SearchMessagesFilterVideoNote.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterVideoNote();
            case TdApi.SearchMessagesFilterVoiceAndVideoNote.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterVoiceAndVideoNote();
            case TdApi.SearchMessagesFilterAudio.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterAudio();
            case TdApi.SearchMessagesFilterPhoto.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterPhoto();
            case TdApi.SearchMessagesFilterPhotoAndVideo.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterPhotoAndVideo();
            case TdApi.SearchMessagesFilterDocument.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterDocument();
            case TdApi.SearchMessagesFilterVoiceNote.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterVoiceNote();
            case TdApi.SearchMessagesFilterMention.CONSTRUCTOR:
                return new TdApi.SearchMessagesFilterMention();
            default:
                throw new IllegalStateException(String.valueOf(i10).toString());
        }
    }
}
