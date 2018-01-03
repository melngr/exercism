import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Gigasecond {

    LocalDateTime _dateTime;

    Gigasecond(LocalDate birthDate) {
        this._dateTime = LocalDateTime.of( birthDate, LocalTime.of(0, 0) );
    }

    Gigasecond(LocalDateTime birthDateTime) {
        this._dateTime = LocalDateTime.of( birthDateTime.toLocalDate(), 
            birthDateTime.toLocalTime() );
    }

    LocalDateTime getDate() {
        return (this._dateTime).plusSeconds( 1000000000 );
    }

}
