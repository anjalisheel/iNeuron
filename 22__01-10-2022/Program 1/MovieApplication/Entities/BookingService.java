package MovieApplication.Entities;

import java.util.Date;

public interface BookingService {
    public long createBooking(long userId, long movieId, Date showTime, int numberOfSeats);
}
