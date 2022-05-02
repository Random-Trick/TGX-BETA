package p193nb;

import java.util.Arrays;
import org.drinkless.p210td.libcore.telegram.TdApi;
import p107ha.C5047g;
import qa.C8298k;

public final class C7324h {
    public static final TdApi.Chat m16888a(TdApi.Chat chat) {
        TdApi.ChatPosition[] chatPositionArr = null;
        if (chat == null) {
            return null;
        }
        long j = chat.f25370id;
        TdApi.ChatType chatType = chat.type;
        String str = chat.title;
        TdApi.ChatPhotoInfo chatPhotoInfo = chat.photo;
        TdApi.ChatPermissions chatPermissions = chat.permissions;
        TdApi.Message message = chat.lastMessage;
        TdApi.ChatPosition[] chatPositionArr2 = chat.positions;
        if (chatPositionArr2 != null) {
            C8298k.m12934d(chatPositionArr2, "this.positions");
            Object[] copyOf = Arrays.copyOf(chatPositionArr2, chatPositionArr2.length);
            C8298k.m12934d(copyOf, "copyOf(this, size)");
            chatPositionArr = (TdApi.ChatPosition[]) copyOf;
        }
        return new TdApi.Chat(j, chatType, str, chatPhotoInfo, chatPermissions, message, chatPositionArr, chat.messageSenderId, chat.hasProtectedContent, chat.isMarkedAsUnread, chat.isBlocked, chat.hasScheduledMessages, chat.canBeDeletedOnlyForSelf, chat.canBeDeletedForAllUsers, chat.canBeReported, chat.defaultDisableNotification, chat.unreadCount, chat.lastReadInboxMessageId, chat.lastReadOutboxMessageId, chat.unreadMentionCount, chat.unreadReactionCount, chat.notificationSettings, chat.availableReactions, chat.messageTtl, chat.themeName, chat.actionBar, chat.videoChat, chat.pendingJoinRequests, chat.replyMarkupMessageId, chat.draftMessage, chat.clientData);
    }

    public static final TdApi.ChatMemberStatus m16887b(TdApi.ChatMemberStatus chatMemberStatus) {
        TdApi.ChatMemberStatus chatMemberStatus2;
        if (chatMemberStatus == null) {
            return null;
        }
        switch (chatMemberStatus.getConstructor()) {
            case TdApi.ChatMemberStatusBanned.CONSTRUCTOR:
                chatMemberStatus2 = new TdApi.ChatMemberStatusBanned(((TdApi.ChatMemberStatusBanned) chatMemberStatus).bannedUntilDate);
                break;
            case TdApi.ChatMemberStatusCreator.CONSTRUCTOR:
                TdApi.ChatMemberStatusCreator chatMemberStatusCreator = (TdApi.ChatMemberStatusCreator) chatMemberStatus;
                chatMemberStatus2 = new TdApi.ChatMemberStatusCreator(chatMemberStatusCreator.customTitle, chatMemberStatusCreator.isAnonymous, chatMemberStatusCreator.isMember);
                break;
            case TdApi.ChatMemberStatusLeft.CONSTRUCTOR:
                return new TdApi.ChatMemberStatusLeft();
            case TdApi.ChatMemberStatusAdministrator.CONSTRUCTOR:
                TdApi.ChatMemberStatusAdministrator chatMemberStatusAdministrator = (TdApi.ChatMemberStatusAdministrator) chatMemberStatus;
                return new TdApi.ChatMemberStatusAdministrator(chatMemberStatusAdministrator.customTitle, chatMemberStatusAdministrator.canBeEdited, chatMemberStatusAdministrator.canManageChat, chatMemberStatusAdministrator.canChangeInfo, chatMemberStatusAdministrator.canPostMessages, chatMemberStatusAdministrator.canEditMessages, chatMemberStatusAdministrator.canDeleteMessages, chatMemberStatusAdministrator.canInviteUsers, chatMemberStatusAdministrator.canRestrictMembers, chatMemberStatusAdministrator.canPinMessages, chatMemberStatusAdministrator.canPromoteMembers, chatMemberStatusAdministrator.canManageVideoChats, chatMemberStatusAdministrator.isAnonymous);
            case TdApi.ChatMemberStatusMember.CONSTRUCTOR:
                return new TdApi.ChatMemberStatusMember();
            case TdApi.ChatMemberStatusRestricted.CONSTRUCTOR:
                TdApi.ChatMemberStatusRestricted chatMemberStatusRestricted = (TdApi.ChatMemberStatusRestricted) chatMemberStatus;
                chatMemberStatus2 = new TdApi.ChatMemberStatusRestricted(chatMemberStatusRestricted.isMember, chatMemberStatusRestricted.restrictedUntilDate, C7321e.m16934l(chatMemberStatusRestricted.permissions));
                break;
            default:
                String object = chatMemberStatus.toString();
                C8298k.m12934d(object, "this.toString()");
                throw new C5047g(C8298k.m12928j("An operation is not implemented: ", object));
        }
        return chatMemberStatus2;
    }

    public static final TdApi.ChatPermissions m16886c(TdApi.ChatPermissions chatPermissions) {
        if (chatPermissions == null) {
            return null;
        }
        return new TdApi.ChatPermissions(chatPermissions.canSendMessages, chatPermissions.canSendMediaMessages, chatPermissions.canSendPolls, chatPermissions.canSendOtherMessages, chatPermissions.canAddWebPagePreviews, chatPermissions.canChangeInfo, chatPermissions.canInviteUsers, chatPermissions.canPinMessages);
    }

    public static final TdApi.File m16885d(TdApi.File file) {
        if (file == null) {
            return null;
        }
        return new TdApi.File(file.f25376id, file.size, file.expectedSize, C7321e.m16928n(file.local), C7321e.m16922p(file.remote));
    }

    public static final TdApi.LocalFile m16884e(TdApi.LocalFile localFile) {
        if (localFile == null) {
            return null;
        }
        return new TdApi.LocalFile(localFile.path, localFile.canBeDownloaded, localFile.canBeDeleted, localFile.isDownloadingActive, localFile.isDownloadingCompleted, localFile.downloadOffset, localFile.downloadedPrefixSize, localFile.downloadedSize);
    }

    public static final TdApi.Message m16883f(TdApi.Message message) {
        if (message == null) {
            return null;
        }
        return new TdApi.Message(message.f25409id, message.senderId, message.chatId, message.sendingState, message.schedulingState, message.isOutgoing, message.isPinned, message.canBeEdited, message.canBeForwarded, message.canBeSaved, message.canBeDeletedOnlyForSelf, message.canBeDeletedForAllUsers, message.canGetAddedReactions, message.canGetStatistics, message.canGetMessageThread, message.canGetViewers, message.canGetMediaTimestampLinks, message.hasTimestampedMedia, message.isChannelPost, message.containsUnreadMention, message.date, message.editDate, message.forwardInfo, message.interactionInfo, message.unreadReactions, message.replyInChatId, message.replyToMessageId, message.messageThreadId, message.ttl, message.ttlExpiresIn, message.viaBotUserId, message.authorSignature, message.mediaAlbumId, message.restrictionReason, message.content, message.replyMarkup);
    }

    public static final TdApi.RemoteFile m16882g(TdApi.RemoteFile remoteFile) {
        if (remoteFile == null) {
            return null;
        }
        return new TdApi.RemoteFile(remoteFile.f25420id, remoteFile.uniqueId, remoteFile.isUploadingActive, remoteFile.isUploadingCompleted, remoteFile.uploadedSize);
    }

    public static final void m16881h(TdApi.ChatPermissions chatPermissions, TdApi.ChatPermissions chatPermissions2) {
        C8298k.m12933e(chatPermissions, "<this>");
        C8298k.m12933e(chatPermissions2, "dst");
        chatPermissions2.canSendMessages = chatPermissions.canSendMessages;
        chatPermissions2.canSendMediaMessages = chatPermissions.canSendMediaMessages;
        chatPermissions2.canSendOtherMessages = chatPermissions.canSendOtherMessages;
        chatPermissions2.canAddWebPagePreviews = chatPermissions.canAddWebPagePreviews;
        chatPermissions2.canSendPolls = chatPermissions.canSendPolls;
        chatPermissions2.canInviteUsers = chatPermissions.canInviteUsers;
        chatPermissions2.canPinMessages = chatPermissions.canPinMessages;
        chatPermissions2.canChangeInfo = chatPermissions.canChangeInfo;
    }

    public static final void m16880i(TdApi.ChatPosition chatPosition, TdApi.ChatPosition chatPosition2) {
        C8298k.m12933e(chatPosition, "<this>");
        C8298k.m12933e(chatPosition2, "dst");
        chatPosition2.list = chatPosition.list;
        chatPosition2.order = chatPosition.order;
        chatPosition2.isPinned = chatPosition.isPinned;
        chatPosition2.source = chatPosition.source;
    }

    public static final void m16879j(TdApi.Message message, TdApi.Message message2) {
        C8298k.m12933e(message, "<this>");
        C8298k.m12933e(message2, "dst");
        message2.f25409id = message.f25409id;
        message2.senderId = message.senderId;
        message2.chatId = message.chatId;
        message2.sendingState = message.sendingState;
        message2.schedulingState = message.schedulingState;
        message2.isOutgoing = message.isOutgoing;
        message2.isPinned = message.isPinned;
        message2.canBeEdited = message.canBeEdited;
        message2.canBeForwarded = message.canBeForwarded;
        message2.canBeSaved = message.canBeSaved;
        message2.canBeDeletedOnlyForSelf = message.canBeDeletedOnlyForSelf;
        message2.canBeDeletedForAllUsers = message.canBeDeletedForAllUsers;
        message2.canGetStatistics = message.canGetStatistics;
        message2.canGetMessageThread = message.canGetMessageThread;
        message2.canGetViewers = message.canGetViewers;
        message2.canGetMediaTimestampLinks = message.canGetMediaTimestampLinks;
        message2.hasTimestampedMedia = message.hasTimestampedMedia;
        message2.isChannelPost = message.isChannelPost;
        message2.containsUnreadMention = message.containsUnreadMention;
        message2.date = message.date;
        message2.editDate = message.editDate;
        message2.forwardInfo = message.forwardInfo;
        message2.replyToMessageId = message.replyToMessageId;
        message2.ttl = message.ttl;
        message2.ttlExpiresIn = message.ttlExpiresIn;
        message2.viaBotUserId = message.viaBotUserId;
        message2.authorSignature = message.authorSignature;
        message2.interactionInfo = message.interactionInfo;
        message2.replyInChatId = message.replyInChatId;
        message2.messageThreadId = message.messageThreadId;
        message2.mediaAlbumId = message.mediaAlbumId;
        message2.restrictionReason = message.restrictionReason;
        message2.content = message.content;
        message2.replyMarkup = message.replyMarkup;
    }

    public static final void m16878k(TdApi.User user, TdApi.User user2) {
        C8298k.m12933e(user, "<this>");
        C8298k.m12933e(user2, "dst");
        user2.firstName = user.firstName;
        user2.lastName = user.lastName;
        user2.username = user.username;
        user2.phoneNumber = user.phoneNumber;
        user2.profilePhoto = user.profilePhoto;
        user2.isContact = user.isContact;
        user2.isMutualContact = user.isMutualContact;
        user2.isVerified = user.isVerified;
        user2.restrictionReason = user.restrictionReason;
        user2.haveAccess = user.haveAccess;
        user2.type = user.type;
        user2.languageCode = user.languageCode;
    }

    public static final boolean m16877l(TdApi.File file, TdApi.File file2) {
        C8298k.m12933e(file, "<this>");
        C8298k.m12933e(file2, "dst");
        boolean z = !C7321e.m16997L(file, file2, false);
        TdApi.LocalFile localFile = file2.local;
        TdApi.LocalFile localFile2 = file.local;
        localFile.downloadedSize = localFile2.downloadedSize;
        localFile.downloadOffset = localFile2.downloadOffset;
        localFile.downloadedPrefixSize = localFile2.downloadedPrefixSize;
        localFile.isDownloadingActive = localFile2.isDownloadingActive;
        localFile.isDownloadingCompleted = localFile2.isDownloadingCompleted;
        localFile.canBeDeleted = localFile2.canBeDeleted;
        localFile.canBeDownloaded = localFile2.canBeDownloaded;
        localFile.path = localFile2.path;
        TdApi.RemoteFile remoteFile = file2.remote;
        TdApi.RemoteFile remoteFile2 = file.remote;
        remoteFile.uploadedSize = remoteFile2.uploadedSize;
        remoteFile.isUploadingActive = remoteFile2.isUploadingActive;
        remoteFile.isUploadingCompleted = remoteFile2.isUploadingCompleted;
        remoteFile.uniqueId = remoteFile2.uniqueId;
        remoteFile.f25420id = remoteFile2.f25420id;
        file2.expectedSize = file.expectedSize;
        file2.size = file.size;
        return z;
    }
}
