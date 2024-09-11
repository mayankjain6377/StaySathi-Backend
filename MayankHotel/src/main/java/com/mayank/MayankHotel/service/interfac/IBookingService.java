package com.mayank.MayankHotel.service.interfac;


import com.mayank.MayankHotel.dto.Response;
import com.mayank.MayankHotel.entity.Booking;

public interface IBookingService {

    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);

}

