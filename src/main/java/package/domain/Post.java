package domain;

public class Post {
    private int iD; // номер поста
    private String ownerId; // идентификатор пользователя сделавшего пост
    private String ownerIdGroup; //идентификатор группы
    private String namePost; // название поста
    private String logoAuthor; //логотип группы
    private int date; //дата создания поста
    private String imageUrl; // заглавная картинка в посте
    private String text; // текст поста
    private String viewing; //количество просмотров поста
    private String chosen; // добавление в избранное
    private String url; // ссылка, для того чтобы провалится в сам пост

    // + getters/setters
}
