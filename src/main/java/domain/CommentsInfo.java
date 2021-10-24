package domain;

public class CommentsInfo {
    private int totalComment; // количество комментариев
    private boolean canPost; // возможность добавить комментарий
    private boolean groupsCanPost; // информация о том, могут ли сообщества комментировать запись
    private boolean canClose; // может ли текущий пользователь закрыть комментарии к записи
    private boolean canOpen; // может ли текущий пользователь открыть комментарии к записи
}
