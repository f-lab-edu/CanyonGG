package io.github.seoj17.canyongg.worker

import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import io.github.seoj17.canyongg.domain.usecase.firebase.GetApiVersionUseCase

@HiltWorker
class ApiVersionFetchWorker @AssistedInject constructor(
    @Assisted appContext: Context,
    @Assisted workerParams: WorkerParameters,
    private val getApiVersionUseCase: GetApiVersionUseCase,
) : CoroutineWorker(appContext, workerParams) {
    override suspend fun doWork(): Result {
        runCatching {
            getApiVersionUseCase()
        }.fold(
            onSuccess = {
                return Result.success()
            },
            onFailure = {
                return Result.retry()
            },
        )
    }
}