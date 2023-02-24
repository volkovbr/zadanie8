public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Борис";
        post.pasport = "1234№123123";
        post.patronymic = "Романович";
        post.phone = "+7 (123)123-12-12";
        post.surname = "Волков";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 1;
        post.birthday.month = 10;
        post.birthday.year = 1995;
    }
}
