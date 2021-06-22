package com.example.data.repository

import com.example.common.entity.CellLog
import com.example.common.entity.Tracking
import com.example.data.datasource.TrackingLocalDataSource
import com.example.usecase.repository.TrackingRepository
import kotlinx.coroutines.flow.Flow

class TrackingRepositoryImpl(
    private val trackingLocalDataSource: TrackingLocalDataSource
) : TrackingRepository {

    override suspend fun createNewActiveTracking() {
        trackingLocalDataSource.createNewActiveTracking()
    }

    override suspend fun getActiveTrackingId(): Int {
        return trackingLocalDataSource.getActiveTrackingId()
    }

    override suspend fun addNewCellLog(cellLog: CellLog) {
        trackingLocalDataSource.addNewCellLog(cellLog)
    }

    override suspend fun getActiveTracking(): Tracking {
        return trackingLocalDataSource.getActiveTracking()
    }

    override suspend fun stopActiveTracking() {
        trackingLocalDataSource.stopActiveTracking()
    }

    override suspend fun getAllTrackings(): List<Tracking> {
        return trackingLocalDataSource.getAllTrackings()
    }

    override fun isThereActiveTracking(): Flow<Boolean> {
        return trackingLocalDataSource.isThereActiveTracking()
    }
}