package p193nb;

import org.drinkless.p210td.libcore.telegram.TdApi;

public final class C7323g {
    public static final TdApi.ChatAction m16891a(int i) {
        switch (i) {
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

    public static final TdApi.NotificationSettingsScope m16890b(int i) {
        if (i == 548013448) {
            return new TdApi.NotificationSettingsScopeChannelChats();
        }
        if (i == 937446759) {
            return new TdApi.NotificationSettingsScopePrivateChats();
        }
        if (i == 1212142067) {
            return new TdApi.NotificationSettingsScopeGroupChats();
        }
        throw new IllegalStateException(String.valueOf(i).toString());
    }

    public static final TdApi.SearchMessagesFilter m16889c(int i) {
        switch (i) {
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
                throw new IllegalStateException(String.valueOf(i).toString());
        }
    }
}
