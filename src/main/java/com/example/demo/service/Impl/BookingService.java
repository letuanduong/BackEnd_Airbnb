package com.example.demo.service.Impl;

import com.example.demo.model.Booking;
import com.example.demo.service.IBookingService;

import java.util.List;
import java.util.Optional;

public class BookingService implements IBookingService {
    @Override
    public List<Booking> findAll() {
        return null;
    }

    @Override
    public Optional<Booking> findById() {
        return Optional.empty();
    }

    @Override
    public Optional<Booking> findByName() {
        return Optional.empty();
    }

    @Override
    public boolean save(Booking booking) {
        return false;
    }

    @Override
    public boolean deleteById(int id) {
        return false;
    }

    @Override
    public boolean deleteByObject(Booking booking) {
        return false;
    }

    @Override
    public boolean updateById(int id) {
        return false;
    }

    @Override
    public boolean updateByObject(Booking booking) {
        return false;
    }
}
