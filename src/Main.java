public class Main {
    public static void main(String[] args) {
        for (Event event : getMovies()) {
            try {
                validateEvent(event);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        for (Event event : getPlays()) {
            try {
                validateEvent(event);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Все события корректны");
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Lighthouse", 2019, 18),
                new Movie("Soul", 2020, 6),
                new Movie("Rick and Morty", 2021, 18)
        };
    }

    public static Theatre[] getPlays() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2019, 18),
                new Theatre("Шелкунчик", 2020, 6),
                new Theatre("Козы Корпеш", 2021, 12)
        };
    }

    public static void validateEvent(Event event) throws RuntimeException {
        if (event.getAge() == 0 || event.getReleaseYear() == 0) {
            throw new RuntimeException("Не указано возрастное ограничение или год выпуска");
        } else if (event.getTitle() == null) {
            throw new RuntimeException("Не указано название мероприятия");
        }
    }
}