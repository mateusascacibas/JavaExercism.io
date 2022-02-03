import java.time.LocalDate;
import java.time.LocalDateTime;
public class Gigasecond {
    private final LocalDateTime birthday;
    public Gigasecond(LocalDate birthday) {
        this(birthday.atStartOfDay());
    }
    public Gigasecond(LocalDateTime birthday) {
        this.birthday = birthday;
    }
    public LocalDateTime getDateTime() {
        return birthday.plusSeconds(1_000_000_000);
    }
}