package com.readdle.handmademvi

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import kotlinx.coroutines.flow.MutableStateFlow

class BaseFeature<Wish : Any, Effect : Any, State : Any>(
    initialState: State,
    actor: Actor<State, Wish, Effect>,
    reducer: Reducer<State, Effect>,
) : Flow<State> {

    private val state = MutableStateFlow(initialState)

    override suspend fun collect(collector: FlowCollector<State>) {
        state.collect(collector)
    }
}