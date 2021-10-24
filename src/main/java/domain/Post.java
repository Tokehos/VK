package domain;

public class Post {
    private int iD; // номер поста
    private String ownerId; // идентификатор пользователя сделавшего пост
    private String fromId; // Идентификатор владельца стены, на которой размещена запись
    private int createdBy; // Идентификатор администратора, который опубликовал запись . Возвращается в записях, опубликованных менее 24 часов назад.
    private int date; //дата создания поста
    private String text; // текст поста
    private String replyOwnerId; // Идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private int replyPostId; // Идентификатор записи, в ответ на которую была оставлена текущая.
    private boolean FriendsOnly; // запись видят только друзья
    private CommentsInfo commentsInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс CommentsInfo
    private CopyrightInfo copyrightInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс CopyrightInfo
    private LikesInfo likesInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс LikesInfo
    private RepostInfo repostInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс RepostInfo
    private ViewInfo viewInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс ViewInfo
    private String postType; // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    private PostSourseInfo postSourseInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс PostSourseInfo
    private GeoInfo geoInfo;  // в документации он типа object, под такой тип объекта мы создали отдельный класс GeoInfo
    private int signerId; // Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    private boolean canPin; // Информация о том, может ли текущий пользователь закрепить запись
    private boolean canDelete; // Информация о том, может ли текущий пользователь удалить запись
    private boolean canEdit; // Информация о том, может ли текущий пользователь редактировать запись
    private boolean isPinned; // Информация о том, что запись закреплена
    private boolean markedAsAds; // Информация о том, содержит ли запись отметку "реклама"
    private boolean isFavorite; //true, если объект добавлен в закладки у текущего пользователя.
    private DonutInfo donutInfo; //  в документации он типа object, под такой тип объекта мы создали отдельный класс DonutInfo
    private boolean postponedId; //Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.


    // + getters/setters
}
