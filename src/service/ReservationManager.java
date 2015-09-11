package service;

import java.util.List;

import entity.ReservationEntity;

public interface ReservationManager {
	public void addReservation(ReservationEntity reservation);
	public void editeReservation(ReservationEntity reservation);
    public List<ReservationEntity> getAllReservations();
    public ReservationEntity getReservationById(Integer reservationtId);
    public void deleteReservation(Integer reservationId);
    public void validerReservation(Integer reservationId);
}
