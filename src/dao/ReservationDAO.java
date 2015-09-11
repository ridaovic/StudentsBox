package dao;

import java.util.List;

import entity.ReservationEntity;

public interface ReservationDAO 
{
    public void addReservation(ReservationEntity reservation);
    public void editeReservation(ReservationEntity reservation);
    public List<ReservationEntity> getAllReservations();
    public ReservationEntity getReservationById(Integer reservationId);
    public void deleteReservation(Integer reservationId);
    public void validerReservation(Integer reservationId);
    
}