package domain;

public class LikesInfo {
    private boolean giveLike; // поставлен лайк пользователем (да/нет)
    private int totalLike; // количество лайков
    private boolean canLike; // информация о том, может ли текущий пользователь поставить отметку «Мне нравится»
    private boolean canPublish; // информация о том, может ли текущий пользователь сделать репост записи
}
