package domain;

public class DonutInfo {
    private boolean isDonut; // запись доступна только платным подписчикам VK Donut
    private int paidDuration; // время, в течение которого запись будет доступна только платным подписчикам VK Donut
    private boolean canPublishFreeCopy; // можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
    private String editMode; // информация о том, какие значения VK Donut можно изменить в записи
    private PlaceholderInfo placeholderInfo;  // в документации он типа object, под такой тип объекта мы создали отдельный класс PlaceholderInfo
}
