package com.tres.dao;

import com.tres.compositekey.CompositeKeyRoute;
import com.tres.entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnquiryRouteRepo extends JpaRepository<Route, Integer> {

    public List<Route> findByTrainIdAndStationCode(int trainId, String stationCode);

}
